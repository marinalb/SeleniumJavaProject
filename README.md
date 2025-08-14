# Selenium Java (Maven) – Training Project

A simple project to practice UI automation with Selenium WebDriver in Java using Maven and TestNG.

## Tech Stack
- Java 17+  
- Maven 3.8+  
- Selenium WebDriver 4.x  
- TestNG  
- WebDriverManager  

## Structure
src
├── main/java # (optional: utils, config)
└── test/java # tests, page objects, base classes

perl
Copy
Edit

## Run Tests
Install dependencies:  
```bash
mvn clean install -DskipTests
Run all tests:

mvn clean test
Run with parameters:

mvn test -Dbrowser=chrome -Dheadless=true

Configuration

Set values in config/test.properties:
mvn test -Dbrowser=edge -DbaseUrl=https://staging.example.com