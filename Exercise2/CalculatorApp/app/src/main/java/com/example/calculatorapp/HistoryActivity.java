package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HistoryActivity extends AppCompatActivity {
    private ListView History;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        History = findViewById(R.id.History);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        Map<String, ?> allEntries = sharedPreferences.getAll();
        List<String> historyList = new ArrayList<>();

        for (Map.Entry<String, ?>  entry: allEntries.entrySet()) {
            String historyy = entry.getKey() + ": " + entry.getValue().toString();
            historyList.add(historyy);
        }
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,historyList);
        History.setAdapter(adapter);

    }
}