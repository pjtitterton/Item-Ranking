package com.example.pj.item_rankings;

import java.util.UUID;

/**
 * Created by PJ on 11/29/2016.
 */

public class BandModel {

    private UUID id;
    private String bandName;
    private String description;

    public BandModel(String bName)
    {
        this.id = UUID.randomUUID();
        this.setBandName(bName);
        this.setDescription("A classic rock band");

    }
    public BandModel(String bName, String bDesc)
    {
        this.id = UUID.randomUUID();
        this.setBandName(bName);
        this.setDescription(bDesc);
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId()
    {
        return id;
    }
}
