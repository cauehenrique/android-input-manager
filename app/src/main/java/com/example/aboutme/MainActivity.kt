package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById<Button>(R.id.doneButton).setOnClickListener {
            addName(it);
        }
    }

    private fun addName(view: View) {
        val nameTextEdit = findViewById<EditText>(R.id.nameEditText);
        val nameTextView = findViewById<TextView>(R.id.nameText);

        nameTextView.text = nameTextEdit.text;
        nameTextView.visibility = View.VISIBLE;

        nameTextEdit.visibility = View.GONE;
        view.visibility = View.GONE;

        val inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager;
        inputManager.hideSoftInputFromWindow(view.windowToken, 0);
    }
}