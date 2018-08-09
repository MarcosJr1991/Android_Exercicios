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
public class projetofragment2 extends Fragment {
    private Button btnfrag2;

    public projetofragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_projetofragment2,container,false);

        btnfrag2 = (Button)view.findViewById(R.id.btnfrag2);

        btnfrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getBaseContext(),"voce esta no fragmento 2 ",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

}
