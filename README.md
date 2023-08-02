# spring-boot-with-keycloak

## README.MD
Syntax help: https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax  
If not previewing in Intellij or any other IDE, you can online preview on:
https://markdownlivepreview.com/ or https://dillinger.io/

### Project Creation:
https://start.spring.io/

Opts:  
Maven - Java - Spring 3.1.2   
Metadata:  
com.poc  
spring.keycloak  
spring.keycloak  
Demo project for Spring Boot  
com.poc.spring.keycloak  
JAR - JAVA 17  
Dependencies:  
Spring Web  
Spring Boot Actuator  
OAuth2 Authorization Server

### Intellij Community Config
Version: 2023.2  
Maven: 3.8.6  
Java: 18.0.2 (Oracle)

File > Settings (Ctrl + Alt + S)
Build, Execution, Deployment > Build Tools > Maven
Maven home path: <Folder to local Maven>
User settings file: <Folder to local Maven>/conf/settings.xml
Local repository: <Custom moven local repository folder if you want>

File > Project Structure... (Ctrl + Alt + Shift + S)
SDK: 18.0.2
Language level: 18 - no new language features

Edit Configurations (Alt + Shift + F10)
(+) Add new Configuration > Application
Name: RunApp
Main class: Search for "Application.java" > OK > Apply > OK
Run (Shift + F10)

Try access "http://localhost:8080/", to see login page

### First API (master branch - commit ???)
Create a simple controller with GET method @RestController + @GetMapping

Change default root context path and server port, adding in application.properties:
```
server.servlet.context-path=/api
server.port=8095
#will turn localhost:8080/ into localhost:8095/api
```

When running application, on console, get the password, example shown when running:
```
Using generated security password: 09d0145c-e576-4c41-a3f1-c130fd765d74

This generated password is for development use only. Your security configuration must be updated before running your application in production.
```

Try opening the url "http://localhost:8095/api/first", you'll be redirected to login page (API GET is secured)

To authenticate use:  
username: user
password: <password you got from console>

You'll be redirected back, and will see:
```
GET - first API, secured by Default
```