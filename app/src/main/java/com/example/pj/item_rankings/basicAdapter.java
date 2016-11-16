package com.example.pj.item_rankings;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.List;

/**
 * Created by PJ on 11/14/2016.
 */

public class basicAdapter extends RecyclerView.Adapter<ShowViewHolder>
{
    private Context context;
    private List<String> bandList;

    public basicAdapter(Context context, List<String> band)
    {
        this. context = context;
        this.bandList = band;
    }

    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        TextView view = (TextView) inflater.inflate(android.R.layout.simple_list_item_1, parent, false);

        return new ShowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ShowViewHolder holder, int position)
    {
        holder.fill(this.bandList.get(position));
    }

    @Override
    public int getItemCount()
    {
        return this.bandList.size();
    }

    public void swap(int firstPosition, int secondPosition)
    {
        Collections.swap(bandList, firstPosition, secondPosition);
        notifyItemMoved(firstPosition,secondPosition);
    }
    public void remove(int position)
    {
        bandList.remove(position);
        notifyItemRemoved(position);

    }
}
