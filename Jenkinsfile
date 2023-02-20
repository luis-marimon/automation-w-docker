#!groovy
node('principal') {

    docker.image('docker-image').pull()

    docker.image("${dockerImage}").inside("""--entrypoint=''"""){

        stage('csm') {
        echo 'getting sources'
            checkout scm
        }
        stage('Test') {
            echo 'Testing....'
            sh 'mvn verify serenity:aggregate'
        }
        stage('publish report'){
            publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'target/site/serenity', reportFiles: 'index.html', reportName: "Test Results", reportTitles: 'Serenity Report'])
        }

    }
}
