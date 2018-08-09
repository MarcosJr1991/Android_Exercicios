package testelistviewerecyclerview.com.testelistviewerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import testelistviewerecyclerview.com.testelistviewerecyclerview.model.Curso;
import testelistviewerecyclerview.com.testelistviewerecyclerview.model.EstadoAtual;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView)findViewById(R.id.lista);
        List<Curso> cursos = todosOscursos();
        ArrayAdapter<Curso>adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,cursos);
        lista.setAdapter(adapter);


    }
    private List<Curso> todosOscursos(){
        return new ArrayList<>(Arrays.asList(
                new Curso("Java","curso javeiro", EstadoAtual.Fazendo),
                new Curso("Android","curso Android",EstadoAtual.Finalizado),
                new Curso("Kotlin","basico de klotin",EstadoAtual.Finalizado)
        ));
    }
}
