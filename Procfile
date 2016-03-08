heroku ps:scale web=1
web: java $JAVA_OPTS -jar target/dependency/* --port $PORT target/*.war
web: java -war target/enterpriseapp-1.0.war
