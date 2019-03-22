package com.example.trombosgdl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vertical);
        Button btninguno;
        Button btsolotrombolisis;
        Button bttrombolisistrombectomia;

        btninguno=this.findViewById(R.id.btninguno);
        btsolotrombolisis=this.findViewById(R.id.btsolotrombolisis);
        bttrombolisistrombectomia=this.findViewById(R.id.bttrombolisistrombectomia);

        btninguno.setOnClickListener(this);
        btsolotrombolisis.setOnClickListener(this);
        bttrombolisistrombectomia.setOnClickListener(this);

        Toast.makeText(this,"Esta es una prueba", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btninguno:
                Toast.makeText(this,"Seteando a nada", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btsolotrombolisis:
                Toast.makeText(this,"Seteando a solo trombolisis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bttrombolisistrombectomia:
                Toast.makeText(this,"Seteando a ambas", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
