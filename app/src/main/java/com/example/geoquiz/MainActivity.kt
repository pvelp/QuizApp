package com.example.geoquiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.geoquiz.ui.theme.GeoQuizTheme

class MainActivity : ComponentActivity() {
    private lateinit var mTrueButton: Button
    private lateinit var mFalseButton: Button

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        mTrueButton = findViewById(R.id.true_button)
        mTrueButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
        })

        mFalseButton = findViewById(R.id.false_button)
        mFalseButton.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        })
    }
}


