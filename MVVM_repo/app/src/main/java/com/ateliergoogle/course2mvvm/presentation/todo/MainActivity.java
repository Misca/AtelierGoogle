package com.ateliergoogle.course2mvvm.presentation.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ateliergoogle.course2mvvm.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ToDoFragment.newInstance())
                    .commitNow();
        }
    }
}
