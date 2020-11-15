package se.niah.library


class JenkinsApi implements Serializable {
    def public static getNodes() {
        return Jenkins.instance.getAllItems()
    }
}