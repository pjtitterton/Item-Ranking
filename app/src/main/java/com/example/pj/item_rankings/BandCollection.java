package com.example.pj.item_rankings;

/**
 * Created by PJ on 11/30/2016.
 */
public class BandCollection {
    private static BandCollection ourInstance = new BandCollection();

    public static BandCollection getInstance() {
        return ourInstance;
    }

    private BandCollection() {
    }
}
