package testerecyclerview.com.testerecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

class Marcosviewholder extends RecyclerView.Adapter<ViewHolder> {
    private List<String> List;

    public Marcosviewholder(List<String>List){
    this.List = List;
    }
    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflate.inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        String titulo =List.get(position);
        holder.bind(titulo);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Posição" + position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.List.size();
    }

}