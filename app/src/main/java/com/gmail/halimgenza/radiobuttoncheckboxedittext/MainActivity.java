package com.gmail.halimgenza.radiobuttoncheckboxedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.CheckBox;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //ini deklarasi atribut tampilan/view
    EditText editNama, editNim;
    CheckBox uzur;
    RadioButton ip;
    TextView texthasil;
    Button tombolSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Koneksi atribut dengan XML: memanggil nilai dari inputan nama dan nim*/
        editNama = (EditText)findViewById(R.id.editNamaMhs);
        editNim = (EditText)findViewById(R.id.editNimMhs);
        uzur = (CheckBox)findViewById(R.id.mhsUzur);
        ip = (RadioButton)findViewById(R.id.nilaiIP);
        texthasil = (TextView)findViewById(R.id.txtHasil);
        tombolSubmit = (Button)findViewById(R.id.button);
    }

    protected void onClick(View view){
        String nama, nim, mUzur, nil_ip;
        nama = editNama.getText().toString();
        nim = editNim.getText().toString();
        if(uzur.isChecked()){
            mUzur = "Mahasiswa Uzur";
        }else{
            mUzur = "";
        }

        boolean checked = ((RadioButton) nilai).isChecked();
        switch(nilai.findViewById()){
            case R.id.radioButton9:
                if(checked){
                    nil_ip = "3.00 - 4.00";
                }
                break;
            case R.id.radioButton8:
                if(checked){
                    nil_ip = "2.00 - 2.99";
                }
                break;
            case R.id.radioButton7:
                if(checked){
                    nil_ip = "1.00 - 1.99";
                }
                break;
            case R.id.radioButton6:
                if(checked){
                    nil_ip = "0 - 0.99";
                }
                break;
        }

        texthasil.setText("" + nama + " - " + nim + ", Mahasiswa Uzur, IP: " + nil_ip); //mengatur format tampilan
    }
}
