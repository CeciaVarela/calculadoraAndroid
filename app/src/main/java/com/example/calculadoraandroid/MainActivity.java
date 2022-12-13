package com.example.calculadoraandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Screen;
    private Button AC,Power,Back,Div,Mul,Plus,Min,One,Two,Three,Four,Five,Six,Seven,Eight,Nine,Zero,Ans,Point,Equal;
    private String input,Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen = findViewById(R.id.screen);
        AC = findViewById(R.id.ac);
        Power = findViewById(R.id.power);
        Back = findViewById(R.id.back);
        Div = findViewById(R.id.div);
        Seven = findViewById(R.id.seven);
        Eight = findViewById(R.id.eight);
        Nine = findViewById(R.id.nine);
        Mul = findViewById(R.id.multiplication);
        Four = findViewById(R.id.four);
        Five = findViewById(R.id.five);
        Six = findViewById(R.id.six);
        Min = findViewById(R.id.min);
        One = findViewById(R.id.one);
        Two = findViewById(R.id.two);
        Three = findViewById(R.id.three);
        Plus = findViewById(R.id.plus);
        Zero = findViewById(R.id.zero);
        Point = findViewById(R.id.point);
        Ans = findViewById(R.id.ans);
        Equal = findViewById(R.id.equal);
    }
    public void ButtonClick(View view){
        Button button=(Button) view;
        String data = button.getText().toString();
        switch (data){
            case "AC":
                input="";
                break;
            case "Ans":
                input += Answer;
                break;
            case "*":
                solve();
                input += "*";
                break;
            case "^":
                solve();
                input += "^";
                break;
            case "=":
                solve();
                Answer = input;
                break;
            case "DEL":
                String newText = input.substring(0,input.length()-1);
                input = newText;
                break;
            default:
                if(input==null){
                    input="";
                }
                if(data.equals("+") || data.equals("-") || data.equals("/")){
                   solve();
            }
                input += data;
        }
        Screen.setText(input);
    }
    private void solve() {
    }
}