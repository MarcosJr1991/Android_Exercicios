package intents.com.projetonovofragments;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    android.support.v4.app.FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button)findViewById(R.id.botao1);

        //Pega o fragmentManager
        fragmentManager = getSupportFragmentManager();


        //Abre uma transação e adiciona
        fragmentManager.beginTransaction()
                .add(R.id.frame1,new fragment1())
                .commit();

        //Abre uma transação e adiciona
        fragmentManager.beginTransaction()
             .add(R.id.frame2,new fragment2())
             .commit();

        //Substitui um Fragment
        fragmentManager.beginTransaction()
                .replace(R.id.frame1,new fragment2())
                .addToBackStack(null)//procurar que isso
                .commit();
        
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frame2);
                if (fragment !=null)
                    fragmentManager.beginTransaction().remove(fragment).commit();
                Toast.makeText(view.getContext(),"voce esta no fragmento 2 ",Toast.LENGTH_LONG).show();
                
            }
        });
    }
}
