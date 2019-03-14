package com.example.grupal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int cont_entran = 0;
    private int cont_salen = 0;
    private Button bt_entran;
    private Button bt_salen;
    private TextView id_entran;
    private TextView id_salen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_entran = (Button) findViewById(R.id.bt_entran);
        bt_salen = (Button) findViewById(R.id.bt_salen);

        id_entran = (TextView) findViewById(R.id.id_entran);
        id_salen = (TextView) findViewById(R.id.id_salen);

        bt_entran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont_entran++;
                id_entran.setText(cont_entran);
            }
        });

        bt_salen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_entran>=1){
                    cont_salen++;
                    cont_entran--;
                }
                id_salen.setText(cont_salen);
            }
        });

    }






}
