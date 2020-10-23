package com.example.shopkura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int main_to_basket = 1000;
    public static final int main_to_buy = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        상단의 장바구니 버튼
        Button basket_button = (Button)findViewById(R.id.go_basket);

//        하단 버튼들
        Button get_basket_button = (Button)findViewById(R.id.get_basket);
        Button buy_button = (Button)findViewById(R.id.buy);

//        꽃 checkbox 배열
        CheckBox checkBox_hydra = (CheckBox)findViewById(R.id.checkBox_hydra);
        CheckBox checkBox_fog = (CheckBox)findViewById(R.id.checkBox_fog);
        CheckBox checkBox_rose = (CheckBox)findViewById(R.id.checkBox_rose);
        CheckBox checkBox_set = (CheckBox)findViewById(R.id.checkBox_set);
        CheckBox checkBox_pink = (CheckBox)findViewById(R.id.checkBox_pink);
        CheckBox[] checkBoxes_flower = {checkBox_hydra, checkBox_fog, checkBox_rose,
                checkBox_set, checkBox_pink};

//        상단 장바구니 버튼 클릭시
        basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent basket_intent = new Intent(getApplicationContext(), BasketActivity.class);
                boolean flowerSelectCheck = isFlowerSelected(checkBoxes_flower);
                basket_intent.putExtra("isSelected", flowerSelectCheck);
//                선택된 꽃 있는지 확인하고 넘김
                if(flowerSelectCheck) {
                    ArrayList<Integer> selectFlower = getSelectFlowerNumber(checkBoxes_flower);
                    basket_intent.putExtra("selectFlowers", selectFlower);
                }

                startActivityForResult(basket_intent, main_to_basket);
            }
        });

//        하단 장바구니 버튼 클릭시
        get_basket_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                선택된 체크박스가 있는지 확인
                if(isFlowerSelected(checkBoxes_flower)) {
//                    있다면 선택된 것들 확인하고 basket 에 넘김
                    ArrayList<Integer> selectFlower = getSelectFlowerNumber(checkBoxes_flower);
                    Intent basket_intent = new Intent(getApplicationContext(), BasketActivity.class);
                    boolean flowerSelectCheck = isFlowerSelected(checkBoxes_flower);
                    basket_intent.putExtra("isSelected", flowerSelectCheck);
                    basket_intent.putExtra("selectFlowers", selectFlower);
                    startActivityForResult(basket_intent, main_to_basket);
                }
                else{
//                    장바구니 버튼을 눌렀을 때 선택된 체크박스가 없다면 Toast 출력
                    Toast toast = Toast.makeText(getApplicationContext(), "선택된 상품이 없습니다!",
                                                    Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

//        하단 구매하기 버튼 클릭시
        buy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isFlowerSelected(checkBoxes_flower)) {
                    Intent buy_intent = new Intent(getApplicationContext(), BuyActivity.class);
                    ArrayList<Integer> selectFlower = getSelectFlowerNumber(checkBoxes_flower);
                    buy_intent.putExtra("selectFlowers", selectFlower);
                    startActivity(buy_intent);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "선택된 상품이 없습니다!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    //꽃이 선택되었는지 확인하는 함수
    public boolean isFlowerSelected(CheckBox[] checkBoxes) {
        for(int i=0; i<checkBoxes.length; i++) {
            if(checkBoxes[i].isChecked()) {
                return true;
            }
        }
        return false;
    }

//    선택된 꽃의 번호를 반환하는 함수
    public ArrayList<Integer> getSelectFlowerNumber(CheckBox[] checkBoxes) {
        ArrayList<Integer> selectFlowerNumber = new ArrayList<>();
        for(int i=0; i<checkBoxes.length; i++) {
            if(checkBoxes[i].isChecked()) {
                selectFlowerNumber.add(i);
            }
        }
        return selectFlowerNumber;
    }

}