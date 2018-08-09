package testetablayout.com.testetablayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout)findViewById(R.id.appbarid);
        viewPager = (ViewPager)findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //ADIÇÃO DE FRAGMENTO
        adapter.AddFragment(new FragmentQuiz(),"Quiz");
        adapter.AddFragment(new FragmentExplore(),"Explore");
        adapter.AddFragment(new FragmentStore(),"Store");

        //CONFIGURAÇÃO DO ADAPTER
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
