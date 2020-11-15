// vars/sayHello.groovy
def call(Map config = [:]') {
    echo "Hello from pipeline: ${config.name}"
}