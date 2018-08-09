package com.dh.RecyclerViewListener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class CityDetailActivity extends AppCompatActivity {
    private TextView tvCityName;
    private TextView tvCityDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_view);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(getResources().getDrawable(getResources().getIdentifier(getIntent().getStringExtra("image"), "drawable", getPackageName())));

        tvCityName = (TextView) findViewById(R.id.tv_city_name);
        tvCityName.setText(getIntent().getStringExtra("city"));
        tvCityDesc = (TextView) findViewById(R.id.tv_city_desc);
        tvCityDesc.setText(getIntent().getStringExtra("desc"));

    }
}
