package com.example.pj.item_rankings;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by PJ on 11/30/2016.
 */
public class BandCollection {

    private static BandCollection collection;
    private List<BandModel> bandModelList;

    public static BandCollection Get()
    {
        if (collection == null)
        {
            collection = new BandCollection();
        }


            return collection;

    }
    private BandCollection()
    {
        this.bandModelList = new ArrayList<>();
        BandModel band = new BandModel("you hate Music");
        this.bandModelList.add(band);
    }

    public BandModel getBand(UUID id)
    {
        for (BandModel band : this.bandModelList)
        {
            if(band.getId().equals(id))
            {
                return band;
            }
        }
        return null;
    }
    public void addBand(BandModel band)
    {
        this.bandModelList.add(band);
    }
    public void removeBand(BandModel band)
    {
        this.bandModelList.remove(band);
    }
}
