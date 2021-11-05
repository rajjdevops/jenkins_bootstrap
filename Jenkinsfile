pipeline {
    agent any 

  

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
