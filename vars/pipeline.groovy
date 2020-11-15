// vars/sayHello.groovy
def call(Map config = ["name":"No Name Pipeline"], Closure body = {}) {
    echo "Hello from pipeline: ${config.name}"
    if ( body != null) {
        body()
    }
}