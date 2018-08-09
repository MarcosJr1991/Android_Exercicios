package estudandofragment.com.fragmentodinamicos;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,fr1.OnFragmentInteractionListener,fr2.OnFragmentInteractionLinester {

    Button btnfr1;
    Button btnfr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fr1 fragmento1 = new fr1();
        getSupportFragmentManager().beginTransaction().add(R.id.conteiner,fragmento1);

        btnfr1 = (Button)findViewById(R.id.btnfrag1);
        btnfr2 = (Button)findViewById(R.id.btnfrag2);

        btnfr2.setOnClickListener((View.OnClickListener) this);
        btnfr1.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnfrag1:

                fr1 fragmento1 = new fr1();
                android.support.v4.app.FragmentTransaction transicao = getSupportFragmentManager().beginTransaction();
                transicao.replace(R.id.conteiner,fragmento1);
                transicao.commit();

                break;

            case R.id.btnfrag2:

                fr2 fragmento2 = new fr2();
                android.support.v4.app.FragmentTransaction transicao1 = getSupportFragmentManager().beginTransaction();
                transicao1.replace(R.id.conteiner,fragmento2);
                transicao1.commit();

                break;
        }
    }
}
