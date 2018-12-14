package es.fempa.jorge.chatonlineandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_irConfig = (Button)findViewById(R.id.btn_irConfig);
        Button b_irAcercaDe = (Button)findViewById(R.id.btn_irAcercaDe);

        b_irConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Configuracion.class);
                startActivity(intent);
            }
        });

        b_irAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, AcercaDe.class);
                startActivity(intent);
            }
        });

    }


}
