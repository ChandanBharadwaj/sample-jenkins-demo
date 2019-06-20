def pipelineShared = ''
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                pipelineShared = load 'sample.groovy'
                sh 'pwd'
                sh "git tag -a some_tag -m 'Jenkins'"
                sh "git push https://github.com/ChandanBharadwaj/sample-jenkins-demo.git --tags"
                pipelineShared.runJenkinsPipeline()
            }
        }
    }
}
