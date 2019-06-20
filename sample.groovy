def runJenkinsPipeline(buildScript) {
 println "Sample Groovy Script testing "
 stage('File Param WA') {
          writeFile file: 'demo.yaml', text: params.INPUT_PARAM
          println params.INPUT_PARAM
}
}
