package com.example.intentfilter

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast
import java.net.URI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBrowse.setOnClickListener {

//            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(etWebUrl.text.toString()))
//
//            try {
//
//                startActivity(intent)
//
//            } catch (anfe: ActivityNotFoundException) {
//
//                Log.e("ERROR", "Could not open Activity with given URL", anfe)
//                toast("Could not find any app to open this link")
//
//            }

              browse(etWebUrl.text.toString())

        }
    }
}
