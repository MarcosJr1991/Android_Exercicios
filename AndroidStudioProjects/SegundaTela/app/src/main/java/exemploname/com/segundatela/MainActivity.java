package exemploname.com.segundatela;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoA = (Button)findViewById(R.id.botaoA);
        botaoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //puxar outro layout que tem outro id
                setContentView(R.layout.segundatela);
            }
        });

        //Button botaoB = (Button)findViewById(R.id.botaoB);
    }
    public void chamatela(View v){
        setContentView(R.layout.segundatela);
    }
}
