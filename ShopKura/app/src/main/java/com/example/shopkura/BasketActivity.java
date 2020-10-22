package com.example.shopkura;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

// 시작될때 ----------


//        상단 홈버튼
        Button home_button = (Button)findViewById(R.id.button_home);

//        FlowerLayout 배열
        ConstraintLayout layout_one = (ConstraintLayout)findViewById(R.id.layout_hydra);
        ConstraintLayout layout_two = (ConstraintLayout)findViewById(R.id.layout_fog);
        ConstraintLayout layout_three = (ConstraintLayout)findViewById(R.id.layout_rose);
        ConstraintLayout layout_four = (ConstraintLayout)findViewById(R.id.layout_set);
        ConstraintLayout layout_five = (ConstraintLayout)findViewById(R.id.layout_pink);
        ConstraintLayout[] flowerLayouts = {layout_one, layout_two, layout_three, layout_four, layout_five};

//        CheckBox 배열
        CheckBox checkBox_one = (CheckBox)findViewById(R.id.checkBox_hydra);
        CheckBox checkBox_two = (CheckBox)findViewById(R.id.checkBox_fog);
        CheckBox checkBox_three = (CheckBox)findViewById(R.id.checkBox_rose);
        CheckBox checkBox_four = (CheckBox)findViewById(R.id.checkBox_set);
        CheckBox checkBox_five = (CheckBox)findViewById(R.id.checkBox_pink);
        CheckBox[] flowerCheckBoxes = {checkBox_one, checkBox_two, checkBox_three, checkBox_four, checkBox_five};

//        Empty TextView
        TextView emptyText = (TextView)findViewById(R.id.empty_text);

//        선택된 상품 개수
        TextView select_cnt = (TextView)findViewById(R.id.select_cnt_text);
//        총가격
        TextView total_price = (TextView)findViewById(R.id.total_price_text);

//        total layout
        LinearLayout total_layout = (LinearLayout)findViewById(R.id.total_layout);

//        가격 배열
        int[] price = {16000, 15000, 21000, 24000, 21000};

        Intent main_intent = getIntent();
        boolean isSelected = main_intent.getExtras().getBoolean("isSelected");

        if(isSelected) {
            ArrayList<Integer> selectFlower = main_intent.getExtras().getIntegerArrayList("selectFlowers");
            emptyText.setVisibility(View.GONE);
            total_layout.setVisibility(View.VISIBLE);
            int sum = 0;
            for(int i=0; i<selectFlower.size(); i++) {
                flowerLayouts[selectFlower.get(i)].setVisibility(View.VISIBLE);
                flowerCheckBoxes[selectFlower.get(i)].setChecked(true);
                sum += price[i];
            }
            select_cnt.setText(""+selectFlower.size());
            total_price.setText(""+sum);

        } else {
            emptyText.setVisibility(View.VISIBLE);
            total_layout.setVisibility(View.GONE);
        }


//        상단 홈버튼 클릭시 홈으로 이동
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}