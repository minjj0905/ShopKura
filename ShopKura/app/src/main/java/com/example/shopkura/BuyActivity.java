package com.example.shopkura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

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

//        하단 결제 버튼
        Button pay_button = (Button)findViewById(R.id.payment);

//        가격 배열
        int[] price = {16000, 15000, 21000, 24000, 21000};

        Intent intent = getIntent();
        ArrayList<Integer> selectFlower = intent.getExtras().getIntegerArrayList("selectFlowers");
        int sum = 0;
        for(int i=0; i<selectFlower.size(); i++) {
            flowerLayouts[selectFlower.get(i)].setVisibility(View.VISIBLE);
        }
        for(int i=0; i<5; i++) {
            if(flowerLayouts[i].getVisibility() == View.VISIBLE) {
                sum += price[i];
            }
        }
        select_cnt.setText(""+selectFlower.size());
        total_price.setText(""+sum);

        pay_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((address.getText().toString().length() != 0) && (phone.getText().toString().length() != 0)) {
                    Intent after_intent = new Intent(getApplicationContext(), AfterBuyActivity.class);
                    startActivity(after_intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "주문자 정보를 모두 작성해주세요.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }

}