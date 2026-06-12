pipeline {
    agent any

    triggers {
        pollSCM('H/2 * * * *')   // check GitHub for new commits every ~2 minutes
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                bat 'javac Calculator.java'        // Windows agent: use bat instead of sh
            }
        }
        stage('Execute') {
            steps {
                bat 'java Calculator'
            }
        }
    }
}