FROM airhacks/glassfish
COPY ./target/travistest.war ${DEPLOYMENT_DIR}
