#!/usr/bin/env groovy

pipelineJob("job_4") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
				git {
					remote {
						github("rajjdevops/jenkins_bootstrap", "https")
					}
					branch("*/master")
				}
			}
			scriptPath("shell/Jenkinsfile")
		}
	}
	disabled(false)
}

