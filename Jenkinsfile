pipeline {
    agent any 

    options {
        disableConcurrentBuilds()
        timestamp()
        buildDiscarder(logRotater(numToKeeper: '10'))
    }

    stages {

        stage('Create BaseLine Jobs') {
            steps {
                script {

                    echo 'Loading Jobs'

                    jobsDsl scriptText:
                    """

                    folder('bucket') {
                        description 'Folder containing various poc pipeline'
                    }
                    """

                    // poc pipeline
                    load("jobs/bucket/s3bucket.groovy")
                
                }
            }
        }
    }
}