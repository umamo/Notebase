package com.umamo.notebase.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.umamo.notebase.view.layout.MainActivityLayout
import org.jetbrains.anko.setContentView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivityLayout().setContentView(this)
    }
}
