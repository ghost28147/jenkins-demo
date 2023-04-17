pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build -x test'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                sh ("""
                    ./gradlew bootJar
                    cp build/libs/*.jar /tmp
                """)
            }
        }
    }
}
