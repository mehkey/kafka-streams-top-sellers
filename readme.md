# Kafka Streams Top Sellers


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
