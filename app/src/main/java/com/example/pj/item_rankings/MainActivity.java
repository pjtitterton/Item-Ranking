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

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK)
            {
                newBandName=data.getStringExtra("bandN");
                newBandDescription=data.getStringExtra("bandD");
                this.bandList.add(new BandModel(newBandName,newBandDescription));
                this.rv_didNotCopy.getAdapter().notifyDataSetChanged();
            }
            if (resultCode == Activity.RESULT_CANCELED) {

            }
        }
    }

    private void hardCodeBands()
    {
        this.bandList.add(new BandModel("Led Zeppelin"));
        this.bandList.add(new BandModel("Pink Floyd"));
        this.bandList.add(new BandModel("Queen"));
        this.bandList.add(new BandModel("David Bowie"));
        this.bandList.add(new BandModel("The Who"));
        this.bandList.add(new BandModel("Bruce Springsteen"));
        this.bandList.add(new BandModel("Deep Purple"));
        this.bandList.add(new BandModel("The Allman Brothers"));
        this.bandList.add(new BandModel("Jimmy Hendrix"));
        this.bandList.add(new BandModel("Grateful Dead"));
        this.bandList.add(new BandModel("Jefferson Airplane"));
        this.bandList.add(new BandModel("The Rolling Stones"));
        this.bandList.add(new BandModel("Fleetwood Mac"));
        this.bandList.add(new BandModel("Santana"));
        this.bandList.add(new BandModel("Lynyrd Skynyrd"));
        this.bandList.add(new BandModel("Bob Dylan"));
        this.bandList.add(new BandModel("James Taylor"));
        this.bandList.add(new BandModel("Men Without Hats"));
        this.bandList.add(new BandModel("Men at Work"));
        this.bandList.add(new BandModel("The Ramones"));
        this.bandList.add(new BandModel("AC/DC"));
        this.bandList.add(new BandModel("KISS"));

    }
}
