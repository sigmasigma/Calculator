package com.example.gushimakota.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView num1,num2,ope,answer;
    int ans,temp;
    boolean point;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (TextView)findViewById(R.id.num1);
        num2 = (TextView)findViewById(R.id.num2);
        ope = (TextView)findViewById(R.id.ope);
        answer = (TextView)findViewById(R.id.answer);
        num1.setText("----");
        num2.setText("----");
        ope.setText(" ");
        answer.setText("----");
        temp=0;
        ans=0;
        point = false;
    }

    public void bt0(View v){
        if(point){
            num2.setText("0");
        }else{
            ans = 0;
            num1.setText("0");
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }

    public void bt1(View v){
        temp=1;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }

    public void bt2(View v){
        temp=2;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt3(View v){
        temp=3;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt4(View v){
        temp=4;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt5(View v){
        temp=5;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt6(View v){
        temp=6;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt7(View v){
        temp=7;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt8(View v){
        temp=8;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }
    public void bt9(View v){
        temp=9;
        if(point){
            ans+=temp;
            num2.setText(String.valueOf(temp));
        }else{
            ans = temp;
            num1.setText(String.valueOf(temp));
            num2.setText("----");
            ope.setText(" ");
            answer.setText("----");
        }
    }

    public void equal(View v){
        answer.setText(String.valueOf(ans));
        point = false;
        ans = 0;
    }

    public void plus(View v){
        point = true;
        ope.setText("+");
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
