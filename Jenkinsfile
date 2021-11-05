#!/usr/bin/env groovy

pipeline {
    agent any 

    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotater(numToKeeper: '10'))
    }

    stages {

        stage('Create BaseLine Jobs') {
            steps {
                script {

                    echo 'Loading Jobs'

                    jobsDsl scriptText:
                    """
                    folder('tech-utils') {
                        description 'Folder contaning various tech utils'
                    }

                    folder('poc') {
                        description 'Folder containing various poc pipeline'
                    }
                    """

                    // poc pipeline
                    load("jobs/poc/s3bucket.groovy")
                
                }
            }
        }
    }
}