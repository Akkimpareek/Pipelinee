pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control
                git url 'https://github.com/Akkimpareek/Pipelinee.git'
            }
        }
        stage('Build') {
            steps {
                // Use Maven to build your project
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Run tests if applicable
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Deploy your artifact, if necessary
                // Example: bat 'mvn deploy'
            }
        }
    }
    

    post {
        success {
            // This block will be executed if the pipeline runs successfully
            echo 'Pipeline executed successfully!'
        }
        failure {
            // This block will be executed if the pipeline fails
            echo 'Pipeline failed!'
        }
    }
}
