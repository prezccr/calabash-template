package com.meetic.calabash_template

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.main_activity.*

/**
 **  Meetic
 **  Copyright (c) $year. All rights reserved.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        loginButton.setOnClickListener {
            v ->
            if (emailEditTextView.text.isNotEmpty() && passwordEditTextView.text.isNotEmpty()) {
                startActivity(Intent(this, LoggedActivity::class.java));
            } else {
                emailEditTextView.error = "You should fill the email";
                passwordEditTextView.error = "You should set a password";
            }
        }
    }
}