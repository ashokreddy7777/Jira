node('Linux'){
    stage('build info'){
        jiraSendBuildInfo  site: 'avrb.atlassian.net'
    }
    stage('deployment info'){
        jiraSendDeploymentInfo environmentId: '01', environmentName: 'test', environmentType: 'testing', serviceIds: [''], site: 'avrb.atlassian.net', state: 'in_progress'
    }
}
