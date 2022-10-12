# LAB 2

### 2.1 - Server-side programming with servlets

Java Servlet is the foundation web specification in the Java Enterprise Platform. Developers can build web applications using the Servlet API to interact with the request/response workflow.



### 2.2 Server-side programming with embedded servers



### 2.3 Introduction to web apps with a full-featured framework (Spring Boot)

In Spring’s approach to building web sites, HTTP requests are handled by a controller.

Run the application

```bash
./mvnw spring-boot:run
```

or

```bash
./mvnw clean package
java -jar target/serving-web-content-0.0.1-SNAPSHOT.jar
```

This commands create and run a JAR file in maven. 

Accessing the endpoint from the command line using the curl utility (the application must be running in another terminal)

```bash
curl -v http://localhost:8080/RestGreeting?name=User
```

### Review questions

A. What are the responsibilities/services of a “servlet container”?

The "servlet container" generate dinamic web pages using Java. Interacts with the Java servlets, comunicating between the client browser and the servlets. The "servlet container" receives the web server requests and sends them to a servlet. The "servlet container" processes the HTTP requests and finally the web servlet generates the data.

B. Explain, in brief, the “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)

Spring Boot has controllers to handle requests and creates models with the desired data. These models are used in the view templates to generate data visuallization. 

C. Inspect the POM.xml for the previous Spring Boot projects. What is the role of the “starters” dependencies?



Os Spring Boot starters resolvem o problema de gerenciamento de dependências em um projeto complexo. Os starter POMs são um conjunto de descritores de dependência convenientes que podem ser incluídos no aplicativo, com eles, obtemos todo o Spring, sem ter que procurar por códigos de amostra e copiar e colar os descritores de dependência.

D. Which annotations are transitively included in the @SpringBootApplication?



E. Search online for the topic “Best practices for REST API design”. From what you could learn, select your “top 5” practices, and briefly explain them in you own words.
