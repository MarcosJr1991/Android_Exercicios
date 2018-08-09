package testeviewpager.com.testeviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class Myadapter extends PagerAdapter {

    List<Integer> lstimages;
    Context context;
    LayoutInflater layoutInflater;

    public Myadapter(List<Integer> lstimages, Context context) {
        this.lstimages = lstimages;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lstimages.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.card_item,container,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(lstimages.get(position));
        container.addView(view);
        return view;
    }
}
