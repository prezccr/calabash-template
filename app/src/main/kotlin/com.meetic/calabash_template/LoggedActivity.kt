package com.meetic.calabash_template

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.logged_activity.*
import java.util.*

/**
 * *  Meetic
 * *  Copyright (c) $year. All rights reserved.
 */
class LoggedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged_activity);
        val data : MutableList<String>  = ArrayList()
        var i = 0;
        while (i <= 100) {
            data.add("element " + i);
            i++
        }
        val adapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        listView.adapter = adapter;
    }
}
