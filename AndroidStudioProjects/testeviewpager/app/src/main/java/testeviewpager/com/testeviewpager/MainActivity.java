package testeviewpager.com.testeviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> lstimages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.horizontal_cycle);

        //criar adaptador e definir para visualizar o pager
        Myadapter adapter = new Myadapter(lstimages,getBaseContext());
        pager.setAdapter(adapter);

    }
    //adicionar recurso de imagem à sua lista
    private void initData() {
        lstimages.add(R.drawable.ameninaqueroubavalivros);
        lstimages.add(R.drawable.oespelhosecreto);
        lstimages.add(R.drawable.namoradoaluguel);

    }



}
