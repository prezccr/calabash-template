package com.meetic.calabash_template

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.list_activity.*
import java.util.*

/**
 * *  Meetic
 * *  Copyright (c) $year. All rights reserved.
 */
class ListActivity : AppCompatActivity() {

    companion object {
        const val NUMBER_OF_ELEMENT : Int = 100;
    }

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        val data : MutableList<String>  = ArrayList()
        var i = 0;
        while (i <= NUMBER_OF_ELEMENT) {
            data.add("element " + i);
            i++
        }
        val adapter : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        listView.adapter = adapter;
        listView.setOnItemClickListener { adapterView, view, position, id ->

            val itemName : String = adapterView.adapter.getItem(position) as String;

            var intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.BUNDLE_ITEM_NAME, itemName);
            startActivity(intent);
        }
    }
}
