#!/usr/bin/env groovy

node('home-panarik') {

    stage('Checkout') {
        checkout scm
    }

    withEnv(["ANDROID_SDK_ROOT=/usr/lib/android-sdk"]) {

        stage('Build app') {
            echo 'Билдим приложуху'
            sh './gradlew clean assembleDebug --no-daemon'
        }

        stage(' Force install app') {
            echo 'Принудительно ставим пакеты'
            sh 'adb install /home/ubuntu/workspace/home-notepad_AndroidClearApp_ForEmulator/app/build/outputs/apk/debug/app-debug.apk'
        }

        stage('Run Android tests') {
            echo 'Запускаем UI тесты на запущенном устройстве'
            sh './gradlew connectedAndroidTest --no-daemon'
        }

    }


}
