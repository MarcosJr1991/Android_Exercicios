package radiobutton.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_selecione;
    TextView tvSelecionado;
    RadioButton rb1;
    RadioButton rb2;
    CheckBox cb1;
    CheckBox cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_selecione = (Button)findViewById(R.id.btnselecione);
        tvSelecionado = (TextView)findViewById(R.id.tvresposta);
        rb1 = (RadioButton)findViewById(R.id.rb1);
        rb2 = (RadioButton)findViewById(R.id.rb2);
        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);

        btn_selecione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb1.isChecked()){

                    tvSelecionado.setText(rb1.getText());

                }else if (rb2.isChecked()){

                    tvSelecionado.setText(rb2.getText());

                }else if (cb1.isChecked()){

                    tvSelecionado.setText(cb1.getText());

                }else if (cb2.isChecked()){

                    tvSelecionado.setText(cb2.getText());
                }else {

                    tvSelecionado.setText("Não há selecionou nenhuma opção");
                }

            }
        });
    }
}
