package com.example.shopkura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BuyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

//        상단부터 순서대로
        TextView select_cnt = (TextView)findViewById(R.id.select_cnt_text);
        TextView total_price = (TextView)findViewById(R.id.total_price_text);

//        layout 배열
        ConstraintLayout layout_one = (ConstraintLayout)findViewById(R.id.layout_hydra);
        ConstraintLayout layout_two = (ConstraintLayout)findViewById(R.id.layout_fog);
        ConstraintLayout layout_three = (ConstraintLayout)findViewById(R.id.layout_rose);
        ConstraintLayout layout_four = (ConstraintLayout)findViewById(R.id.layout_set);
        ConstraintLayout layout_five = (ConstraintLayout)findViewById(R.id.layout_pink);
        ConstraintLayout[] flowerLayouts = {layout_one, layout_two, layout_three, layout_four, layout_five};

//        주소, 전화번호
        EditText address = (EditText)findViewById(R.id.editAddress);
        EditText phone = (EditText)findViewById(R.id.editTextPhone);


    }
}