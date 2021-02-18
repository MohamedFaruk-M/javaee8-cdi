# Build
mvn clean package && docker build -t com.nisfa/ContextDependency .

# RUN

docker rm -f ContextDependency || true && docker run -d -p 8080:8080 -p 4848:4848 --name ContextDependency com.nisfa/ContextDependency 