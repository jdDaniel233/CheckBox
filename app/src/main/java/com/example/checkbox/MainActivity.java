package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1= (CheckBox) findViewById(R.id.idchec1);
        c2= (CheckBox) findViewById(R.id.idchec2);
    }
    public void onClick(View view){
       if(view.getId()==R.id.btnValidar){
           validar();
       }
    }

    public void validar() {
    String cad="Seleccionado: \n";
    if(c1.isChecked()==true){
        cad+="Opcion 1 ";

    }
    if(c2.isChecked()==true){
        cad+="Opcion 2";
    }
        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }
}