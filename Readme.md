# How to build
```aidl
./gradlew bootJar
```

# How to run
## (Dockerfile version)
### Create docker image with dockerfile 
    ```
    docker build -t simple_spring:v1 --build-arg JAR_FILE=./build/libs/simple-0.0.1-SNAPSHOT.jar .
    ```
### Crete docker container
    ```
    docker run -d -p 8881:8881 simple_spring:v1 
    ```
## (Docker compose version)
    ```
    docker-compose up -d
    ```

# How to access
http://localhost:8881
Test REST API: http://localhost:8881/sourcegit

# TODO
- setup swagger
- add CI pipeline
- add test code