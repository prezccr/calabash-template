package com.meetic.calabash_template

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    companion object {
        const val BUNDLE_ITEM_NAME : String = "BUNDLE_ITEM_NAME";
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var itemName : String = intent.extras.getString(BUNDLE_ITEM_NAME);
        title = itemName;
    }
}