package com.example.pj.item_rankings;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.support.v7.widget.helper.ItemTouchHelper;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView rv_didNotCopy;
    private RecyclerView.Adapter notCopiedAdapter;
    private RecyclerView.LayoutManager aLayoutManager;
    public String newBandName;
    public String newBandDescription;
    public BandModel band;

    private List<BandModel> bandList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create list of bands
        hardCodeBands();

        //implement recycle view
        rv_didNotCopy = (RecyclerView) findViewById(R.id.rv_notcopied);

        aLayoutManager = new LinearLayoutManager(this);
        rv_didNotCopy.setLayoutManager(aLayoutManager);

        notCopiedAdapter = new basicAdapter(this, this.bandList);
        rv_didNotCopy.setAdapter(notCopiedAdapter);

        //swipe stuff
        ItemTouchHelper.Callback callit = new BandTouchHelper(this, (basicAdapter) notCopiedAdapter);
        ItemTouchHelper helper = new ItemTouchHelper(callit);
        helper.attachToRecyclerView(rv_didNotCopy);
    }

    @Override
    public void onResume()
    {
        super.onResume();
        this.rv_didNotCopy.getAdapter().notifyDataSetChanged();

    }



    private void hardCodeBands()
    {
        band = new BandModel("Led Zeppelin");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Pink Floyd");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Queen");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("David Bowie");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("The Who");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Bruce Springsteen");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Deep Purple");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("The Allman Brothers");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);
        ;
        band = new BandModel("Jimmy Hendrix");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Grateful Dead");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Jefferson Airplane");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("The Rolling Stones");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Fleetwood Mac");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Santana");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Lynyrd Skynyrd");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Bob Dylan");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("James Taylor");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Men Without Hats");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("Men at Work");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("The Ramones");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("AC/DC");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);

        band = new BandModel("KISS");
        this.bandList.add(band);
        BandCollection.Get().addBand(band);


    }
}
