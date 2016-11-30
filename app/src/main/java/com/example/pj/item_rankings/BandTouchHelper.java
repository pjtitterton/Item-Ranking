package com.example.pj.item_rankings;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.content.Context;




/**
 * Created by PJ on 11/15/2016.
 */

public class BandTouchHelper extends ItemTouchHelper.SimpleCallback
{
    public static final String EX_BAND_ID = "band_id";
    private BandModel band;
    private basicAdapter bandAdapter;
    private Context context;

    public BandTouchHelper(Context context, basicAdapter bAdapter)
    {

        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN , ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        this.bandAdapter = bAdapter;
        this.context = context;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target)
    {
        bandAdapter.swap(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction)
    {
        bandAdapter.remove(viewHolder.getAdapterPosition());
    }








}
