pipeline {
  agent any

  tools {
    gradle "Gradle"
  }

  stages {
    stage('Build apk') {
      steps {
        echo 'I fucked up with my apk,  Its not an open source. This time build apk step is skipped'
      }
    }

    stage('Run test') {
      steps {
        git 'https://github.com/Ksevetest/app.sscom.git'
        sh 'gradle build'
      }
    }
  }

  post {
    always {
      script {
        allure([
          includeProperties: false,
          jdk: '',
          properties: [],
          reportBuildPolicy: 'ALWAYS',
          results: [[path: 'allure-results']]
          cleanWs()
        ])
      }
    }
  }
}