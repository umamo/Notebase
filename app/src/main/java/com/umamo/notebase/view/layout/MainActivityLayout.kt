package com.umamo.notebase.view.layout

import android.view.Gravity
import android.view.View
import com.umamo.notebase.R
import com.umamo.notebase.view.activity.MainActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivityLayout : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        verticalLayout {
            editText {
                hint = "文字を入力..."
            }.lparams(width = matchParent, height = wrapContent)
            button(R.string.test) {
                onClick {
                    toast("clicked!")
                }
                gravity = Gravity.CENTER
            }.lparams(width = wrapContent, height = wrapContent)
        }
    }
}