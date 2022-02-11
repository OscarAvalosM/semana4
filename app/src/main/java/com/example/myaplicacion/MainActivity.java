package com.example.myaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer sonido;
    public ImageButton letraa;
    public ImageButton letrae;
    public ImageButton letrai;
    public ImageButton letrao;
    public ImageButton letrau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letraa=(ImageButton) findViewById(R.id.imga);
        letraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste la letra A", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.letra_a);
                sonido.start();
            }
        });

        letrae=(ImageButton) findViewById(R.id.imge);
        letrae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste la letra E", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.letra_e);
                sonido.start();
            }
        });

        letrai=(ImageButton) findViewById(R.id.imgi);
        letrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste la letra I", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.letra_i);
                sonido.start();
            }
        });

        letrao=(ImageButton) findViewById(R.id.imgo);
        letrao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste la letra O", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.letra_o);
                sonido.start();
            }
        });

        letrau=(ImageButton) findViewById(R.id.imgu);
        letrau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Precionaste la letra U", Toast.LENGTH_LONG).show();
                sonido= MediaPlayer.create(getApplicationContext(), R.raw.letra_u);
                sonido.start();
            }
        });




    }
}