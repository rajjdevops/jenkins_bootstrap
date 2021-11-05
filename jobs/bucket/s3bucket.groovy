#!/usr/bin/env groovy


    pipelineJob("folder name/job name") {
        description("<h3> this job will create</h3> ")
      
        logRotator {
            numTokeep(10)
        }

        properties {
                      disableConcurrentBuilds()
        }

        parameters { 
            choiceParam('DEPLOYMENT_BRANCH', ['new','master'], 'select branch to deploy')  
        }
  
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url ("https://github.com/rajjdevops/jenkins_bootstrap.git")
                            
                      
                        }
                        branch('\$DEPLOYMENT_BRANCH')    
                    }
                }
                scriptPath('shell/Jenkinsfile')
            }
        }

    }
