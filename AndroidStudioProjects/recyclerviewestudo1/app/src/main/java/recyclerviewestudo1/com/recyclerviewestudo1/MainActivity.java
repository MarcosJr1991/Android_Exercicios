package recyclerviewestudo1.com.recyclerviewestudo1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ExampleItem> mExampleList;

    private RecyclerView mRecyclerView;
    private ExempleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Button buttonInsert;
    private Button buttonRemove;
    private EditText editTextInsert;
    private EditText editTextRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleList();
        buildRecyclerView();
        setButtons();



    }

    public void insertItem(int position) {
        mExampleList.add(position, new ExampleItem(R.drawable.ic_android, " Novo item na posição " + position, " esta é a linha 2  "));
        mAdapter.notifyItemInserted(position);//notificar item inserido

    }

    public void removeItem(int position) {

        mExampleList.remove(position);
        mAdapter.notifyItemRemoved(position);//notificar item removido

    }

    public void changeItem(int position, String text){
        mExampleList.get(position).changeText1(text);
        mAdapter.notifyItemChanged(position);
    }

    public void createExampleList() {
        mExampleList = new ArrayList<>();

        mExampleList.add(new ExampleItem(R.drawable.ic_android, "Linha 1 ", "Linha 2 "));
        mExampleList.add(new ExampleItem(R.drawable.ic_audio, "Linha 3 ", "Linha 4 "));
        mExampleList.add(new ExampleItem(R.drawable.ic_sunny, "Linha 5 ", "Linha 6 "));
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerview);

        mRecyclerView.setHasFixedSize(true);//conjunto tem tamanho fixo
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExempleAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExempleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
               changeItem(position," Clicado ");
            }

            @Override
            public void onDeleteClick(int position) {
                removeItem(position);
            }
        });
    }

    public void setButtons(){

    }

}
