# Let Docker pull the JSK 17 as a BAse Image to create out Image
FROM openjdk:17-ea-3-buster

#Create a Directeory by the name MyCahsBacksApp
# We will copy the code into
RUN mkdir /MyCashBacksApp

# Copy the class file i.e. MyApp.class from the bin into the /MyCashBackApp
COPY bin/ /MyCashBacksApp

# Set the directory to execute any future commands.
WORKDIR /MyCashBacksApp

# Execute the java command -< java MyApp
CMD java  MyApp