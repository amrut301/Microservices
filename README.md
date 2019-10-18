# Microservices
Complete Microservice 
-This repo uses.
-Spring-cloud.
-Spring cloud config server
-spring eureka server for registry
-uses spring cloud config (uses git profile files) to pick the data from git / (configuration)
-uses spring cloud-bus and RabbitMQ to to refresh any changes thats happening in the profile configuration without sending request to each service,
and this cab be done by calling using POST call "http://localhost:8080/actuator/bus/refresh"

-spring -feign client to communicate to different services (in feign client you need to provide the instance of   services so that load can on the 
servers can be managed). [more of hardocoded way - to overcome this, we use Ribbon Client]
-spring - Ribbon Client - so that load balance can be done.
-Spring zuul service - For Identiyfying the new service and load balance acoordingly.
