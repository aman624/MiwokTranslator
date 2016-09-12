package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abakshi on 9/11/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    int layoutResId;
    int bgColor;

    public WordAdapter(Context context, int layoutResId, List<Word> list, int bgColor) {
        super(context, layoutResId, list);
        this.layoutResId = layoutResId;
        this.bgColor = bgColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word word = getItem(position);
        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(layoutResId, parent, false);
        }

        TextView miwokText = (TextView) v.findViewById(R.id.miwok_text);
        TextView defaultText = (TextView) v.findViewById(R.id.default_text);
        ImageView image = (ImageView) v.findViewById(R.id.item_image);
        miwokText.setText(word.getMiwokTranslation());
        defaultText.setText(word.getDefaultTranslation());
        if (word.hasImage()) {
            image.setImageResource(word.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }
        LinearLayout textContainer = (LinearLayout) v.findViewById(R.id.text_container);
        textContainer.setBackgroundResource(bgColor);
        return v;
    }
}
