package com.example.na_sprawdzian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class GaleryActivity extends AppCompatActivity {
    private ImageView imageView;
    private Spinner spinner;
    private Button buttonLewo, ButtonPrawo, buttonWyswietl;
    private int aktualny =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);

        imageView = findViewById(R.id.imageView);
        buttonLewo = findViewById(R.id.lewo);
        ButtonPrawo = findViewById(R.id.prawo);
        buttonWyswietl = findViewById(R.id.button11);

        int obrazki [] = new int[]
                {       R.drawable.bledne_skaly,
                        R.drawable.omg_piesek,
                        R.drawable.szczeliniec,
                        R.drawable.woda_w_gorach,
                        R.drawable.szczelinowy_dom
                };
        buttonWyswietl.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        RadioGroup radioGroup = findViewById(R.id.radioGroup);
                        int idRadioKlikniety = radioGroup.getCheckedRadioButtonId();
                        if(idRadioKlikniety == R.id.radioButton5)
                        {
                            aktualny =0;

                        }
                        else if(idRadioKlikniety == R.id.radioButton3)
                        {
                            aktualny = 1;
                        }
                        else if(idRadioKlikniety == R.id.radioButton6)
                        {
                            aktualny = 2;
                        }
                        else {
                        aktualny = 3;
                        }

                        imageView.setImageResource(obrazki[aktualny]);

                    }
                }
        );
        buttonLewo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualny--;
                        if(aktualny < 0)
                        {
                            aktualny = obrazki.length-1;
                        }
                            imageView.setImageResource(obrazki[aktualny]);

                    }
                }
        );
        ButtonPrawo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        aktualny++;
                        if(aktualny == obrazki.length)
                        {
                            aktualny=0;
                        }
                            imageView.setImageResource(obrazki[aktualny]);

                    }
                }
        );


        spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(
                //spinner selected
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        aktualny = i;
                        imageView.setImageResource(obrazki[aktualny]);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                }
        );
    }
}