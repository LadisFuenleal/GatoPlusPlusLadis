package com.example.mygatoplusplusladis;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    int turno,cont,conta=0;
    String letra;

    //Creo mi Editext
    EditText Et_Ganador;

    //Creo mis botones
    Button Btn_1,Btn_2,Btn_3,Btn_4,Btn_5,Btn_6,Btn_7,Btn_8,Btn_9,Btn_10,Btn_11,Btn_12,Btn_13,Btn_14,Btn_15,Btn_16,Btn_17,Btn_18,Btn_19,Btn_20,Btn_21,Btn_22,Btn_23,Btn_24,Btn_25,Btn_26,Btn_27,Btn_28,Btn_29,Btn_30,Btn_31,Btn_32,Btn_33,Btn_34,Btn_35,Btn_36,Btn_Salir,Btn_Reset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        //Jalo las referencias

        Et_Ganador=(EditText)findViewById(R.id.Et_Ganador);

        Btn_1=(Button)(findViewById(R.id.Btn_1));
        Btn_2=(Button)(findViewById(R.id.Btn_2));
        Btn_3=(Button)(findViewById(R.id.Btn_3));
        Btn_4=(Button)(findViewById(R.id.Btn_4));
        Btn_5=(Button)(findViewById(R.id.Btn_5));
        Btn_6=(Button)(findViewById(R.id.Btn_6));
        Btn_7=(Button)(findViewById(R.id.Btn_7));
        Btn_8=(Button)(findViewById(R.id.Btn_8));
        Btn_9=(Button)(findViewById(R.id.Btn_9));
        Btn_10=(Button)(findViewById(R.id.Btn_10));
        Btn_11=(Button)(findViewById(R.id.Btn_11));
        Btn_12=(Button)(findViewById(R.id.Btn_12));
        Btn_13=(Button)(findViewById(R.id.Btn_13));
        Btn_14=(Button)(findViewById(R.id.Btn_14));
        Btn_15=(Button)(findViewById(R.id.Btn_15));
        Btn_16=(Button)(findViewById(R.id.Btn_16));
        Btn_17=(Button)(findViewById(R.id.Btn_17));
        Btn_18=(Button)(findViewById(R.id.Btn_18));
        Btn_19=(Button)(findViewById(R.id.Btn_19));
        Btn_20=(Button)(findViewById(R.id.Btn_20));
        Btn_21=(Button)(findViewById(R.id.Btn_21));
        Btn_22=(Button)(findViewById(R.id.Btn_22));
        Btn_23=(Button)(findViewById(R.id.Btn_23));
        Btn_24=(Button)(findViewById(R.id.Btn_24));
        Btn_25=(Button)(findViewById(R.id.Btn_25));
        Btn_26=(Button)(findViewById(R.id.Btn_26));
        Btn_27=(Button)(findViewById(R.id.Btn_27));
        Btn_28=(Button)(findViewById(R.id.Btn_28));
        Btn_29=(Button)(findViewById(R.id.Btn_29));
        Btn_30=(Button)(findViewById(R.id.Btn_30));
        Btn_31=(Button)(findViewById(R.id.Btn_31));
        Btn_32=(Button)(findViewById(R.id.Btn_32));
        Btn_33=(Button)(findViewById(R.id.Btn_33));
        Btn_34=(Button)(findViewById(R.id.Btn_34));
        Btn_35=(Button)(findViewById(R.id.Btn_35));
        Btn_36=(Button)(findViewById(R.id.Btn_36));
        Btn_Salir=(Button)(findViewById(R.id.Btn_Salir));
        Btn_Reset =(Button)(findViewById(R.id.Btn_Reset));



        //Estamos haciendo que mis botones los escuche el onClick
        Btn_1.setOnClickListener(this);
        Btn_2.setOnClickListener(this);
        Btn_3.setOnClickListener(this);
        Btn_4.setOnClickListener(this);
        Btn_5.setOnClickListener(this);
        Btn_6.setOnClickListener(this);
        Btn_7.setOnClickListener(this);
        Btn_8.setOnClickListener(this);
        Btn_9.setOnClickListener(this);
        Btn_10.setOnClickListener(this);
        Btn_11.setOnClickListener(this);
        Btn_12.setOnClickListener(this);
        Btn_13.setOnClickListener(this);
        Btn_14.setOnClickListener(this);
        Btn_15.setOnClickListener(this);
        Btn_16.setOnClickListener(this);
        Btn_17.setOnClickListener(this);
        Btn_18.setOnClickListener(this);
        Btn_19.setOnClickListener(this);
        Btn_20.setOnClickListener(this);
        Btn_21.setOnClickListener(this);
        Btn_22.setOnClickListener(this);
        Btn_23.setOnClickListener(this);
        Btn_24.setOnClickListener(this);
        Btn_25.setOnClickListener(this);
        Btn_26.setOnClickListener(this);
        Btn_27.setOnClickListener(this);
        Btn_28.setOnClickListener(this);
        Btn_29.setOnClickListener(this);
        Btn_30.setOnClickListener(this);
        Btn_31.setOnClickListener(this);
        Btn_32.setOnClickListener(this);
        Btn_33.setOnClickListener(this);
        Btn_34.setOnClickListener(this);
        Btn_35.setOnClickListener(this);
        Btn_36.setOnClickListener(this);
        Btn_Salir.setOnClickListener(this);
        Btn_Reset.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        cont++;
        turno=cont%2;

        //Jugador 1 X
        if(turno == 1){
            imprimirXO('x', v);
        }

        //Jugador 2 O
        else{
            imprimirXO('o', v);
        }


    }//Fin del onClick


    public void imprimirXO(char letra, View v){

        if(v.getId() == R.id.Btn_Reset){
            Et_Ganador.setEnabled(true);
            Et_Ganador.setText("");

            Btn_1.setEnabled(true);
            Btn_1.setText("");

            Btn_2.setEnabled(true);
            Btn_2.setText("");

            Btn_3.setEnabled(true);
            Btn_3.setText("");

            Btn_4.setEnabled(true);
            Btn_4.setText("");

            Btn_5.setEnabled(true);
            Btn_5.setText("");

            Btn_6.setEnabled(true);
            Btn_6.setText("");

            Btn_7.setEnabled(true);
            Btn_7.setText("");

            Btn_8.setEnabled(true);
            Btn_8.setText("");

            Btn_9.setEnabled(true);
            Btn_9.setText("");

            Btn_10.setEnabled(true);
            Btn_10.setText("");

            Btn_11.setEnabled(true);
            Btn_11.setText("");

            Btn_12.setEnabled(true);
            Btn_12.setText("");

            Btn_13.setEnabled(true);
            Btn_13.setText("");

            Btn_14.setEnabled(true);
            Btn_14.setText("");

            Btn_15.setEnabled(true);
            Btn_15.setText("");

            Btn_16.setEnabled(true);
            Btn_16.setText("");

            Btn_17.setEnabled(true);
            Btn_17.setText("");

            Btn_18.setEnabled(true);
            Btn_18.setText("");

            Btn_19.setEnabled(true);
            Btn_19.setText("");

            Btn_20.setEnabled(true);
            Btn_20.setText("");

            Btn_21.setEnabled(true);
            Btn_21.setText("");

            Btn_22.setEnabled(true);
            Btn_22.setText("");

            Btn_23.setEnabled(true);
            Btn_23.setText("");

            Btn_24.setEnabled(true);
            Btn_24.setText("");

            Btn_25.setEnabled(true);
            Btn_25.setText("");

            Btn_26.setEnabled(true);
            Btn_26.setText("");

            Btn_27.setEnabled(true);
            Btn_27.setText("");

            Btn_28.setEnabled(true);
            Btn_28.setText("");

            Btn_29.setEnabled(true);
            Btn_29.setText("");

            Btn_30.setEnabled(true);
            Btn_30.setText("");

            Btn_31.setEnabled(true);
            Btn_31.setText("");

            Btn_32.setEnabled(true);
            Btn_32.setText("");

            Btn_33.setEnabled(true);
            Btn_33.setText("");

            Btn_34.setEnabled(true);
            Btn_34.setText("");

            Btn_35.setEnabled(true);
            Btn_35.setText("");

            Btn_36.setEnabled(true);
            Btn_36.setText("");
        }

        if(v.getId() == R.id.Btn_Salir){
            System.exit(0);
        }


        if(v.getId() == R.id.Btn_1){
            Btn_1.setText(letra+"");
            Btn_1.setEnabled(false);
        }//Cierro el IF
        else if(v.getId() == R.id.Btn_2){
            Btn_2.setText(letra+"");
            Btn_2.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_3){
            Btn_3.setText(letra+"");
            Btn_3.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_4){
            Btn_4.setText(letra+"");
            Btn_4.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_5){
            Btn_5.setText(letra+"");
            Btn_5.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_6){
            Btn_6.setText(letra+"");
            Btn_6.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_7){
            Btn_7.setText(letra+"");
            Btn_7.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_8){
            Btn_8.setText(letra+"");
            Btn_8.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_9){
            Btn_9.setText(letra+"");
            Btn_9.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_10){
            Btn_10.setText(letra+"");
            Btn_10.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_11){
            Btn_11.setText(letra+"");
            Btn_11.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_12){
            Btn_12.setText(letra+"");
            Btn_12.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_13){
            Btn_13.setText(letra+"");
            Btn_13.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_14){
            Btn_14.setText(letra+"");
            Btn_14.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_15){
            Btn_15.setText(letra+"");
            Btn_15.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_16){
            Btn_16.setText(letra+"");
            Btn_16.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_17){
            Btn_17.setText(letra+"");
            Btn_17.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_18){
            Btn_18.setText(letra+"");
            Btn_18.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_19){
            Btn_19.setText(letra+"");
            Btn_19.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_20){
            Btn_20.setText(letra+"");
            Btn_20.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_21){
            Btn_21.setText(letra+"");
            Btn_21.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_22){
            Btn_22.setText(letra+"");
            Btn_22.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_23){
            Btn_23.setText(letra+"");
            Btn_23.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_24){
            Btn_24.setText(letra+"");
            Btn_24.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_25){
            Btn_25.setText(letra+"");
            Btn_25.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_26){
            Btn_26.setText(letra+"");
            Btn_26.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_27){
            Btn_27.setText(letra+"");
            Btn_27.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_28){
            Btn_28.setText(letra+"");
            Btn_28.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_29){
            Btn_29.setText(letra+"");
            Btn_29.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_30){
            Btn_30.setText(letra+"");
            Btn_30.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_31){
            Btn_31.setText(letra+"");
            Btn_31.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_32){
            Btn_32.setText(letra+"");
            Btn_32.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_33){
            Btn_33.setText(letra+"");
            Btn_33.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_34){
            Btn_34.setText(letra+"");
            Btn_34.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_35){
            Btn_35.setText(letra+"");
            Btn_35.setEnabled(false);
        }
        else if(v.getId() == R.id.Btn_36){
            Btn_36.setText(letra+"");
            Btn_36.setEnabled(false);
        }

        Ganador(letra);


    }//Fin del Metodo imprimirXO

    public void Ganador(char letra){

        if(Btn_1.getText().toString().equals(letra+"") && (Btn_2.getText().toString().equals(letra+"")) && (Btn_3.getText().toString().equals(letra+"")) && (Btn_10.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_4.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_6.getText().toString().equals(letra+"")) && (Btn_13.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_7.getText().toString().equals(letra+"") && (Btn_8.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+""))&& (Btn_16.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_1.getText().toString().equals(letra+"") && (Btn_4.getText().toString().equals(letra+"")) && (Btn_7.getText().toString().equals(letra+""))&& (Btn_19.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_2.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_8.getText().toString().equals(letra+"")) && (Btn_20.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_3.getText().toString().equals(letra+"") && (Btn_6.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+"")) && (Btn_21.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_1.getText().toString().equals(letra+"") && (Btn_5.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+"")) && (Btn_28.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_10.getText().toString().equals(letra+"") && (Btn_11.getText().toString().equals(letra+"")) && (Btn_12.getText().toString().equals(letra+"")) && (Btn_3.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_13.getText().toString().equals(letra+"") && (Btn_14.getText().toString().equals(letra+"")) && (Btn_15.getText().toString().equals(letra+"")) && (Btn_6.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_16.getText().toString().equals(letra+"") && (Btn_17.getText().toString().equals(letra+"")) && (Btn_18.getText().toString().equals(letra+"")) && (Btn_9.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_10.getText().toString().equals(letra+"") && (Btn_13.getText().toString().equals(letra+"")) && (Btn_16.getText().toString().equals(letra+"")) && (Btn_28.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_11.getText().toString().equals(letra+"") && (Btn_14.getText().toString().equals(letra+"")) && (Btn_17.getText().toString().equals(letra+"")) && (Btn_29.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_12.getText().toString().equals(letra+"") && (Btn_15.getText().toString().equals(letra+"")) && (Btn_18.getText().toString().equals(letra+"")) && (Btn_30.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_12.getText().toString().equals(letra+"") && (Btn_14.getText().toString().equals(letra+"")) && (Btn_16.getText().toString().equals(letra+"")) && (Btn_21.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_19.getText().toString().equals(letra+"") && (Btn_20.getText().toString().equals(letra+"")) && (Btn_21.getText().toString().equals(letra+""))&& (Btn_28.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_22.getText().toString().equals(letra+"") && (Btn_23.getText().toString().equals(letra+"")) && (Btn_24.getText().toString().equals(letra+""))&& (Btn_31.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }
        else if(Btn_25.getText().toString().equals(letra+"") && (Btn_26.getText().toString().equals(letra+"")) && (Btn_27.getText().toString().equals(letra+""))&& (Btn_34.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_19.getText().toString().equals(letra+"") && (Btn_22.getText().toString().equals(letra+"")) && (Btn_25.getText().toString().equals(letra+""))&& (Btn_7.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_20.getText().toString().equals(letra+"") && (Btn_23.getText().toString().equals(letra+"")) && (Btn_26.getText().toString().equals(letra+""))&& (Btn_8.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_21.getText().toString().equals(letra+"") && (Btn_24.getText().toString().equals(letra+"")) && (Btn_27.getText().toString().equals(letra+""))&& (Btn_9.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_21.getText().toString().equals(letra+"") && (Btn_23.getText().toString().equals(letra+"")) && (Btn_25.getText().toString().equals(letra+""))&& (Btn_16.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_28.getText().toString().equals(letra+"") && (Btn_29.getText().toString().equals(letra+"")) && (Btn_30.getText().toString().equals(letra+""))&& (Btn_21.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_31.getText().toString().equals(letra+"") && (Btn_32.getText().toString().equals(letra+"")) && (Btn_33.getText().toString().equals(letra+""))&& (Btn_24.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_34.getText().toString().equals(letra+"") && (Btn_35.getText().toString().equals(letra+"")) && (Btn_36.getText().toString().equals(letra+""))&& (Btn_27.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_28.getText().toString().equals(letra+"") && (Btn_31.getText().toString().equals(letra+"")) && (Btn_34.getText().toString().equals(letra+""))&& (Btn_16.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_29.getText().toString().equals(letra+"") && (Btn_32.getText().toString().equals(letra+"")) && (Btn_35.getText().toString().equals(letra+""))&& (Btn_17.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_30.getText().toString().equals(letra+"") && (Btn_33.getText().toString().equals(letra+"")) && (Btn_36.getText().toString().equals(letra+""))&& (Btn_18.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(Btn_28.getText().toString().equals(letra+"") && (Btn_32.getText().toString().equals(letra+"")) && (Btn_36.getText().toString().equals(letra+""))&& (Btn_9.getText().toString().equals(letra+""))){
            Et_Ganador.setText("El ganador es "+letra);
            Et_Ganador.setEnabled(false);
            Btn_1.setEnabled(false);
            Btn_2.setEnabled(false);
            Btn_3.setEnabled(false);
            Btn_4.setEnabled(false);
            Btn_5.setEnabled(false);
            Btn_6.setEnabled(false);
            Btn_7.setEnabled(false);
            Btn_8.setEnabled(false);
            Btn_9.setEnabled(false);
            Btn_10.setEnabled(false);
            Btn_11.setEnabled(false);
            Btn_12.setEnabled(false);
            Btn_13.setEnabled(false);
            Btn_14.setEnabled(false);
            Btn_15.setEnabled(false);
            Btn_16.setEnabled(false);
            Btn_17.setEnabled(false);
            Btn_18.setEnabled(false);
            Btn_19.setEnabled(false);
            Btn_20.setEnabled(false);
            Btn_21.setEnabled(false);
            Btn_22.setEnabled(false);
            Btn_23.setEnabled(false);
            Btn_24.setEnabled(false);
            Btn_25.setEnabled(false);
            Btn_26.setEnabled(false);
            Btn_27.setEnabled(false);
            Btn_28.setEnabled(false);
            Btn_29.setEnabled(false);
            Btn_30.setEnabled(false);
            Btn_31.setEnabled(false);
            Btn_32.setEnabled(false);
            Btn_33.setEnabled(false);
            Btn_34.setEnabled(false);
            Btn_35.setEnabled(false);
            Btn_36.setEnabled(false);

        }else if(conta<36){
            conta++;
        }else if(conta==36){
            Et_Ganador.setText("Empate");
        }




    }}