package se.niah.library

import hudson.model.Node

class JenkinsApi implements Serializable {
    public static List<Node> getNodes() {
        return Jenkins.instance.getNodes()
    }
}