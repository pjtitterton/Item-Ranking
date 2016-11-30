package com.example.pj.item_rankings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import static com.example.pj.item_rankings.BandTouchHelper.EX_BAND_ID;


public class ShowViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener

{
    private TextView tv_showBand;
    private static final String EX_BAND_NAME = "bandName";
    private static final String EX_BAND_DESCRIPTION = "bandDescription";

    private BandModel band;
    private Context context;
    private String newBandName;
    private String newBandDescription;


    public ShowViewHolder(Context context, TextView bandView)
    {
        super(bandView);
        this.tv_showBand = bandView;
        this.context = context;
        bandView.setOnClickListener(this);
    }


    public void populate(BandModel band)
    {
        this.band = band;
        this.tv_showBand.setText(band.getBandName());
    }
    @Override
    public void onClick(View view)
    {
        Intent bandIntent = new Intent(context,DetailsActivity.class);
        bandIntent.putExtra(EX_BAND_NAME, this.band.getBandName());
        bandIntent.putExtra(EX_BAND_DESCRIPTION, this.band.getDescription());
        bandIntent.putExtra(EX_BAND_ID, this.band.getId());
        context.startActivity(bandIntent);



    }

    public void fill(String showEq)
    {
        this.tv_showBand.setText(showEq);
    }



}
