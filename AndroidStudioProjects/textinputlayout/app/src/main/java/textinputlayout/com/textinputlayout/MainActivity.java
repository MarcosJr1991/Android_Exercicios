package textinputlayout.com.textinputlayout;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private static final Pattern Senha_Pattern =
                                Pattern.compile("^" +
                                        "(?=.*[0-9])" + //pelo menos 1 dígito
                                        "(?=.*[a-z])" + //pelo menos 1 letra minúscula
                                        "(?=.*[A-Z])" + //pelo menos 1 letra maiúscula
                                        //"(?=.*[a-ZA-Z]" + //QUALQUER LETRA
                                        "(?=.*[@#$%^&+=])" + //pelo menos 1 caractere especial
                                        "(?=\\S+$)" +        //sem espaços em branco
                                        ".{6,}" +            //pelo menos 6 caracteres
                                        "$");

    private TextInputLayout textinputEmail;
    private TextInputLayout textinputNome;
    private TextInputLayout textinputSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textinputEmail = findViewById(R.id.text_input_email);
        textinputNome = findViewById(R.id.text_input_username);
        textinputSenha = findViewById(R.id.text_input_password);
    }

    private boolean validadeEmail() {
        //entrada no email   //Este método retorna uma cópia da string, com espaço em branco inicial e final omitido.
        String emailinput = textinputEmail.getEditText().getText().toString().trim();

        if (emailinput.isEmpty()) {
            textinputEmail.setError(" campo não pode estar vazio ");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailinput).matches()) {
            textinputEmail.setError(" Por favor insira um endereço de e-mail válido ");
            return false;
        } else {
            textinputEmail.setError(null);
            // textinputEmail.setErrorEnabled(false);//erro ativado
            return true;
        }

    }

    private boolean validadenome() {
        String nome = textinputNome.getEditText().getText().toString().trim();

        if (nome.isEmpty()) {
            textinputNome.setError(" campo não pode estar vazio ");
            return false;
        } else if (nome.length() > 15) {
            textinputNome.setError(" nome de usuário muito longo ");
            return false;
        } else {
            textinputNome.setError(null);
            return true;
        }
    }

    private boolean validadeSenha() {
        //entrada no email   //Este método retorna uma cópia da string, com espaço em branco inicial e final omitido.
        String senhainput = textinputSenha.getEditText().getText().toString().trim();

        if (senhainput.isEmpty()) {
            textinputSenha.setError(" campo não pode estar vazio ");
            return false;
        } else if (!Senha_Pattern.matcher(senhainput).matches()){
            textinputSenha.setError(" Senha muito fraca ");
            return false;
        }else {
            textinputSenha.setError(null);
            // textinputEmail.setErrorEnabled(false);//erro ativado
            return true;
        }

    }

    public void confimarinput(View v) {
        if (!validadeEmail() | !validadenome() | !validadeSenha()) {
            return;
        }
        String entrada = "Email: " + textinputEmail.getEditText().getText().toString();
        entrada += "\n";

        entrada += "nome: " + textinputNome.getEditText().getText().toString();
        entrada += "\n";

        entrada = "Senha: " + textinputSenha.getEditText().getText().toString();

        Toast.makeText(this, entrada, Toast.LENGTH_SHORT).show();
    }
}