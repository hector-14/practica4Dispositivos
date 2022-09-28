package mx.edu.tesoem.isc.p47s2120222hmrm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnmsuma,btnmresta,btnmmultiplicar,btnmdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmsuma = findViewById(R.id.btnmsuma);
        btnmresta = findViewById(R.id.btnmresta);
        btnmmultiplicar = findViewById(R.id.btnmmultiplicar);
        btnmdividir = findViewById(R.id.btnmdividir);

        btnmsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent psuma = new Intent(MainActivity.this, SumaActivity.class);
                startActivity(psuma);
            }
        });

        btnmresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presta = new Intent(MainActivity.this, RestaActivity.class);
                startActivity(presta);
                //finish();
            }
        });

        btnmmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pmultiplicar = new Intent(MainActivity.this, MultiplicarActivity.class);
                startActivity(pmultiplicar);
            }
        });

        btnmdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pdividir = new Intent(MainActivity.this, DividirActivity.class);
                startActivity(pdividir);
            }
        });

    }
}