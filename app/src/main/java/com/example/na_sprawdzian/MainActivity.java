package com.example.na_sprawdzian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listViewMysli;
    private ArrayList<String> mysli = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysli.add("Kto jada ostatki ten jest tłusty i gładki");
        mysli.add("Lepszy rydz niżnic");
        mysli.add("Nic nie jest szczegulnie trudne, jeżeli oddamy się w pr zepaść");
        mysli.add("Nie bądź zły, bądź dobry");
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_list_item_1,
                        mysli
                );
        listViewMysli = findViewById(R.id.listView2);
        listViewMysli.setAdapter(adapter);
    }
}
//formularze
//galeria
//timer
//używać recyclerView