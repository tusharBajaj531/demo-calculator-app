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
        
        stage('Build and Test')
        {
            steps{
                sh './mvnw clean test'
            }

            
        }

        stage ('Package'){
            steps{
                sh './mvnw package -DskipTests'
            }
        }
        
        stage('Build Docker Image')
        {
            steps{
                sh 'docker rm -f demo-calculator-app-container || true'
                sh 'docker rmi -f demo-calculator-app:0.0.1 || true'
                sh 'docker build -t demo-calculator-app:0.0.1 .'
            }
        }

        stage('Run Docker Container'){
            steps{
                sh 'docker run -d -p 8081:8081 --name demo-calculator-app-container demo-calculator-app:0.0.1'
            }
        }
        
    }
    
    post {
           always {
                  junit 'target/surefire-reports/*.xml'
            }
        }
    
}