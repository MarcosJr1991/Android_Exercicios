package botaop.com.botaop;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button btnsonoro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsonoro = (Button)findViewById(R.id.btnsonoro);

        mp = MediaPlayer.create(this,R.raw.sonoro);

        btnsonoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.start();
            }
        });
    }
}
