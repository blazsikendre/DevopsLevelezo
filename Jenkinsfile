pipeline {
    agent { label 'dockerslave' }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/blazsikendre/DevopsLevelezo.git'
            }
        }
        stage('Packaging') {
            steps {
               sh './gradlew build'
            }
        }
        stage('Docker Build') {
            steps {
               sh 'docker build -t blazsikendre/levelezo-example .'
            }
        }
        stage('Docker Push') {
            steps {
               sh 'docker login --username=blazsikendre --password=$docker_password'
               sh 'docker push blazsikendre/levelezo-example'
            }
        }
        stage('Deploy to Staging') {
            steps {
               sh 'docker run -d -rm -p 8765:8080 --name levelezo blazsikendre/levelezo-example'
            }
        }
        stage('Acceptance Test') {
            steps {
               sleep 30 
               sh './acceptance_test.sh'
            }
        }
    }
    post {
        always {
            sh 'docker stop levelezo'
        }
    }
}