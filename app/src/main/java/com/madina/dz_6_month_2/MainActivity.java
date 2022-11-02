package com.madina.dz_6_month_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }
    private void test() {
        TextView vhod=findViewById(R.id.vhod);
        TextView vipolnite =findViewById(R.id.vipolnite);
        EditText pochta =findViewById(R.id.pochta);
        EditText parol =findViewById(R.id.parol);
        Button voiti =findViewById(R.id.voiti);
        TextView zabil =findViewById(R.id.zabil);
        TextView najmite =findViewById(R.id.najmite);
        
        pochta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
            if (pochta.getText().toString().equals("")){  //в почту приходит текст, принимаем, отображаем текст и проверяем пусто или нет
                voiti.setBackgroundColor(Color.GRAY); // если пусто менять на серый
            }else {
                voiti.setBackgroundColor(Color.YELLOW); // если не пусто менять на желтый
            }
            }
            
        });
        voiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if (pochta.getText().toString().equals("admin")&& parol.getText().toString().equals("admin")) {
                 Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались!", Toast.LENGTH_SHORT).show();
                 vhod.setVisibility(View.GONE);
                 vipolnite.setVisibility(View.GONE);
                 parol.setVisibility(View.GONE);
                 pochta.setVisibility(View.GONE);
                 zabil.setVisibility(View.GONE);
                 najmite.setVisibility(View.GONE);
             }else {
                 Toast.makeText(MainActivity.this, "Вы ввели неверные данные!", Toast.LENGTH_SHORT).show();
             }

            }
        });
    }
}