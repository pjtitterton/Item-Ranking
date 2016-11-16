package com.example.pj.item_rankings;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
/**
 * Created by PJ on 11/14/2016.
 */

public class ShowViewHolder extends RecyclerView.ViewHolder

{
    private TextView tv_showBand;


    public ShowViewHolder(TextView bandView)
    {
        super(bandView);
        this.tv_showBand = bandView;
    }

    public void fill(String showEq)
    {
        this.tv_showBand.setText(showEq);
    }

}
