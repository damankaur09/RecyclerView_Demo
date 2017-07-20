package com.example.sampleproject;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

/**
 * Created by root on 13/6/17.
 */

public class PagerImageAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // Declare Variables

    public PagerImageAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        // Declare Variables
        final ImageView imgflag;
        final ProgressBar spinner;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.viewpager_item, container,
                false);

        // Locate the ImageView in viewpager_item.xml
        imgflag = (ImageView) itemView.findViewById(R.id.flag);
        spinner = (ProgressBar) itemView.findViewById(R.id.spinner);

        // touch.setImageBitmap(bitmap);
        Picasso.with(context).load("https://static.pexels.com/photos/3247/nature-forest-industry-rails.jpg").resize(500, 500).centerCrop().into(imgflag, new Callback() {
            @Override
            public void onSuccess() {
                spinner.setVisibility(View.GONE);
            }

            @Override
            public void onError() {
                spinner.setVisibility(View.GONE);
            }
        });

        // Add viewpager_item.xml to ViewPager
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        container.removeView((RelativeLayout) object);

    }


}