pipeline {

    agent none

    environment {
        ANDROID_SDK_ROOT = '/usr/lib/android-sdk'
    }

    stages {

        stage('Checkout scm') {
            agent {
                label 'jenkins-agent-build'
            }
            steps {
                checkout scm
            }
        }

        stage('Build') {
            agent {
                label 'jenkins-agent-build'
            }
            steps {
                echo 'Билдим приложуху'
                sh './gradlew clean assembleDebug --no-daemon'
                stash name: 'app', includes: '**', excludes: '**/.gradle/,**/.git/**'
            }
        }

        stage('Test') {

            agent {
                label 'home-panarik'
            }
            steps {
                unstash 'app'
                sh './gradlew connectedAndroidTest --no-daemon'
            }
            post {
                always {
                    junit '**/debugAndroidTest/**'
                }
            }

        }

    }
}