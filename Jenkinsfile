pipeline {
    agent {
        label "ubuntu_vm"
    }
    
    environment {
        JAVA_HOME = "/usr/lib/jvm/java-17-openjdk-amd64"
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }
    
    stages{
        stage("Check Java Version")
        {
            steps{
                sh 'java --version'
            }
        }
        
        stage('Checkout')
        {
            steps{
                checkout scm
            }
        }
        
        stage('Build and Test')
        {
            steps{
                sh './mvnw clean test'
            }
        }
        
        
    }
    
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
    
}