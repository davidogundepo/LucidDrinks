package com.icdatofcusgmail.luciddrinks.ServingActivityArchive;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.icdatofcusgmail.luciddrinks.DrinksActivityArchive.DrinksmenuActivity;
import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;
import com.icdatofcusgmail.luciddrinks.VendorActivityArchive.VendorActivity;

public class ServingActivity extends AppCompatActivity {

    PowerManager.WakeLock wakeLock;
    TextView textViewun, textViewdo, textViewtrois, textViewquartz, textViewfive, textViewsix, textViewsept, textVieweight, textViewnous, textViewten, textVieweleven, textViewtwelve, textViewthirteen, textViewfourteen, textViewfifteen, textViewsixteen, textViewseventeen, textVieweighteen, textViewnineteen, textViewtwenty, textViewtwentyOne, textViewtwentyTwo, textViewtwentyThree, textViewtwentyFour, textViewtwentyFive, textViewtwentySix, textViewtwentySeven, textViewtwentyEight, textViewtwentyNine, textViewthirty, textViewthirtyOne, textViewthirtyTwo, textViewthirtyThree, textViewthirtyFour, textViewthirtyFive, textViewthirtySix, textViewthirtySeven, textViewthirtyEight, textViewthirtyNine, textViewfourty, textViewfourtyOne, textViewfourtyTwo, textViewfourtyThree, textViewfourtyFour, textViewfourtyFive, textViewPlateorPark;
    TextView pleaseServeMe;
    LucidApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serving);

        app = LucidApplication.getInstance();

        Log.d("ServingActivity", "onCreate invoked");
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }

        pleaseServeMe = findViewById(R.id.serveMePlease);

//        whichName = app.Nametext.getText().toString();
//        firstName = whichName.substring(whichName.indexOf(""), whichName.indexOf(" "));
//
//        Bundle SecondParcel = getIntent().getExtras();
//        pleaseServeMe.setText(firstName +", please serve " + SecondParcel.getString("prince") + " the following:" );

        Intent SecondParcel = getIntent();
        String registrar = SecondParcel.getStringExtra("prince");

        String azubike = registrar.replace("Welcome, ","").trim();

        String Azubike = azubike.substring(0,1).toUpperCase() + azubike.substring(1).toLowerCase();

        String maero_delta = app.Nametext.getText().toString();
        String maero = maero_delta.substring(maero_delta.indexOf(""), maero_delta.indexOf(" "));
        String Maero = maero.substring(0,1).toUpperCase() + maero.substring(1).toLowerCase();

        pleaseServeMe.setText(Maero + " please serve " + Azubike + " the following:" );


        textViewun = findViewById(R.id.plate1);
        textViewun.setVisibility(View.GONE);
        textViewdo = findViewById(R.id.plate2);
        textViewdo.setVisibility(View.GONE);
        textViewtrois = findViewById(R.id.plate3);
        textViewtrois.setVisibility(View.GONE);
        textViewquartz = findViewById(R.id.plate4);
        textViewquartz.setVisibility(View.GONE);
        textViewfive = findViewById(R.id.plate5);
        textViewfive.setVisibility(View.GONE);
        textViewsix = findViewById(R.id.plate6);
        textViewsix.setVisibility(View.GONE);
        textViewsept = findViewById(R.id.plate7);
        textViewsept.setVisibility(View.GONE);
        textVieweight = findViewById(R.id.plate8);
        textVieweight.setVisibility(View.GONE);
        textViewnous = findViewById(R.id.plate9);
        textViewnous.setVisibility(View.GONE);
        textViewten = findViewById(R.id.plate10);
        textViewten.setVisibility(View.GONE);
        textVieweleven = findViewById(R.id.plate11);
        textVieweleven.setVisibility(View.GONE);
        textViewtwelve = findViewById(R.id.plate12);
        textViewtwelve.setVisibility(View.GONE);
        textViewthirteen = findViewById(R.id.plate13);
        textViewthirteen.setVisibility(View.GONE);
        textViewfourteen = findViewById(R.id.plate14);
        textViewfourteen.setVisibility(View.GONE);
        textViewfifteen = findViewById(R.id.plate15);
        textViewfifteen.setVisibility(View.GONE);
        textViewsixteen = findViewById(R.id.plate16);
        textViewsixteen.setVisibility(View.GONE);
        textViewseventeen = findViewById(R.id.plate17);
        textViewseventeen.setVisibility(View.GONE);
        textVieweighteen = findViewById(R.id.plate18);
        textVieweighteen.setVisibility(View.GONE);
        textViewnineteen = findViewById(R.id.plate19);
        textViewnineteen.setVisibility(View.GONE);
        textViewtwenty = findViewById(R.id.plate20);
        textViewtwenty.setVisibility(View.GONE);
        textViewtwentyOne = findViewById(R.id.plate21);
        textViewtwentyOne.setVisibility(View.GONE);
        textViewtwentyTwo = findViewById(R.id.plate22);
        textViewtwentyTwo.setVisibility(View.GONE);
        textViewtwentyThree = findViewById(R.id.plate23);
        textViewtwentyThree.setVisibility(View.GONE);
        textViewtwentyFour = findViewById(R.id.plate24);
        textViewtwentyFour.setVisibility(View.GONE);
        textViewtwentyFive = findViewById(R.id.plate25);
        textViewtwentyFive.setVisibility(View.GONE);
        textViewtwentySix = findViewById(R.id.plate26);
        textViewtwentySix.setVisibility(View.GONE);
        textViewtwentySeven = findViewById(R.id.plate27);
        textViewtwentySeven.setVisibility(View.GONE);
        textViewtwentyEight = findViewById(R.id.plate28);
        textViewtwentyEight.setVisibility(View.GONE);
        textViewtwentyNine = findViewById(R.id.plate29);
        textViewtwentyNine.setVisibility(View.GONE);
        textViewthirty = findViewById(R.id.plate30);
        textViewthirty.setVisibility(View.GONE);
        textViewthirtyOne = findViewById(R.id.plate31);
        textViewthirtyOne.setVisibility(View.GONE);
        textViewthirtyTwo = findViewById(R.id.plate32);
        textViewthirtyTwo.setVisibility(View.GONE);
        textViewthirtyThree = findViewById(R.id.plate33);
        textViewthirtyThree.setVisibility(View.GONE);
        textViewthirtyFour = findViewById(R.id.plate34);
        textViewthirtyFour.setVisibility(View.GONE);
        textViewthirtyFive = findViewById(R.id.plate35);
        textViewthirtyFive.setVisibility(View.GONE);
        textViewthirtySix = findViewById(R.id.plate36);
        textViewthirtySix.setVisibility(View.GONE);
        textViewthirtySeven = findViewById(R.id.plate37);
        textViewthirtySeven.setVisibility(View.GONE);
        textViewthirtyEight = findViewById(R.id.plate38);
        textViewthirtyEight.setVisibility(View.GONE);
        textViewthirtyNine = findViewById(R.id.plate39);
        textViewthirtyNine.setVisibility(View.GONE);
        textViewfourty = findViewById(R.id.plate40);
        textViewfourty.setVisibility(View.GONE);
        textViewfourtyOne = findViewById(R.id.plate41);
        textViewfourtyOne.setVisibility(View.GONE);
        textViewfourtyTwo = findViewById(R.id.plate42);
        textViewfourtyTwo.setVisibility(View.GONE);
        textViewfourtyThree = findViewById(R.id.plate43);
        textViewfourtyThree.setVisibility(View.GONE);
        textViewfourtyFour = findViewById(R.id.plate44);
        textViewfourtyFour.setVisibility(View.GONE);
        textViewfourtyFive = findViewById(R.id.plate45);
        textViewfourtyFive.setVisibility(View.GONE);



        textViewPlateorPark = findViewById(R.id.PackorPlate);
        textViewPlateorPark.setVisibility(View.INVISIBLE);


        Intent PorP = getIntent();
        String receivedvalue = PorP.getStringExtra("Roman");
       

        if (receivedvalue.contentEquals("Buying all in a plate"))
            textViewPlateorPark.setText("" + "All in one Plate" + "");
        

        else if (receivedvalue.contentEquals("Buying all in two plates")) 
            textViewPlateorPark.setText("" + "All in Two different Plates" + "");
        

        else if (receivedvalue.contentEquals("Buying all in three plates")) 
            textViewPlateorPark.setText("" + "All in Three different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in four plates")) 
            textViewPlateorPark.setText("" + "All in Four different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in five plates")) 
            textViewPlateorPark.setText("" + "All in Five different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in six plates")) 
            textViewPlateorPark.setText("" + "All in Six different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in seven plates")) 
            textViewPlateorPark.setText("" + "All in Seven different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in eight plates")) 
            textViewPlateorPark.setText("" + "All in Eight different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in nine plates")) 
            textViewPlateorPark.setText("" + "All in Nine different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in ten plates")) 
            textViewPlateorPark.setText("" + "All in Ten different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in oneone plates")) 
            textViewPlateorPark.setText("" + "All in Eleven different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in onetwo plates")) 
            textViewPlateorPark.setText("" + "All in Twelve different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in onethree plates")) 
            textViewPlateorPark.setText("" + "All in Thirteen different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in onefour plates")) 
            textViewPlateorPark.setText("" + "All in Fourteen different Plates" + "");
        

        else if (receivedvalue.contentEquals("Buying all in onefive plates")) 
            textViewPlateorPark.setText("" + "All in Fifteen different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in onesix plates")) 
            textViewPlateorPark.setText("" + "All in Sixteen different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in oneseven plates")) 
            textViewPlateorPark.setText("" + "All in Seventeen Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in oneeight plates")) 
            textViewPlateorPark.setText("" + "All in Eighteen different Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in onenine plates")) 
            textViewPlateorPark.setText("" + "All in Nineteen different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in oneten plates")) 
            textViewPlateorPark.setText("" + "All in Twenty different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twoone plates")) 
            textViewPlateorPark.setText("" + "All in TwentyOne Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twotwo plates")) 
            textViewPlateorPark.setText("" + "All in TwentyTwo different Plates" + "");


        else if (receivedvalue.contentEquals("Buying all in twothree plates")) 
            textViewPlateorPark.setText("" + "All in TwentyThree different Plates" + "");
        

        else if (receivedvalue.contentEquals("Buying all in twofour plates")) 
            textViewPlateorPark.setText("" + "All in TwentyFour different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twofive plates")) 
            textViewPlateorPark.setText("" + "All in TwentyFive different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in twosix plates")) 
            textViewPlateorPark.setText("" + "All in TwentySix different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in twoseven plates")) 
            textViewPlateorPark.setText("" + "All in TwentySeven different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twoeight plates")) 
            textViewPlateorPark.setText("" + "All in TwentyEight different Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in twonine plates")) 
            textViewPlateorPark.setText("" + "All in TwentyNine different Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in twoten plates")) 
            textViewPlateorPark.setText("" + "All in Thirty different Plates" + "");

        else {
            textViewPlateorPark.setText("" + "All in a Plate" + "");
        }




        Intent favouritism = getIntent();
        String dweezy = favouritism.getStringExtra("favouritism");
        if (DrinksmenuActivity.textView.getVisibility() == View.VISIBLE) {
            textViewun.setText(dweezy);
            textViewun.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView.getVisibility() == View.GONE) {
            textViewun.setVisibility(View.GONE);
        }

        Intent genius = getIntent();
        String tobi = genius.getStringExtra("genius");
        if (DrinksmenuActivity.textView2nd.getVisibility() == View.VISIBLE) {
            textViewdo.setText(tobi);
            textViewdo.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView2nd.getVisibility() == View.GONE) {
            textViewdo.setVisibility(View.GONE);
        }

        Intent generous = getIntent();
        String emmanuel = generous.getStringExtra("generous");
        if (DrinksmenuActivity.textView3rd.getVisibility() == View.VISIBLE) {
            textViewtrois.setText(emmanuel);
            textViewtrois.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView3rd.getVisibility() == View.GONE) {
            textViewtrois.setVisibility(View.GONE);
        }

        Intent focused = getIntent();
        String joseph = focused.getStringExtra("focused");
        if (DrinksmenuActivity.textView4th.getVisibility() == View.VISIBLE) {
            textViewquartz.setText(joseph);
            textViewquartz.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView4th.getVisibility() == View.GONE) {
            textViewquartz.setVisibility(View.GONE);
        }

        Intent creativebeast = getIntent();
        String godwin = creativebeast.getStringExtra("creativebeast");
        if (DrinksmenuActivity.textView5th.getVisibility() == View.VISIBLE) {
            textViewfive.setText(godwin);
            textViewfive.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView5th.getVisibility() == View.GONE) {
            textViewfive.setVisibility(View.GONE);
        }

        Intent bestmom = getIntent();
        String funmilayo = bestmom.getStringExtra("bestmom");
        if (DrinksmenuActivity.textView6th.getVisibility() == View.VISIBLE) {
            textViewsix.setText(funmilayo);
            textViewsix.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView6th.getVisibility() == View.GONE) {
            textViewsix.setVisibility(View.GONE);
        }

        Intent bestdad = getIntent();
        String james = bestdad.getStringExtra("bestdad");
        if (DrinksmenuActivity.textView7th.getVisibility() == View.VISIBLE) {
            textViewsept.setText(james);
            textViewsept.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView7th.getVisibility() == View.GONE) {
            textViewsept.setVisibility(View.GONE);
        }

        Intent biggersis = getIntent();
        String tomilola = biggersis.getStringExtra("biggersis");
        if (DrinksmenuActivity.textView8th.getVisibility() == View.VISIBLE) {
            textVieweight.setText(tomilola);
            textVieweight.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView8th.getVisibility() == View.GONE) {
            textVieweight.setVisibility(View.GONE);
        }

        Intent biggestsis = getIntent();
        String opeyemi = biggestsis.getStringExtra("biggestsis");
        if (DrinksmenuActivity.textView9th.getVisibility() == View.VISIBLE) {
            textViewnous.setText(opeyemi);
            textViewnous.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView9th.getVisibility() == View.GONE) {
            textViewnous.setVisibility(View.GONE);
        }

        Intent dhalson = getIntent();
        String david = dhalson.getStringExtra("dhalson");
        if (DrinksmenuActivity.textView10th.getVisibility() == View.VISIBLE) {
            textViewten.setText(david);
            textViewten.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView10th.getVisibility() == View.GONE) {
            textViewten.setVisibility(View.GONE);
        }

        Intent obla = getIntent();
        String mami = obla.getStringExtra("chikito");
        if (DrinksmenuActivity.textView11th.getVisibility() == View.VISIBLE) {
            textVieweleven.setText(mami);
            textVieweleven.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView11th.getVisibility() == View.GONE) {
            textVieweleven.setVisibility(View.GONE);
        }

        Intent love = getIntent();
        String unfailing = love.getStringExtra("blackdiamond");
        if (DrinksmenuActivity.textView12th.getVisibility() == View.VISIBLE) {
            textViewtwelve.setText(unfailing);
            textViewtwelve.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView12th.getVisibility() == View.GONE) {
            textViewtwelve.setVisibility(View.GONE);
        }

        Intent mrnoah = getIntent();
        String studentdeveloper = mrnoah.getStringExtra("smilingfull");
        if (DrinksmenuActivity.textView13th.getVisibility() == View.VISIBLE) {
            textViewthirteen.setText(studentdeveloper);
            textViewthirteen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView13th.getVisibility() == View.GONE) {
            textViewthirteen.setVisibility(View.GONE);
        }

        Intent google = getIntent();
        String android = google.getStringExtra("versatile");
        if (DrinksmenuActivity.textView14th.getVisibility() == View.VISIBLE) {
            textViewfourteen.setText(android);
            textViewfourteen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView14th.getVisibility() == View.GONE) {
            textViewfourteen.setVisibility(View.GONE);
        }

        Intent havillah = getIntent();
        String agadah = havillah.getStringExtra("crazitivity");
        if (DrinksmenuActivity.textView15th.getVisibility() == View.VISIBLE) {
            textViewfifteen.setText(agadah);
            textViewfifteen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView15th.getVisibility() == View.GONE) {
            textViewfifteen.setVisibility(View.GONE);
        }

        Intent samuel = getIntent();
        String agbede = samuel.getStringExtra("humility");
        if (DrinksmenuActivity.textView16th.getVisibility() == View.VISIBLE) {
            textViewsixteen.setText(agbede);
            textViewsixteen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView16th.getVisibility() == View.GONE) {
            textViewsixteen.setVisibility(View.GONE);
        }

        Intent praise = getIntent();
        String pop = praise.getStringExtra("omuaranprince");
        if (DrinksmenuActivity.textView17th.getVisibility() == View.VISIBLE) {
            textViewseventeen.setText(pop);
            textViewseventeen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView17th.getVisibility() == View.GONE) {
            textViewseventeen.setVisibility(View.GONE);
        }

        Intent albert = getIntent();
        String mutale = albert.getStringExtra("zambian");
        if (DrinksmenuActivity.textView18th.getVisibility() == View.VISIBLE) {
            textVieweighteen.setText(mutale);
            textVieweighteen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView18th.getVisibility() == View.GONE) {
            textVieweighteen.setVisibility(View.GONE);
        }

        Intent akinfenwa = getIntent();
        String dopest = akinfenwa.getStringExtra("silentassasin");
        if (DrinksmenuActivity.textView19th.getVisibility() == View.VISIBLE) {
            textViewnineteen.setText(dopest);
            textViewnineteen.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView19th.getVisibility() == View.GONE) {
            textViewnineteen.setVisibility(View.GONE);
        }

        Intent aize = getIntent();
        String obayan = aize.getStringExtra("speciallyunique");
        if (DrinksmenuActivity.textView20th.getVisibility() == View.VISIBLE) {
            textViewtwenty.setText(obayan);
            textViewtwenty.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView20th.getVisibility() == View.GONE) {
            textViewtwenty.setVisibility(View.GONE);
        }

        Intent eruku = getIntent();
        String bayo = eruku.getStringExtra("oribee");
        if (DrinksmenuActivity.textView21st.getVisibility() == View.VISIBLE) {
            textViewtwentyOne.setText(bayo);
            textViewtwentyOne.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView21st.getVisibility() == View.GONE) {
            textViewtwentyOne.setVisibility(View.GONE);
        }

        Intent demilade = getIntent();
        String fineboy = demilade.getStringExtra("blackoyinbo");
        if (DrinksmenuActivity.textView22nd.getVisibility() == View.VISIBLE) {
            textViewtwentyTwo.setText(fineboy);
            textViewtwentyTwo.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView22nd.getVisibility() == View.GONE) {
            textViewtwentyTwo.setVisibility(View.GONE);
        }

        Intent dimeji = getIntent();
        String qudus = dimeji.getStringExtra("westbrook");
        if (DrinksmenuActivity.textView23rd.getVisibility() == View.VISIBLE) {
            textViewtwentyThree.setText(qudus);
            textViewtwentyThree.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView23rd.getVisibility() == View.GONE) {
            textViewtwentyThree.setVisibility(View.GONE);
        }

        Intent westbrook = getIntent();
        String okc = westbrook.getStringExtra("mvp");
        if (DrinksmenuActivity.textView24th.getVisibility() == View.VISIBLE) {
            textViewtwentyFour.setText(okc);
            textViewtwentyFour.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView24th.getVisibility() == View.GONE) {
            textViewtwentyFour.setVisibility(View.GONE);
        }

        Intent curry = getIntent();
        String unanimous = curry.getStringExtra("babyfaceassasin");
        if (DrinksmenuActivity.textView25th.getVisibility() == View.VISIBLE) {
            textViewtwentyFive.setText(unanimous);
            textViewtwentyFive.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView25th.getVisibility() == View.GONE) {
            textViewtwentyFive.setVisibility(View.GONE);
        }

        Intent oyedepo = getIntent();
        String papa = oyedepo.getStringExtra("baba");
        if (DrinksmenuActivity.textView26th.getVisibility() == View.VISIBLE) {
            textViewtwentySix.setText(papa);
            textViewtwentySix.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView26th.getVisibility() == View.GONE) {
            textViewtwentySix.setVisibility(View.GONE);
        }

        Intent damola = getIntent();
        String orieja = damola.getStringExtra("geelord");
        if (DrinksmenuActivity.textView27th.getVisibility() == View.VISIBLE) {
            textViewtwentySeven.setText(orieja);
            textViewtwentySeven.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView27th.getVisibility() == View.GONE) {
            textViewtwentySeven.setVisibility(View.GONE);
        }

        Intent bukunmi = getIntent();
        String omokogi = bukunmi.getStringExtra("myguy");
        if (DrinksmenuActivity.textView28th.getVisibility() == View.VISIBLE) {
            textViewtwentyEight.setText(omokogi);
            textViewtwentyEight.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView28th.getVisibility() == View.GONE) {
            textViewtwentyEight.setVisibility(View.GONE);
        }

        Intent solomon = getIntent();
        String e_norhbae = solomon.getStringExtra("okowon");
        if (DrinksmenuActivity.textView29th.getVisibility() == View.VISIBLE) {
            textViewtwentyNine.setText(e_norhbae);
            textViewtwentyNine.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView29th.getVisibility() == View.GONE) {
            textViewtwentyNine.setVisibility(View.GONE);
        }

        Intent tolani = getIntent();
        String aro = tolani.getStringExtra("submissive");
        if (DrinksmenuActivity.textView30th.getVisibility() == View.VISIBLE) {
            textViewthirty.setText(aro);
            textViewthirty.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView30th.getVisibility() == View.GONE) {
            textViewthirty.setVisibility(View.GONE);
        }

        Intent ganyan = getIntent();
        String godblessu = ganyan.getStringExtra("sokind");
        if (DrinksmenuActivity.textView31st.getVisibility() == View.VISIBLE) {
            textViewthirtyOne.setText(godblessu);
            textViewthirtyOne.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView31st.getVisibility() == View.GONE) {
            textViewthirtyOne.setVisibility(View.GONE);
        }

        Intent keziah = getIntent();
        String omokaduna = keziah.getStringExtra("smilesmile");
        if (DrinksmenuActivity.textView32nd.getVisibility() == View.VISIBLE) {
            textViewthirtyTwo.setText(omokaduna);
            textViewthirtyTwo.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView32nd.getVisibility() == View.GONE) {
            textViewthirtyTwo.setVisibility(View.GONE);
        }

        Intent maryam = getIntent();
        String shedeveloper = maryam.getStringExtra("myhand");
        if (DrinksmenuActivity.textView33rd.getVisibility() == View.VISIBLE) {
            textViewthirtyThree.setText(shedeveloper);
            textViewthirtyThree.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView33rd.getVisibility() == View.GONE) {
            textViewthirtyThree.setVisibility(View.GONE);
        }

        Intent mrenoch = getIntent();
        String wordstudyprodigy = mrenoch.getStringExtra("mentor");
        if (DrinksmenuActivity.textView34th.getVisibility() == View.VISIBLE) {
            textViewthirtyFour.setText(wordstudyprodigy);
            textViewthirtyFour.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView34th.getVisibility() == View.GONE) {
            textViewthirtyFour.setVisibility(View.GONE);
        }

        Intent shittu = getIntent();
        String reymond = shittu.getStringExtra("softwareboss");
        if (DrinksmenuActivity.textView35th.getVisibility() == View.VISIBLE) {
            textViewthirtyFive.setText(reymond);
            textViewthirtyFive.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView35th.getVisibility() == View.GONE) {
            textViewthirtyFive.setVisibility(View.GONE);
        }

        Intent pastorchris = getIntent();
        String prayerforceprodigy = pastorchris.getStringExtra("letspray");
        if (DrinksmenuActivity.textView36th.getVisibility() == View.VISIBLE) {
            textViewthirtySix.setText(prayerforceprodigy);
            textViewthirtySix.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView36th.getVisibility() == View.GONE) {
            textViewthirtySix.setVisibility(View.GONE);
        }

        Intent deborah = getIntent();
        String chemengr = deborah.getStringExtra("owobird");
        if (DrinksmenuActivity.textView37th.getVisibility() == View.VISIBLE) {
            textViewthirtySeven.setText(chemengr);
            textViewthirtySeven.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView37th.getVisibility() == View.GONE) {
            textViewthirtySeven.setVisibility(View.GONE);
        }

        Intent engrope = getIntent();
        String csis = engrope.getStringExtra("acceptance");
        if (DrinksmenuActivity.textView38th.getVisibility() == View.VISIBLE) {
            textViewthirtyEight.setText(csis);
            textViewthirtyEight.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView38th.getVisibility() == View.GONE) {
            textViewthirtyEight.setVisibility(View.GONE);
        }

        Intent drojo = getIntent();
        String civilengr = drojo.getStringExtra("myprof");
        if (DrinksmenuActivity.textView39th.getVisibility() == View.VISIBLE) {
            textViewthirtyNine.setText(civilengr);
            textViewthirtyNine.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView39th.getVisibility() == View.GONE) {
            textViewthirtyNine.setVisibility(View.GONE);
        }

        Intent drgana = getIntent();
        String letslaugh = drgana.getStringExtra("impactful");
        if (DrinksmenuActivity.textView40th.getVisibility() == View.VISIBLE) {
            textViewfourty.setText(letslaugh);
            textViewfourty.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView40th.getVisibility() == View.GONE) {
            textViewfourty.setVisibility(View.GONE);
        }

        Intent calabar = getIntent();
        String soccerbaby = calabar.getStringExtra("letsplay");
        if (DrinksmenuActivity.textView41st.getVisibility() == View.VISIBLE) {
            textViewfourtyOne.setText(soccerbaby);
            textViewfourtyOne.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView41st.getVisibility() == View.GONE) {
            textViewfourtyOne.setVisibility(View.GONE);
        }

        Intent pemisire = getIntent();
        String cousinmi = pemisire.getStringExtra("myboy");
        if (DrinksmenuActivity.textView42nd.getVisibility() == View.VISIBLE) {
            textViewfourtyTwo.setText(cousinmi);
            textViewfourtyTwo.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView42nd.getVisibility() == View.GONE) {
            textViewfourtyTwo.setVisibility(View.GONE);
        }

        Intent firebomi = getIntent();
        String mycousin = firebomi.getStringExtra("mygal");
        if (DrinksmenuActivity.textView43rd.getVisibility() == View.VISIBLE) {
            textViewfourtyThree.setText(mycousin);
            textViewfourtyThree.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView43rd.getVisibility() == View.GONE) {
            textViewfourtyThree.setVisibility(View.GONE);
        }

        Intent lesbrown = getIntent();
        String myfavspeaker = lesbrown.getStringExtra("speaker");
        if (DrinksmenuActivity.textView44th.getVisibility() == View.VISIBLE) {
            textViewfourtyFour.setText(myfavspeaker);
            textViewfourtyFour.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView44th.getVisibility() == View.GONE) {
            textViewfourtyFour.setVisibility(View.GONE);
        }

        Intent ericthomas = getIntent();
        String sabaywb = ericthomas.getStringExtra("hiphop");
        if (DrinksmenuActivity.textView45th.getVisibility() == View.VISIBLE) {
            textViewfourtyFive.setText(sabaywb);
            textViewfourtyFive.setVisibility(View.VISIBLE);
        } else if (DrinksmenuActivity.textView45th.getVisibility() == View.GONE) {
            textViewfourtyFive.setVisibility(View.GONE);
        }


    }


    public void NextTransactionPlease (View view) {

        Intent lucid = new Intent(this, VendorActivity.class);
        startActivity(lucid);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Unnecessary Move");
        alertDialog.setMessage("This action is prevented and unnecessary");
        alertDialog.setIcon(R.drawable.a_alert);
        alertDialog.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.create().show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ServingActivity","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ServingActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ServingActivity","onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ServingActivity","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ServingActivity","onDestroy invoked");
    }
}
