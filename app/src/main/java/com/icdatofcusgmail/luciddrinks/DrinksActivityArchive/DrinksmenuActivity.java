package com.icdatofcusgmail.luciddrinks.DrinksActivityArchive;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.antonionicolaspina.revealtextview.RevealTextView;
import com.icdatofcusgmail.luciddrinks.LoginActivityArchive.LoginActivity;
import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.MyCountlesston;
import com.icdatofcusgmail.luciddrinks.R;
import com.icdatofcusgmail.luciddrinks.ServingActivityArchive.ServingActivity;
import com.luolc.emojirain.EmojiRainLayout;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class DrinksmenuActivity extends AppCompatActivity  implements MidFielder, DrinkspriceFragment.OnNameSetListener, ChosendrinksFragment.OnPriceSetListener, AdapterView.OnItemClickListener{

    PowerManager.WakeLock wakeLock;
    Toolbar toolbar_foodmenu;
    private RelativeLayout relative;
    public static TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th, textView25th, textView26th, textView27th, textView28th, textView29th, textView30th, textView31st, textView32nd, textView33rd, textView34th, textView35th, textView36th, textView37th, textView38th, textView39th, textView40th, textView41st, textView42nd, textView43rd, textView44th, textView45th;
    Button button, button2, button3, button4, button5, button6;
    static Button Pcount, Purchase;
    ListView ShowForThis;
    TextView WelcomeSweet, fullUsername, Lucid, EmailAddress;
    TextView NoOfPlates;
    TextView Sex, UserProfileName, UserProfileAccountBalance, UserProfileStarLevel, Department, Level, LastSeen, UserProfileSex;
    ImageView UserProfileImage;
    TextView HiICalculate;
    private ImageView AnimatedImageView;
    CircleImageView circleImageView;
    public static int out = 0;

    public static String playtcount = "";
    public static String stringplayti = "Buying all in a plate";
    String stringplaytii = "Buying all in two plates";
    String stringplaytiii = "Buying all in three plates";
    String stringplaytiv = "Buying all in four plates";
    String stringplaytv = "Buying all in five plates";
    String stringplaytvi = "Buying all in six plates";
    String stringplaytvii = "Buying all in seven plates";
    String stringplaytviii = "Buying all in eight plates";
    String stringplaytix = "Buying all in nine plates";
    String stringplaytx = "Buying all in ten plates";
    String stringplaytxi = "Buying all in oneone plates";
    String stringplaytxii = "Buying all in onetwo plates";
    String stringplaytxiii = "Buying all in onethree plates";
    String stringplaytxiv = "Buying all in onefour plates";
    String stringplaytxv = "Buying all in onefive plates";
    String stringplaytxvi = "Buying all in onesix plates";
    String stringplaytxvii = "Buying all in oneseven plates";
    String stringplaytxviii = "Buying all in oneeight plates";
    String stringplaytxix = "Buying all in onenine plates";
    String stringplaytxx = "Buying all in oneten plates";
    String stringplaytxxi = "Buying all in twoone plates";
    String stringplaytxxii = "Buying all in twotwo plates";
    String stringplaytxxiii = "Buying all in twothree plates";
    String stringplaytxxiv = "Buying all in twofour plates";
    String stringplaytxxv = "Buying all in twofive plates";
    String stringplaytxxvi = "Buying all in twosix plates";
    String stringplaytxxvii = "Buying all in twoseven plates";
    String stringplaytxxviii = "Buying all in twoeight plates";
    String stringplaytxxix = "Buying all in twonine plates";
    String stringplaytxxx = "Buying all in twoten plates";

    String DrinkAOneBeta, DrinkAOne, DrinkATwo, NoOfDrinkA;
    String DrinkBOneBeta, DrinkBOne, DrinkBTwo, NoOfDrinkB;
    String DrinkCOneBeta, DrinkCOne, DrinkCTwo, NoOfDrinkC;
    String DrinkDOneBeta, DrinkDOne, DrinkDTwo, NoOfDrinkD;
    String DrinkEOneBeta, DrinkEOne, DrinkETwo, NoOfDrinkE;
    String DrinkFOneBeta, DrinkFOne, DrinkFTwo, NoOfDrinkF;
    String DrinkGOneBeta, DrinkGOne, DrinkGTwo, NoOfDrinkG;
    String DrinkHOneBeta, DrinkHOne, DrinkHTwo, NoOfDrinkH;
    String DrinkIOneBeta, DrinkIOne, DrinkITwo, NoOfDrinkI;
    String DrinkJOneBeta, DrinkJOne, DrinkJTwo, NoOfDrinkJ;
    String DrinkKOneBeta, DrinkKOne, DrinkKTwo, NoOfDrinkK;
    String DrinkLOneBeta, DrinkLOne, DrinkLTwo, NoOfDrinkL;
    String DrinkMOneBeta, DrinkMOne, DrinkMTwo, NoOfDrinkM;
    String DrinkNOneBeta, DrinkNOne, DrinkNTwo, NoOfDrinkN;
    String DrinkOOneBeta, DrinkOOne, DrinkOTwo, NoOfDrinkO;
    String DrinkPOneBeta, DrinkPOne, DrinkPTwo, NoOfDrinkP;
    String DrinkQOneBeta, DrinkQOne, DrinkQTwo, NoOfDrinkQ;
    String DrinkROneBeta, DrinkROne, DrinkRTwo, NoOfDrinkR;
    String DrinkSOneBeta, DrinkSOne, DrinkSTwo, NoOfDrinkS;
    String DrinkTOneBeta, DrinkTOne, DrinkTTwo, NoOfDrinkT;
    String DrinkUOneBeta, DrinkUOne, DrinkUTwo, NoOfDrinkU;
    String DrinkVOneBeta, DrinkVOne, DrinkVTwo, NoOfDrinkV;
    String DrinkWOneBeta, DrinkWOne, DrinkWTwo, NoOfDrinkW;
    String DrinkXOneBeta, DrinkXOne, DrinkXTwo, NoOfDrinkX;
    String DrinkYOneBeta, DrinkYOne, DrinkYTwo, NoOfDrinkY;
    String DrinkZOneBeta, DrinkZOne, DrinkZTwo, NoOfDrinkZ;
    String DrinkZAOneBeta, DrinkZAOne, DrinkZATwo, NoOfDrinkZA;
    String DrinkZBOneBeta, DrinkZBOne, DrinkZBTwo, NoOfDrinkZB;
    String DrinkZCOneBeta, DrinkZCOne, DrinkZCTwo, NoOfDrinkZC;
    String DrinkZDOneBeta, DrinkZDOne, DrinkZDTwo, NoOfDrinkZD;
    String DrinkZEOneBeta, DrinkZEOne, DrinkZETwo, NoOfDrinkZE;
    String DrinkZFOneBeta, DrinkZFOne, DrinkZFTwo, NoOfDrinkZF;
    String DrinkZGOneBeta, DrinkZGOne, DrinkZGTwo, NoOfDrinkZG;
    String DrinkZHOneBeta, DrinkZHOne, DrinkZHTwo, NoOfDrinkZH;
    String DrinkZIOneBeta, DrinkZIOne, DrinkZITwo, NoOfDrinkZI;
    String DrinkZJOneBeta, DrinkZJOne, DrinkZJTwo, NoOfDrinkZJ;
    String DrinkZKOneBeta, DrinkZKOne, DrinkZKTwo, NoOfDrinkZK;
    String DrinkZLOneBeta, DrinkZLOne, DrinkZLTwo, NoOfDrinkZL;
    String DrinkZMOneBeta, DrinkZMOne, DrinkZMTwo, NoOfDrinkZM;
    String DrinkZNOneBeta, DrinkZNOne, DrinkZNTwo, NoOfDrinkZN;
    String DrinkZOOneBeta, DrinkZOOne, DrinkZOTwo, NoOfDrinkZO;
    String DrinkZPOneBeta, DrinkZPOne, DrinkZPTwo, NoOfDrinkZP;
    String DrinkZQOneBeta, DrinkZQOne, DrinkZQTwo, NoOfDrinkZQ;
    String DrinkZROneBeta, DrinkZROne, DrinkZRTwo, NoOfDrinkZR;
    String DrinkZSOneBeta, DrinkZSOne, DrinkZSTwo, NoOfDrinkZS;


    LucidApplication app;

    String update_balance = "http://128.0.1.2/my_accountbalance_diff.php";
    String insert_bought_drinkitems = "http://128.0.1.2/my_luciddrinks_transaction_success.php";
    String webmail_drinktranc_details = "http://128.0.1.2/my_luciddrink_webmail_transaction_details.php";

    AlertDialog.Builder Dweezy;

    AlertDialog.Builder Lenient;
    Dialog Prince;

    EmojiRainLayout idara;


    private enum OperationAnimation {
        BEGIN, ADJOURN
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinksmenu);

        app = LucidApplication.getInstance();

        Dweezy = new AlertDialog.Builder(DrinksmenuActivity.this);

        playtcount = stringplayti;
        ShowForThis = findViewById(R.id.listView);
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        textView = (Button) findViewById(R.id.Istchosenbutton);
        textView2nd = (Button) findViewById(R.id.Secondchosenbutton);
        textView3rd = (Button) findViewById(R.id.Thirdchosenbutton);
        textView4th = (Button) findViewById(R.id.Fourthchosenbutton);
        textView5th = (Button) findViewById(R.id.Fifthchosenbutton);
        textView6th = (Button) findViewById(R.id.Sixthchosenbutton);
        textView7th = (Button) findViewById(R.id.Seventhchosenbutton);
        textView8th = (Button) findViewById(R.id.Eightchosenbutton);
        textView9th = (Button) findViewById(R.id.Ninthchosenbutton);
        textView10th = (Button) findViewById(R.id.Tenthchosenbutton);
        textView11th = (Button) findViewById(R.id.Eleventhchosenbutton);
        textView12th = (Button) findViewById(R.id.Twelvthchosenbutton);
        textView13th = (Button) findViewById(R.id.Thirteenthchosenbutton);
        textView14th = (Button) findViewById(R.id.Fourteenthchosenbutton);
        textView15th = (Button) findViewById(R.id.Fifteenthchosenbutton);
        textView16th = (Button) findViewById(R.id.Sixteenthchosenbutton);
        textView17th = (Button) findViewById(R.id.Seventeenthchosenbutton);
        textView18th = (Button) findViewById(R.id.Eighteenthchosenbutton);
        textView19th = (Button) findViewById(R.id.Nineteenthchosenbutton);
        textView20th = (Button) findViewById(R.id.Twentiethchosenbutton);
        textView21st = (Button) findViewById(R.id.TwentyIstchosenbutton);
        textView22nd = (Button) findViewById(R.id.TwentySecondchosenbutton);
        textView23rd = (Button) findViewById(R.id.TwentyThirdchosenbutton);
        textView24th = (Button) findViewById(R.id.TwentyFourthchosenbutton);
        textView25th = (Button) findViewById(R.id.TwentyFifthchosenbutton);
        textView26th = (Button) findViewById(R.id.TwentySixthchosenbutton);
        textView27th = (Button) findViewById(R.id.TwentySeventhchosenbutton);
        textView28th = (Button) findViewById(R.id.TwentyEightchosenbutton);
        textView29th = (Button) findViewById(R.id.TwentyNinthchosenbutton);
        textView30th = (Button) findViewById(R.id.Thirtiethchosenbutton);
        textView31st = (Button) findViewById(R.id.ThirtyIstchosenbutton);
        textView32nd = (Button) findViewById(R.id.ThirtySecondchosenbutton);
        textView33rd = (Button) findViewById(R.id.ThirtyThirdchosenbutton);
        textView34th = (Button) findViewById(R.id.ThirtyFourthchosenbutton);
        textView35th = (Button) findViewById(R.id.ThirtyFifthchosenbutton);
        textView36th = (Button) findViewById(R.id.ThirtySixthchosenbutton);
        textView37th = (Button) findViewById(R.id.ThirtySeventhchosenbutton);
        textView38th = (Button) findViewById(R.id.ThirtyEighthchosenbutton);
        textView39th = (Button) findViewById(R.id.ThirtyNinthchosenbutton);
        textView40th = (Button) findViewById(R.id.Fourtiethchosenbutton);
        textView41st = (Button) findViewById(R.id.FourtyOnechosenbutton);
        textView42nd = (Button) findViewById(R.id.FourtyTwochosenbutton);
        textView43rd = (Button) findViewById(R.id.FourtyThreechosenbutton);
        textView44th = (Button) findViewById(R.id.FourtyFourchosenbutton);
        textView45th = (Button) findViewById(R.id.FourtyFivechosenbutton);

        NoOfPlates = findViewById(R.id.CountMyPlate);

        Sex = findViewById(R.id.sex);


        WelcomeSweet = findViewById(R.id.UserWelcome);
        fullUsername = findViewById(R.id.fullUsername);
        EmailAddress = findViewById(R.id.emailAddress);
        Lucid = (RevealTextView) findViewById(R.id.AppName);
        Typeface blackface = Typeface.createFromAsset(getAssets(), "customfont/buttonfor.otf");
        Lucid.setTypeface(blackface);

        button = findViewById(R.id.Istpricebutton);
        button2 = findViewById(R.id.Secondpricebutton);
        button3 = findViewById(R.id.Thirdpricebutton);
        button4 = findViewById(R.id.Fourthpricebutton);
        button5 = findViewById(R.id.Fifthpricebutton);
     //   button6 = (Button) findViewById(R.id.Sixthpricebutton);

        Pcount = findViewById(R.id.button);

        Purchase = findViewById(R.id.button20000);

        AnimatedImageView = findViewById(R.id.animatedImages);


        circleImageView = findViewById(R.id.ServerImage);
        final Bundle bundle = getIntent().getExtras();
        getUserAppearance(bundle.getString("image"));

        if (!textView.isShown() && !textView2nd.isShown() && !textView3rd.isShown()
                && !textView4th.isShown() && !textView5th.isShown() && !textView6th.isShown()
                && !textView7th.isShown() && !textView8th.isShown() && !textView9th.isShown()
                && !textView10th.isShown() && !textView11th.isShown() && !textView12th.isShown()
                && !textView13th.isShown() && !textView14th.isShown() && !textView15th.isShown()
                && !textView16th.isShown() && !textView17th.isShown() && !textView18th.isShown()
                && !textView19th.isShown() && !textView20th.isShown() && !textView21st.isShown()
                && !textView22nd.isShown() && !textView23rd.isShown() && !textView24th.isShown()
                && !textView25th.isShown() && !textView26th.isShown() && !textView27th.isShown()
                && !textView28th.isShown() && !textView29th.isShown() && !textView30th.isShown()
                && !textView31st.isShown() && !textView32nd.isShown() && !textView33rd.isShown()
                && !textView34th.isShown() && !textView35th.isShown() && !textView36th.isShown()
                && !textView37th.isShown() && !textView38th.isShown() && !textView39th.isShown()
                && !textView40th.isShown()  && !textView41st.isShown() && !textView42nd.isShown()
                && !textView43rd.isShown()) {
            // Pcount.setEnabled(false);
            Purchase.setEnabled(false);
        }

        Bundle FirstParcel = getIntent().getExtras();
        try {
            WelcomeSweet.setText("Welcome,  " + FirstParcel.getString("king") + "");
        } catch (Exception ignored) {

        }

        Bundle SecondParcel = getIntent().getExtras();
        try {
            fullUsername.setText("" + SecondParcel.getString("kingDavid") + "");
        } catch (Exception ignored) {

        }

        Bundle ThirdParcel = getIntent().getExtras();
        try {
            EmailAddress.setText("" + ThirdParcel.getString("email") + "");
        } catch (Exception ignored) {

        }

        HiICalculate = findViewById(R.id.counter);
        HiICalculate.setText("Hey " + FirstParcel.getString("king") + "\nI Calculate");

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        relative = findViewById(R.id.activity_drinksmenu);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }
        toolbar_foodmenu = findViewById(R.id.ToolbardrinksmenuActivity);
        setSupportActionBar(toolbar_foodmenu);

        try {
            getSupportActionBar().setTitle("");
        }catch (NullPointerException ignored) {

        }

    }

    private void getUserAppearance(String url) {

        Bundle SexParcel = getIntent().getExtras();
        Sex.setText(SexParcel.getString("sex"));

        if (Sex.getText().toString().equals("female")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorgirl).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("male")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorboy).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("doctor")) {
                    Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errordoctor).into(circleImageView, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        }

        if (Sex.getText().toString().equals("professor")) {
                    Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorprof).into(circleImageView, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        }

        if (Sex.getText().toString().equals("mr")) {
                    Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormr).into(circleImageView, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        }

        if (Sex.getText().toString().equals("engineer")) {
                    Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorengr).into(circleImageView, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        }

        if (Sex.getText().toString().equals("mrs")) {
                    Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormrs).into(circleImageView, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        }

        if (Sex.getText().toString().equals("miss")) {
                    Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormiss).into(circleImageView, new com.squareup.picasso.Callback() {
                        @Override
                        public void onSuccess() {

                        }

                        @Override
                        public void onError() {

                        }
                    });
        }

    }


    public void ConfirmMyPurchase(View v) {

        Bundle FirstParcel = getIntent().getExtras();

        if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#B71C1C")) {
            AlertDialog.Builder notExactly = new AlertDialog.Builder(DrinksmenuActivity.this);
            notExactly.setTitle("Ummmm....it seems you've kinda exceeded your accountbalance.");
            notExactly.setMessage("\nIt's alright " + FirstParcel.getString("king") +  ", we could do away with few stuffs.");
            notExactly.setPositiveButton("I'm Sorry Fam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notExactly.create().show();
        } else if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#303F9F")) {
            AlertDialog.Builder notBeyond = new AlertDialog.Builder(DrinksmenuActivity.this);
            notBeyond.setTitle("Ummmm....Your Purchase really can't be equal with your Balance");
            notBeyond.setMessage("\nLet's try do away with something aiit?");
            notBeyond.setPositiveButton("Aiit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notBeyond.create().show();
        } else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(DrinksmenuActivity.this);

            Bundle IRTBD = getIntent().getExtras();
            builder.setTitle("Confirm Purchase " + IRTBD.getString("king") + "");

            builder.setMessage("The drink(s) you selected will be bought by clicking \n\n\tBuy");
            builder.setCancelable(false);

            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                    playtcount = stringplayti;
                    ChosenplateCounter.feetag.setText("" + app.allindrinkcounter + "");
                 //   DrinksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
                    NoOfPlates.setText("1");

                    StyleableToast NotConfirmed = new StyleableToast(getApplicationContext(), "Transaction not Confirmed", Toast.LENGTH_SHORT).spinIcon();
                    NotConfirmed.setBackgroundColor(Color.parseColor("#FF5A5F"));
                    NotConfirmed.setTextColor(Color.WHITE);
                    NotConfirmed.show();
                }
            });
            builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    StringRequest fromJingSun = new StringRequest(Request.Method.POST, update_balance,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(final String response) {
                                    try {
                                        JSONArray jsonArray = new JSONArray(response);
                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
                                        String code = jsonObject.getString("code");

                                        Bundle FirstParcel = getIntent().getExtras();

                                        if (code.equals("Transaction Successful.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nAlright " + FirstParcel.getString("king") + " let's get you served.");
                                        }
                                        if (code.equals("Ummmm....it seems you've kinda exceeded your accountbalance.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nIt's alright " + FirstParcel.getString("king") + ", we could do away with few stuffs.");
                                            builder.setPositiveButton("Okay", null);
                                        }
                                        if (code.equals("It's crazy " + FirstParcel.getString("king") + " but you are not permitted to put exactly all your money.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nLet's try do away with something aiit?");
                                            builder.setPositiveButton("Aiit", null);
                                        }
                                        else {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nAlright " + FirstParcel.getString("king") + " let's get you served.");
                                        }

                                      //  Dweezy.setMessage(code);
                                        Dweezy.setCancelable(false);
                                        exhibitAnswer(code);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> params = new HashMap<String, String>();
                            params.put("accountbalance_diff", ChosenplateCounter.feetag.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(fromJingSun);
                }

            }).setIcon(R.drawable.a_announcement_b);
            Dialog dialog = builder.create();
            try {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
            } catch (NullPointerException ignored) {

            }
            dialog.show();

         //   myOwnPay = (TextView) view.findViewById(R.id.myPaynotYours);

        }
    }

    public void exhibitAnswer(final String code) {
        Dweezy.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (code.equals("Transaction Successful."))
                {
                    StyleableToast TranCompleted = new StyleableToast(getApplicationContext(), "Transaction Verified", Toast.LENGTH_SHORT).spinIcon();
                    TranCompleted.setBackgroundColor(Color.parseColor("#01579B"));
                    TranCompleted.setTextColor(Color.WHITE);
                    TranCompleted.setIcon(R.drawable.da_confirmpurchasetoasticon);
                    TranCompleted.show();

                    Intent intent = new Intent(getBaseContext(), ServingActivity.class);
                    intent.putExtra("Roman", playtcount);

                    Bundle dweezy = new Bundle();
                    dweezy.putString("favouritism", textView.getText().toString());
                    intent.putExtras(dweezy);

                    Bundle tobi = new Bundle();
                    tobi.putString("genius", textView2nd.getText().toString());
                    intent.putExtras(tobi);

                    Bundle emmanuel = new Bundle();
                    emmanuel.putString("generous", textView3rd.getText().toString());
                    intent.putExtras(emmanuel);

                    Bundle joseph = new Bundle();
                    joseph.putString("focused", textView4th.getText().toString());
                    intent.putExtras(joseph);

                    Bundle godwin = new Bundle();
                    godwin.putString("creativebeast", textView5th.getText().toString());
                    intent.putExtras(godwin);

                    Bundle funmilayo = new Bundle();
                    funmilayo.putString("bestmom", textView6th.getText().toString());
                    intent.putExtras(funmilayo);

                    Bundle james = new Bundle();
                    james.putString("bestdad", textView7th.getText().toString());
                    intent.putExtras(james);

                    Bundle tomilola = new Bundle();
                    tomilola.putString("biggersis", textView8th.getText().toString());
                    intent.putExtras(tomilola);

                    Bundle opeyemi = new Bundle();
                    opeyemi.putString("biggestsis", textView9th.getText().toString());
                    intent.putExtras(opeyemi);

                    Bundle david = new Bundle();
                    david.putString("dhalson", textView10th.getText().toString());
                    intent.putExtras(david);

                    Bundle obla = new Bundle();
                    obla.putString("chikito", textView11th.getText().toString());
                    intent.putExtras(obla);

                    Bundle love = new Bundle();
                    love.putString("blackdiamond", textView12th.getText().toString());
                    intent.putExtras(love);

                    Bundle ikechukwu = new Bundle();
                    ikechukwu.putString("smilingfull", textView13th.getText().toString());
                    intent.putExtras(ikechukwu);

                    Bundle kaskas = new Bundle();
                    kaskas.putString("versatile", textView14th.getText().toString());
                    intent.putExtras(kaskas);

                    Bundle havillah = new Bundle();
                    havillah.putString("crazitivity", textView15th.getText().toString());
                    intent.putExtras(havillah);

                    Bundle samuel = new Bundle();
                    samuel.putString("humility", textView16th.getText().toString());
                    intent.putExtras(samuel);

                    Bundle praise = new Bundle();
                    praise.putString("omuaranprince", textView17th.getText().toString());
                    intent.putExtras(praise);

                    Bundle albert = new Bundle();
                    albert.putString("zambian", textView18th.getText().toString());
                    intent.putExtras(albert);

                    Bundle akinfenwa = new Bundle();
                    akinfenwa.putString("silentassasin", textView19th.getText().toString());
                    intent.putExtras(akinfenwa);

                    Bundle aize = new Bundle();
                    aize.putString("speciallyunique", textView20th.getText().toString());
                    intent.putExtras(aize);

                    Bundle eruku = new Bundle();
                    eruku.putString("oribee", textView21st.getText().toString());
                    intent.putExtras(eruku);

                    Bundle demilade = new Bundle();
                    demilade.putString("blackoyinbo", textView22nd.getText().toString());
                    intent.putExtras(demilade);

                    Bundle dimeji = new Bundle();
                    dimeji.putString("westbrook", textView23rd.getText().toString());
                    intent.putExtras(dimeji);

                    Bundle westbrook = new Bundle();
                    westbrook.putString("mvp", textView24th.getText().toString());
                    intent.putExtras(westbrook);

                    Bundle curry = new Bundle();
                    curry.putString("babyfaceassasin", textView25th.getText().toString());
                    intent.putExtras(curry);

                    Bundle oyedepo = new Bundle();
                    oyedepo.putString("baba", textView26th.getText().toString());
                    intent.putExtras(oyedepo);

                    Bundle damola = new Bundle();
                    damola.putString("geelord", textView27th.getText().toString());
                    intent.putExtras(damola);

                    Bundle bukunmi = new Bundle();
                    bukunmi.putString("myguy", textView28th.getText().toString());
                    intent.putExtras(bukunmi);

                    Bundle solomon = new Bundle();
                    solomon.putString("okowon", textView29th.getText().toString());
                    intent.putExtras(solomon);

                    Bundle tolani = new Bundle();
                    tolani.putString("submissive", textView30th.getText().toString());
                    intent.putExtras(tolani);

                    Bundle ganyan = new Bundle();
                    ganyan.putString("sokind", textView31st.getText().toString());
                    intent.putExtras(ganyan);

                    Bundle keziah = new Bundle();
                    keziah.putString("smilesmile", textView32nd.getText().toString());
                    intent.putExtras(keziah);

                    Bundle maryam = new Bundle();
                    maryam.putString("myhand", textView33rd.getText().toString());
                    intent.putExtras(maryam);

                    Bundle mrenoch = new Bundle();
                    mrenoch.putString("mentor", textView34th.getText().toString());
                    intent.putExtras(mrenoch);

                    Bundle shittu = new Bundle();
                    shittu.putString("softwareboss", textView35th.getText().toString());
                    intent.putExtras(shittu);

                    Bundle pastorchris = new Bundle();
                    pastorchris.putString("letspray", textView36th.getText().toString());
                    intent.putExtras(pastorchris);

                    Bundle deborah = new Bundle();
                    deborah.putString("owobird", textView37th.getText().toString());
                    intent.putExtras(deborah);

                    Bundle engrope = new Bundle();
                    engrope.putString("acceptance", textView38th.getText().toString());
                    intent.putExtras(engrope);

                    Bundle drojo = new Bundle();
                    drojo.putString("myprof", textView39th.getText().toString());
                    intent.putExtras(drojo);

                    Bundle drgana = new Bundle();
                    drgana.putString("impactful", textView40th.getText().toString());
                    intent.putExtras(drgana);

                    Bundle calabar = new Bundle();
                    calabar.putString("letsplay", textView41st.getText().toString());
                    intent.putExtras(calabar);

                    Bundle pemisire = new Bundle();
                    pemisire.putString("myboy", textView42nd.getText().toString());
                    intent.putExtras(pemisire);

                    Bundle firebomi = new Bundle();
                    firebomi.putString("mygal", textView43rd.getText().toString());
                    intent.putExtras(firebomi);

                    Bundle lesbrown = new Bundle();
                    lesbrown.putString("speaker", textView44th.getText().toString());
                    intent.putExtras(lesbrown);

                    Bundle ericthomas = new Bundle();
                    ericthomas.putString("hiphop", textView45th.getText().toString());
                    intent.putExtras(ericthomas);




                    Bundle PrincessFiancee = new Bundle();
                    PrincessFiancee.putString("prince", WelcomeSweet.getText().toString().substring(8));
                    intent.putExtras(PrincessFiancee);



                    if (textView.getVisibility() == View.VISIBLE) {
                        stringRequestOne();
                    }
                    if (textView2nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwo();
                    }
                    if (textView3rd.getVisibility() == View.VISIBLE) {
                        stringRequestThree();
                    }
                    if (textView4th.getVisibility() == View.VISIBLE) {
                        stringRequestFour();
                    }
                    if (textView5th.getVisibility() == View.VISIBLE) {
                        stringRequestFive();
                    }
                    if (textView6th.getVisibility() == View.VISIBLE) {
                        stringRequestSix();
                    }
                    if (textView7th.getVisibility() == View.VISIBLE) {
                        stringRequestSeven();
                    }
                    if (textView8th.getVisibility() == View.VISIBLE) {
                        stringRequestEight();
                    }
                    if (textView9th.getVisibility() == View.VISIBLE) {
                        stringRequestNine();
                    }
                    if (textView10th.getVisibility() == View.VISIBLE) {
                        stringRequestTen();
                    }
                    if (textView11th.getVisibility() == View.VISIBLE) {
                        stringRequestEleven();
                    }
                    if (textView12th.getVisibility() == View.VISIBLE) {
                        stringRequestTwelve();
                    }
                    if (textView13th.getVisibility() == View.VISIBLE) {
                        stringRequestThirteen();
                    }
                    if (textView14th.getVisibility() == View.VISIBLE) {
                        stringRequestFourteen();
                    }
                    if (textView15th.getVisibility() == View.VISIBLE) {
                        stringRequestFifteen();
                    }
                    if (textView16th.getVisibility() == View.VISIBLE) {
                        stringRequestSixteen();
                    }
                    if (textView17th.getVisibility() == View.VISIBLE) {
                        stringRequestSeventeen();
                    }
                    if (textView18th.getVisibility() == View.VISIBLE) {
                        stringRequestEighteen();
                    }
                    if (textView19th.getVisibility() == View.VISIBLE) {
                        stringRequestNineteen();
                    }
                    if (textView20th.getVisibility() == View.VISIBLE) {
                        stringRequestTwenty();
                    }
                    if (textView21st.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyOne();
                    }
                    if (textView22nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyTwo();
                    }
                    if (textView23rd.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyThree();
                    }
                    if (textView24th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyFour();
                    }
                    if (textView25th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyFive();
                    }
                    if (textView26th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentySix();
                    }
                    if (textView27th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentySeven();
                    }
                    if (textView28th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyEight();
                    }
                    if (textView29th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyNine();
                    }
                    if (textView30th.getVisibility() == View.VISIBLE) {
                        stringRequestThirty();
                    }
                    if (textView31st.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyOne();
                    }
                    if (textView32nd.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyTwo();
                    }
                    if (textView33rd.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyThree();
                    }
                    if (textView34th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyFour();
                    }
                    if (textView35th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyFive();
                    }
                    if (textView36th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtySix();
                    }
                    if (textView37th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtySeven();
                    }
                    if (textView38th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyEight();
                    }
                    if (textView39th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyNine();
                    }
                    if (textView40th.getVisibility() == View.VISIBLE) {
                        stringRequestFourty();
                    }
                    if (textView41st.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyOne();
                    }
                    if (textView42nd.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyTwo();
                    }
                    if (textView43rd.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyThree();
                    }
                    if (textView44th.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyFour();
                    }
                    if (textView45th.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyFive();
                    }


//                    StringRequest stringRequest = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
//                            new Response.Listener<String>() {
//                                @Override
//                                public void onResponse(String response) {
//                                    try {
//                                        JSONArray jsonArray = new JSONArray(response);
//                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
//
//                                        String code = jsonObject.getString("tranc_success");
//
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//
//                                }
//                            }, new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//
//                        }
//                    }){
//                        @Override
//                        protected Map<String, String> getParams() throws AuthFailureError {
//
//                            String[] snacksNames = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf("NAIRA")+6) : null
//
//
//                            };
//
//                            String[] snacksPrices = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
//                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
//                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
//                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
//                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
//                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
//                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
//                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
//                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
//                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
//                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
//                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
//                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" ")) : null,
//                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" ")) : null,
//                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" ")) : null,
//                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf(""), textView25th.getText().toString().indexOf(" ")) : null,
//                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf(""), textView26th.getText().toString().indexOf(" ")) : null,
//                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf(""), textView27th.getText().toString().indexOf(" ")) : null,
//                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf(""), textView28th.getText().toString().indexOf(" ")) : null,
//                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf(""), textView29th.getText().toString().indexOf(" ")) : null,
//                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf(""), textView30th.getText().toString().indexOf(" ")) : null,
//                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf(""), textView31st.getText().toString().indexOf(" ")) : null,
//                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf(""), textView32nd.getText().toString().indexOf(" ")) : null,
//                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf(""), textView33rd.getText().toString().indexOf(" ")) : null,
//                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf(""), textView34th.getText().toString().indexOf(" ")) : null,
//                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf(""), textView35th.getText().toString().indexOf(" ")) : null,
//                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf(""), textView36th.getText().toString().indexOf(" ")) : null,
//                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf(""), textView37th.getText().toString().indexOf(" ")) : null,
//                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf(""), textView38th.getText().toString().indexOf(" ")) : null,
//                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf(""), textView39th.getText().toString().indexOf(" ")) : null,
//                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf(""), textView40th.getText().toString().indexOf(" ")) : null,
//                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf(""), textView41st.getText().toString().indexOf(" ")) : null,
//                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf(""), textView42nd.getText().toString().indexOf(" ")) : null,
//                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf(""), textView43rd.getText().toString().indexOf(" ")) : null
//
//
//
//                            };
//
//                            Map<String, String> params = new HashMap<String, String>();
//                            for (String Names : snacksNames) {
//                                if (!(Names == null))
//                                    params.put("drink_names", Arrays.toString(snacksNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            for (String Prices : snacksPrices) {
//                                if (!(Prices == null))
//                                    params.put("drink_prices", Arrays.toString(snacksPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            params.put("buyer_name", fullUsername.getText().toString());
//                            params.put("no_plates", NoOfPlates.getText().toString());
//                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
//                            params.put("vendor_id", app.Idtext.getText().toString());
//
//                            return params;
//                        }
//                    };
//                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequest);



                    StringRequest LandMarkUniversity = new StringRequest(Request.Method.POST, webmail_drinktranc_details,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray johnson = new JSONArray(response);
                                        JSONObject james = johnson.getJSONObject(0);

                                        String code = james.getString("");

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {

                            String[] webmail_DrinkNames = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView44th.isShown() ? textView44th.getText().toString().substring(textView44th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView45th.isShown() ? textView45th.getText().toString().substring(textView45th.getText().toString().indexOf("NAIRA")+6) : null

                            };

                            String[] webmail_DrinkPrices = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" ")) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" ")) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" ")) : null,
                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf(""), textView25th.getText().toString().indexOf(" ")) : null,
                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf(""), textView26th.getText().toString().indexOf(" ")) : null,
                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf(""), textView27th.getText().toString().indexOf(" ")) : null,
                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf(""), textView28th.getText().toString().indexOf(" ")) : null,
                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf(""), textView29th.getText().toString().indexOf(" ")) : null,
                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf(""), textView30th.getText().toString().indexOf(" ")) : null,
                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf(""), textView31st.getText().toString().indexOf(" ")) : null,
                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf(""), textView32nd.getText().toString().indexOf(" ")) : null,
                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf(""), textView33rd.getText().toString().indexOf(" ")) : null,
                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf(""), textView34th.getText().toString().indexOf(" ")) : null,
                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf(""), textView35th.getText().toString().indexOf(" ")) : null,
                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf(""), textView36th.getText().toString().indexOf(" ")) : null,
                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf(""), textView37th.getText().toString().indexOf(" ")) : null,
                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf(""), textView38th.getText().toString().indexOf(" ")) : null,
                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf(""), textView39th.getText().toString().indexOf(" ")) : null,
                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf(""), textView40th.getText().toString().indexOf(" ")) : null,
                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf(""), textView41st.getText().toString().indexOf(" ")) : null,
                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf(""), textView42nd.getText().toString().indexOf(" ")) : null,
                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf(""), textView43rd.getText().toString().indexOf(" ")) : null,
                                    textView44th.isShown() ? textView44th.getText().toString().substring(textView44th.getText().toString().indexOf(""), textView44th.getText().toString().indexOf(" ")) : null,
                                    textView45th.isShown() ? textView45th.getText().toString().substring(textView45th.getText().toString().indexOf(""), textView45th.getText().toString().indexOf(" ")) : null


                            };

                            Map<String, String> params = new HashMap<String, String>();
                            for (String Names : webmail_DrinkNames) {
                                if (!(Names == null))
                                    params.put("drink_names", Arrays.toString(webmail_DrinkNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            for (String Prices : webmail_DrinkPrices) {
                                if (!(Prices == null))
                                    params.put("drink_prices", Arrays.toString(webmail_DrinkPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            params.put("no_plates", NoOfPlates.getText().toString());
                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
                            params.put("vendor_name", app.Nametext.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            params.put("sex", Sex.getText().toString());
                            params.put("accountbalance", ChosenplateCounter.feetag.getText().toString());

                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(LandMarkUniversity);



                    startActivity(intent);
                }
                else {
                    StyleableToast TranCompleted = new StyleableToast(getApplicationContext(), "Transaction Verified", Toast.LENGTH_SHORT).spinIcon();
                    TranCompleted.setBackgroundColor(Color.parseColor("#01579B"));
                    TranCompleted.setTextColor(Color.WHITE);
                    TranCompleted.setIcon(R.drawable.da_confirmpurchasetoasticon);
                    TranCompleted.show();

                    Intent intent = new Intent(getBaseContext(), ServingActivity.class);
                    intent.putExtra("Roman", playtcount);

                    Bundle dweezy = new Bundle();
                    dweezy.putString("favouritism", textView.getText().toString());
                    intent.putExtras(dweezy);

                    Bundle tobi = new Bundle();
                    tobi.putString("genius", textView2nd.getText().toString());
                    intent.putExtras(tobi);

                    Bundle emmanuel = new Bundle();
                    emmanuel.putString("generous", textView3rd.getText().toString());
                    intent.putExtras(emmanuel);

                    Bundle joseph = new Bundle();
                    joseph.putString("focused", textView4th.getText().toString());
                    intent.putExtras(joseph);

                    Bundle godwin = new Bundle();
                    godwin.putString("creativebeast", textView5th.getText().toString());
                    intent.putExtras(godwin);

                    Bundle funmilayo = new Bundle();
                    funmilayo.putString("bestmom", textView6th.getText().toString());
                    intent.putExtras(funmilayo);

                    Bundle james = new Bundle();
                    james.putString("bestdad", textView7th.getText().toString());
                    intent.putExtras(james);

                    Bundle tomilola = new Bundle();
                    tomilola.putString("biggersis", textView8th.getText().toString());
                    intent.putExtras(tomilola);

                    Bundle opeyemi = new Bundle();
                    opeyemi.putString("biggestsis", textView9th.getText().toString());
                    intent.putExtras(opeyemi);

                    Bundle david = new Bundle();
                    david.putString("dhalson", textView10th.getText().toString());
                    intent.putExtras(david);

                    Bundle obla = new Bundle();
                    obla.putString("chikito", textView11th.getText().toString());
                    intent.putExtras(obla);

                    Bundle love = new Bundle();
                    love.putString("blackdiamond", textView12th.getText().toString());
                    intent.putExtras(love);

                    Bundle ikechukwu = new Bundle();
                    ikechukwu.putString("smilingfull", textView13th.getText().toString());
                    intent.putExtras(ikechukwu);

                    Bundle kaskas = new Bundle();
                    kaskas.putString("versatile", textView14th.getText().toString());
                    intent.putExtras(kaskas);

                    Bundle havillah = new Bundle();
                    havillah.putString("crazitivity", textView15th.getText().toString());
                    intent.putExtras(havillah);

                    Bundle samuel = new Bundle();
                    samuel.putString("humility", textView16th.getText().toString());
                    intent.putExtras(samuel);

                    Bundle praise = new Bundle();
                    praise.putString("omuaranprince", textView17th.getText().toString());
                    intent.putExtras(praise);

                    Bundle albert = new Bundle();
                    albert.putString("zambian", textView18th.getText().toString());
                    intent.putExtras(albert);

                    Bundle akinfenwa = new Bundle();
                    akinfenwa.putString("silentassasin", textView19th.getText().toString());
                    intent.putExtras(akinfenwa);

                    Bundle aize = new Bundle();
                    aize.putString("speciallyunique", textView20th.getText().toString());
                    intent.putExtras(aize);

                    Bundle eruku = new Bundle();
                    eruku.putString("oribee", textView21st.getText().toString());
                    intent.putExtras(eruku);

                    Bundle demilade = new Bundle();
                    demilade.putString("blackoyinbo", textView22nd.getText().toString());
                    intent.putExtras(demilade);

                    Bundle dimeji = new Bundle();
                    dimeji.putString("westbrook", textView23rd.getText().toString());
                    intent.putExtras(dimeji);

                    Bundle westbrook = new Bundle();
                    westbrook.putString("mvp", textView24th.getText().toString());
                    intent.putExtras(westbrook);

                    Bundle curry = new Bundle();
                    curry.putString("babyfaceassasin", textView25th.getText().toString());
                    intent.putExtras(curry);

                    Bundle oyedepo = new Bundle();
                    oyedepo.putString("baba", textView26th.getText().toString());
                    intent.putExtras(oyedepo);

                    Bundle damola = new Bundle();
                    damola.putString("geelord", textView27th.getText().toString());
                    intent.putExtras(damola);

                    Bundle bukunmi = new Bundle();
                    bukunmi.putString("myguy", textView28th.getText().toString());
                    intent.putExtras(bukunmi);

                    Bundle solomon = new Bundle();
                    solomon.putString("okowon", textView29th.getText().toString());
                    intent.putExtras(solomon);

                    Bundle tolani = new Bundle();
                    tolani.putString("submissive", textView30th.getText().toString());
                    intent.putExtras(tolani);

                    Bundle ganyan = new Bundle();
                    ganyan.putString("sokind", textView31st.getText().toString());
                    intent.putExtras(ganyan);

                    Bundle keziah = new Bundle();
                    keziah.putString("smilesmile", textView32nd.getText().toString());
                    intent.putExtras(keziah);

                    Bundle maryam = new Bundle();
                    maryam.putString("myhand", textView33rd.getText().toString());
                    intent.putExtras(maryam);

                    Bundle mrenoch = new Bundle();
                    mrenoch.putString("mentor", textView34th.getText().toString());
                    intent.putExtras(mrenoch);

                    Bundle shittu = new Bundle();
                    shittu.putString("softwareboss", textView35th.getText().toString());
                    intent.putExtras(shittu);

                    Bundle pastorchris = new Bundle();
                    pastorchris.putString("letspray", textView36th.getText().toString());
                    intent.putExtras(pastorchris);

                    Bundle deborah = new Bundle();
                    deborah.putString("owobird", textView37th.getText().toString());
                    intent.putExtras(deborah);

                    Bundle engrope = new Bundle();
                    engrope.putString("acceptance", textView38th.getText().toString());
                    intent.putExtras(engrope);

                    Bundle drojo = new Bundle();
                    drojo.putString("myprof", textView39th.getText().toString());
                    intent.putExtras(drojo);

                    Bundle drgana = new Bundle();
                    drgana.putString("impactful", textView40th.getText().toString());
                    intent.putExtras(drgana);

                    Bundle calabar = new Bundle();
                    calabar.putString("letsplay", textView41st.getText().toString());
                    intent.putExtras(calabar);

                    Bundle pemisire = new Bundle();
                    pemisire.putString("myboy", textView42nd.getText().toString());
                    intent.putExtras(pemisire);

                    Bundle firebomi = new Bundle();
                    firebomi.putString("mygal", textView43rd.getText().toString());
                    intent.putExtras(firebomi);

                    Bundle lesbrown = new Bundle();
                    lesbrown.putString("speaker", textView44th.getText().toString());
                    intent.putExtras(lesbrown);

                    Bundle ericthomas = new Bundle();
                    ericthomas.putString("hiphop", textView45th.getText().toString());
                    intent.putExtras(ericthomas);




                    Bundle PrincessFiancee = new Bundle();
                    PrincessFiancee.putString("prince", WelcomeSweet.getText().toString().substring(8));
                    intent.putExtras(PrincessFiancee);



                    if (textView.getVisibility() == View.VISIBLE) {
                        stringRequestOne();
                    }
                    if (textView2nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwo();
                    }
                    if (textView3rd.getVisibility() == View.VISIBLE) {
                        stringRequestThree();
                    }
                    if (textView4th.getVisibility() == View.VISIBLE) {
                        stringRequestFour();
                    }
                    if (textView5th.getVisibility() == View.VISIBLE) {
                        stringRequestFive();
                    }
                    if (textView6th.getVisibility() == View.VISIBLE) {
                        stringRequestSix();
                    }
                    if (textView7th.getVisibility() == View.VISIBLE) {
                        stringRequestSeven();
                    }
                    if (textView8th.getVisibility() == View.VISIBLE) {
                        stringRequestEight();
                    }
                    if (textView9th.getVisibility() == View.VISIBLE) {
                        stringRequestNine();
                    }
                    if (textView10th.getVisibility() == View.VISIBLE) {
                        stringRequestTen();
                    }
                    if (textView11th.getVisibility() == View.VISIBLE) {
                        stringRequestEleven();
                    }
                    if (textView12th.getVisibility() == View.VISIBLE) {
                        stringRequestTwelve();
                    }
                    if (textView13th.getVisibility() == View.VISIBLE) {
                        stringRequestThirteen();
                    }
                    if (textView14th.getVisibility() == View.VISIBLE) {
                        stringRequestFourteen();
                    }
                    if (textView15th.getVisibility() == View.VISIBLE) {
                        stringRequestFifteen();
                    }
                    if (textView16th.getVisibility() == View.VISIBLE) {
                        stringRequestSixteen();
                    }
                    if (textView17th.getVisibility() == View.VISIBLE) {
                        stringRequestSeventeen();
                    }
                    if (textView18th.getVisibility() == View.VISIBLE) {
                        stringRequestEighteen();
                    }
                    if (textView19th.getVisibility() == View.VISIBLE) {
                        stringRequestNineteen();
                    }
                    if (textView20th.getVisibility() == View.VISIBLE) {
                        stringRequestTwenty();
                    }
                    if (textView21st.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyOne();
                    }
                    if (textView22nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyTwo();
                    }
                    if (textView23rd.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyThree();
                    }
                    if (textView24th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyFour();
                    }
                    if (textView25th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyFive();
                    }
                    if (textView26th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentySix();
                    }
                    if (textView27th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentySeven();
                    }
                    if (textView28th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyEight();
                    }
                    if (textView29th.getVisibility() == View.VISIBLE) {
                        stringRequestTwentyNine();
                    }
                    if (textView30th.getVisibility() == View.VISIBLE) {
                        stringRequestThirty();
                    }
                    if (textView31st.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyOne();
                    }
                    if (textView32nd.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyTwo();
                    }
                    if (textView33rd.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyThree();
                    }
                    if (textView34th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyFour();
                    }
                    if (textView35th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyFive();
                    }
                    if (textView36th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtySix();
                    }
                    if (textView37th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtySeven();
                    }
                    if (textView38th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyEight();
                    }
                    if (textView39th.getVisibility() == View.VISIBLE) {
                        stringRequestThirtyNine();
                    }
                    if (textView40th.getVisibility() == View.VISIBLE) {
                        stringRequestFourty();
                    }
                    if (textView41st.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyOne();
                    }
                    if (textView42nd.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyTwo();
                    }
                    if (textView43rd.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyThree();
                    }
                    if (textView44th.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyFour();
                    }
                    if (textView45th.getVisibility() == View.VISIBLE) {
                        stringRequestFourtyFive();
                    }


//                    StringRequest stringRequest = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
//                            new Response.Listener<String>() {
//                                @Override
//                                public void onResponse(String response) {
//                                    try {
//                                        JSONArray jsonArray = new JSONArray(response);
//                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
//
//                                        String code = jsonObject.getString("tranc_success");
//
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//
//                                }
//                            }, new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//
//                        }
//                    }){
//                        @Override
//                        protected Map<String, String> getParams() throws AuthFailureError {
//
//                            String[] snacksNames = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf("NAIRA")+6) : null
//
//
//                            };
//
//                            String[] snacksPrices = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
//                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
//                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
//                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
//                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
//                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
//                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
//                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
//                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
//                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
//                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
//                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
//                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" ")) : null,
//                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" ")) : null,
//                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" ")) : null,
//                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf(""), textView25th.getText().toString().indexOf(" ")) : null,
//                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf(""), textView26th.getText().toString().indexOf(" ")) : null,
//                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf(""), textView27th.getText().toString().indexOf(" ")) : null,
//                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf(""), textView28th.getText().toString().indexOf(" ")) : null,
//                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf(""), textView29th.getText().toString().indexOf(" ")) : null,
//                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf(""), textView30th.getText().toString().indexOf(" ")) : null,
//                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf(""), textView31st.getText().toString().indexOf(" ")) : null,
//                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf(""), textView32nd.getText().toString().indexOf(" ")) : null,
//                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf(""), textView33rd.getText().toString().indexOf(" ")) : null,
//                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf(""), textView34th.getText().toString().indexOf(" ")) : null,
//                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf(""), textView35th.getText().toString().indexOf(" ")) : null,
//                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf(""), textView36th.getText().toString().indexOf(" ")) : null,
//                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf(""), textView37th.getText().toString().indexOf(" ")) : null,
//                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf(""), textView38th.getText().toString().indexOf(" ")) : null,
//                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf(""), textView39th.getText().toString().indexOf(" ")) : null,
//                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf(""), textView40th.getText().toString().indexOf(" ")) : null,
//                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf(""), textView41st.getText().toString().indexOf(" ")) : null,
//                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf(""), textView42nd.getText().toString().indexOf(" ")) : null,
//                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf(""), textView43rd.getText().toString().indexOf(" ")) : null
//
//
//
//                            };
//
//                            Map<String, String> params = new HashMap<String, String>();
//                            for (String Names : snacksNames) {
//                                if (!(Names == null))
//                                    params.put("drink_names", Arrays.toString(snacksNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            for (String Prices : snacksPrices) {
//                                if (!(Prices == null))
//                                    params.put("drink_prices", Arrays.toString(snacksPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            params.put("buyer_name", fullUsername.getText().toString());
//                            params.put("no_plates", NoOfPlates.getText().toString());
//                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
//                            params.put("vendor_id", app.Idtext.getText().toString());
//
//                            return params;
//                        }
//                    };
//                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequest);



                    StringRequest LandMarkUniversity = new StringRequest(Request.Method.POST, webmail_drinktranc_details,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray johnson = new JSONArray(response);
                                        JSONObject james = johnson.getJSONObject(0);

                                        String code = james.getString("");

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {

                            String[] webmail_DrinkNames = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView44th.isShown() ? textView44th.getText().toString().substring(textView44th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView45th.isShown() ? textView45th.getText().toString().substring(textView45th.getText().toString().indexOf("NAIRA")+6) : null

                            };

                            String[] webmail_DrinkPrices = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null,
                                    textView11th.isShown() ? textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" ")) : null,
                                    textView12th.isShown() ? textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" ")) : null,
                                    textView13th.isShown() ? textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" ")) : null,
                                    textView14th.isShown() ? textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" ")) : null,
                                    textView15th.isShown() ? textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" ")) : null,
                                    textView16th.isShown() ? textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" ")) : null,
                                    textView17th.isShown() ? textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" ")) : null,
                                    textView18th.isShown() ? textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" ")) : null,
                                    textView19th.isShown() ? textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" ")) : null,
                                    textView20th.isShown() ? textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" ")) : null,
                                    textView21st.isShown() ? textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" ")) : null,
                                    textView22nd.isShown() ? textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" ")) : null,
                                    textView23rd.isShown() ? textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" ")) : null,
                                    textView24th.isShown() ? textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" ")) : null,
                                    textView25th.isShown() ? textView25th.getText().toString().substring(textView25th.getText().toString().indexOf(""), textView25th.getText().toString().indexOf(" ")) : null,
                                    textView26th.isShown() ? textView26th.getText().toString().substring(textView26th.getText().toString().indexOf(""), textView26th.getText().toString().indexOf(" ")) : null,
                                    textView27th.isShown() ? textView27th.getText().toString().substring(textView27th.getText().toString().indexOf(""), textView27th.getText().toString().indexOf(" ")) : null,
                                    textView28th.isShown() ? textView28th.getText().toString().substring(textView28th.getText().toString().indexOf(""), textView28th.getText().toString().indexOf(" ")) : null,
                                    textView29th.isShown() ? textView29th.getText().toString().substring(textView29th.getText().toString().indexOf(""), textView29th.getText().toString().indexOf(" ")) : null,
                                    textView30th.isShown() ? textView30th.getText().toString().substring(textView30th.getText().toString().indexOf(""), textView30th.getText().toString().indexOf(" ")) : null,
                                    textView31st.isShown() ? textView31st.getText().toString().substring(textView31st.getText().toString().indexOf(""), textView31st.getText().toString().indexOf(" ")) : null,
                                    textView32nd.isShown() ? textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf(""), textView32nd.getText().toString().indexOf(" ")) : null,
                                    textView33rd.isShown() ? textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf(""), textView33rd.getText().toString().indexOf(" ")) : null,
                                    textView34th.isShown() ? textView34th.getText().toString().substring(textView34th.getText().toString().indexOf(""), textView34th.getText().toString().indexOf(" ")) : null,
                                    textView35th.isShown() ? textView35th.getText().toString().substring(textView35th.getText().toString().indexOf(""), textView35th.getText().toString().indexOf(" ")) : null,
                                    textView36th.isShown() ? textView36th.getText().toString().substring(textView36th.getText().toString().indexOf(""), textView36th.getText().toString().indexOf(" ")) : null,
                                    textView37th.isShown() ? textView37th.getText().toString().substring(textView37th.getText().toString().indexOf(""), textView37th.getText().toString().indexOf(" ")) : null,
                                    textView38th.isShown() ? textView38th.getText().toString().substring(textView38th.getText().toString().indexOf(""), textView38th.getText().toString().indexOf(" ")) : null,
                                    textView39th.isShown() ? textView39th.getText().toString().substring(textView39th.getText().toString().indexOf(""), textView39th.getText().toString().indexOf(" ")) : null,
                                    textView40th.isShown() ? textView40th.getText().toString().substring(textView40th.getText().toString().indexOf(""), textView40th.getText().toString().indexOf(" ")) : null,
                                    textView41st.isShown() ? textView41st.getText().toString().substring(textView41st.getText().toString().indexOf(""), textView41st.getText().toString().indexOf(" ")) : null,
                                    textView42nd.isShown() ? textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf(""), textView42nd.getText().toString().indexOf(" ")) : null,
                                    textView43rd.isShown() ? textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf(""), textView43rd.getText().toString().indexOf(" ")) : null,
                                    textView44th.isShown() ? textView44th.getText().toString().substring(textView44th.getText().toString().indexOf(""), textView44th.getText().toString().indexOf(" ")) : null,
                                    textView45th.isShown() ? textView45th.getText().toString().substring(textView45th.getText().toString().indexOf(""), textView45th.getText().toString().indexOf(" ")) : null


                            };

                            Map<String, String> params = new HashMap<String, String>();
                            for (String Names : webmail_DrinkNames) {
                                if (!(Names == null))
                                    params.put("drink_names", Arrays.toString(webmail_DrinkNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            for (String Prices : webmail_DrinkPrices) {
                                if (!(Prices == null))
                                    params.put("drink_prices", Arrays.toString(webmail_DrinkPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            params.put("no_plates", NoOfPlates.getText().toString());
                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
                            params.put("vendor_name", app.Nametext.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            params.put("sex", Sex.getText().toString());
                            params.put("accountbalance", ChosenplateCounter.feetag.getText().toString());

                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(LandMarkUniversity);



                    startActivity(intent);
                }
            }
        });
        AlertDialog alertDialog = Dweezy.create();
        alertDialog.show();
    }



    public void stringRequestOne() {


            StringRequest stringRequestOne = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView.getText().toString().equals("150 NAIRA C. MIRINDA")) {

                        paramsOne.put("drink_names", "C.MIRINDA");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkAOneBeta = textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA") + 6);
                        DrinkAOne = DrinkAOneBeta.substring(DrinkAOneBeta.indexOf(""), DrinkAOneBeta.indexOf("("));
                        DrinkATwo = textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" "));

                        NoOfDrinkA = DrinkAOneBeta.substring(DrinkAOneBeta.indexOf("(") + 1, DrinkAOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkAOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkATwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkA);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestOne);
    //    }

    }

    public void stringRequestTwo() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView2nd.getText().toString().equals("80 NAIRA G. MIRINDA")) {

                        paramsOne.put("drink_names", "G.MIRINDA");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkBOneBeta = textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA") + 6);
                        DrinkBOne = DrinkBOneBeta.substring(DrinkBOneBeta.indexOf(""), DrinkBOneBeta.indexOf("("));
                        DrinkBTwo = textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" "));

                        NoOfDrinkB = DrinkBOneBeta.substring(DrinkBOneBeta.indexOf("(") + 1, DrinkBOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkBOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkBTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkB);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTwo);
    //    }

    }

    public void stringRequestThree() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView3rd.getText().toString().equals("100 NAIRA PET MIRINDA")) {

                        paramsOne.put("drink_names", "PETMIRINDA");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkCOneBeta  = textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6);
                        DrinkCOne = DrinkCOneBeta.substring(DrinkCOneBeta.indexOf(""), DrinkCOneBeta.indexOf("("));
                        DrinkCTwo = textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" "));

                        NoOfDrinkC = DrinkCOneBeta.substring(DrinkCOneBeta.indexOf("(")+1,DrinkCOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkCOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkCTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkC);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestThree);
    }

    public void stringRequestFour() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView4th.getText().toString().equals("150 NAIRA CAN PEPSI")) {

                        paramsOne.put("drink_names", "CANPEPSI");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {
                        DrinkDOneBeta  = textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6);
                        DrinkDOne = DrinkDOneBeta.substring(DrinkDOneBeta.indexOf(""), DrinkDOneBeta.indexOf("("));
                        DrinkDTwo = textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" "));

                        NoOfDrinkD = DrinkDOneBeta.substring(DrinkDOneBeta.indexOf("(")+1,DrinkDOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkDOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkDTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkD);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestFive() {


            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView5th.getText().toString().equals("80 NAIRA GLASS PEPSI")) {

                        paramsOne.put("drink_names", "GLASSPEPSI");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkEOneBeta  = textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6);
                        DrinkEOne = DrinkEOneBeta.substring(DrinkEOneBeta.indexOf(""), DrinkEOneBeta.indexOf("("));
                        DrinkETwo = textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" "));

                        NoOfDrinkE = DrinkEOneBeta.substring(DrinkEOneBeta.indexOf("(")+1,DrinkEOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkEOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkETwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkE);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFive);

    }

    public void stringRequestSix() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView6th.getText().toString().equals("100 NAIRA PET PEPSI")) {

                        paramsOne.put("drink_names", "PETPEPSI");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkFOneBeta  = textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6);
                        DrinkFOne = DrinkFOneBeta.substring(DrinkFOneBeta.indexOf(""), DrinkFOneBeta.indexOf("("));
                        DrinkFTwo = textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" "));

                        NoOfDrinkF = DrinkFOneBeta.substring(DrinkFOneBeta.indexOf("(")+1,DrinkFOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkFOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkFTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkF);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestSeven() {


            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView7th.getText().toString().equals("150 NAIRA C. SAVANNA")) {

                        paramsOne.put("drink_names", "C.SAVANNA");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkGOneBeta  = textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6);
                        DrinkGOne = DrinkGOneBeta.substring(DrinkGOneBeta.indexOf(""), DrinkGOneBeta.indexOf("("));
                        DrinkGTwo = textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" "));

                        NoOfDrinkG = DrinkGOneBeta.substring(DrinkGOneBeta.indexOf("(")+1,DrinkGOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkGOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkGTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkG);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestEight() {


            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView8th.getText().toString().equals("100 NAIRA P. SAVANNA")) {

                        paramsOne.put("drink_names", "P.SAVANNA");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkHOneBeta  = textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6);
                        DrinkHOne = DrinkHOneBeta.substring(DrinkHOneBeta.indexOf(""), DrinkHOneBeta.indexOf("("));
                        DrinkHTwo = textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" "));

                        NoOfDrinkH = DrinkHOneBeta.substring(DrinkHOneBeta.indexOf("(")+1,DrinkHOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkHOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkHTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkH);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestEight);

    }

    public void stringRequestNine() {

            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView9th.getText().toString().equals("150 NAIRA C. SEVENUP")) {

                        paramsOne.put("drink_names", "C.SEVENUP");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkIOneBeta  = textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6);
                        DrinkIOne = DrinkIOneBeta.substring(DrinkIOneBeta.indexOf(""), DrinkIOneBeta.indexOf("("));
                        DrinkITwo = textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" "));

                        NoOfDrinkI = DrinkIOneBeta.substring(DrinkIOneBeta.indexOf("(")+1,DrinkIOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkIOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkITwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkI);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestNine);

    }

    public void stringRequestTen() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView10th.getText().toString().equals("80 NAIRA G. SEVENUP")) {

                        paramsOne.put("drink_names", "G.SEVENUP");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkJOneBeta  = textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6);
                        DrinkJOne = DrinkJOneBeta.substring(DrinkJOneBeta.indexOf(""), DrinkJOneBeta.indexOf("("));
                        DrinkJTwo = textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" "));

                        NoOfDrinkJ = DrinkJOneBeta.substring(DrinkJOneBeta.indexOf("(")+1,DrinkJOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkJOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkJTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkJ);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestEleven() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView11th.getText().toString().equals("100 NAIRA P. SEVENUP")) {

                        paramsOne.put("drink_names", "P.SEVENUP");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkKOneBeta  = textView11th.getText().toString().substring(textView11th.getText().toString().indexOf("NAIRA")+6);
                        DrinkKOne = DrinkKOneBeta.substring(DrinkKOneBeta.indexOf(""), DrinkKOneBeta.indexOf("("));
                        DrinkKTwo = textView11th.getText().toString().substring(textView11th.getText().toString().indexOf(""), textView11th.getText().toString().indexOf(" "));

                        NoOfDrinkK = DrinkKOneBeta.substring(DrinkKOneBeta.indexOf("(")+1,DrinkKOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkKOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkKTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkK);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTwo);

    }

    public void stringRequestTwelve() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView12th.getText().toString().equals("80 NAIRA SMALL G. SPRITE")) {

                        paramsOne.put("drink_names", "SMALLG.SPRITE");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkLOneBeta  = textView12th.getText().toString().substring(textView12th.getText().toString().indexOf("NAIRA")+6);
                        DrinkLOne = DrinkLOneBeta.substring(DrinkLOneBeta.indexOf(""), DrinkLOneBeta.indexOf("("));
                        DrinkLTwo = textView12th.getText().toString().substring(textView12th.getText().toString().indexOf(""), textView12th.getText().toString().indexOf(" "));

                        NoOfDrinkL = DrinkLOneBeta.substring(DrinkLOneBeta.indexOf("(")+1,DrinkLOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkLOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkLTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkL);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestThirteen() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView13th.getText().toString().equals("100 NAIRA BIG G. SPRITE")) {

                        paramsOne.put("drink_names", "BIGG.SPRITE");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkMOneBeta  = textView13th.getText().toString().substring(textView13th.getText().toString().indexOf("NAIRA")+6);
                        DrinkMOne = DrinkMOneBeta.substring(DrinkMOneBeta.indexOf(""), DrinkMOneBeta.indexOf("("));
                        DrinkMTwo = textView13th.getText().toString().substring(textView13th.getText().toString().indexOf(""), textView13th.getText().toString().indexOf(" "));

                        NoOfDrinkM = DrinkMOneBeta.substring(DrinkMOneBeta.indexOf("(")+1,DrinkMOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkMOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkMTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkM);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestFourteen() {


            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView14th.getText().toString().equals("100 NAIRA PET SPRITE")) {

                        paramsOne.put("drink_names", "PETSPRITE");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkNOneBeta  = textView14th.getText().toString().substring(textView14th.getText().toString().indexOf("NAIRA")+6);
                        DrinkNOne = DrinkNOneBeta.substring(DrinkNOneBeta.indexOf(""), DrinkNOneBeta.indexOf("("));
                        DrinkNTwo = textView14th.getText().toString().substring(textView14th.getText().toString().indexOf(""), textView14th.getText().toString().indexOf(" "));

                        NoOfDrinkN = DrinkNOneBeta.substring(DrinkNOneBeta.indexOf("(")+1,DrinkNOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkNOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkNTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkN);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFive);

    }

    public void stringRequestFifteen() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView15th.getText().toString().equals("100 NAIRA PET TEEM")) {

                        paramsOne.put("drink_names", "PETTEEM");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkOOneBeta  = textView15th.getText().toString().substring(textView15th.getText().toString().indexOf("NAIRA")+6);
                        DrinkOOne = DrinkOOneBeta.substring(DrinkOOneBeta.indexOf(""), DrinkOOneBeta.indexOf("("));
                        DrinkOTwo = textView15th.getText().toString().substring(textView15th.getText().toString().indexOf(""), textView15th.getText().toString().indexOf(" "));

                        NoOfDrinkO = DrinkOOneBeta.substring(DrinkOOneBeta.indexOf("(")+1,DrinkOOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkOOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkOTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkO);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestSixteen() {


            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView16th.getText().toString().equals("100 NAIRA PET LACASERA")) {

                        paramsOne.put("drink_names", "PETLACASERA");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkPOneBeta  = textView16th.getText().toString().substring(textView16th.getText().toString().indexOf("NAIRA")+6);
                        DrinkPOne = DrinkPOneBeta.substring(DrinkPOneBeta.indexOf(""), DrinkPOneBeta.indexOf("("));
                        DrinkPTwo = textView16th.getText().toString().substring(textView16th.getText().toString().indexOf(""), textView16th.getText().toString().indexOf(" "));

                        NoOfDrinkP = DrinkPOneBeta.substring(DrinkPOneBeta.indexOf("(")+1,DrinkPOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkPOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkPTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkP);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestSeventeen() {


            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView17th.getText().toString().equals("150 NAIRA PET SMOOV")) {

                        paramsOne.put("drink_names", "PETSMOOV");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkQOneBeta  = textView17th.getText().toString().substring(textView17th.getText().toString().indexOf("NAIRA")+6);
                        DrinkQOne = DrinkQOneBeta.substring(DrinkQOneBeta.indexOf(""), DrinkQOneBeta.indexOf("("));
                        DrinkQTwo = textView17th.getText().toString().substring(textView17th.getText().toString().indexOf(""), textView17th.getText().toString().indexOf(" "));

                        NoOfDrinkQ = DrinkQOneBeta.substring(DrinkQOneBeta.indexOf("(")+1,DrinkQOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkQOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkQTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkQ);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestEight);


    }

    public void stringRequestEighteen() {


            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView18th.getText().toString().equals("80 NAIRA SMALL G. COKE")) {

                        paramsOne.put("drink_names", "SMALLG.COKE");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkROneBeta  = textView18th.getText().toString().substring(textView18th.getText().toString().indexOf("NAIRA")+6);
                        DrinkROne = DrinkROneBeta.substring(DrinkROneBeta.indexOf(""), DrinkROneBeta.indexOf("("));
                        DrinkRTwo = textView18th.getText().toString().substring(textView18th.getText().toString().indexOf(""), textView18th.getText().toString().indexOf(" "));

                        NoOfDrinkR = DrinkROneBeta.substring(DrinkROneBeta.indexOf("(")+1,DrinkROneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkROne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkRTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkR);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestNine);

    }

    public void stringRequestNineteen() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView19th.getText().toString().equals("100 NAIRA BIG G. COKE")) {

                        paramsOne.put("drink_names", "BIGG.COKE");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkSOneBeta  = textView19th.getText().toString().substring(textView19th.getText().toString().indexOf("NAIRA")+6);
                        DrinkSOne = DrinkSOneBeta.substring(DrinkSOneBeta.indexOf(""), DrinkSOneBeta.indexOf("("));
                        DrinkSTwo = textView19th.getText().toString().substring(textView19th.getText().toString().indexOf(""), textView19th.getText().toString().indexOf(" "));

                        NoOfDrinkS = DrinkSOneBeta.substring(DrinkSOneBeta.indexOf("(")+1,DrinkSOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkSOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkSTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkS);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestTwenty() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView20th.getText().toString().equals("100 NAIRA SMALL PET COKE")) {

                        paramsOne.put("drink_names", "SMALLPETCOKE");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkTOneBeta  = textView20th.getText().toString().substring(textView20th.getText().toString().indexOf("NAIRA")+6);
                        DrinkTOne = DrinkTOneBeta.substring(DrinkTOneBeta.indexOf(""), DrinkTOneBeta.indexOf("("));
                        DrinkTTwo = textView20th.getText().toString().substring(textView20th.getText().toString().indexOf(""), textView20th.getText().toString().indexOf(" "));

                        NoOfDrinkT = DrinkTOneBeta.substring(DrinkTOneBeta.indexOf("(")+1,DrinkTOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkTOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkTTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkT);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTwo);

    }

    public void stringRequestTwentyOne() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView21st.getText().toString().equals("150 NAIRA BIG PET COKE")) {

                        paramsOne.put("drink_names", "BIGPETCOKE");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkUOneBeta  = textView21st.getText().toString().substring(textView21st.getText().toString().indexOf("NAIRA")+6);
                        DrinkUOne = DrinkUOneBeta.substring(DrinkUOneBeta.indexOf(""), DrinkUOneBeta.indexOf("("));
                        DrinkUTwo = textView21st.getText().toString().substring(textView21st.getText().toString().indexOf(""), textView21st.getText().toString().indexOf(" "));

                        NoOfDrinkU = DrinkUOneBeta.substring(DrinkUOneBeta.indexOf("(")+1,DrinkUOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkUOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkUTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkU);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestTwentyTwo() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView22nd.getText().toString().equals("80 NAIRA SMALL G. FANTA")) {

                        paramsOne.put("drink_names", "SMALLG.FANTA");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkVOneBeta  = textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf("NAIRA")+6);
                        DrinkVOne = DrinkVOneBeta.substring(DrinkVOneBeta.indexOf(""), DrinkVOneBeta.indexOf("("));
                        DrinkVTwo = textView22nd.getText().toString().substring(textView22nd.getText().toString().indexOf(""), textView22nd.getText().toString().indexOf(" "));

                        NoOfDrinkV = DrinkVOneBeta.substring(DrinkVOneBeta.indexOf("(")+1,DrinkVOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkVOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkVTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkV);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestTwentyThree() {


            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView23rd.getText().toString().equals("100 NAIRA BIG G. FANTA")) {

                        paramsOne.put("drink_names", "BIGG.FANTA");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkWOneBeta  = textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf("NAIRA")+6);
                        DrinkWOne = DrinkWOneBeta.substring(DrinkWOneBeta.indexOf(""), DrinkWOneBeta.indexOf("("));
                        DrinkWTwo = textView23rd.getText().toString().substring(textView23rd.getText().toString().indexOf(""), textView23rd.getText().toString().indexOf(" "));

                        NoOfDrinkW = DrinkWOneBeta.substring(DrinkWOneBeta.indexOf("(")+1,DrinkWOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkWOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkWTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkW);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFive);

    }

    public void stringRequestTwentyFour() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView24th.getText().toString().equals("100 NAIRA SMALL P. FANTA")) {

                        paramsOne.put("drink_names", "SMALLP.FANTA");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkXOneBeta  = textView24th.getText().toString().substring(textView24th.getText().toString().indexOf("NAIRA")+6);
                        DrinkXOne = DrinkXOneBeta.substring(DrinkXOneBeta.indexOf(""), DrinkXOneBeta.indexOf("("));
                        DrinkXTwo = textView24th.getText().toString().substring(textView24th.getText().toString().indexOf(""), textView24th.getText().toString().indexOf(" "));

                        NoOfDrinkX = DrinkXOneBeta.substring(DrinkXOneBeta.indexOf("(")+1,DrinkXOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkXOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkXTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkX);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestTwentyFive() {


            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView25th.getText().toString().equals("150 NAIRA BIG P. FANTA")) {

                        paramsOne.put("drink_names", "BIGP.FANTA");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkYOneBeta  = textView25th.getText().toString().substring(textView25th.getText().toString().indexOf("NAIRA")+6);
                        DrinkYOne = DrinkYOneBeta.substring(DrinkYOneBeta.indexOf(""), DrinkYOneBeta.indexOf("("));
                        DrinkYTwo = textView25th.getText().toString().substring(textView25th.getText().toString().indexOf(""), textView25th.getText().toString().indexOf(" "));

                        NoOfDrinkY = DrinkYOneBeta.substring(DrinkYOneBeta.indexOf("(")+1,DrinkYOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkYOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkYTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkY);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestTwentySix() {


            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView26th.getText().toString().equals("10 NAIRA PURE WATER")) {

                        paramsOne.put("drink_names", "PUREWATER");
                        paramsOne.put("drink_prices", "10");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZOneBeta  = textView26th.getText().toString().substring(textView26th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZOne = DrinkZOneBeta.substring(DrinkZOneBeta.indexOf(""), DrinkZOneBeta.indexOf("("));
                        DrinkZTwo = textView26th.getText().toString().substring(textView26th.getText().toString().indexOf(""), textView26th.getText().toString().indexOf(" "));

                        NoOfDrinkZ = DrinkZOneBeta.substring(DrinkZOneBeta.indexOf("(")+1,DrinkZOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkZOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZ);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestEight);

    }

    public void stringRequestTwentySeven() {


            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView27th.getText().toString().equals("60 NAIRA BOTTLE WATER")) {

                        paramsOne.put("drink_names", "BOTTLEWATER");
                        paramsOne.put("drink_prices", "60");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZAOneBeta  = textView27th.getText().toString().substring(textView27th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZAOne = DrinkZAOneBeta.substring(DrinkZAOneBeta.indexOf(""), DrinkZAOneBeta.indexOf("("));
                        DrinkZATwo = textView27th.getText().toString().substring(textView27th.getText().toString().indexOf(""), textView27th.getText().toString().indexOf(" "));

                        NoOfDrinkZA = DrinkZAOneBeta.substring(DrinkZAOneBeta.indexOf("(")+1,DrinkZAOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZAOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZATwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZA);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestNine);


    }

    public void stringRequestTwentyEight() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView28th.getText().toString().equals("150 NAIRA C. MALTAGOLD")) {

                        paramsOne.put("drink_names", "C.MALTAGOLD");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZBOneBeta  = textView28th.getText().toString().substring(textView28th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZBOne = DrinkZBOneBeta.substring(DrinkZBOneBeta.indexOf(""), DrinkZBOneBeta.indexOf("("));
                        DrinkZBTwo = textView28th.getText().toString().substring(textView28th.getText().toString().indexOf(""), textView28th.getText().toString().indexOf(" "));

                        NoOfDrinkZB = DrinkZBOneBeta.substring(DrinkZBOneBeta.indexOf("(")+1,DrinkZBOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZBOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZBTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZB);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestTwentyNine() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView29th.getText().toString().equals("150 NAIRA C. MALTINA")) {

                        paramsOne.put("drink_names", "C.MALTINA");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZCOneBeta  = textView29th.getText().toString().substring(textView29th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZCOne = DrinkZCOneBeta.substring(DrinkZCOneBeta.indexOf(""), DrinkZCOneBeta.indexOf("("));
                        DrinkZCTwo = textView29th.getText().toString().substring(textView29th.getText().toString().indexOf(""), textView29th.getText().toString().indexOf(" "));

                        NoOfDrinkZC = DrinkZCOneBeta.substring(DrinkZCOneBeta.indexOf("(")+1,DrinkZCOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZCOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZCTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZC);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTwo);


    }

    public void stringRequestThirty() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView30th.getText().toString().equals("150 NAIRA C. HIMALT")) {

                        paramsOne.put("drink_names", "C.HIMALT");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZDOneBeta  = textView30th.getText().toString().substring(textView30th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZDOne = DrinkZDOneBeta.substring(DrinkZDOneBeta.indexOf(""), DrinkZDOneBeta.indexOf("("));
                        DrinkZDTwo = textView30th.getText().toString().substring(textView30th.getText().toString().indexOf(""), textView30th.getText().toString().indexOf(" "));

                        NoOfDrinkZD = DrinkZDOneBeta.substring(DrinkZDOneBeta.indexOf("(")+1,DrinkZDOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkZDOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZDTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZD);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestThirtyOne() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView31st.getText().toString().equals("150 NAIRA C. MALTAGUINNESS")) {

                        paramsOne.put("drink_names", "C.MALTAGUINNESS");
                        paramsOne.put("drink_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZEOneBeta  = textView31st.getText().toString().substring(textView31st.getText().toString().indexOf("NAIRA")+6);
                        DrinkZEOne = DrinkZEOneBeta.substring(DrinkZEOneBeta.indexOf(""), DrinkZEOneBeta.indexOf("("));
                        DrinkZETwo = textView31st.getText().toString().substring(textView31st.getText().toString().indexOf(""), textView31st.getText().toString().indexOf(" "));

                        NoOfDrinkZE = DrinkZEOneBeta.substring(DrinkZEOneBeta.indexOf("(")+1,DrinkZEOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZEOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZETwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZE);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestThirtyTwo() {


            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView32nd.getText().toString().equals("500 NAIRA 5ALIVE JUICE")) {

                        paramsOne.put("drink_names", "5ALIVEJUICE");
                        paramsOne.put("drink_prices", "500");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {
                        DrinkZFOneBeta  = textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf("NAIRA")+6);
                        DrinkZFOne = DrinkZFOneBeta.substring(DrinkZFOneBeta.indexOf(""), DrinkZFOneBeta.indexOf("("));
                        DrinkZFTwo = textView32nd.getText().toString().substring(textView32nd.getText().toString().indexOf(""), textView32nd.getText().toString().indexOf(" "));

                        NoOfDrinkZF = DrinkZFOneBeta.substring(DrinkZFOneBeta.indexOf("(")+1,DrinkZFOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZFOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZFTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZF);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestFive);


    }

    public void stringRequestThirtyThree() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView33rd.getText().toString().equals("300 NAIRA SMALL HOLLANDIA JUICE")) {

                        paramsOne.put("drink_names", "SMALLHOLLANDIAJUICE");
                        paramsOne.put("drink_prices", "300");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZGOneBeta  = textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf("NAIRA")+6);
                        DrinkZGOne = DrinkZGOneBeta.substring(DrinkZGOneBeta.indexOf(""), DrinkZGOneBeta.indexOf("("));
                        DrinkZGTwo = textView33rd.getText().toString().substring(textView33rd.getText().toString().indexOf(""), textView33rd.getText().toString().indexOf(" "));

                        NoOfDrinkZG = DrinkZGOneBeta.substring(DrinkZGOneBeta.indexOf("(")+1,DrinkZGOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZGOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZGTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZG);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestThirtyFour() {


            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView34th.getText().toString().equals("500 NAIRA BIG HOLLANDIA JUICE")) {

                        paramsOne.put("drink_names", "BIGHOLLANDIAJUICE");
                        paramsOne.put("drink_prices", "500");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {
                        DrinkZHOneBeta  = textView34th.getText().toString().substring(textView34th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZHOne = DrinkZHOneBeta.substring(DrinkZHOneBeta.indexOf(""), DrinkZHOneBeta.indexOf("("));
                        DrinkZHTwo = textView34th.getText().toString().substring(textView34th.getText().toString().indexOf(""), textView34th.getText().toString().indexOf(" "));

                        NoOfDrinkZH = DrinkZHOneBeta.substring(DrinkZHOneBeta.indexOf("(")+1,DrinkZHOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZHOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZHTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZH);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestThirtyFive() {


            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView35th.getText().toString().equals("300 NAIRA SMALL CHIEXOTIC JUICE")) {

                        paramsOne.put("drink_names", "SMALLCHIEXOTICJUICE");
                        paramsOne.put("drink_prices", "300");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZIOneBeta  = textView35th.getText().toString().substring(textView35th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZIOne = DrinkZIOneBeta.substring(DrinkZIOneBeta.indexOf(""), DrinkZIOneBeta.indexOf("("));
                        DrinkZITwo = textView35th.getText().toString().substring(textView35th.getText().toString().indexOf(""), textView35th.getText().toString().indexOf(" "));

                        NoOfDrinkZI = DrinkZIOneBeta.substring(DrinkZIOneBeta.indexOf("(")+1,DrinkZIOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZIOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZITwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZI);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestEight);

    }

    public void stringRequestThirtySix() {


            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView36th.getText().toString().equals("500 NAIRA BIG CHIEXOTIC JUICE")) {

                        paramsOne.put("drink_names", "BIGCHIEXOTICJUICE");
                        paramsOne.put("drink_prices", "500");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {
                        DrinkZJOneBeta  = textView36th.getText().toString().substring(textView36th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZJOne = DrinkZJOneBeta.substring(DrinkZJOneBeta.indexOf(""), DrinkZJOneBeta.indexOf("("));
                        DrinkZJTwo = textView36th.getText().toString().substring(textView36th.getText().toString().indexOf(""), textView36th.getText().toString().indexOf(" "));

                        NoOfDrinkZJ = DrinkZJOneBeta.substring(DrinkZJOneBeta.indexOf("(")+1,DrinkZJOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZJOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZJTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZJ);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestNine);

    }

    public void stringRequestThirtySeven() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView37th.getText().toString().equals("300 NAIRA SMALL CHIVITA JUICE")) {

                        paramsOne.put("drink_names", "SMALLCHIVITAJUICE");
                        paramsOne.put("drink_prices", "300");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZKOneBeta  = textView37th.getText().toString().substring(textView37th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZKOne = DrinkZKOneBeta.substring(DrinkZKOneBeta.indexOf(""), DrinkZKOneBeta.indexOf("("));
                        DrinkZKTwo = textView37th.getText().toString().substring(textView37th.getText().toString().indexOf(""), textView37th.getText().toString().indexOf(" "));

                        NoOfDrinkZK = DrinkZKOneBeta.substring(DrinkZKOneBeta.indexOf("(")+1,DrinkZKOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZKOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZKTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZK);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestThirtyEight() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView38th.getText().toString().equals("500 NAIRA BIG CHIVITA JUICE")) {

                        paramsOne.put("drink_names", "BIGCHIVITAJUICE");
                        paramsOne.put("drink_prices", "500");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZLOneBeta  = textView38th.getText().toString().substring(textView38th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZLOne = DrinkZLOneBeta.substring(DrinkZLOneBeta.indexOf(""), DrinkZLOneBeta.indexOf("("));
                        DrinkZLTwo = textView38th.getText().toString().substring(textView38th.getText().toString().indexOf(""), textView38th.getText().toString().indexOf(" "));

                        NoOfDrinkZL = DrinkZLOneBeta.substring(DrinkZLOneBeta.indexOf("(")+1,DrinkZLOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZLOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZLTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZL);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestThirtyNine() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView39th.getText().toString().equals("300 NAIRA SMALL HAPPYHOUR JUICE")) {

                        paramsOne.put("drink_names", "SMALLHAPPYHOURJUICE");
                        paramsOne.put("drink_prices", "300");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZMOneBeta  = textView39th.getText().toString().substring(textView39th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZMOne = DrinkZMOneBeta.substring(DrinkZMOneBeta.indexOf(""), DrinkZMOneBeta.indexOf("("));
                        DrinkZMTwo = textView39th.getText().toString().substring(textView39th.getText().toString().indexOf(""), textView39th.getText().toString().indexOf(" "));

                        NoOfDrinkZM = DrinkZMOneBeta.substring(DrinkZMOneBeta.indexOf("(")+1,DrinkZMOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZMOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZMTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZM);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestFourty() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView40th.getText().toString().equals("500 NAIRA BIG HAPPYHOUR JUICE")) {

                        paramsOne.put("drink_names", "BIGHAPPYHOURJUICE");
                        paramsOne.put("drink_prices", "500");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZNOneBeta  = textView40th.getText().toString().substring(textView40th.getText().toString().indexOf("NAIRA")+6);
                        DrinkZNOne = DrinkZNOneBeta.substring(DrinkZNOneBeta.indexOf(""), DrinkZNOneBeta.indexOf("("));
                        DrinkZNTwo = textView40th.getText().toString().substring(textView40th.getText().toString().indexOf(""), textView40th.getText().toString().indexOf(" "));

                        NoOfDrinkZN = DrinkZNOneBeta.substring(DrinkZNOneBeta.indexOf("(")+1,DrinkZNOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZNOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZNTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZN);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestFourtyOne() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView41st.getText().toString().equals("80 NAIRA SMALL G. SCHWEPPES")) {

                        paramsOne.put("drink_names", "SMALLG.SCHWEPPES");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZOOneBeta  = textView41st.getText().toString().substring(textView41st.getText().toString().indexOf("NAIRA")+6);
                        DrinkZOOne = DrinkZOOneBeta.substring(DrinkZOOneBeta.indexOf(""), DrinkZOOneBeta.indexOf("("));
                        DrinkZOTwo = textView41st.getText().toString().substring(textView41st.getText().toString().indexOf(""), textView41st.getText().toString().indexOf(" "));

                        NoOfDrinkZO = DrinkZOOneBeta.substring(DrinkZOOneBeta.indexOf("(")+1,DrinkZOOneBeta.indexOf(")"));


                        paramsOne.put("drink_names", DrinkZOOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZOTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZO);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestFourtyTwo() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView42nd.getText().toString().equals("100 NAIRA BIG G. SCHWEPPES")) {

                        paramsOne.put("drink_names", "BIGG.SCHWEPPES");
                        paramsOne.put("drink_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZPOneBeta  = textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf("NAIRA")+6);
                        DrinkZPOne = DrinkZPOneBeta.substring(DrinkZPOneBeta.indexOf(""), DrinkZPOneBeta.indexOf("("));
                        DrinkZPTwo = textView42nd.getText().toString().substring(textView42nd.getText().toString().indexOf(""), textView42nd.getText().toString().indexOf(" "));

                        NoOfDrinkZP = DrinkZPOneBeta.substring(DrinkZPOneBeta.indexOf("(")+1,DrinkZPOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZPOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZPTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZP);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);


    }

    public void stringRequestFourtyThree() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView43rd.getText().toString().equals("80 NAIRA PET ZOBO")) {

                        paramsOne.put("drink_names", "PETZOBO");
                        paramsOne.put("drink_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        DrinkZQOneBeta  = textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf("NAIRA")+6);
                        DrinkZQOne = DrinkZQOneBeta.substring(DrinkZQOneBeta.indexOf(""), DrinkZQOneBeta.indexOf("("));
                        DrinkZQTwo = textView43rd.getText().toString().substring(textView43rd.getText().toString().indexOf(""), textView43rd.getText().toString().indexOf(" "));

                        NoOfDrinkZQ = DrinkZQOneBeta.substring(DrinkZQOneBeta.indexOf("(")+1,DrinkZQOneBeta.indexOf(")"));

                        paramsOne.put("drink_names", DrinkZQOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("drink_prices", DrinkZQTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfDrinkZQ);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }

                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }

    public void stringRequestFourtyFour() {

        StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            JSONObject jsonObject = jsonArray.getJSONObject(0);

                            String code = jsonObject.getString("tranc_success");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> paramsOne = new HashMap<>();

                if (textView44th.getText().toString().equals("120 NAIRA PET SCHWEPPES")) {

                    paramsOne.put("drink_names", "PETSCHWEPPES");
                    paramsOne.put("drink_prices", "120");
                    paramsOne.put("buyer_name", fullUsername.getText().toString());
                    paramsOne.put("no_plates", NoOfPlates.getText().toString());
                    paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                    paramsOne.put("vendor_id", app.Idtext.getText().toString());
                }
                else {

                    DrinkZROneBeta  = textView44th.getText().toString().substring(textView44th.getText().toString().indexOf("NAIRA")+6);
                    DrinkZROne = DrinkZROneBeta.substring(DrinkZROneBeta.indexOf(""), DrinkZROneBeta.indexOf("("));
                    DrinkZRTwo = textView44th.getText().toString().substring(textView44th.getText().toString().indexOf(""), textView44th.getText().toString().indexOf(" "));

                    NoOfDrinkZR = DrinkZROneBeta.substring(DrinkZROneBeta.indexOf("(")+1,DrinkZROneBeta.indexOf(")"));

                    paramsOne.put("drink_names", DrinkZROne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                    paramsOne.put("drink_prices", DrinkZRTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                    paramsOne.put("buyer_name", fullUsername.getText().toString());
                    paramsOne.put("no_plates", NoOfDrinkZR);
                    paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                    paramsOne.put("vendor_id", app.Idtext.getText().toString());
                }

                return paramsOne;
            }
        };
        MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);
    }

    public void stringRequestFourtyFive() {

        StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_drinkitems,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            JSONObject jsonObject = jsonArray.getJSONObject(0);

                            String code = jsonObject.getString("tranc_success");

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String, String> paramsOne = new HashMap<>();

                if (textView45th.getText().toString().equals("200 NAIRA PET 5ALIVE")) {

                    paramsOne.put("drink_names", "PET5ALIVE");
                    paramsOne.put("drink_prices", "200");
                    paramsOne.put("buyer_name", fullUsername.getText().toString());
                    paramsOne.put("no_plates", NoOfPlates.getText().toString());
                    paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                    paramsOne.put("vendor_id", app.Idtext.getText().toString());
                }
                else {

                    DrinkZSOneBeta  = textView45th.getText().toString().substring(textView45th.getText().toString().indexOf("NAIRA")+6);
                    DrinkZSOne = DrinkZSOneBeta.substring(DrinkZSOneBeta.indexOf(""), DrinkZSOneBeta.indexOf("("));
                    DrinkZSTwo = textView45th.getText().toString().substring(textView45th.getText().toString().indexOf(""), textView45th.getText().toString().indexOf(" "));

                    NoOfDrinkZS = DrinkZSOneBeta.substring(DrinkZSOneBeta.indexOf("(")+1,DrinkZSOneBeta.indexOf(")"));

                    paramsOne.put("drink_names", DrinkZSOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                    paramsOne.put("drink_prices", DrinkZSTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                    paramsOne.put("buyer_name", fullUsername.getText().toString());
                    paramsOne.put("no_plates", NoOfDrinkZS);
                    paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                    paramsOne.put("vendor_id", app.Idtext.getText().toString());
                }

                return paramsOne;
            }
        };
        MyCountlesston.getmInstance(DrinksmenuActivity.this).addToRequestQueue(stringRequestTen);
    }







    @Override
    public void respond(int ant) {
        FragmentManager manager = getFragmentManager();

        DrinkspriceFragment fpf = (DrinkspriceFragment) manager.findFragmentById(R.id.Fragmentdrinkprice);
        fpf.Datachange(ant);
    }

    @Override
    public void setPrice(String price) {
        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updatePrice(price);
    }

    @Override
    public void setName(String name) {
        ChosendrinksFragment cff = (ChosendrinksFragment) getFragmentManager().findFragmentById(R.id.FragmentChosendrink);
        cff.updateInfo(name);

        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updateInfo(name);

        Pcount.setEnabled(true);
        Purchase.setEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drinksactivityappbarmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.check_balance:
                break;

            case R.id.log_out:
                break;
        }
        return false;
    }

    public void checkMyBalance(MenuItem item) {
        Bundle myMoney = getIntent().getExtras();
        myMoney.getString("");
        Snackbar CheckMyMoney = Snackbar.make(relative, "Your balance is: " + myMoney.getString("accountbalance"), Snackbar.LENGTH_LONG);
        View ColourfulMoney = CheckMyMoney.getView();
        ColourfulMoney.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSnqck));
        CheckMyMoney.setActionTextColor(Color.GREEN);
        CheckMyMoney.show();
    }

    public void AlrightImOff(MenuItem item) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        Bundle Oyedepo = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Oyedepo.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    public void maxPlateCount(View view) {

        out = Integer.parseInt(String.valueOf(app.allindrinkcounter));

        final AlertDialog.Builder builder = new AlertDialog.Builder(DrinksmenuActivity.this);

        try { final String[] whiteRing = app.Diamond;
            builder.setItems(whiteRing, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (which == 0) {
                      //  Pcount.setText("" + "PLATE COUNT" + "");
                        NoOfPlates.setText("1");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in a plate", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                        playtcount = stringplayti;
                    }
                    if (which == 1) {
                     //   Pcount.setText("PLATE COUNT\n(2)");
                        NoOfPlates.setText("2");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in two diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(2 * out ) + "");
                        playtcount = stringplaytii;
                    }
                    if (which == 2) {
                     //   Pcount.setText("PLATE COUNT\n(3)");
                        NoOfPlates.setText("3");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in three diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(3 * out ) + "");
                        playtcount = stringplaytiii;
                    }
                    if (which == 3) {
                     //   Pcount.setText("PLATE COUNT\n(4)");
                        NoOfPlates.setText("4");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in four diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(4 * out ) + "");
                        playtcount = stringplaytiv;
                    }
                    if (which == 4) {
                     //   Pcount.setText("PLATE COUNT\n(5)");
                        NoOfPlates.setText("5");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in five diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(5 * out ) + "");
                        playtcount = stringplaytv;
                    }
                    if (which == 5) {
                    //    Pcount.setText("PLATE COUNT\n(6)");
                        NoOfPlates.setText("6");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in six diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(6 * out ) + "");
                        playtcount = stringplaytvi;
                    }
                    if (which == 6) {
                        Pcount.setText("PLATE COUNT\n(7)");
                        NoOfPlates.setText("7");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(7 * out ) + "");
                        playtcount = stringplaytvii;
                    }
                    if (which == 7) {
                        Pcount.setText("PLATE COUNT\n(8)");
                        NoOfPlates.setText("8");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eight diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(8 * out ) + "");
                        playtcount = stringplaytviii;
                    }
                    if (which == 8) {
                        Pcount.setText("PLATE COUNT\n(9)");
                        NoOfPlates.setText("9");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nine diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(9 * out ) + "");
                        playtcount = stringplaytix;
                    }
                    if (which == 9) {
                        Pcount.setText("PLATE COUNT\n(10)");
                        NoOfPlates.setText("" + "10" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in ten diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(10 * out ) + "");
                        playtcount = stringplaytx;
                    }
                    if (which == 10) {
                        Pcount.setText("PLATE COUNT\n(11)");
                        NoOfPlates.setText("" + "11" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eleven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(11 * out ) + "");
                        playtcount = stringplaytxi;
                    }
                    if (which == 11) {
                        Pcount.setText("PLATE COUNT\n(12)");
                        NoOfPlates.setText("" + "12" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twelve diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(12 * out ) + "");
                        playtcount = stringplaytxii;
                    }
                    if (which == 12) {
                        Pcount.setText("PLATE COUNT\n(13)");
                        NoOfPlates.setText("" + "13" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(13 * out ) + "");
                        playtcount = stringplaytxiii;
                    }
                    if (which == 13) {
                        Pcount.setText("PLATE COUNT\n(14)");
                        NoOfPlates.setText("" + "14" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fourteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(14 * out ) + "");
                        playtcount = stringplaytxiv;
                    }
                    if (which == 14) {
                        Pcount.setText("PLATE COUNT\n(15)");
                        NoOfPlates.setText("" + "15" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fifteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(15 * out ) + "");
                        playtcount = stringplaytxv;
                    }
                    if (which == 15) {
                        Pcount.setText("PLATE COUNT\n(16)");
                        NoOfPlates.setText("" + "16" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in sixteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(16 * out ) + "");
                        playtcount = stringplaytxvi;
                    }
                    if (which == 16) {
                        Pcount.setText("PLATE COUNT\n(17)");
                        NoOfPlates.setText("" + "17" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seventeen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(17 * out ) + "");
                        playtcount = stringplaytxvii;
                    }
                    if (which == 17) {
                        Pcount.setText("PLATE COUNT\n(18)");
                        NoOfPlates.setText("" + "18" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eighteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(18 * out ) + "");
                        playtcount = stringplaytxviii;
                    }
                    if (which == 18) {
                        Pcount.setText("PLATE COUNT\n(19)");
                        NoOfPlates.setText("" + "19" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nineteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(19 * out ) + "");
                        playtcount = stringplaytxix;
                    }
                    if (which == 19) {
                        Pcount.setText("PLATE COUNT\n(20)");
                        NoOfPlates.setText("" + "20" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twenty diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(20 * out ) + "");
                        playtcount = stringplaytxx;
                    }
                    if (which == 20) {
                        Pcount.setText("PLATE COUNT\n(21)");
                        NoOfPlates.setText("" + "21" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyone diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(21 * out ) + "");
                        playtcount = stringplaytxxi;
                    }
                    if (which == 21) {
                        Pcount.setText("PLATE COUNT\n(22)");
                        NoOfPlates.setText("" + "22" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentytwo diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(22 * out ) + "");
                        playtcount = stringplaytxxii;
                    }
                    if (which == 22) {
                        Pcount.setText("PLATE COUNT\n(23)");
                        NoOfPlates.setText("" + "23" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentythree diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(23 * out ) + "");
                        playtcount = stringplaytxxiii;
                    }
                    if (which == 23) {
                        Pcount.setText("PLATE COUNT\n(24)");
                        NoOfPlates.setText("" + "24" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfour diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(24 * out ) + "");
                        playtcount = stringplaytxxiv;
                    }
                    if (which == 24) {
                        Pcount.setText("PLATE COUNT\n(25)");
                        NoOfPlates.setText("" + "25" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfive diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(25 * out ) + "");
                        playtcount = stringplaytxxv;
                    }
                    if (which == 25) {
                        Pcount.setText("PLATE COUNT\n(26)");
                        NoOfPlates.setText("" + "26" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentysix diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(26 * out ) + "");
                        playtcount = stringplaytxxvi;
                    }
                    if (which == 26) {
                        Pcount.setText("PLATE COUNT\n(27)");
                        NoOfPlates.setText("" + "27" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyseven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(27 * out ) + "");
                        playtcount = stringplaytxxvii;
                    }
                    if (which == 27) {
                        Pcount.setText("PLATE COUNT\n(28)");
                        NoOfPlates.setText("" + "28" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyeight diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(28 * out ) + "");
                        playtcount = stringplaytxxviii;
                    }
                    if (which == 28) {
                        Pcount.setText("PLATE COUNT\n(29)");
                        NoOfPlates.setText("" + "29" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentynine diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(29 * out ) + "");
                        playtcount = stringplaytxxix;
                    }
                    if (which == 29) {
                        Pcount.setText("PLATE COUNT\n(30)");
                        NoOfPlates.setText("" + "30" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirty diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(30 * out ) + "");
                        playtcount = stringplaytxxx;
                    }
                }
            });
        }
        catch (NullPointerException ignored) {

        }
        builder.setCancelable(true);
        Dialog dialog = builder.create();
        dialog.show();
    }

    public void autoBio(View view) {


        LayoutInflater inflater = DrinksmenuActivity.this.getLayoutInflater();
        view = inflater.inflate(R.layout.da_userprof_background, null);


        Lenient = new AlertDialog.Builder(DrinksmenuActivity.this);
        Lenient.setView(view);

        Department = view.findViewById(R.id.department);
        UserProfileAccountBalance = view.findViewById(R.id.userProfileAccountBalance);
        UserProfileName = view.findViewById(R.id.userProfileName);
        UserProfileStarLevel = view.findViewById(R.id.userProfileStarLevel);
        UserProfileSex = view.findViewById(R.id.userProfileSex);
        UserProfileImage = view.findViewById(R.id.userProfileImage);
        Level = view.findViewById(R.id.level);
        LastSeen = view.findViewById(R.id.lastSeen);

        final Bundle lenient = getIntent().getExtras();
        getUserProfileAppearance(lenient.getString("image"));


        Bundle ForthParcel = getIntent().getExtras();
        try {
            Department.setText("" + ForthParcel.getString("department") + "");
        } catch (Exception ignored) {

        }

        Bundle FifthParcel = getIntent().getExtras();
        try {
            Level.setText("" + FifthParcel.getString("level") + "");
        } catch (Exception ignored) {

        }

        Bundle SixthParcel = getIntent().getExtras();
        try {
            UserProfileAccountBalance.setText("" + SixthParcel.getString("accountbalance") + "");
        } catch (Exception ignored) {

        }

        Bundle SeventhParcel = getIntent().getExtras();
        try {
            UserProfileSex.setText("" + SeventhParcel.getString("sex") + "");
        } catch (Exception ignored) {

        }

        Bundle EightParcel = getIntent().getExtras();
        String myBirthtime = EightParcel.getString("time");
        final String justMonthNDate = myBirthtime;
        final String isToday = justMonthNDate != null ? justMonthNDate.substring(justMonthNDate.indexOf("- ") + 2) : null;


        Bundle NinthParcel = getIntent().getExtras();
        try {
            LastSeen.setText("" + NinthParcel.getString("last_seen_accept") + "");
        } catch (Exception ignored) {

        }


        Bundle TenthParcel = getIntent().getExtras();
//        TenthParcel.getString("d_n_m");
        String myBirthday = TenthParcel.getString("d_n_m");

        Bundle EleventhParcel = getIntent().getExtras();
        if (Objects.equals(myBirthday, isToday)) {

            idara = (EmojiRainLayout) view;


            idara.addEmoji(R.drawable.c_happy_h);
            idara.addEmoji(R.drawable.c_happy_a);
            idara.addEmoji(R.drawable.c_happy_p);
            idara.addEmoji(R.drawable.c_happy_p_two);
            idara.addEmoji(R.drawable.c_happy_y);

            idara.addEmoji(R.drawable.c_happy_b);
            idara.addEmoji(R.drawable.c_happy_i);
            idara.addEmoji(R.drawable.c_happy_r);
            idara.addEmoji(R.drawable.c_happy_t);
            idara.addEmoji(R.drawable.c_happy_h_two);
            idara.addEmoji(R.drawable.c_happy_d);
            idara.addEmoji(R.drawable.c_happy_a_two);
            idara.addEmoji(R.drawable.c_happy_y_two);

            idara.stopDropping();
            idara.setPer(10);
            idara.setDuration(7200);
            idara.setDropDuration(4400);
            idara.setDropFrequency(500);

            idara.startDropping();


            UserProfileName.setText("Happy Birthday " + EightParcel.getString("name") + "");
            UserProfileName.setTextSize(30);
        }
        else {

            try {
                UserProfileName.setText("" + EleventhParcel.getString("name") + "");
            } catch (Exception ignored) {

            }
        }


        Prince = Lenient.create();
        Prince.show();
    }

    public void userProfileLayoutButton(View view) {

        Prince.cancel();
    }

    private void getUserProfileAppearance(String url) {

        Bundle SexParcel = getIntent().getExtras();
        Sex.setText(SexParcel.getString("sex"));

        if (Sex.getText().toString().equals("female")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorgirl).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("male")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorboy).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("doctor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errordoctor).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("professor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorprof).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mr")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormr).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("engineer")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorengr).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mrs")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormrs).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("miss")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormiss).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        Bundle Oyedepo = getIntent().getExtras();
        alertDialog.setTitle("Come on " + Oyedepo.getString("king") + "");

        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        Bundle Oyedepo = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Oyedepo.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to Cancel your transaction? ");
        alertDialog.setIcon(R.drawable.a_alert);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.create().show();
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FoodmenuActivity","onStart invoked");
        reverseAnime(OperationAnimation.BEGIN);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FoodmenuActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FoodmenuActivity", "onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FoodmenuActivity","onStop invoked");
        reverseAnime(OperationAnimation.ADJOURN);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FoodmenuActivity","onRestart invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FoodmenuActivity","onDestroy invoked");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private void reverseAnime(OperationAnimation bedCheck) {
        Drawable graphicsPad = AnimatedImageView.getDrawable();
        Animatable crazitivity = ((Animatable) graphicsPad);
        switch (bedCheck) {
            case BEGIN:
                crazitivity.start();
                break;
            case ADJOURN:
                crazitivity.stop();
                break;
        }
    }
}
