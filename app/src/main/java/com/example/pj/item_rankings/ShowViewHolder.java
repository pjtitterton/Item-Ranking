package com.example.pj.item_rankings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;




public class ShowViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener

{
    private TextView tv_showBand;
    private static final String EX_BAND_NAME = "bandName";
    private static final String EX_BAND_DESCRIPTION = "bandDescription";
    private static final int RESULT_CODE = 1;
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
        ((Activity)context).startActivityForResult(bandIntent,1);



    }

    public void fill(String showEq)
    {
        this.tv_showBand.setText(showEq);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK)
            {
                newBandName=data.getStringExtra("bandN");
                newBandDescription=data.getStringExtra("bandD");
                band.setBandName(newBandName);
                band.setDescription(newBandDescription);
            }
            if (resultCode == Activity.RESULT_CANCELED) {

            }
        }
    }

}
