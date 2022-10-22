# Lab 3

### 3_1

a) Para resolver esta alínea tive de incluir no ficheiro application.properties as seguintes definições, uma vez que estava a ter problemas na criação da DB.

```java
spring.jpa.open-in-view=false
spring.jpa.properties.hibernate.globally_quoted_identifiers=true
```

from: 

- https://stackoverflow.com/questions/30549489/what-is-this-spring-jpa-open-in-view-true-property-in-spring-boot
- https://jtuto.com/solved-generationtarget-encountered-exception-accepting-error-executing-ddl/

b) 

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

### 3_2 

![image-20221021173804653](/home/raquel/.config/Typora/typora-user-images/image-20221021173804653.png)

![image-20221021173851759](/home/raquel/.config/Typora/typora-user-images/image-20221021173851759.png)

![image-20221021174716519](/home/raquel/.config/Typora/typora-user-images/image-20221021174716519.png)

![image-20221021175116301](/home/raquel/.config/Typora/typora-user-images/image-20221021175116301.png)

![image-20221021175057681](/home/raquel/.config/Typora/typora-user-images/image-20221021175057681.png)