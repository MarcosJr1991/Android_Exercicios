package intents.com.projetofragmentstatico;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class projetofragmento3 extends Fragment {
    private Button btnfrag3;

    public projetofragmento3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_projetofragmento3,container,false);

        btnfrag3 = (Button)view.findViewById(R.id.btnfrag3);

        btnfrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getBaseContext(), "voce esta no fragmento 3 ", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}





