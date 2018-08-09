package testerecyclerview.com.testerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> List = new ArrayList<>();

        List.add("Marcos");
        List.add("Carlos");
        List.add("Eduardo");
        List.add("Paulo");
        RecyclerView recycler = findViewById(R.id.recyclerView);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new Marcosviewholder(List));
    }
}
