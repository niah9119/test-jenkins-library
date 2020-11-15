hudson.model.Node
hudson.model.Jenkins

def call(Map config = ["name":"No Name Pipeline"]) {
    pipeline {
        agent { docker 'groovy' }
        def nodes = ""
        stages {
            stage('Stage 1') {
                script {

                    p
                                    }
                steps {
                    sh '/home/jenkins/pipeline_scripts/hello.groovy'
                    List<Nodes> nodeList = api
                    echo "Nodes: " + nodeList
                }
            }
        }
    }
}