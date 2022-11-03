# Mongo-AutoGen-field
+ The Spring Boot application is to auto generate field

## Method
+ We created a collection which is going to hold sequence name and count
+ From which whenever there is a new entity added, we are calling the service to get and increase the sequence number.
+ That sequence number is used as ID for the entity object

## Tools
+ For testing API `OpenAPI` [added in code]
+ `MongoDB` local or cloud
+ Any `Java IDE` to run the code

### Precheck
+ `Server Port` availability
+ `Mongo DB` details to be added in application.properties
