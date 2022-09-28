package mx.edu.tesoem.isc.p47s2120222hmrm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MultiplicarActivity extends AppCompatActivity {

    Button btnmregresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicar);

        btnmregresar = findViewById(R.id.btnmregresar);

        btnmregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}