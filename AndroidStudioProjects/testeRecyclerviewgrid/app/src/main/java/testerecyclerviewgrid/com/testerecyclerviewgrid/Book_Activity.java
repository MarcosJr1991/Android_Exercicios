package testerecyclerviewgrid.com.testerecyclerviewgrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvtitle = (TextView)findViewById(R.id.txttitle);
        tvdescription = (TextView)findViewById(R.id.txtDesc);
        tvcategory = (TextView)findViewById(R.id.txtcat);
        img = (ImageView)findViewById(R.id.bookthubnail);


        //Receber dados
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Titulo");
        String Description = intent.getExtras().getString("Descrição");
        int image = intent.getExtras().getInt("miniatura");

        //Ajuste de valores
        tvtitle.setText(title);
        tvdescription.setText(Description);
        img.setImageResource(image);


    }
}
