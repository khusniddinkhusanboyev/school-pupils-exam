FROM openjdk:17

ADD target/school-pupil-comp-test-0.0.1-SNAPSHOT.jar school-pupil-comp-test-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "school-pupil-comp-test-0.0.1-SNAPSHOT.jar"]