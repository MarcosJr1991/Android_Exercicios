package comunicaofragmentos.com.comunicacaofragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class fr2 extends Fragment {

    private TextView tv1;


    public fr2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fr2, container, false);

        tv1 = (TextView) view.findViewById(R.id.textView);


        // Inflate the layout for this fragment

        return view;
    }
}

