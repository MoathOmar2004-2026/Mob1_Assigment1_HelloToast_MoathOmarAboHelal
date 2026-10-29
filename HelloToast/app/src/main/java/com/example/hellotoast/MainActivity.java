package com.example.hellotoast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero;
    private Button mButtonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        mButtonZero = findViewById(R.id.button_zero);
        mButtonCount = findViewById(R.id.button_count);
    }
    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!!", Toast.LENGTH_SHORT).show();
    }
    public void showCount(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0) {
            mButtonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        } else {
            mButtonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }
        if (mCount > 0) {
            mButtonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.orange));
        }
    }
    public void showZero(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        mButtonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        mButtonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200));
    }
}