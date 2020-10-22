package com.example.shopkura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button basket_button = (Button)findViewById(R.id.go_basket);

        basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                Intent basket_intent = new Intent(getApplicationContext(), BasketActivity.class);
                startActivity(basket_intent);
            }
        });
    }
}