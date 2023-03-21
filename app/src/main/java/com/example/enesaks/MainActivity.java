package com.example.enesaks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnVirgul,btnEsittir,btnArti,btnEksi,btnCarp,btnBol,btnYuzde,btnArtıEksi,btnAllClear;
    TextView HesapCevap,HesapCozum;
    Double temp1,temp2;
    boolean toplam = false,cıkarma = false, carpma = false, bolme = false , yuzde = false;

    private void btnTikla(String deger){
        switch (deger){
            case "0":
                HesapCevap.setText(HesapCevap.getText().toString()+"0");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "1":
                HesapCevap.setText(HesapCevap.getText().toString()+"1");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "2":
                HesapCevap.setText(HesapCevap.getText().toString()+"2");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "3":
                HesapCevap.setText(HesapCevap.getText().toString()+"3");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "4":
                HesapCevap.setText(HesapCevap.getText().toString()+"4");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "5":
                HesapCevap.setText(HesapCevap.getText().toString()+"5");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "6":
                HesapCevap.setText(HesapCevap.getText().toString()+"6");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "7":
                HesapCevap.setText(HesapCevap.getText().toString()+"7");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "8":
                HesapCevap.setText(HesapCevap.getText().toString()+"8");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "9":
                HesapCevap.setText(HesapCevap.getText().toString()+"9");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "V":
                HesapCevap.setText(HesapCevap.getText().toString()+".");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "eksi":
                temp1 = Double.parseDouble(HesapCevap.getText().toString());
                temp1 = temp1*(-1);
                HesapCevap.setText(temp1+"");
                HesapCozum.setText(HesapCevap.getText());
                break;
            case "+":
                //Kontrol bloğu işlemden önce işlem varsa bidaha getirmesine izin vermemk için.
                char[] chrCevap = (HesapCevap.getText().toString()).toCharArray();
                if(HesapCevap.getText().toString().matches("") || chrCevap[chrCevap.length-1] == '+'|| chrCevap[chrCevap.length-1] == '-'|| chrCevap[chrCevap.length-1] == '/'|| chrCevap[chrCevap.length-1] == '*' || chrCevap[chrCevap.length-1] == '%'|| chrCevap[chrCevap.length-1] == ','){
                }else
                    temp1 = Double.parseDouble(HesapCevap.getText()+"");
                    HesapCozum.setText(HesapCevap.getText().toString()+"+");
                    HesapCevap.setText(null);
                    toplam = true;
                break;
            case "-":
                chrCevap = (HesapCevap.getText().toString()).toCharArray();
                if(HesapCevap.getText().toString().matches("") || chrCevap[chrCevap.length-1] == '+'|| chrCevap[chrCevap.length-1] == '-'|| chrCevap[chrCevap.length-1] == '/'|| chrCevap[chrCevap.length-1] == '*' || chrCevap[chrCevap.length-1] == '%'|| chrCevap[chrCevap.length-1] == ','){
                }else
                    temp1 = Double.parseDouble(HesapCevap.getText()+"");
                    HesapCozum.setText(HesapCevap.getText().toString()+"-");

                    cıkarma = true;
                break;
            case "*":
                chrCevap = (HesapCevap.getText().toString()).toCharArray();
                if(HesapCevap.getText().toString().matches("") || chrCevap[chrCevap.length-1] == '+'|| chrCevap[chrCevap.length-1] == '-'|| chrCevap[chrCevap.length-1] == '/'|| chrCevap[chrCevap.length-1] == '*' || chrCevap[chrCevap.length-1] == '%'|| chrCevap[chrCevap.length-1] == ','){
                }else
                    temp1 = Double.parseDouble(HesapCevap.getText()+"");
                    HesapCozum.setText(HesapCevap.getText().toString()+"*");
                    HesapCevap.setText(null);
                    carpma = true;
                break;
            case "/":
                chrCevap = (HesapCevap.getText().toString()).toCharArray();
                if(HesapCevap.getText().toString().matches("") || chrCevap[chrCevap.length-1] == '+'|| chrCevap[chrCevap.length-1] == '-'|| chrCevap[chrCevap.length-1] == '/'|| chrCevap[chrCevap.length-1] == '*' || chrCevap[chrCevap.length-1] == '%'|| chrCevap[chrCevap.length-1] == ','){
                }else
                    temp1 = Double.parseDouble(HesapCevap.getText()+"");
                    HesapCozum.setText(HesapCevap.getText().toString()+"/");
                    HesapCevap.setText(null);
                    bolme = true;
                break;
            case "=":
                temp2 = Double.parseDouble(HesapCevap.getText()+"");
                if (toplam == true){
                    HesapCevap.setText(temp1+temp2+"");
                    HesapCozum.setText(temp1+"+"+temp2);
                    toplam = false;
                }
                if (carpma == true){
                    HesapCevap.setText(temp1*temp2+"");
                    HesapCozum.setText(temp1+"*"+temp2);
                    carpma = false;
                }
                if (cıkarma == true){
                    HesapCevap.setText(temp1-temp2+"");
                    HesapCozum.setText(temp1+"-"+temp2);
                    cıkarma = false;
                }
                if (bolme == true){
                    HesapCevap.setText(temp1/temp2+"");
                    HesapCozum.setText(temp1+"/"+temp2);
                    bolme = false;
                }




                break;
            case "A":
                HesapCevap.setText(null);
                HesapCozum.setText(null);
                break;


        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnVirgul = findViewById(R.id.btnvirgul);
        btnEsittir = findViewById(R.id.btnesit);
        btnArti = findViewById(R.id.btntopla);
        btnEksi = findViewById(R.id.btncikar);
        btnCarp = findViewById(R.id.btncarp);
        btnBol = findViewById(R.id.btnBol);
        btnYuzde = findViewById(R.id.btnYuzde);
        btnArtıEksi = findViewById(R.id.btnArtieksi);
        btnAllClear = findViewById(R.id.btnAC);
        HesapCevap = findViewById(R.id.hesapCevap);
        HesapCozum = findViewById(R.id.hesapCozum);

        }

    public void btn0(View view){
        btnTikla("0");
    }
    public void btn1(View view){
        btnTikla("1");
    }
    public void btn2(View view){
        btnTikla("2");
    }
    public void btn3(View view){
        btnTikla("3");
    }
    public void btn4(View view){
        btnTikla("4");
    }
    public void btn5(View view){
        btnTikla("5");
    }
    public void btn6(View view){
        btnTikla("6");
    }
    public void btn7(View view){
        btnTikla("7");
    }
    public void btn8(View view){
        btnTikla("8");
    }
    public void btn9(View view){
        btnTikla("9");
    }
    public void btnArti(View view){
        btnTikla("+");
    }
    public void btnEksi(View view){
        btnTikla("-");
    }
    public void btnArtıEksiEksi(View view){
        btnTikla("eksi");
    }
    public void btnCarp(View view){
        btnTikla("*");
    }
    public void btnBol(View view){
        btnTikla("/");
    }
    public void btnVirgul(View view){
        btnTikla("V");
    }
    public void btnEsittir(View view){
        btnTikla("=");
    }
    public void btnAllClear(View view){
        btnTikla("A");
    }



}