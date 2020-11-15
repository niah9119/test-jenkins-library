import se.niah.library.JenkinsApi


def call(Map config = ["name":"No Name Pipeline"]) {
    pipeline {
        agent { docker 'groovy' }
        stages {
            stage('Stage 1') {
                steps {
                    sh '/home/jenkins/pipeline_scripts/hello.groovy'
                    def jobs = JenkinsApi.getNodes()
                    echo "Jobs: " + jobs.toString()
                }
            }
        }
    }
}