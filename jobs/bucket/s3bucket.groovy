pipelineJob('shell') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/rajjdevops/jenkins_bootstrap.git')
          }
          branch('*/master')
        }
      }
      lightweight()
    }
  }
}
