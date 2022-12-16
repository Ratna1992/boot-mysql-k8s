FROM openjdk:17
EXPOSE 9192
ADD target/boot-mysql-k8s.jar boot-mysql-k8s.jar
ENTRYPOINT ["java","-jar","boot-mysql-k8s.jar"]
