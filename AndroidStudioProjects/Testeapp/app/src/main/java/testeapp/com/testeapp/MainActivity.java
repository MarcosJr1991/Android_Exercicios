package testeapp.com.testeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText login;
    private EditText senha;
    private Button botaoLogin;
    private Button botaoCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.login);
        senha = (EditText) findViewById(R.id.senha);
        botaoLogin = (Button)findViewById(R.id.botaoLogin);
        botaoCancelar = (Button)findViewById(R.id.botaoCancelar);

        botaoCancelar.setOnClickListener(this);
        botaoLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == (R.id.botaoLogin)) {


            if (login.getText().toString().equals("Marcos@digitalHouse.com") && senha.getText().toString().equals("123")) {
                Toast.makeText(getApplicationContext(), "Acesso Realizado Com Sucesso", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Acesso Negado", Toast.LENGTH_LONG).show();

            }

        }
        if (view.getId() == (R.id.botaoCancelar)){
            Toast.makeText(getApplicationContext(),"Cancelado com Sucesso",Toast.LENGTH_LONG).show();
        }
    }
}

