package com.icdatofcusgmail.luciddrinks.VendorActivityArchive;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
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
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.icdatofcusgmail.luciddrinks.LoginActivityArchive.LoginActivity;
import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;
import com.icdatofcusgmail.luciddrinks.Vendors_LoginActivityArchive.Vendor_LoginActivity;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

import java.util.ArrayList;

public class VendorActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, RadioGroup.OnCheckedChangeListener {

    SmoothCheckBox smoothy;
    public static RadioGroup radioGroup;
    public static RadioButton oneissmalljoor, twook, threeok, fourok, fiveok, sixok, sevenok, eightok, nineok, tenok, elevenok, twelveok, thirteenok, fourteenok, fifteenok, sixteenok, seventeenok, eighteenok, nineteenok, twentyok, twentyoneok, twentytwook, twentythreeok, twentyfourok, twentyfiveok, twentysixok, twentysevenok, twentyeightok, twentynineok, thirtyisenoughjoor;
    PowerManager.WakeLock wakeLock;
    Toolbar toolbar_vendor;
    VendorAdapter vendorAdapter;
    public static GridView ShowInThis;
    public static TextView itemsState, pleaseWork, itemsBeenSelected;
    Button PassDataAlso;

    final String[] drinksnames = new String[]{"Can Mirinda", "Glass Mirinda", "Pet Mirinda", "Can Pepsi", "Glass Pepsi",
            "Pet Pepsi", "Can Savanna", "Pet Savanna", "Can SevenUp", "Glass SevenUp", "Pet SevenUp", "Small Glass Sprite",
            "Big Glass Sprite", "Pet Sprite", "Pet Teem", "Pet Lacasera", "Pet Smoov", "Small Glass Coke", "Big Glass Coke",
            "Small Pet Coke", "Big Pet Coke", "Small Glass Fanta", "Big Glass Fanta", "Small Pet Fanta", "Big Pet Fanta",
            "Sachet Water", "Pet Water", "Can MaltaGold", "Can Maltina", "Can Himalt", "Can MaltaGuinness", "5Alive Juice",
            "Small Hollandia Juice", "Big Hollandia Juice", "Small ChiExotic Juice", "Big ChiExotic Juice", "Small Chivita Juice",
            "Big Chivita Juice", "Small HappyHour Juice", "Big HappyHour Juice", "Small Glass Schweppes", "Big Glass Schweppes", "Pet Zobo",
            "Pet Schweppes", "Pet 5Alive"};

    int[] drinksimages = { R.drawable.c_mirinda_can, R.drawable.c_mirinda_glass, R.drawable.c_mirinda_pet, R.drawable.c_pepsi_can,
            R.drawable.c_pepsi_glass, R.drawable.c_pepsi_pet, R.drawable.c_savanna_can, R.drawable.c_savanna_pet, R.drawable.c_sevenup_can,
            R.drawable.c_sevenup_glass, R.drawable.c_sevenup_pet, R.drawable.c_sprite_small_glass, R.drawable.c_sprite_big_glass,
            R.drawable.c_sprite_pet, R.drawable.c_teem_pet, R.drawable.c_lacasera_pet, R.drawable.c_smoov_pet, R.drawable.c_cocacola_small_glass,
            R.drawable.c_cocacola_big_glass, R.drawable.c_cocacola_small_pet, R.drawable.c_cocacola_big_pet, R.drawable.c_fanta_small_glass,
            R.drawable.c_fanta_big_glass, R.drawable.c_fanta_small_pet, R.drawable.c_fanta_big_pet, R.drawable.c_water_sachet, R.drawable.c_water_pet,
            R.drawable.c_maltagold_can, R.drawable.c_maltina_can, R.drawable.c_himalt_can, R.drawable.c_maltaguinness_can, R.drawable.c_fivealive_juice,
            R.drawable.c_hollandia_small_juice, R.drawable.c_hollandia_big_juice, R.drawable.c_chiexotic_small_juice, R.drawable.c_chiexotic_big_juice,
            R.drawable.c_chivita_small_juice, R.drawable.c_chivita_big_juice, R.drawable.c_happyhour_small_juice, R.drawable.c_happyhour_big_juice,
            R.drawable.c_schweppes_small_glass, R.drawable.c_schweppes_big_glass, R.drawable.c_zobo, R.drawable.c_schweppes_pet, R.drawable.c_5alive_pet};

    TextView sellerId;

    LucidApplication app;

    SharedPreferences MyOkPlatesPrefences;
    SharedPreferences.Editor MyOkPlatesEditor;

    private static final String PREF_NICK_NAME = "VendorsCall";
    private static final String ONE_KITCHEN_KEY_RECALL = "unforgettable1";
    private static final String TWO_SITTINGROOM_KEY_RECALL = "unforgettable2";
    private static final String THREE_VISITORROOM_KEY_RECALL = "unforgettable3";
    private static final String FOUR_LAUNDRYROOM_KEY_RECALL = "unforgettable4";
    private static final String FIVE_CLASSROOM_KEY_RECALL = "unforgettable5";
    private static final String SIX_BOARDROOM_KEY_RECALL = "unforgettable6";
    private static final String SEVEN_CONFERENCEROOM_KEY_RECALL = "unforgettable7";
    private static final String EIGHT_MASTERBEDROOM_KEY_RECALL = "unforgettable8";
    private static final String NINE_CHILDRENROOM_KEY_RECALL = "unforgettable9";
    private static final String TEN_GARAGEROOM_KEY_RECALL = "unforgettable10";
    private static final String ELEVEN_LECTUREROOM_KEY_RECALL = "unforgettable11";
    private static final String TWELVE_GENTROOM_KEY_RECALL = "unforgettable12";
    private static final String THIRTEEN_LADIESROOM_KEY_RECALL = "unforgettable13";
    private static final String FOURTEEN_BARROOM_KEY_RECALL = "unforgettable14";
    private static final String FIFTEEN_RICESPOT_KEY_RECALL = "unforgettable15";
    private static final String SIXTEEN_drinksSPOT_KEY_RECALL = "unforgettable16";
    private static final String SEVENTEEN_DRINKSPOT_KEY_RECALL = "unforgettable17";
    private static final String EIGHTEEN_POTARITOSPOT_KEY_RECALL = "unforgettable18";
    private static final String NINETEEN_TUBABASPOT_KEY_RECALL = "unforgettable19";
    private static final String TWENTY_CHINESERICESPOT_KEY_RECALL = "unforgettable20";
    private static final String TWENTYONE_AMALASPOT_KEY_RECALL = "unforgettable21";
    private static final String TWENTYTWO_FRUITSPOT_KEY_RECALL = "unforgettable22";
    private static final String TWENTYTHREE_CHAPMANSPOT_KEY_RECALL = "unforgettable23";
    private static final String TWENTYFOUR_SHOPPINGMALL_KEY_RECALL = "unforgettable24";
    private static final String TWENTYFIVE_MEDICALCENTRE_KEY_RECALL = "unforgettable25";
    private static final String TWENTYSIX_ABRAHAMHALL_KEY_RECALL = "unforgettable26";
    private static final String TWENTYSEVEN_SARAHHALL_KEY_RECALL = "unforgettable27";
    private static final String TWENTYEIGHT_JOSEPHHALL_KEY_RECALL = "unforgettable28";
    private static final String TWENTYNINE_DEBORAHHALL_KEY_RECALL = "unforgettable29";
    private static final String THIRTY_SENATEBUILDING_KEY_RECALL = "unforgettable30";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);

        Log.d("VendorActivity", "onCreate invoked");

        app = LucidApplication.getInstance();

        sellerId = findViewById(R.id.textViewId);

        try {

            sellerId.setText("Id No : " + app.Idtext.getText().toString() + "");
        }
        catch (Exception ignored) {

        }

        MyOkPlatesPrefences = getSharedPreferences(PREF_NICK_NAME, Context.MODE_PRIVATE);
        MyOkPlatesEditor = MyOkPlatesPrefences.edit();

        PassDataAlso = findViewById(R.id.getMeNextActivity);

        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }

        toolbar_vendor = findViewById(R.id.ToolbarVendorActivity);
        setSupportActionBar(toolbar_vendor);

        getSupportActionBar().setTitle("");

        itemsState = findViewById(R.id.itemsState);
        itemsState.setVisibility(View.INVISIBLE);

        pleaseWork = findViewById(R.id.selectedYet);
        pleaseWork.setVisibility(View.INVISIBLE);

        itemsBeenSelected = findViewById(R.id.itemsBeenSelected);
        itemsBeenSelected.setVisibility(View.INVISIBLE);

        ShowInThis = findViewById(R.id.showInThis);
        ShowInThis.setOnItemClickListener(this);

        ShowInThis.setVisibility(View.GONE);
        ShowInThis.setChoiceMode(GridView.CHOICE_MODE_MULTIPLE);
        vendorAdapter = new VendorAdapter(getApplicationContext(), getIcdats());
        ShowInThis.setAdapter(vendorAdapter);

        smoothy = findViewById(R.id.smoothie);
    }


    private ArrayList<Icdat> getIcdats() {
        ArrayList<Icdat> icdats = new ArrayList<>();
        icdats.add(new Icdat(drinksnames[0], drinksimages[0], smoothy)); // Can Mirinda
        icdats.add(new Icdat(drinksnames[1], drinksimages[1], smoothy)); // Glass Mirinda
        icdats.add(new Icdat(drinksnames[2], drinksimages[2], smoothy)); // Pet Mirinda
        icdats.add(new Icdat(drinksnames[3], drinksimages[3], smoothy)); // Can Pepsi
        icdats.add(new Icdat(drinksnames[4], drinksimages[4], smoothy)); // Glass Pepsi
        icdats.add(new Icdat(drinksnames[5], drinksimages[5], smoothy)); // Pet Pepsi
        icdats.add(new Icdat(drinksnames[6], drinksimages[6], smoothy)); // Can Savanna
        icdats.add(new Icdat(drinksnames[7], drinksimages[7], smoothy)); // Pet Savanna
        icdats.add(new Icdat(drinksnames[8], drinksimages[8], smoothy)); // Can SevenUp
        icdats.add(new Icdat(drinksnames[9], drinksimages[9], smoothy)); // Glass SevenUp
        icdats.add(new Icdat(drinksnames[10], drinksimages[10], smoothy)); // Pet SevenUp
        icdats.add(new Icdat(drinksnames[11], drinksimages[11], smoothy)); // Small Glass Sprite
        icdats.add(new Icdat(drinksnames[12], drinksimages[12], smoothy)); // Big Glass Sprite
        icdats.add(new Icdat(drinksnames[13], drinksimages[13], smoothy)); // Pet Sprite
        icdats.add(new Icdat(drinksnames[14], drinksimages[14], smoothy)); // Pet Teem
        icdats.add(new Icdat(drinksnames[15], drinksimages[15], smoothy)); // Pet Lacasera
        icdats.add(new Icdat(drinksnames[16], drinksimages[16], smoothy)); // Pet Smoov
        icdats.add(new Icdat(drinksnames[17], drinksimages[17], smoothy)); // Small Glass Coke
        icdats.add(new Icdat(drinksnames[18], drinksimages[18], smoothy)); // Big Glass Coke
        icdats.add(new Icdat(drinksnames[19], drinksimages[19], smoothy)); // Small Pet Coke
        icdats.add(new Icdat(drinksnames[20], drinksimages[20], smoothy)); // Big Pet Coke
        icdats.add(new Icdat(drinksnames[21], drinksimages[21], smoothy)); // Small Glass Fanta
        icdats.add(new Icdat(drinksnames[22], drinksimages[22], smoothy)); // Big Glass Fanta
        icdats.add(new Icdat(drinksnames[23], drinksimages[23], smoothy)); // Small Pet Fanta
        icdats.add(new Icdat(drinksnames[24], drinksimages[24], smoothy)); // Big Pet Fanta
        icdats.add(new Icdat(drinksnames[25], drinksimages[25], smoothy)); // Sachet Water
        icdats.add(new Icdat(drinksnames[26], drinksimages[26], smoothy)); // Pet Water
        icdats.add(new Icdat(drinksnames[27], drinksimages[27], smoothy)); // Can MaltaGold
        icdats.add(new Icdat(drinksnames[28], drinksimages[28], smoothy)); // Can Maltina
        icdats.add(new Icdat(drinksnames[29], drinksimages[29], smoothy)); // Can Himalt
        icdats.add(new Icdat(drinksnames[30], drinksimages[30], smoothy)); // Can MaltaGuinness
        icdats.add(new Icdat(drinksnames[31], drinksimages[31], smoothy)); // 5Alive Juice
        icdats.add(new Icdat(drinksnames[32], drinksimages[32], smoothy)); // Small Hollandia Juice
        icdats.add(new Icdat(drinksnames[33], drinksimages[33], smoothy)); // Big Hollandia Juice
        icdats.add(new Icdat(drinksnames[34], drinksimages[34], smoothy)); // Small ChiExotic Juice
        icdats.add(new Icdat(drinksnames[35], drinksimages[35], smoothy)); // Big ChiExotic Juice
        icdats.add(new Icdat(drinksnames[36], drinksimages[36], smoothy)); // Small Chivita Juice
        icdats.add(new Icdat(drinksnames[37], drinksimages[37], smoothy)); // Big Chivita Juice
        icdats.add(new Icdat(drinksnames[38], drinksimages[38], smoothy)); // Small HappyHour Juice
        icdats.add(new Icdat(drinksnames[39], drinksimages[39], smoothy)); // Big HappyHour Juice
        icdats.add(new Icdat(drinksnames[40], drinksimages[40], smoothy)); // Small Glass Schweppes
        icdats.add(new Icdat(drinksnames[41], drinksimages[41], smoothy)); // Big Glass Schweppes
        icdats.add(new Icdat(drinksnames[42], drinksimages[42], smoothy)); // Pet Zobo
        icdats.add(new Icdat(drinksnames[43], drinksimages[43], smoothy)); // Pet Schweppes
        icdats.add(new Icdat(drinksnames[44], drinksimages[44], smoothy)); // Pet 5Alive
        return icdats;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Icdat icdat = getIcdats().get(position);

        if (view.getTag() instanceof VendorAdapter.ViewHolder) {
            VendorAdapter.ViewHolder holder = (VendorAdapter.ViewHolder) view.getTag();
            holder.smooth.toggle();
        }


        SmoothCheckBox checkBox = (SmoothCheckBox) view.getTag(R.id.smoothie);

        int pos = compareIndex(icdat);
        if (pos == -1){
            app.selecteddrinks.add(icdat);
        } else {
            app.selecteddrinks.remove(pos);
        }

        StyleableToast JustFooddiamonds = new StyleableToast(view.getContext(), drinksnames[position] + " " + isCheckedOrNot(checkBox), Toast.LENGTH_SHORT);
        JustFooddiamonds.setBackgroundColor(Color.parseColor("#80CBC4"));
        JustFooddiamonds.setTextColor(Color.WHITE);
        JustFooddiamonds.show();



//        String mealSelected = "Selected Drinks are:  ";
//
//        for (int me = 0; me < ShowInThis.getCount(); me++) {
//            if (ShowInThis.isItemChecked(me)) {
//                mealSelected += icdat.getDrinkname() + ", ";
//            }
//
//        }
//      //  itemsBeenSelected.setVisibility(View.VISIBLE);
//        itemsBeenSelected.setText(mealSelected);
//
//        final int checkedCount = ShowInThis.getCheckedItemCount();
//
//        if (checkedCount < 2) {
//            pleaseWork.setText(checkedCount + " item Selected" + "");
//            vendorAdapter.toggleSelection(position);
//        } else if (checkedCount > 1) {
//            pleaseWork.setText(checkedCount + " items Selected" + "");
//            vendorAdapter.toggleSelection(position);
//        }
//        vendorAdapter.notifyDataSetChanged();
    }

    private int compareIndex(Icdat icdat){
        int ounje = -1;
        for(int food = 0; food < app.selecteddrinks.size(); food++){
            Icdat dweezy = (Icdat) app.selecteddrinks.get(food);
            if(dweezy.getDrinkname().equals(icdat.getDrinkname())){
                ounje = food;
            }
        }
        return ounje;
    }

    private String isCheckedOrNot(SmoothCheckBox checkbox) {
        if(checkbox.isChecked())
            return "is selected";
        else
            return "is not selected";
    }

    public void OCAddorRemove(View view) {
        FragmentManager AorRmanager = getFragmentManager();
        UpdateItems reveal = new UpdateItems();
        reveal.show(AorRmanager, "UpdateItems");
    }

    public void OCDynamicPlateCount(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(VendorActivity.this);
        builder.setTitle("Choose the slightest volume of items available");
        LayoutInflater inflater = VendorActivity.this.getLayoutInflater();
        final View view = inflater.inflate(R.layout.va_dynamic_platecount, null);
        builder.setView(view);

        radioGroup = view.findViewById(R.id.radiohead);
        radioGroup.setOnCheckedChangeListener(this);

        oneissmalljoor = view.findViewById(R.id.one);
        twook = view.findViewById(R.id.two);
        threeok = view.findViewById(R.id.three);
        fourok = view.findViewById(R.id.four);
        fiveok = view.findViewById(R.id.five);
        sixok = view.findViewById(R.id.six);
        sevenok = view.findViewById(R.id.seven);
        eightok = view.findViewById(R.id.eight);
        nineok = view.findViewById(R.id.nine);
        tenok = view.findViewById(R.id.ten);
        elevenok = view.findViewById(R.id.eleven);
        twelveok = view.findViewById(R.id.twelve);
        thirteenok = view.findViewById(R.id.thirteen);
        fourteenok = view.findViewById(R.id.fourteen);
        fifteenok = view.findViewById(R.id.fifteen);
        sixteenok = view.findViewById(R.id.sixteen);
        seventeenok = view.findViewById(R.id.seventeen);
        eighteenok = view.findViewById(R.id.eighteen);
        nineteenok = view.findViewById(R.id.nineteen);
        twentyok = view.findViewById(R.id.twenty);
        twentyoneok = view.findViewById(R.id.twentyone);
        twentytwook = view.findViewById(R.id.twentytwo);
        twentythreeok = view.findViewById(R.id.twentythree);
        twentyfourok = view.findViewById(R.id.twentyfour);
        twentyfiveok = view.findViewById(R.id.twentyfive);
        twentysixok = view.findViewById(R.id.twentysix);
        twentysevenok = view.findViewById(R.id.twentyseven);
        twentyeightok = view.findViewById(R.id.twentyeight);
        twentynineok = view.findViewById(R.id.twentynine);
        thirtyisenoughjoor = view.findViewById(R.id.thirty);

        if (MyOkPlatesPrefences.getBoolean(ONE_KITCHEN_KEY_RECALL, false))
            oneissmalljoor.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWO_SITTINGROOM_KEY_RECALL, false))
            twook.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(THREE_VISITORROOM_KEY_RECALL, false))
            threeok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, false))
            fourok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FIVE_CLASSROOM_KEY_RECALL, false))
            fiveok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SIX_BOARDROOM_KEY_RECALL, false))
            sixok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, false))
            sevenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, false))
            eightok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(NINE_CHILDRENROOM_KEY_RECALL, false))
            nineok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TEN_GARAGEROOM_KEY_RECALL, false))
            tenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, false))
            elevenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWELVE_GENTROOM_KEY_RECALL, false))
            twelveok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, false))
            thirteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FOURTEEN_BARROOM_KEY_RECALL, false))
            fourteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FIFTEEN_RICESPOT_KEY_RECALL, false))
            fifteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SIXTEEN_drinksSPOT_KEY_RECALL, false))
            sixteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, false))
            seventeenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, false))
            eighteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, false))
            nineteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, false))
            twentyok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, false))
            twentyoneok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, false))
            twentytwook.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, false))
            twentythreeok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, false))
            twentyfourok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, false))
            twentyfiveok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYSIX_ABRAHAMHALL_KEY_RECALL, false))
            twentysixok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, false))
            twentysevenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, false))
            twentyeightok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, false))
            twentynineok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, false))
            thirtyisenoughjoor.setChecked(true);

        builder.setPositiveButton(R.string.okay, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (oneissmalljoor.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.OneDrinknumber);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "One drink per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twook.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwoDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Two drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (threeok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ThreeDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Three drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (fourok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FourDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Four drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (fiveok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FiveDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Five drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (sixok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SixDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Six drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (sevenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SevenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Seven drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (eightok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.EightDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Eight drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (nineok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.NineDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Nine drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (tenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Ten drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (elevenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ElevenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Eleven drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twelveok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwelveDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twelve drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (thirteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ThirteenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Thirteen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (fourteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FourteenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Fourteen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (fifteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FifteenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Fifteen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (sixteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SixteenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Sixteen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (seventeenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SeventeenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Seventeen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (eighteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.EighteenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Eighteen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (nineteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.NineteenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Nineteen drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentyok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twenty drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentyoneok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyOneDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentyone drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentytwook.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyTwoDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentytwo drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentythreeok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyThreeDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentythree drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentyfourok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyFourDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentyfour drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentyfiveok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyFiveDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentyfive drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentysixok.isChecked()) {

                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentySixDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentysix drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentysevenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentySevenDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentyseven drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentyeightok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyEightDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentyeight drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (twentynineok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyNineDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Twentynine drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
                else if (thirtyisenoughjoor.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ThirtyDrinknumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    StyleableToast APlateNoSelected = new StyleableToast(getApplicationContext(), "Thirty drinks per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    APlateNoSelected.setBackgroundColor(Color.parseColor("#80CBC4"));
                    APlateNoSelected.setTextColor(Color.WHITE);
                    APlateNoSelected.show();
                }
            }
        });
        Dialog dialog = builder.create();
        dialog.show();

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        TakeCareOfPlateSelection();

        switch (checkedId) {
            case R.id.one:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] OneString = getResources().getStringArray(R.array.OneDrinknumber);
                        bundle.putStringArray("diamond", OneString);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#FFFFFF"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));


                break;

            case R.id.two:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwoStrings = getResources().getStringArray(R.array.TwoDrinknumbers);
                        bundle.putStringArray("diamond", TwoStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#FFFFFF"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.three:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ThreeStrings = getResources().getStringArray(R.array.ThreeDrinknumbers);
                        bundle.putStringArray("diamond", ThreeStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#FFFFFF"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.four:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FourStrings = getResources().getStringArray(R.array.FourDrinknumbers);
                        bundle.putStringArray("diamond", FourStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#FFFFFF"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.five:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FiveStrings = getResources().getStringArray(R.array.FiveDrinknumbers);
                        bundle.putStringArray("diamond", FiveStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#FFFFFF"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.six:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SixStrings = getResources().getStringArray(R.array.SixDrinknumbers);
                        bundle.putStringArray("diamond", SixStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#FFFFFF"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.seven:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SevenStrings = getResources().getStringArray(R.array.SevenDrinknumbers);
                        bundle.putStringArray("diamond", SevenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#FFFFFF"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.eight:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] EightStrings = getResources().getStringArray(R.array.EightDrinknumbers);
                        bundle.putStringArray("diamond", EightStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#FFFFFF"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.nine:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] NineStrings = getResources().getStringArray(R.array.NineDrinknumbers);
                        bundle.putStringArray("diamond", NineStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#FFFFFF"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.ten:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TenStrings = getResources().getStringArray(R.array.TenDrinknumbers);
                        bundle.putStringArray("diamond", TenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#FFFFFF"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.eleven:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ElevenStrings = getResources().getStringArray(R.array.ElevenDrinknumbers);
                        bundle.putStringArray("diamond", ElevenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#FFFFFF"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twelve:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwelveStrings = getResources().getStringArray(R.array.TwelveDrinknumbers);
                        bundle.putStringArray("diamond", TwelveStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#FFFFFF"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.thirteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ThirteenStrings = getResources().getStringArray(R.array.ThirteenDrinknumbers);
                        bundle.putStringArray("diamond", ThirteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#FFFFFF"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.fourteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FourteenStrings = getResources().getStringArray(R.array.FourteenDrinknumbers);
                        bundle.putStringArray("diamond", FourteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#FFFFFF"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.fifteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FifteenStrings = getResources().getStringArray(R.array.FifteenDrinknumbers);
                        bundle.putStringArray("diamond", FifteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#FFFFFF"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.sixteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SixteenStrings = getResources().getStringArray(R.array.SixteenDrinknumbers);
                        bundle.putStringArray("diamond", SixteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#FFFFFF"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.seventeen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SeventeenStrings = getResources().getStringArray(R.array.SeventeenDrinknumbers);
                        bundle.putStringArray("diamond", SeventeenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#FFFFFF"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.eighteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] EighteenStrings = getResources().getStringArray(R.array.EighteenDrinknumbers);
                        bundle.putStringArray("diamond", EighteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#FFFFFF"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.nineteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] NineteenStrings = getResources().getStringArray(R.array.NineteenDrinknumbers);
                        bundle.putStringArray("diamond", NineteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#FFFFFF"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twenty:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyStrings = getResources().getStringArray(R.array.TwentyDrinknumbers);
                        bundle.putStringArray("diamond", TwentyStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#FFFFFF"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentyone:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyOneStrings = getResources().getStringArray(R.array.TwentyOneDrinknumbers);
                        bundle.putStringArray("diamond", TwentyOneStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#FFFFFF"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentytwo:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyDiamond = getResources().getStringArray(R.array.TwentyTwoDrinknumbers);
                        bundle.putStringArray("diamond", TwentyDiamond);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#FFFFFF"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentythree:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyThreeStrings = getResources().getStringArray(R.array.TwentyThreeDrinknumbers);
                        bundle.putStringArray("diamond", TwentyThreeStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#FFFFFF"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentyfour:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyFourStrings = getResources().getStringArray(R.array.TwentyFourDrinknumbers);
                        bundle.putStringArray("diamond", TwentyFourStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#FFFFFF"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentyfive:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyFiveStrings = getResources().getStringArray(R.array.TwentyFiveDrinknumbers);
                        bundle.putStringArray("diamond", TwentyFiveStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#FFFFFF"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentysix:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentySixStrings = getResources().getStringArray(R.array.TwentySixDrinknumbers);
                        bundle.putStringArray("diamond", TwentySixStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#FFFFFF"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentyseven:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentySevenStrings = getResources().getStringArray(R.array.TwentySevenDrinknumbers);
                        bundle.putStringArray("diamond", TwentySevenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#FFFFFF"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentyeight:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyEightStrings = getResources().getStringArray(R.array.TwentyEightDrinknumbers);
                        bundle.putStringArray("diamond", TwentyEightStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#FFFFFF"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.twentynine:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyNineStrings = getResources().getStringArray(R.array.TwentyNineDrinknumbers);
                        bundle.putStringArray("diamond", TwentyNineStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#FFFFFF"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#80CBC4"));
                break;

            case R.id.thirty:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ThirtyStrings = getResources().getStringArray(R.array.ThirtyDrinknumbers);
                        bundle.putStringArray("diamond", ThirtyStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#80CBC4"));
                twook.setTextColor(Color.parseColor("#80CBC4"));
                threeok.setTextColor(Color.parseColor("#80CBC4"));
                fourok.setTextColor(Color.parseColor("#80CBC4"));
                fiveok.setTextColor(Color.parseColor("#80CBC4"));
                sixok.setTextColor(Color.parseColor("#80CBC4"));
                sevenok.setTextColor(Color.parseColor("#80CBC4"));
                eightok.setTextColor(Color.parseColor("#80CBC4"));
                nineok.setTextColor(Color.parseColor("#80CBC4"));
                tenok.setTextColor(Color.parseColor("#80CBC4"));
                elevenok.setTextColor(Color.parseColor("#80CBC4"));
                twelveok.setTextColor(Color.parseColor("#80CBC4"));
                thirteenok.setTextColor(Color.parseColor("#80CBC4"));
                fourteenok.setTextColor(Color.parseColor("#80CBC4"));
                fifteenok.setTextColor(Color.parseColor("#80CBC4"));
                sixteenok.setTextColor(Color.parseColor("#80CBC4"));
                seventeenok.setTextColor(Color.parseColor("#80CBC4"));
                eighteenok.setTextColor(Color.parseColor("#80CBC4"));
                nineteenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyok.setTextColor(Color.parseColor("#80CBC4"));
                twentyoneok.setTextColor(Color.parseColor("#80CBC4"));
                twentytwook.setTextColor(Color.parseColor("#80CBC4"));
                twentythreeok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfourok.setTextColor(Color.parseColor("#80CBC4"));
                twentyfiveok.setTextColor(Color.parseColor("#80CBC4"));
                twentysixok.setTextColor(Color.parseColor("#80CBC4"));
                twentysevenok.setTextColor(Color.parseColor("#80CBC4"));
                twentyeightok.setTextColor(Color.parseColor("#80CBC4"));
                twentynineok.setTextColor(Color.parseColor("#80CBC4"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#FFFFFF"));
                break;
        }
    }

    private void TakeCareOfPlateSelection() {
        if (oneissmalljoor.isChecked()) {
            MyOkPlatesEditor.putBoolean(ONE_KITCHEN_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(ONE_KITCHEN_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twook.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWO_SITTINGROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWO_SITTINGROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (threeok.isChecked()) {
            MyOkPlatesEditor.putBoolean(THREE_VISITORROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(THREE_VISITORROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fourok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fiveok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FIVE_CLASSROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FIVE_CLASSROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (sixok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SIX_BOARDROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SIX_BOARDROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (sevenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (eightok.isChecked()) {
            MyOkPlatesEditor.putBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (nineok.isChecked()) {
            MyOkPlatesEditor.putBoolean(NINE_CHILDRENROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(NINE_CHILDRENROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (tenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TEN_GARAGEROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TEN_GARAGEROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (elevenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twelveok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWELVE_GENTROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWELVE_GENTROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (thirteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fourteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FOURTEEN_BARROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FOURTEEN_BARROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fifteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FIFTEEN_RICESPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FIFTEEN_RICESPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (sixteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SIXTEEN_drinksSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SIXTEEN_drinksSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (seventeenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (eighteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (nineteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyoneok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentytwook.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentythreeok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyfourok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyfiveok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentysixok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYSIX_ABRAHAMHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYSIX_ABRAHAMHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentysevenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyeightok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentynineok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (thirtyisenoughjoor.isChecked()) {
            MyOkPlatesEditor.putBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
    }

    public void GetMeNextActivity(View view) {

        Intent obsolete = new Intent(getApplicationContext(), LoginActivity.class);

        Bundle oldbutstill = new Bundle();
        String[] Default = getResources().getStringArray(R.array.DefaultDrinknumber);
        oldbutstill.putStringArray("diamond", Default);
        obsolete.putExtras(oldbutstill);
        oldbutstill.putBoolean(ONE_KITCHEN_KEY_RECALL, true);
        oldbutstill.putBoolean(TWO_SITTINGROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(THREE_VISITORROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FIVE_CLASSROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(SIX_BOARDROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(NINE_CHILDRENROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(TEN_GARAGEROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(TWELVE_GENTROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FOURTEEN_BARROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FIFTEEN_RICESPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(SIXTEEN_drinksSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, true);
        oldbutstill.putBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, true);

        startActivity(obsolete);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("VendorActivity","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("VendorActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("VendorActivity","onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("VendorActivity","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VendorActivity","onDestroy invoked");

    }

    @Override
    public void onBackPressed() {
        logOut();
    }

    public void logOut() {
        AlertDialog.Builder destroyer = new AlertDialog.Builder(this);
        destroyer.setTitle("Log out");
        destroyer.setMessage("This should only be done if your section is over. Are you sure?");
        destroyer.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(VendorActivity.this, Vendor_LoginActivity.class);
                startActivity(intent);
            }
        });
        destroyer.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        destroyer.create().show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.vendor_activityappbarmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.log_out:
                break;
        }
        return true;
    }

    public void mySectionIsOver(MenuItem item) {
        AlertDialog.Builder destroyer = new AlertDialog.Builder(this);
        destroyer.setTitle("Log out");
        destroyer.setMessage("This should only be done if your section is over. Are you sure?");
        destroyer.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(VendorActivity.this, Vendor_LoginActivity.class);
                startActivity(intent);
            }
        });
        destroyer.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        destroyer.create().show();

    }

    @Override
    public void onClick(View v) {
    }

}
