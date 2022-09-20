# README #

This README would normally document whatever steps are necessary to get your application up and running.

### Next step ? ###

* Solve all TO-DO
* Implements units test
* Create a documentation of API with swagger.
* Stress test and configura observability.
* 

### How do I get set up? ###

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### How do i run ? ###
* by command:  java -jar 
* by maven mvn spring-boot:run

### How do I test? ###

* Test get
curl --location --request GET 'http://localhost:8080/challenge/trainer/trainer-id-000001'

* Test post
curl --location --request POST 'http://localhost:8080/challenge/trainer' \
--header 'Content-Type: application/json' \
--data-raw '{
"id" : "trainer-id-000001",
"email" : "trainer@campgladiator.com",
"phone" : "51251251201",
"first_name": "Fearless",
"last_name": "Contender"
}'
