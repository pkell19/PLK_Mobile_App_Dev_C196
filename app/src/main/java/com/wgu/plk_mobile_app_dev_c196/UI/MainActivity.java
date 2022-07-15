package com.wgu.plk_mobile_app_dev_c196.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.wgu.plk_mobile_app_dev_c196.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toTermList(View view) {
        Intent intent = new Intent(MainActivity.this, TermList.class);
        startActivity(intent);
    }

    public void toCourseList(View view) {
        Intent intent = new Intent(MainActivity.this, CourseList.class);
        startActivity(intent);
    }

    public void toAssessmentList(View view) {
        Intent intent = new Intent(MainActivity.this, AssessmentList.class);
        startActivity(intent);
    }
}