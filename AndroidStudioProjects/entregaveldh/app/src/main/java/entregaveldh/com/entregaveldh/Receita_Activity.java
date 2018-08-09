package entregaveldh.com.entregaveldh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Receita_Activity extends AppCompatActivity {

    private TextView tvtitulo,tvreceita,tvpreparo;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita_);

        tvtitulo =(TextView) findViewById(R.id.txttitulo);
        tvreceita =(TextView) findViewById(R.id.txtreceita);
        tvpreparo =(TextView) findViewById(R.id.txtpreparo);
        img = (ImageView)findViewById(R.id.receitaminiatura);

        //receber dados
        Intent intent = getIntent();
        String titulo = intent.getExtras().getString("Titulo");//esse titulo vem da recyclerviewAdapter
        String Receita = intent.getExtras().getString("Receita");//essa Receita vem da recyclerviewAdapter
        String Preparo = intent.getExtras().getString("Preparo");//esse Preparo vem da recyclerviewAdapter

        int image = intent.getExtras().getInt("miniatura");

        //valores de configuração

        tvtitulo.setText(titulo);
        tvreceita.setText(Receita);
        tvpreparo.setText(Preparo);
        img.setImageResource(image);

    }
}
