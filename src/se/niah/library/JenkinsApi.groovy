package se.niah.library

import hudson.model.Node

class JeninsApi implements Serializable {
    public static List<Node> getNodes() {
        return Jenkins.instance.getNodes()
    }
}