package com.example.simplecalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {
    private enum Operator {none,add,minus,multiply,divide}
    private double data1=0, data2=0;
    private Operator op=Operator.none;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn00Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }

    public void btn01Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }

    public void btn02Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }

    public void btn03Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }

    public void btn04Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }

    public void btn05Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }

    public void btn06Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }

    public void btn07Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }

    public void btn08Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }

    public void btn09Click(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }

    public void btnPlusClick(View view){
        op= Operator.add;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1= Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view){
        op= Operator.minus;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1= Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    public void btnDivideClick(View view){
        op= Operator.divide;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1= Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view){
        op= Operator.multiply;
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        data1= Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDotClick(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + ".");
    }

    public void btnClearClick(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        eText.setText("");
    }
    public void btnNumberClick(View view){
        TextView eText = (TextView)findViewById(R.id.resultEdit);
        int pressID = view.getId();
        switch (pressID){
            case R.id.btn00:
                eText.setText(eText.getText() + "0");
                break;
            case R.id.btn01:
                eText.setText(eText.getText() + "1");
                break;
            case R.id.btn02:
                eText.setText(eText.getText() + "2");
                break;
            case R.id.btn03:
                eText.setText(eText.getText() + "3");
                break;
            case R.id.btn04:
                eText.setText(eText.getText() + "4");
                break;
            case R.id.btn05:
                eText.setText(eText.getText() + "5");
                break;
            case R.id.btn06:
                eText.setText(eText.getText() + "6");
                break;
            case R.id.btn07:
                eText.setText(eText.getText() + "7");
                break;
            case R.id.btn08:
                eText.setText(eText.getText() + "8");
                break;
            case R.id.btn09:
                eText.setText(eText.getText() + "9");
                break;
            case R.id.btnDot:
                eText.setText(eText.getText() + ".");
                break;
            default:
                eText.setText("ERROR");
                Log.d("ERROR","Unknown Button Pressed!!");
        }
    }

    public void btnEqualClick(View view) {
        if (op != Operator.none) {
            TextView eText = (TextView) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (op == Operator.add) {
                result = data1 + data2;
            } else if (op == Operator.minus) {
                result = data1 - data2;
            } else if (op == Operator.multiply) {
                result = data1 * data2;
            } else if (op == Operator.divide) {
                result = data1 / data2;
            }

            op = Operator.none;
            if (result - (int) result != 0) {
                eText.setText(String.valueOf(result));
                return;
            }
            eText.setText(String.valueOf((int)result));
        }
    }
}