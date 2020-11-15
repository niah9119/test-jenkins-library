def call(Map config = ["name":"No Name Pipeline"], Closure body = {}) {
    echo "Hello from superPipeline: ${config.name}"
    if ( body != null) {
        body()
    }
    sh "hostname"
}