// vars/sayHello.groovy
def call(Map config, Closure body) {
    echo "Hello from pipeline: ${config.name}"
    if ( body != null) {
        body()
    }
}