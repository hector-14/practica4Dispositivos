package mx.edu.tesoem.isc.p47s2120222hmrm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SumaActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnsregresa, btnscalcula;
    TextView lbresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        btnsregresa = findViewById(R.id.btnsregresa);
        btnsregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        lbresultado = findViewById(R.id.lbresultado);

        btnscalcula = findViewById(R.id.btnscalcula);
        btnscalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lbresultado.setText(lbresultado.getText().toString()+String.valueOf (num1+num2));
            }
        });
    }
}