package com.example.tp04_compoundbuttonex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name;
    RadioGroup rg_1, rg_2;
    RadioButton rb_g1, rb_g2, rb_c1, rb_c2, rb_c3;
    EditText et_num1, et_num2, et_num3;
    CheckBox cb_1, cb_2, cb_3, cb_4;
    Button btn;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et_name);

        rg_1 = findViewById(R.id.rg_1);
        rg_2 = findViewById(R.id.rg_2);

        /*rb_g1 = findViewById(R.id.rb_g1);
        rb_g2 = findViewById(R.id.rb_g2);
        rb_c1 = findViewById(R.id.rb_c1);
        rb_c2 = findViewById(R.id.rb_c2);
        rb_c3 = findViewById(R.id.rb_c3);*/

        et_num1 = findViewById(R.id.et_num1);
        et_num2 = findViewById(R.id.et_num2);
        et_num3 = findViewById(R.id.et_num3);

        cb_1 = findViewById(R.id.cb_1);
        cb_2 = findViewById(R.id.cb_2);
        cb_3 = findViewById(R.id.cb_3);
        cb_4 = findViewById(R.id.cb_4);

        btn = findViewById(R.id.btn); // 이걸 누르면..

        result = findViewById(R.id.result); // 여기로 위의 값들의 text 정보 출력.. !

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s = ""; // 여기다가 ++로 추가..

                s += name.getText().toString();
                s += " ";

                int gd = rg_1.getCheckedRadioButtonId(); // 체크된 버튼의 id를 받아오자.
                RadioButton rb = findViewById(gd); // 여기서 rb참조변수는 id를 갖고있지.
                s += rb.getText().toString();
                s += " ";

                int ct = rg_2.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(ct);
                s += rb2.getText().toString();
                s += " ";

                s += et_num1.getText().toString();
                s += "-";
                s += et_num2.getText().toString();
                s += "-";
                s += et_num3.getText().toString();
                s += "-";

                if(cb_1.isChecked()){
                    s+=cb_1.getText().toString();
                    s += " ";
                };
                if(cb_2.isChecked()){
                    s+=cb_2.getText().toString();
                    s += " ";
                };
                if(cb_3.isChecked()){
                    s+=cb_3.getText().toString();
                    s += " ";
                };
                if(cb_4.isChecked()){
                    s+=cb_4.getText().toString();
                    s += " ";
                };

                result.setText(s);






            }
        });






    }
}