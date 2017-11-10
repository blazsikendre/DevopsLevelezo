pipeline {
    agent { label 'dockerslave' }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/blazsikendre/DevopsLevelezo.git'
            }
        }
        stage('Compile') {
            steps {
               sh './gradlew compileJava'
            }
        }
        stage('Unit Test') {
            steps {
               sh './gradlew test'
            }
        }
    }
}