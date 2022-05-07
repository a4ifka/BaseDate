package com.example.smart_fridge20;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductItem extends LinearLayout {
    TextView nameTextView;
    TextView countTextView;
    private Typeface face;

    String name;
    int count;

    public ProductItem(Context context, String name, int count) {
        super(context);
        this.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT,
                1.0f
        );
        int marg = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        param.setMargins(marg, marg, marg, marg);
        this.setLayoutParams(param);

        this.name=name;
        this.count=count;
        this.face=Typeface.createFromAsset(getContext().getAssets(), "fonts/rfdewi.ttf");
        nameTextView.setTypeface(face);
        countTextView.setTypeface(face);
        updateTextViews();

    }

    private void updateTextViews(){
        nameTextView.setText(name);
        countTextView.setText(Integer.toString(count));
    }
}
