package actadapter.com.actadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CountryItem> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillCountryList();

        AutoCompleteTextView ediText = findViewById(R.id.actv);

        AutoCompleteCountryAdapter adapter = new AutoCompleteCountryAdapter(this,countryList);
        ediText.setAdapter(adapter);
    }

    private void fillCountryList(){
        countryList = new ArrayList<>();
        countryList.add(new CountryItem("Brasil",R.drawable.br));
        countryList.add(new CountryItem("Bolivia",R.drawable.bolivia));
        countryList.add(new CountryItem("Alemanha",R.drawable.alemanha));
        countryList.add(new CountryItem("Argelia",R.drawable.argelia));
        countryList.add(new CountryItem("Afeganistao",R.drawable.afghanistan));

    }
}
