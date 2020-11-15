def call(Map config = ["name":"No Name Pipeline"], Closure body = {}) {
    echo "Hello from superPipeline: ${config.name}"
    if (body != null) {
        body()
    }
    pipeline {
        agent { docker 'maven:3-alpine' }
        stages {
            stage('Stage 1') {
                steps {
                    sh 'hostname'
                    sh 'mvn -version'
                }
            }
        }
    }
}