hudson.model.Node
hudson.model.Jenkins

def call() {
    def nodes = Jenkins.instance.getNodes()
    echo "Nodes: " + nodes
    return nodes
}