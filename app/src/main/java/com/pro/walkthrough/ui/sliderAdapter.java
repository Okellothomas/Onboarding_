package com.pro.walkthrough.ui;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.pro.walkthrough.R;

public class sliderAdapter extends PagerAdapter {
    // the slider adapter will help us in sliding the images in our application.

    // declare the context variable
    Context mContext;

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
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }


}
