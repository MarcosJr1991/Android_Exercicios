package testerecyclerviewgrid.com.testerecyclerviewgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("O Espelho Secreto","Categoria Livro","Descrição Livro",R.drawable.oespelhosecreto));
        lstBook.add(new Book("Namorado De Aluguel ","Categoria Livro","Descrição Livro",R.drawable.namoradoaluguel));
        lstBook.add(new Book("A Arte Da Guerra ","Categoria Livro","Descrição Livro",R.drawable.aartedaguerra));
        lstBook.add(new Book("A Guerra Dos Tronos ","Categoria Livro","Descrição Livro",R.drawable.aguerradostronos));
        lstBook.add(new Book("Livro A Cabana","Categoria Livro","Descrição Livro",R.drawable.livroacabana));
        lstBook.add(new Book("A Menina Que Roubava Livros","Categoria Livro","Descrição Livro",R.drawable.ameninaqueroubavalivros));


        //Buscar o id no xml activity principal
        RecyclerView myrv = (RecyclerView)findViewById(R.id.recyclerview_id);

        RecyclerViewAdapter myAdapater = new RecyclerViewAdapter(this,lstBook);

        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapater);


    }
}
