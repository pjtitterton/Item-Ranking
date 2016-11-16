package com.example.pj.item_rankings;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by PJ on 11/15/2016.
 */

public class BandTouchHelper extends ItemTouchHelper.SimpleCallback
{

    private basicAdapter bandAdapter;

    public BandTouchHelper(basicAdapter bAdapter)
    {
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN , ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        this.bandAdapter = bAdapter;
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
