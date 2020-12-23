pipeline {

    stages {

        stage('Build') {
            node('jenkins-agent-build') {
                checkout scm
                steps {
                    echo 'Билдим приложуху'
                    sh './gradlew clean assembleDebug --no-daemon'
                    stash name: 'app', includes: '**', excludes: '**/.gradle/,**/.git/**'
                }
            }
        }

        stage('Test') {
            node('home-panarik') {
                try {
                    unstash 'app'
                    sh './gradlew connectedAndroidTest --no-daemon'
                }
                finally {
                    junit '**/debugAndroidTest/**'
                }
            }

        }

    }
}