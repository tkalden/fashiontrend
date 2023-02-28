# Readme

## Building Gradle Project

1. Clone the repository to your local machine.
2. Open a terminal window and navigate to the project directory.
3. Run `./gradlew build` to build the project.

## Running Dockerfile

1. Build the Docker image by running `docker build -t <image-name> .` in the project directory.
2. Once the build is complete, start the container by running `docker run -p 8080:8080 <image-name>`.

## Running Minikube

1. Start Minikube by running `minikube start`.
2. Run `kubectl create deployment <deployment-name> --image=<image-name>` to create a new deployment.
3. Expose the deployment as a service by running `kubectl expose deployment <deployment-name> --port=8080 --target-port=8080`.
4. Run `minikube service <deployment-name>` to access the application.

Note: Make sure that you have Docker and Minikube installed on your local machine before proceeding with the above steps.