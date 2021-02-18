FROM airhacks/glassfish
COPY ./target/ContextDependency.war ${DEPLOYMENT_DIR}
