node('Linux'){
    stage('checkout'){
       checkout([$class: 'GitSCM', branches: [[name: 'feature/JIT-4']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CleanBeforeCheckout', deleteUntrackedNestedRepositories: true]], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ashokreddy7777/Jira.git']]])
    } 
    stage('build info'){
        jiraSendBuildInfo  site: 'avrb.atlassian.net'
    }
    stage('deployment info'){
        jiraSendDeploymentInfo environmentId: '02', environmentName: 'test', environmentType: 'testing', site: 'avrb.atlassian.net', state: 'in_progress'
    }
}

