FROM java:8 						
COPY target/*.jar /app.jar					
CMD ["--server.port=8084"]			
EXPOSE 8084							
ENTRYPOINT ["java","-jar","/app.jar"]	
