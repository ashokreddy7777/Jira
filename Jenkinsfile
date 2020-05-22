pipeline{
    agent {label'lin'}
    stages{
        stage('Build Info'){
            steps{
                jiraSendBuildInfo branch: '', site: 'avrb.atlassian.net'
            }
        }
        stage('Deployment Info'){
            steps{
                jiraSendDeploymentInfo environmentId: '01', environmentName: 'dev   ', environmentType: 'development', serviceIds: [''], site: 'avrb.atlassian.net', state: 'success'
            }
        }
        stage ('D info'){
            steps{
            jiraSendDeploymentInfo environmentId: '01', environmentName: 'test', environmentType: 'testing', serviceIds: [''], site: 'avrb.atlassian.net', state: 'pending'
            }
        }
    }
}