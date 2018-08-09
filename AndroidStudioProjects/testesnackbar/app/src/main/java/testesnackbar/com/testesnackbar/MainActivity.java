package testesnackbar.com.testesnackbar;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = findViewById(R.id.coodinatorLayout);
        botao = findViewById(R.id.botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar();
            }
        });
    }
    @SuppressLint("ResourceAsColor")
    public void showSnackbar() {
        @SuppressLint("ResourceAsColor") final Snackbar snackbar = Snackbar.make(coordinatorLayout,"este é um Snackbar",Snackbar.LENGTH_INDEFINITE)
                .setAction("desfazer", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1;
                        snackbar1 = Snackbar.make(coordinatorLayout,"DESFAZER SUCESSO",Snackbar.LENGTH_SHORT);
                        snackbar1.show();

                    }
                })
                .setActionTextColor(android.R.color.holo_red_dark);
        View snackView = snackbar.getView();
        TextView textView = snackView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);
        snackbar.show();
    }
}
