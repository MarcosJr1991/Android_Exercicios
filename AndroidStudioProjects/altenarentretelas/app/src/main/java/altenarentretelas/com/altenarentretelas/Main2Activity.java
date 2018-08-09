package altenarentretelas.com.altenarentretelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnvoltar;
    Button btnsair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnvoltar = (Button)findViewById(R.id.btnvoltar);
        btnsair = (Button)findViewById(R.id.btnsair);

        btnvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltar1 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(voltar1);

            }
        });
        btnsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
