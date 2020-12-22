#!/usr/bin/env groovy

node('home-panarik') {

    ansiColor('xterm') {

        checkout scm
        
            stage('Build and upload') {
                stage('Build app') {
                    echo 'Билдим приложуху'
                    sh './gradlew clean assembleDebug --no-daemon'
                }
                stage('Run Android tests') {
                    echo 'Запускаем UI тесты на запущенном устройстве'
                    sh './gradlew connectedAndroidTest --no-daemon'
                }
            }
        
    }
}
