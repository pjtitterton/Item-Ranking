package com.example.pj.item_rankings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;
import java.util.UUID;

import static com.example.pj.item_rankings.BandTouchHelper.EX_BAND_ID;

public class DetailsActivity extends AppCompatActivity {

    private EditText et_bName;
    private EditText et_bDescription;
    private List<BandModel> bandList;
    private BandModel band;

    private static final String EX_BAND_NAME = "bandName";
    private static final String EX_BAND_DESCRIPTION = "bandDescription";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        et_bName = (EditText) findViewById(R.id.bandName_et);
        et_bDescription = (EditText) findViewById(R.id.bandDescription_et);

        Intent intent = getIntent();
        String bName = intent.getStringExtra(EX_BAND_NAME);
        String bDescription = intent.getStringExtra(EX_BAND_DESCRIPTION);
        UUID bId = (UUID) intent.getSerializableExtra(EX_BAND_ID);

        et_bName.setText(bName);
        et_bDescription.setText(bDescription);
        this.band = BandCollection.Get().getBand(bId);


        et_bName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(et_bName.getText()==null)
                {
                    band.setBandName("Really??!!");
                }
                else
                {
                    band.setBandName(et_bName.getText().toString());
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et_bDescription.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(et_bName.getText()==null)
                {
                    band.setDescription("come on");
                }
                else
                {
                    band.setDescription(et_bDescription.getText().toString());
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }


    public void applyClick(View view) {


        finish();


    }
}
