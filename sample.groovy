def runJenkinsPipeline(buildScript) {
 println "Sample Groovy Script testing "
  stage("upload") {
        def inputFile = input message: 'Upload file', parameters: [file(name: 'C:\Users\vinutha.g\Desktop\application.properties')]
        new hudson.FilePath(new File("$workspace/application.properties")).copyFrom(inputFile)
        inputFile.delete()
       println "File uploaded succesfully"
   }
 stage('File Param WA') {
          writeFile file: 'demo.yaml', text: params.INPUT_PARAM
          println params.INPUT_PARAM
}
}
