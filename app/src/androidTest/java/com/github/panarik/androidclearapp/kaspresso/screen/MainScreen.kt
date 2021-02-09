package com.github.panarik.androidclearapp.kaspresso.screen

import com.agoda.kakao.text.KTextView
import com.github.panarik.androidclearapp.MainActivity
import com.github.panarik.androidclearapp.R
import com.kaspersky.kaspresso.screens.KScreen

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val helloTestView = KTextView {withId(R.id.testView)}

}