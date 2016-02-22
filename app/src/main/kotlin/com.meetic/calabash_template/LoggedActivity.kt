package com.meetic.calabash_template

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * *  Meetic
 * *  Copyright (c) $year. All rights reserved.
 */
class LoggedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged_activity);
    }
}
