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

Before Spring Boot was introduced, Spring Developers used to spend a lot of time on Dependency management. Spring Boot Starters were introduced to solve this problem so that the developers can spend more time on actual code than Dependencies. Spring Boot Starters are dependency descriptors that can be added under the **<dependencies>** section in pom.xml. There are around 50+ Spring Boot Starters for different Spring and related technologies. 

from: https://www.geeksforgeeks.org/spring-boot-starters/

D. Which annotations are transitively included in the @SpringBootApplication?

- @EnableAutoConfiguration: activates Spring Boot's automatic configuration mecanism
- @ComponentScan: activates the @Component on the package where the app is located
- @Configuration: allows to register extra beans in the context or to import aditional configuration classes

E. Search online for the topic “Best practices for REST API design”. From what you could learn, select your “top 5” practices, and briefly explain them in you own words.

1. REST API MUST ACCEPT AND RESPOND WITH JSON: It is a common practice that APIs should accept JSON requests as the payload and also send responses back. 
2. GO WITH ERROR STATUS CODES: Over 100 status codes have already been built by HTTP. It is a boon for developers to use status codes in their REST API design.
3. DON’T USE VERBS IN URLS: If you understood the APIs' basics, you would know that inserting verbs in the URL isn’t a good idea. The reason behind this is that HTTP has to be self-sufficient to describe the purpose of the action. 
4. WELL COMPILED DOCUMENTATION:Documentation is one of the important but highly ignored aspects of a REST API structure. The documentation is the first point in the hands of customers to understand the product and critical deciding factor whether to use it or not. One good documentation is neatly presented in a proper flow to make an API development process quicker.
5. RETURN ERROR DETAILS IN THE RESPONSE BODY: It is convenient for the API endpoint to return error details in the JSON or response body to help a user with debugging. If you can explicitly include the affected field in error, this will be special kudos to you.

from: https://www.partech.nl/nl/publicaties/2020/07/9-trending-best-practices-for-rest-api-development#

