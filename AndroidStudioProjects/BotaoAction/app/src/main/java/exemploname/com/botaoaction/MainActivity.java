package exemploname.com.botaoaction;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campotexto = (TextView)findViewById(R.id.campotexto);

        Button botaotexto = (Button)findViewById(R.id.botaotexto);
        Button botaocor = (Button)findViewById(R.id.botaocor);

        final RelativeLayout fundotela = (RelativeLayout)findViewById(R.id.fundotela);

        botaotexto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                campotexto.setText("Marcos JR");

            }
        });
        botaocor.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                fundotela.setBackgroundColor(Color.parseColor("#0B9AE2"));

            }
        });

    }
}
