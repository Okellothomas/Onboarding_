package com.pro.walkthrough.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.pro.walkthrough.R;

public class sliderAdapter extends PagerAdapter {
    // the slider adapter will help us in sliding the images in our application.

    // declare the context variable
    Context mContext;
    LayoutInflater layoutInflater;

    // we go ahead and generate the constructor of the class

    public sliderAdapter(Context mContext) {
        this.mContext = mContext;
    }

    // We then continue to add images in an array

    int images[] = {
            R.drawable.search_place,
            R.drawable.make_a_call,
            R.drawable.add_missing_place,
            R.drawable.sit_back_and_relax
    };

    // we then add the heading array to include the heading in our slides
    int headings[] = {
            R.string.first_slide_title,
            R.string.second_slide_title,
            R.string.third_slide_title,
            R.string.fourth_slide_title
    };

    // we then add the descriptions array to include the descriptions in our slides
    int descriptions[] = {
            R.string.first_slide_desc,
            R.string.second_slide_desc,
            R.string.third_slide_desc,
            R.string.fourth_slide_desc
    };

    // We then go ahead and import the neccessary overidden methods.
    @Override
    public int getCount() {
        // we return the number of slides we will be displaying
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        // we go ahead to inflate our slider layout
        layoutInflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        // we then declare what we have been using.

        ImageView image = (ImageView) view.findViewById(R.id.image_slider);
        TextView desc = (TextView) view.findViewById(R.id.text_desc);
        TextView title = (TextView) view.findViewById(R.id.text_title);

        // Set the position for the images
        image.setImageResource(images[position]);
        desc.setText(descriptions[position]);
        title.setText(headings[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }

}
