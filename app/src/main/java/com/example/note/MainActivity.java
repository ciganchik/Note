package com.example.note;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotesFragment notesFragment = new NotesFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.notes_container, notesFragment)
                .commit();

    }
}