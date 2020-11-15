def call(Map config = ["name":"No Name Pipeline"], Closure body = {}) {
    pipeline {
        agent { docker 'groovy' }
        stages {
            stage('Stage 1') {
                steps {
                    sh '/home/jenkins/pipeline_scripts/hello.groovy'
                }
            }
        }
    }
}