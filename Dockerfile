FROM openjdk:15.0-slim
COPY "./target/api-gateway-1.0.0.jar" "api-gateway.jar"
EXPOSE 9191
ENTRYPOINT["java", "jar", "api-gateway.jar"]