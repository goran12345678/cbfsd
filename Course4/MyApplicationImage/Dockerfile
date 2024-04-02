#Dockerfile (docker build ...) command has the following components. 
#	dir - represents the directory where the Dockerfile is present. ("." if in same directory as command being run)
#	imageName - represents the name given to the image
#	tagName - represents the name fo the tag
# 	returnValue - implies that there are no return values

#Docker can read the instructions from the Dockerfile and build images automatically.
#Dockerfile has all the instructions needed to create a Docker image through the command line.
#The Docker build command can be used to create an automated build

#Docker run command will create a container and execute the application. If it is a console application the -it (interactive terminal) flags will be needed to keep the StdIn open for keyboard input

#Environment variables for the container environment can be added with the ENV directive and key value pairs
#The env variable can be set  via docker run -e debug=true
ENV debug=false


#Variable can be used by docker run
#The variable greeting can be set via the docker run --build-arg greeting=hello
RUN echo "Begin "$greeting

# Let Docker pull the JSK 17 as a Base Image to create out Image
# FROM specifies either a parent image found in docker hub or a base image.
FROM openjdk:latest
#create a base image - FROM scratch

#Create a Directory by the name MyCahsBacksApp
# We will copy the code into
RUN mkdir /MyCashBacksApp

# Copy the class file i.e. MyApp.class from the bin into the /MyCashBackApp
COPY bin/ /MyCashBacksApp

# Set the directory to execute any future commands.
WORKDIR /MyCashBacksApp

# Execute the java command -< java MyApp
# Only 1 CMD in a Dockerfile
CMD java  MyApp