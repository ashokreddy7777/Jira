node('Linux'){
    stage('checkout'){
       checkout([$class: 'GitSCM', branches: [[name: '*/feature/JIT-1']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CleanBeforeCheckout', deleteUntrackedNestedRepositories: true]], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ashokreddy7777/Jira.git']]])
    }
    stage('build info'){
        jiraSendBuildInfo branch: '', site: 'avrb.atlassian.net'
    }
    stage('deployment info'){
        jiraSendDeploymentInfo environmentId: '01', environmentName: 'test', environmentType: 'testing', serviceIds: [''], site: 'avrb.atlassian.net', state: 'in_progress'
    }
}