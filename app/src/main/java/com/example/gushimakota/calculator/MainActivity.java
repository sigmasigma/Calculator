package com.example.gushimakota.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView num1,num2,ope,answer;
    int n1,n2,temp;

    int point;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (TextView)findViewById(R.id.num1);
        num2 = (TextView)findViewById(R.id.num2);
        ope = (TextView)findViewById(R.id.ope);
        answer = (TextView)findViewById(R.id.answer);
        num1.setText(" ");
        num2.setText(" ");
        ope.setText(" ");
        answer.setText("----");
        temp=0;

        point = 0;
    }

    public void bt0(View v){
        temp=0;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }

    public void bt1(View v){
        temp=1;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }

    public void bt2(View v){
        temp=2;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt3(View v){
        temp=3;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt4(View v){
        temp=4;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt5(View v){
        temp=5;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt6(View v){
        temp=6;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt7(View v){
        temp=7;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt8(View v){
        temp=8;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt9(View v){
        temp=9;
        if(point!=0){
            n2=n2*10 + temp;
            num2.setText(String.valueOf(n2));
        }else{
            n1 = n1*10+temp;
            num1.setText(String.valueOf(n1));
            num2.setText(" ");
            ope.setText(" ");
            answer.setText("----");
        }
    }

    public void equal(View v){
        int ans;
        switch (point) {
            case 1:
                ans = n1 + n2;
                answer.setText(String.valueOf(ans));
                break;
            case 2:
                ans = n1 - n2;
                answer.setText(String.valueOf(ans));
                break;
            case 3:
                ans = n1 * n2;
                answer.setText(String.valueOf(ans));
                break;
            case 4:
                double ans_d;
                ans_d = (double)n1 / (double)n2;
                answer.setText(String.valueOf(ans_d));
                break;
        }
        point = 0;
        n1 = 0;
        n2 = 0;
    }

    public void plus(View v){
        point = 1;
        ope.setText("+");
    }

    public void minus(View v){
        point = 2;
        ope.setText("-");
    }

    public void mul(View v){
        point = 3;
        ope.setText("×");
    }

    public void dvd(View v){
        point = 4;
        ope.setText("/");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
