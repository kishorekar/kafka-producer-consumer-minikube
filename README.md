# kafka-producer-consumer-minikube
Kafka producer and consumer with minikube assignment.
producer-service produces kafka events in constant every 30 seconds intervals
consumer-service consumes events from kafka topic and store in to mysql db.


# Build micro services and create docker image

There are two micro services, one is producer-service and another is consumer-service. Need to build and then create docker image using Dockerfile inside this.

docker build -t talk2me19/consumer-service:v1 .
docker build -t talk2me19/producer-service:v1 .
docker push talk2me19/consumer-service:v1
docker push talk2me19/producer-service:v1

# Deploy yaml file in minikube
All minikube yaml files are in minikube-templates folder.
1. Deploy all yaml file 01-zookeeper-kafka   
2. Deploy all yaml file 02-mysql
3. Deploy all yaml file 03-service-deployment
Use kubectl apply -f . from each folder by sequence


# Swagger and api endpoints

consumer-service is exposed as 30082 port and can be access via-
Swagger URL- http://<External IP>:30082/swagger-ui.html
Get event endpoints - http://<External IP>:30082/events

If you are using docker desktop for kubernetes cluster, you can access via localhost
If you are using minikube, then need to do following steps-
1. In one window run "minikube tunnel"
2. Then deploy all yaml from minikube-templates folder
3. get the external IP from consumer service by- kubectl get svc
4. Then use the consumer-service ExternalIP:30082 and use swagger and event end points.