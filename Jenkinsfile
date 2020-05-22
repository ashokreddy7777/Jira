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
                jiraSendDeploymentInfo environmentId: '01', environmentName: 'dev', environmentType: 'development', serviceIds: [''], site: 'avrb.atlassian.net', state: 'success'
            }
        }
        stage ('D info'){
            jiraSendDeploymentInfo environmentId: '01', environmentName: 'test', environmentType: 'test', serviceIds: [''], site: 'avrb.atlassian.net', state: 'pending'
        }
    }
}