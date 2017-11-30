package com.example.mike4christ.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mike4christ.library.NaturalText;
//Developed @ Mightonic Alu Michael
public class MainActivity extends AppCompatActivity {
    //public static Spinner spinner ;
   // public static TextView mtext ;
    NaturalText WTS = new NaturalText();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spinner= findViewById(R.id.spinner);
        //mtext= findViewById(R.id.mtext);


        // set color link. Default = Color.BLUE
        WTS.setColorTAG(Color.GREEN);
        WTS.setColorURL(Color.MAGENTA);
        WTS.setColorPHONE(Color.RED);
        WTS.setColorMAIL(getResources().getColor(R.color.colorPrimary));
        WTS.setColorMENTION(getResources().getColor(R.color.colorAccent));

/* add custom
// WTS.setRegexCUSTOM("([0-9]+-[0-9]+)");
// WTS.setColorCUSTOM(Color.YELLOW);
*/

// set underline link. Default = false
// WTS.setUnderlineTAG(true);
        WTS.setUnderlineURL(true);

       /* ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.naturallist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);*/

// created link to get the whole Text and Span through for word concatened with symbols
        String myText = "I know you hfbjxhcjsjnsnnnnnnnnnnnnnjcjxj @Michael gshsjsnksnjnjksjj #Water ";
        TextView TV = findViewById(R.id.txt);

        WTS.setLink(myText, TV);

       /* spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mtext.setText(spinner.getSelectedItem().toString());
                //String name= "@"+ mtext.toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });*/



// click listener
        WTS.setClickListener(new NaturalText.ClickListener() {
            @Override
            public void onClick( String type,  String text) {

                // type: "tag", "mail", "url", "phone", "mention" or "custom"

                Toast.makeText(getApplicationContext(), "Type: " + type + "\nText: " + text, Toast.LENGTH_LONG).show();

            }
        });
    }


}
