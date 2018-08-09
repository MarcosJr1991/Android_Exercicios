package testerecyclerview.com.testerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView tittle;

    public ViewHolder(View view){
        super(view);
        tittle = (TextView)view.findViewById(R.id.textView);

    }
    public void bind (String s){
        tittle.setText(s);
    }
}
