package entregaveldh.com.entregaveldh;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Receita>mData;

    public RecyclerViewAdapter(Context mContext, List<Receita> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_receita,parent,false);//xml cardview
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_receita_titulo.setText(mData.get(position).getTitulo());
        holder.img_receita_miniatura.setImageResource(mData.get(position).getMiniatura());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext,Receita_Activity.class);
                //passando dados para a receita
                intent.putExtra("TITULO",mData.get(position).getTitulo());//
                intent.putExtra("Receita",mData.get(position).getReceita());//
                intent.putExtra("Preparo",mData.get(position).getPreparo());//
                intent.putExtra("miniatura",mData.get(position).getMiniatura());//

                //iniciando atividade da activity
                mContext .startActivity(intent);



            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_receita_titulo;
        ImageView img_receita_miniatura;
        CardView cardView;


        public MyViewHolder(View itemView) {
            super(itemView);

            tv_receita_titulo = (TextView) itemView.findViewById(R.id.receita_titulo_id);
            img_receita_miniatura = (ImageView)itemView.findViewById(R.id.receita_img_id);
            cardView =(CardView)itemView.findViewById(R.id.cardview_id);

        }
    }
}
