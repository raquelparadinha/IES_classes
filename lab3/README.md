# Lab 3 - Multi-layer web applications with Spring Boot



## 3_1

**a)** Para resolver esta alínea tive de incluir no ficheiro application.properties as seguintes definições, uma vez que estava a ter problemas na criação da DB.

```java
spring.jpa.open-in-view=false
spring.jpa.properties.hibernate.globally_quoted_identifiers=true
```

from: 

- https://stackoverflow.com/questions/30549489/what-is-this-spring-jpa-open-in-view-true-property-in-spring-boot
- https://jtuto.com/solved-generationtarget-encountered-exception-accepting-error-executing-ddl/

**b)** 

1. The “UserController” class gets an instance of “userRepository” through its constructor; how is this new repository instantiated?

O novo repositório é instânciado usando a anotação @Autowired.

2. List the methods invoked in the “userRepository” object by the “UserController”. Where are
   these methods defined?

Os métodos usados são:

- finaAll()
- save()
- findById()
- delete()

Todos eles são definidos na classe CrudRepository, a qual é extendida pela UserRepository.

3. Where is the data being saved?

Os dados são guardados através da dependência h2database, que é uma "in-memory" base de dados.

4. Where is the rule for the “not empty” email address defined?

A regra de "not empty" é definida na declaração do atributo email da classe User através da anotação @NotBlank.

-----



## 3_2 

**b)** Nesta alínea incluí também o código mencionado na alínea a) do exercício anterior.

---



## 3_3

**d)** Ao tentar executar o programa recorrendo ao Dockerfile tive um erro, provavelmente com a porta a usar, que não consegui resolver. No entanto, ao executar diretamente com o comando  ./mvnw spring-boot:run a API funciona corretamente.

---



## Review questions

**A)** Explain the differences between the RestController and Controller components used in different parts of this lab.

A anotação @RestController é usada em RESTful web services e retorna a data em formato JSON.

O @Controller é utilizado para implementar arquiteturas Spring MVC (Model-View-Controller).

from: https://www.geeksforgeeks.org/difference-between-controller-and-restcontroller-annotation-in-spring/



**B)** Create a visualization of the Spring Boot layers (UML diagram or similar), displaying the key abstractions in the solution of 3.3, in particular: entities, repositories, services and REST controllers. Describe the role of the elements modeled in the diagram.

Imagem em anexo.



**C)** Explain the annotations @Table, @Colum, @Id found in the Employee entity.

@Table: é usada para adicionar o nome da tabela na base de dados MySQL respetiva.

@Column: serve para inserir o nome da coluna especificada.

@Id: indica que o atributo que lhe segue é chave primária da entitidade.

from: https://www.geeksforgeeks.org/spring-boot-spring-data-jpa/?ref=gcse



**D)** Explain the use of the annotation @AutoWired (in the Rest Controller class).

A anotação @AutoWired permite que o Spring resolva e injete beans de colaboração no nosso bean.

from: https://www.baeldung.com/spring-autowire