package com.example.collapsingtoolbar

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.collapsingtoolbar.databinding.ActivityCollapsingToolbarBinding
import com.google.android.material.appbar.CollapsingToolbarLayout


class CollapsingToolbar : AppCompatActivity() {
    private lateinit var binding: ActivityCollapsingToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCollapsingToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val toolbar = findViewById<Toolbar>(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        val actionBar: ActionBar? = supportActionBar
//        actionBar?.setDisplayHomeAsUpEnabled(true)
//        val collapsingToolbarLayout =
//            findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar_layout)
//        collapsingToolbarLayout!!.title = " "
    }
}