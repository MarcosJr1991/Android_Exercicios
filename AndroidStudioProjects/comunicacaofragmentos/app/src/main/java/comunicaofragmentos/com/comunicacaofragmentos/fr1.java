package comunicaofragmentos.com.comunicacaofragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fr1 extends Fragment {

    private Button btn1;
    private TextView texto;


    public fr1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fr1,container,false);

        btn1 = (Button)view.findViewById(R.id.btn1);
        texto = (TextView)view.findViewById(R.id.textView);

        // Inflate the layout for this fragment
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Bundle bundle = new Bundle();
               bundle.putString("chave1",texto.getText().toString());
            }
        });
        return view;
    }

}
