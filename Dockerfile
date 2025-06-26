
FROM tomcat:8.0.20-jre8

COPY  target/*.jar  myapp.jar

ENTRYPOINT  [ "java" , "-jar" ,  "myapp.jar"  ]
