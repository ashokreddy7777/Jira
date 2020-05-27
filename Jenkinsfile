node('Linux'){
    stage('build info'){
        jiraSendBuildInfo  site: 'avrb.atlassian.net'
    }
    stage('deployment info'){
        jiraSendDeploymentInfo environmentId: '02', environmentName: 'test', environmentType: 'testing', site: 'avrb.atlassian.net', state: 'in_progress'
    }
}
