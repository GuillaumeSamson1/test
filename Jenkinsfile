pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac test.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java test'
            }
        }
    }
}
