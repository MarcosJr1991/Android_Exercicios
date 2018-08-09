package testefloatinglabel.com.testefloatinglabel;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout entradaemail;
    private TextInputLayout nomeusuario;
    private TextInputLayout senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entradaemail = findViewById(R.id.entradaemail);
        nomeusuario = findViewById(R.id.nomedeusuário);
        senha = findViewById(R.id.senha);
    }
    private boolean validadeEmail(){
        String email = entradaemail.getEditText().getText().toString().trim();

        if (email.isEmpty()){
            entradaemail.setError("campo não pode estar vazio");
            return false;
        }else {
            entradaemail.setError(null);
            //entradaemail.setEnabled(false);
            return true;
        }
    }
    private boolean validadenome(){
        String nome = nomeusuario.getEditText().getText().toString().trim();
        if (nome.isEmpty()){
            nomeusuario.setError("campo não pode estar vazio");
            return false;
        }else if (nome.length()> 15 ){
            nomeusuario.setError("nome de usuário muito longo");
            return false;
        }else{
            nomeusuario.setError(null);
            return true;
        }
    }

    private boolean validadesenha(){
        String vsenha = senha.getEditText().getText().toString().trim();

        if (vsenha.isEmpty()){
            senha.setError("campo não pode estar vazio");
            return false;
        }else {
            senha.setError(null);
            //entradaemail.setEnabled(false);
            return true;
        }
    }

    public void confirmaEntrada(View view){

        if (!validadeEmail() | !validadenome() | !validadesenha()){
            return;
        }
        String entrada = "Email:" + entradaemail.getEditText().getText().toString();
        entrada +="\n";

        entrada += "nome: " + nomeusuario.getEditText().getText().toString();
        entrada +="\n";

        entrada += "senha" + senha.getEditText().getText().toString();

        Toast.makeText(this,entrada,Toast.LENGTH_SHORT).show();

    }
}
