package com.example.birthdaycakewithname;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.cake_hand_1, R.drawable.canle_cake_0,
            R.drawable.flawer_cake_0, R.drawable.happy_birthday_hand_cake_0,
            R.drawable.laddu_cake_0, R.drawable.round_white_0,
            R.drawable.round_yellow_0, R.drawable.plain_cake,
            R.drawable.taj_cake_0, R.drawable.three_stage_0,
            R.drawable.stand_cake_0, R.drawable.three_stage_flawer_0,
            R.drawable.side_cake_0
    };
}
