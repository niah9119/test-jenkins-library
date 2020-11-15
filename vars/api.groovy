hudson.model.Node
hudson.model.Jenkins

def call() {
    return Jenkins.instance.getNodes()
}