package com.example.pj.item_rankings;

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

    private List<String> bandList = new ArrayList<>();


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
        ItemTouchHelper.Callback callit = new BandTouchHelper((basicAdapter) notCopiedAdapter);
        ItemTouchHelper helper = new ItemTouchHelper(callit);
        helper.attachToRecyclerView(rv_didNotCopy);

    }

    private void hardCodeBands()
    {
        this.bandList.add("Led Zeppeln");
        this.bandList.add("Pink Floyd");
        this.bandList.add("Queen");
        this.bandList.add("David Bowie");
        this.bandList.add("The Who");
        this.bandList.add("Bruce Springsteen");
        this.bandList.add("Deep Purple");
        this.bandList.add("The Allman Brothers");
        this.bandList.add("Jimmy Hendrix");
        this.bandList.add("Grateful Dead");
        this.bandList.add("Jefferson Airplane");
        this.bandList.add("The Rolling Stones");
        this.bandList.add("Fleetwood Mac");
        this.bandList.add("Santana");
        this.bandList.add("Lynyrd Skynyrd");
        this.bandList.add("Bob Dylan");
        this.bandList.add("James Taylor");
        this.bandList.add("Men Without Hats");
        this.bandList.add("Men at Work");
        this.bandList.add("The Ramones");
        this.bandList.add("AC/DC");
        this.bandList.add("KISS");

    }
}
