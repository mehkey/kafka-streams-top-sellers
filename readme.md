# Kafka Streams Top Sellers

[![Java CI with Gradle](https://github.com/mehkey/kafka-streams-top-sellers/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/mehkey/kafka-streams-top-sellers/actions/workflows/gradle-build.yml)

```

#start the broker and zookeeper
docker-compose up

#start the kafka stream app
gradle run

#create a topic
kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic sales

#if not installed
brew install kafka

#remove a topic
kafka-topics --bootstrap-server localhost:9092 --delete --topic sales

#kafka stream app reset
kafka-streams-application-reset --application-id top-sales-stream --bootstrap-servers localhost:9092



```


# Kafka Streams Application
This project is a Kafka Streams application that processes sales records and calculates the top sales for each product category over the last week.

## Prerequisites
Java 17
Gradle 6.x
Docker and Docker Compose

## Set Up
Build the project:
> gradle build
Start the test environment using Docker Compose:
> docker-compose up
This will start a Kafka broker and the Kafka Streams application.

Produce some sale records:
> gradle run -Pargs="--producer"
This will produce new sale records every 3 seconds for a random category out of 100 categories.

Check the top sales:
> gradle run -Pargs="--consumer"
This will start a consumer that will check if the top-sales-over-last-week topic has the right values after 1 minute.

## Clean Up
To stop the test environment and remove the containers, run:

> docker-compose down

## Test
To run the tests, run:

> gradle test

## More Information
For more information about the project, see the code and comments in the source files.
