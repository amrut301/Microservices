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


follow these urls to hit the api's


ZIPKIN - for Fault Tollerance - Using Hystrix

http://localhost:9411/zipkin - ZIPKIN 

http://localhost:15672/ - Rabbit MQ for Spring-cloud-Sleuth and spring cloud Bus

http://localhost:8080/fault-tolerance-example

#
Euraka Server- naming server
http://localhost:8761/
# requet routing via Zuul Service
http://localhost:8765/currency-conversion-service/currency-converter-fiegn/from/INR/to/USD/quantity/20

http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR

# hitting api's 
http://localhost:8001/currency-exchange/from/USD/to/INR
http://localhost:8100/currency-converter-fiegn/from/INR/to/USD/quantity/20
http://localhost:8000/currency-exchange/from/USD/to/INR
http://localhost:8100/currency-converter/from/INR/to/USD/quantity/20
http://localhost:8888/limits-service/dev
