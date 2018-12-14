package com.icdatofcusgmail.luciddrinks.DrinksActivityArchive;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class ChosendrinksFragment extends Fragment {

    static TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th, textView11th, textView12th, textView13th, textView14th, textView15th, textView16th, textView17th, textView18th, textView19th, textView20th, textView21st, textView22nd, textView23rd, textView24th, textView25th, textView26th, textView27th, textView28th, textView29th, textView30th, textView31st, textView32nd, textView33rd, textView34th, textView35th, textView36th, textView37th, textView38th, textView39th, textView40th, textView41st, textView42nd, textView43rd, textView44th, textView45th;
    ImageButton imageButton, imageButton2nd, imageButton3rd, imageButton4th, imageButton5th, imageButton6th, imageButton7th, imageButton8th, imageButton9th, imageButton10th, imageButton11th, imageButton12th, imageButton13th, imageButton14th, imageButton15th, imageButton16th, imageButton17th, imageButton18th, imageButton19th, imageButton20th, imageButton21st, imageButton22nd, imageButton23rd, imageButton24th, imageButton25th, imageButton26th, imageButton27th, imageButton28th, imageButton29th, imageButton30th, imageButton31st, imageButton32nd, imageButton33rd, imageButton34th, imageButton35th, imageButton36th, imageButton37th, imageButton38th, imageButton39th, imageButton40th, imageButton41st, imageButton42nd, imageButton43rd, imageButton44th, imageButton45th;
    OnPriceSetListener onPriceSetListener;

    LucidApplication app;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.drinkmenufragment3_chosendrink, container, false);

        app = LucidApplication.getInstance();

        textView = (Button) view.findViewById(R.id.Istchosenbutton);
        textView.setVisibility(View.GONE);
        textView2nd = (Button) view.findViewById(R.id.Secondchosenbutton);
        textView2nd.setVisibility(View.GONE);
        textView3rd = (Button) view.findViewById(R.id.Thirdchosenbutton);
        textView3rd.setVisibility(View.GONE);
        textView4th = (Button) view.findViewById(R.id.Fourthchosenbutton);
        textView4th.setVisibility(View.GONE);
        textView5th = (Button) view.findViewById(R.id.Fifthchosenbutton);
        textView5th.setVisibility(View.GONE);
        textView6th = (Button) view.findViewById(R.id.Sixthchosenbutton);
        textView6th.setVisibility(View.GONE);
        textView7th = (Button) view.findViewById(R.id.Seventhchosenbutton);
        textView7th.setVisibility(View.GONE);
        textView8th = (Button) view.findViewById(R.id.Eightchosenbutton);
        textView8th.setVisibility(View.GONE);
        textView9th = (Button) view.findViewById(R.id.Ninthchosenbutton);
        textView9th.setVisibility(View.GONE);
        textView10th = (Button) view.findViewById(R.id.Tenthchosenbutton);
        textView10th.setVisibility(View.GONE);
        textView11th = (Button) view.findViewById(R.id.Eleventhchosenbutton);
        textView11th.setVisibility(View.GONE);
        textView12th = (Button) view.findViewById(R.id.Twelvthchosenbutton);
        textView12th.setVisibility(View.GONE);
        textView13th = (Button) view.findViewById(R.id.Thirteenthchosenbutton);
        textView13th.setVisibility(View.GONE);
        textView14th = (Button) view.findViewById(R.id.Fourteenthchosenbutton);
        textView14th.setVisibility(View.GONE);
        textView15th = (Button) view.findViewById(R.id.Fifteenthchosenbutton);
        textView15th.setVisibility(View.GONE);
        textView16th = (Button) view.findViewById(R.id.Sixteenthchosenbutton);
        textView16th.setVisibility(View.GONE);
        textView17th = (Button) view.findViewById(R.id.Seventeenthchosenbutton);
        textView17th.setVisibility(View.GONE);
        textView18th = (Button) view.findViewById(R.id.Eighteenthchosenbutton);
        textView18th.setVisibility(View.GONE);
        textView19th = (Button) view.findViewById(R.id.Nineteenthchosenbutton);
        textView19th.setVisibility(View.GONE);
        textView20th = (Button) view.findViewById(R.id.Twentiethchosenbutton);
        textView20th.setVisibility(View.GONE);
        textView21st = (Button) view.findViewById(R.id.TwentyIstchosenbutton);
        textView21st.setVisibility(View.GONE);
        textView22nd = (Button) view.findViewById(R.id.TwentySecondchosenbutton);
        textView22nd.setVisibility(View.GONE);
        textView23rd = (Button) view.findViewById(R.id.TwentyThirdchosenbutton);
        textView23rd.setVisibility(View.GONE);
        textView24th = (Button) view.findViewById(R.id.TwentyFourthchosenbutton);
        textView24th.setVisibility(View.GONE);
        textView25th = (Button) view.findViewById(R.id.TwentyFifthchosenbutton);
        textView25th.setVisibility(View.GONE);
        textView26th = (Button) view.findViewById(R.id.TwentySixthchosenbutton);
        textView26th.setVisibility(View.GONE);
        textView27th = (Button) view.findViewById(R.id.TwentySeventhchosenbutton);
        textView27th.setVisibility(View.GONE);
        textView28th = (Button) view.findViewById(R.id.TwentyEightchosenbutton);
        textView28th.setVisibility(View.GONE);
        textView29th = (Button) view.findViewById(R.id.TwentyNinthchosenbutton);
        textView29th.setVisibility(View.GONE);
        textView30th = (Button) view.findViewById(R.id.Thirtiethchosenbutton);
        textView30th.setVisibility(View.GONE);
        textView31st = (Button) view.findViewById(R.id.ThirtyIstchosenbutton);
        textView31st.setVisibility(View.GONE);
        textView32nd = (Button) view.findViewById(R.id.ThirtySecondchosenbutton);
        textView32nd.setVisibility(View.GONE);
        textView33rd = (Button) view.findViewById(R.id.ThirtyThirdchosenbutton);
        textView33rd.setVisibility(View.GONE);
        textView34th = (Button) view.findViewById(R.id.ThirtyFourthchosenbutton);
        textView34th.setVisibility(View.GONE);
        textView35th = (Button) view.findViewById(R.id.ThirtyFifthchosenbutton);
        textView35th.setVisibility(View.GONE);
        textView36th = (Button) view.findViewById(R.id.ThirtySixthchosenbutton);
        textView36th.setVisibility(View.GONE);
        textView37th = (Button) view.findViewById(R.id.ThirtySeventhchosenbutton);
        textView37th.setVisibility(View.GONE);
        textView38th = (Button) view.findViewById(R.id.ThirtyEighthchosenbutton);
        textView38th.setVisibility(View.GONE);
        textView39th = (Button) view.findViewById(R.id.ThirtyNinthchosenbutton);
        textView39th.setVisibility(View.GONE);
        textView40th = (Button) view.findViewById(R.id.Fourtiethchosenbutton);
        textView40th.setVisibility(View.GONE);
        textView41st = (Button) view.findViewById(R.id.FourtyOnechosenbutton);
        textView41st.setVisibility(View.GONE);
        textView42nd = (Button) view.findViewById(R.id.FourtyTwochosenbutton);
        textView42nd.setVisibility(View.GONE);
        textView43rd = (Button) view.findViewById(R.id.FourtyThreechosenbutton);
        textView43rd.setVisibility(View.GONE);
        textView44th = (Button) view.findViewById(R.id.FourtyFourchosenbutton);
        textView44th.setVisibility(View.GONE);
        textView45th = (Button) view.findViewById(R.id.FourtyFivechosenbutton);
        textView45th.setVisibility(View.GONE);
        


        imageButton = view.findViewById(R.id.Istchosendeletebutton);
        imageButton.setVisibility(View.GONE);
        imageButton2nd = view.findViewById(R.id.Secondchosendeletebutton);
        imageButton2nd.setVisibility(View.GONE);
        imageButton3rd = view.findViewById(R.id.Thirdchosendeletebutton);
        imageButton3rd.setVisibility(View.GONE);
        imageButton4th = view.findViewById(R.id.Fourthchosendeletebutton);
        imageButton4th.setVisibility(View.GONE);
        imageButton5th = view.findViewById(R.id.Fifthchosendeletebutton);
        imageButton5th.setVisibility(View.GONE);
        imageButton6th = view.findViewById(R.id.Sixthchosendeletebutton);
        imageButton6th.setVisibility(View.GONE);
        imageButton7th = view.findViewById(R.id.Seventhchosendeletebutton);
        imageButton7th.setVisibility(View.GONE);
        imageButton8th = view.findViewById(R.id.Eightchosendeletebutton);
        imageButton8th.setVisibility(View.GONE);
        imageButton9th = view.findViewById(R.id.Ninthchosendeleltebutton);
        imageButton9th.setVisibility(View.GONE);
        imageButton10th = view.findViewById(R.id.Tenthchosendeletebutton);
        imageButton10th.setVisibility(View.GONE);
        imageButton11th = view.findViewById(R.id.Eleventhchosendeleltebutton);
        imageButton11th.setVisibility(View.GONE);
        imageButton12th = view.findViewById(R.id.Twelvthchosendeletebutton);
        imageButton12th.setVisibility(View.GONE);
        imageButton13th = view.findViewById(R.id.Thirteenthchosendeleltebutton);
        imageButton13th.setVisibility(View.GONE);
        imageButton14th = view.findViewById(R.id.Fourteenthchosendeletebutton);
        imageButton14th.setVisibility(View.GONE);
        imageButton15th = view.findViewById(R.id.Fifteenthchosendeleltebutton);
        imageButton15th.setVisibility(View.GONE);
        imageButton16th = view.findViewById(R.id.Sixteenthchosendeletebutton);
        imageButton16th.setVisibility(View.GONE);
        imageButton17th = view.findViewById(R.id.Seventeenthchosendeleltebutton);
        imageButton17th.setVisibility(View.GONE);
        imageButton18th = view.findViewById(R.id.Eighteenthchosendeletebutton);
        imageButton18th.setVisibility(View.GONE);
        imageButton19th = view.findViewById(R.id.Nineteenthchosendeleltebutton);
        imageButton19th.setVisibility(View.GONE);
        imageButton20th = view.findViewById(R.id.Twentiethchosendeletebutton);
        imageButton20th.setVisibility(View.GONE);

        imageButton21st = view.findViewById(R.id.TwentyIstchosendeletebutton);
        imageButton21st.setVisibility(View.GONE);
        imageButton22nd = view.findViewById(R.id.TwentySecondchosendeletebutton);
        imageButton22nd.setVisibility(View.GONE);
        imageButton23rd = view.findViewById(R.id.TwentyThirdchosendeletebutton);
        imageButton23rd.setVisibility(View.GONE);
        imageButton24th = view.findViewById(R.id.TwentyFourthchosendeletebutton);
        imageButton24th.setVisibility(View.GONE);
        imageButton25th = view.findViewById(R.id.TwentyFifthchosendeletebutton);
        imageButton25th.setVisibility(View.GONE);
        imageButton26th = view.findViewById(R.id.TwentySixthchosendeletebutton);
        imageButton26th.setVisibility(View.GONE);
        imageButton27th = view.findViewById(R.id.TwentySeventhchosendeletebutton);
        imageButton27th.setVisibility(View.GONE);
        imageButton28th = view.findViewById(R.id.TwentyEightchosendeletebutton);
        imageButton28th.setVisibility(View.GONE);
        imageButton29th = view.findViewById(R.id.TwentyNinthchosendeleltebutton);
        imageButton29th.setVisibility(View.GONE);
        imageButton30th = view.findViewById(R.id.Thirtiethchosendeletebutton);
        imageButton30th.setVisibility(View.GONE);
        imageButton31st = view.findViewById(R.id.ThirtyIstchosendeleltebutton);
        imageButton31st.setVisibility(View.GONE);
        imageButton32nd = view.findViewById(R.id.ThirtySecondchosendeletebutton);
        imageButton32nd.setVisibility(View.GONE);
        imageButton33rd = view.findViewById(R.id.ThirtyThirdchosendeleltebutton);
        imageButton33rd.setVisibility(View.GONE);
        imageButton34th = view.findViewById(R.id.ThirtyFourthchosendeletebutton);
        imageButton34th.setVisibility(View.GONE);
        imageButton35th = view.findViewById(R.id.ThirtyFifthchosendeleltebutton);
        imageButton35th.setVisibility(View.GONE);
        imageButton36th = view.findViewById(R.id.ThirtySixthchosendeletebutton);
        imageButton36th.setVisibility(View.GONE);
        imageButton37th = view.findViewById(R.id.ThirtySeventhchosendeleltebutton);
        imageButton37th.setVisibility(View.GONE);
        imageButton38th = view.findViewById(R.id.ThirtyEighthchosendeletebutton);
        imageButton38th.setVisibility(View.GONE);
        imageButton39th = view.findViewById(R.id.ThirtyNinthchosendeleltebutton);
        imageButton39th.setVisibility(View.GONE);
        imageButton40th = view.findViewById(R.id.Fourtiethchosendeletebutton);
        imageButton40th.setVisibility(View.GONE);
        imageButton41st = view.findViewById(R.id.FourtyOnechosendeleltebutton);
        imageButton41st.setVisibility(View.GONE);
        imageButton42nd = view.findViewById(R.id.FourtyTwochosendeletebutton);
        imageButton42nd.setVisibility(View.GONE);
        imageButton43rd = view.findViewById(R.id.FourtyThreechosendeleltebutton);
        imageButton43rd.setVisibility(View.GONE);
        imageButton44th = view.findViewById(R.id.FourtyFourchosendeletebutton);
        imageButton44th.setVisibility(View.GONE);
        imageButton45th = view.findViewById(R.id.FourtyFivechosendeleltebutton);
        imageButton45th.setVisibility(View.GONE);
        

        return view;
    }

    interface OnPriceSetListener {
        void setPrice(String price);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onPriceSetListener = (OnPriceSetListener) activity;
        } catch (Exception ignored) {
        }
    }

    public void updateInfo(String name) {

        imageButtonAction();

        contentCanMirinda(name);
        contentGlassMirinda(name);
        contentPetMirinda(name);
        contentCanPepsi(name);
        contentGlassPepsi(name);
        contentPetPepsi(name);
        contentCanSavanna(name);
        contentPetSavanna(name);
        contentCanSevenUp(name);
        contentGlassSevenUp(name);
        contentPetSevenUp(name);
        contentSmallGlassSprite(name);
        contentBigGlassSprite(name);
        contentPetSprite(name);
        contentPetTeem(name);
        contentPetLacasera(name);
        contentPetSmoov(name);
        contentSmallGlassCoke(name);
        contentBigGlassCoke(name);
        contentSmallPetCoke(name);
        contentBigPetCoke(name);
        contentSmallGlassFanta(name);
        contentBigGlassFanta(name);
        contentSmallPetFanta(name);
        contentBigPetFanta(name);
        contentSachetWater(name);
        contentPetWater(name);
        contentCanMaltaGold(name);
        contentCanMaltina(name);
        contentCanHimalt(name);
        contentCanMataGuinness(name);
        contentFiveAliveJuice(name);
        contentSmallHollandiaJuice(name);
        contentBigHollandiaJuice(name);
        contentSmallChiExoticJuice(name);
        contentBigChiExoticJuice(name);
        contentSmallChivitaJuice(name);
        contentBigChivitaJuice(name);
        contentSmallHappyHourJuice(name);
        contentBigHappyHourJuice(name);
        contentSmallGlassSchweppes(name);
        contentBigGlassSchweppes(name);
        contentPetZobo(name);
        contentPetSchweppes(name);
        contentPetFiveAlive(name);


      //  DrinksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
    }



    public void imageButtonAction() {


        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
                imageButton.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("0");
                if (!imageButton.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2nd.setVisibility(View.GONE);
                imageButton2nd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView2nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("1");
                if (!imageButton2nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3rd.setVisibility(View.GONE);
                imageButton3rd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView3rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("2");
                if (!imageButton3rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4th.setVisibility(View.GONE);
                imageButton4th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView4th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("3");
                if (!imageButton4th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5th.setVisibility(View.GONE);
                imageButton5th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView5th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("4");
                if (!imageButton5th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView6th.setVisibility(View.GONE);
                imageButton6th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView6th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("5");
                if (!imageButton6th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton7th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView7th.setVisibility(View.GONE);
                imageButton7th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView7th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("6");
                if (!imageButton7th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton8th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView8th.setVisibility(View.GONE);
                imageButton8th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView8th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("7");
                if (!imageButton8th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton9th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView9th.setVisibility(View.GONE);
                imageButton9th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView9th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("8");
                if (!imageButton9th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton10th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView10th.setVisibility(View.GONE);
                imageButton10th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView10th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("9");
                if (!imageButton10th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton11th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView11th.setVisibility(View.GONE);
                imageButton11th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView11th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("10");
                if (!imageButton11th.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton12th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView12th.setVisibility(View.GONE);
                imageButton12th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView12th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("11");
                if (!imageButton12th.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton2nd.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton13th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView13th.setVisibility(View.GONE);
                imageButton13th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView13th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("12");
                if (!imageButton13th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton3rd.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton14th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView14th.setVisibility(View.GONE);
                imageButton14th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView14th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("13");
                if (!imageButton14th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton4th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton15th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView15th.setVisibility(View.GONE);
                imageButton15th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView15th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("14");
                if (!imageButton15th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton5th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton16th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView16th.setVisibility(View.GONE);
                imageButton16th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView16th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("15");
                if (!imageButton16th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton17th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView17th.setVisibility(View.GONE);
                imageButton17th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView17th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("16");
                if (!imageButton17th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton7th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton18th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView18th.setVisibility(View.GONE);
                imageButton18th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView18th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("17");
                if (!imageButton18th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton8th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton19th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView19th.setVisibility(View.GONE);
                imageButton19th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView19th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("18");
                if (!imageButton19th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton9th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton20th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView20th.setVisibility(View.GONE);
                imageButton20th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView20th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("19");
                if (!imageButton20th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });





        imageButton21st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView21st.setVisibility(View.GONE);
                imageButton21st.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView21st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("20");
                if (!imageButton21st.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown()  || imageButton.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton22nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView22nd.setVisibility(View.GONE);
                imageButton22nd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView22nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("21");
                if (!imageButton22nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton2nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton23rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView23rd.setVisibility(View.GONE);
                imageButton23rd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView23rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("22");
                if (!imageButton23rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton3rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton24th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView24th.setVisibility(View.GONE);
                imageButton24th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView24th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("23");
                if (!imageButton24th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton4th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton25th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView25th.setVisibility(View.GONE);
                imageButton25th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView25th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("24");
                if (!imageButton25th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton5th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton26th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView26th.setVisibility(View.GONE);
                imageButton26th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView26th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("25");
                if (!imageButton26th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton6th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton27th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView27th.setVisibility(View.GONE);
                imageButton27th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView27th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("26");
                if (!imageButton27th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()  || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton7th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton28th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView28th.setVisibility(View.GONE);
                imageButton28th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView28th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("27");
                if (!imageButton28th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton8th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton29th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView29th.setVisibility(View.GONE);
                imageButton29th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView29th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("28");
                if (!imageButton29th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton9th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton30th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView30th.setVisibility(View.GONE);
                imageButton30th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView30th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("29");
                if (!imageButton30th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() || imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton10th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton31st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView31st.setVisibility(View.GONE);
                imageButton31st.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView31st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("30");
                if (!imageButton31st.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton11th.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton32nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView32nd.setVisibility(View.GONE);
                imageButton32nd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView32nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("31");
                if (!imageButton32nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton2nd.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton12th.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton33rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView33rd.setVisibility(View.GONE);
                imageButton33rd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView33rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("32");
                if (!imageButton33rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton3rd.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton13th.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton34th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView34th.setVisibility(View.GONE);
                imageButton34th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView34th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("33");
                if (!imageButton34th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton4th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton14th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton35th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView35th.setVisibility(View.GONE);
                imageButton35th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView35th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("34");
                if (!imageButton35th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton5th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton15th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton36th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView36th.setVisibility(View.GONE);
                imageButton36th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView36th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("35");
                if (!imageButton36th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton6th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton16th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton37th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView37th.setVisibility(View.GONE);
                imageButton37th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView37th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("36");
                if (!imageButton37th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton7th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton17th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton38th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView38th.setVisibility(View.GONE);
                imageButton38th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView38th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("37");
                if (!imageButton38th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton8th.isShown()
                        || imageButton19th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton18th.isShown() || imageButton39th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton39th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView39th.setVisibility(View.GONE);
                imageButton39th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView39th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("38");
                if (!imageButton39th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton9th.isShown() || imageButton20th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton19th.isShown()
                        || imageButton40th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton40th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView40th.setVisibility(View.GONE);
                imageButton40th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView40th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("39");
                if (!imageButton40th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });


        imageButton41st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView41st.setVisibility(View.GONE);
                imageButton41st.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView41st.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("40");
                if (!imageButton41st.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton40th.isShown() || imageButton42nd.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton42nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView42nd.setVisibility(View.GONE);
                imageButton42nd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView42nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("41");
                if (!imageButton42nd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton40th.isShown()
                        || imageButton43rd.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton43rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView43rd.setVisibility(View.GONE);
                imageButton43rd.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView43rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("42");
                if (!imageButton43rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton40th.isShown() || imageButton44th.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton44th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView44th.setVisibility(View.GONE);
                imageButton44th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView44th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("43");
                if (!imageButton44th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton40th.isShown() || imageButton43rd.isShown() || imageButton45th.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton45th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView45th.setVisibility(View.GONE);
                imageButton45th.setVisibility(View.GONE);
                // DrinksmenuActivity.Pcount.setEnabled(false);
                DrinksmenuActivity.Purchase.setEnabled(false);
                String Price = textView45th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("44");
                if (!imageButton45th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown() || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown() ||imageButton11th.isShown() || imageButton12th.isShown()
                        || imageButton13th.isShown() || imageButton14th.isShown() || imageButton15th.isShown()
                        || imageButton16th.isShown() || imageButton17th.isShown() || imageButton18th.isShown()
                        || imageButton19th.isShown() || imageButton10th.isShown() || imageButton21st.isShown()
                        || imageButton22nd.isShown() || imageButton23rd.isShown() || imageButton24th.isShown()
                        || imageButton25th.isShown() || imageButton26th.isShown() || imageButton27th.isShown()
                        || imageButton28th.isShown() || imageButton29th.isShown() || imageButton30th.isShown()
                        || imageButton31st.isShown() || imageButton32nd.isShown() || imageButton33rd.isShown()
                        || imageButton34th.isShown() || imageButton35th.isShown() || imageButton36th.isShown()
                        || imageButton37th.isShown() || imageButton38th.isShown() || imageButton39th.isShown()
                        || imageButton20th.isShown() || imageButton41st.isShown() || imageButton42nd.isShown()
                        || imageButton40th.isShown() || imageButton44th.isShown() || imageButton43rd.isShown()) {
                    DrinksmenuActivity.Pcount.setEnabled(true);
                    DrinksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });



    }


    public void contentCanMirinda(String name) {

        if (name.contentEquals("150 NAIRA C. MIRINDA")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. MIRINDA(2)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. MIRINDA(3)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. MIRINDA(4)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. MIRINDA(5)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. MIRINDA(5)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. MIRINDA(6)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. MIRINDA(7)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. MIRINDA(8)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA C. MIRINDA(9)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA C. MIRINDA(10)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. MIRINDA(11)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. MIRINDA(12)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. MIRINDA(13)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA C. MIRINDA(14)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA C. MIRINDA(15)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. MIRINDA(16)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. MIRINDA(17)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. MIRINDA(18)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA C. MIRINDA(19)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA C. MIRINDA(20)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        }
    }

    public void contentGlassMirinda(String name) {

        if (name.contentEquals("80 NAIRA G. MIRINDA")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA G. MIRINDA(2)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA G. MIRINDA(3)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA G. MIRINDA(4)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA G. MIRINDA(5)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA G. MIRINDA(5)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA G. MIRINDA(6)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA G. MIRINDA(7)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA G. MIRINDA(8)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA G. MIRINDA(9)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA G. MIRINDA(10)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA G. MIRINDA(11)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA G. MIRINDA(12)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA G. MIRINDA(13)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA G. MIRINDA(14)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA G. MIRINDA(15)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA G. MIRINDA(16)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA G. MIRINDA(17)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA G. MIRINDA(18)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA G. MIRINDA(19)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA G. MIRINDA(20)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetMirinda(String name) {

        if (name.contentEquals("100 NAIRA PET MIRINDA")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PET MIRINDA(2)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PET MIRINDA(3)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET MIRINDA(4)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA PET MIRINDA(5)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA PET MIRINDA(5)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET MIRINDA(6)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA PET MIRINDA(7)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA PET MIRINDA(8)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 NAIRA PET MIRINDA(9)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1000 NAIRA PET MIRINDA(10)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA PET MIRINDA(11)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET MIRINDA(12)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA PET MIRINDA(13)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1400 NAIRA PET MIRINDA(14)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA PET MIRINDA(15)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET MIRINDA(16)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA PET MIRINDA(17)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA PET MIRINDA(18)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1900 NAIRA PET MIRINDA(19)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 NAIRA PET MIRINDA(20)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanPepsi(String name) {

        if (name.contentEquals("150 NAIRA CAN PEPSI")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA CAN PEPSI(2)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA CAN PEPSI(3)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA CAN PEPSI(4)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA CAN PEPSI(5)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA CAN PEPSI(5)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA CAN PEPSI(6)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA CAN PEPSI(7)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA CAN PEPSI(8)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA CAN PEPSI(9)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA CAN PEPSI(10)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA CAN PEPSI(11)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA CAN PEPSI(12)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA CAN PEPSI(13)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA CAN PEPSI(14)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA CAN PEPSI(15)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA CAN PEPSI(16)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA CAN PEPSI(17)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA CAN PEPSI(18)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA CAN PEPSI(19)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA CAN PEPSI(20)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        }
    }

    public void contentGlassPepsi(String name) {

        if (name.contentEquals("80 NAIRA GLASS PEPSI")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA GLASS PEPSI(2)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA GLASS PEPSI(3)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA GLASS PEPSI(4)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA GLASS PEPSI(5)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA GLASS PEPSI(5)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA GLASS PEPSI(6)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA GLASS PEPSI(7)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA GLASS PEPSI(8)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA GLASS PEPSI(9)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA GLASS PEPSI(10)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA GLASS PEPSI(11)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA GLASS PEPSI(12)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA GLASS PEPSI(13)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA GLASS PEPSI(14)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA GLASS PEPSI(15)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA GLASS PEPSI(16)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA GLASS PEPSI(17)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA GLASS PEPSI(18)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA GLASS PEPSI(19)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA GLASS PEPSI(20)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetPepsi(String name) {

        if (name.contentEquals("100 NAIRA PET PEPSI")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PET PEPSI(2)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PET PEPSI(3)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET PEPSI(4)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PET PEPSI(5)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PET PEPSI(5)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET PEPSI(6)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA PET PEPSI(7)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA PET PEPSI(8)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA PET PEPSI(9)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA PET PEPSI(10)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA PET PEPSI(11)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET PEPSI(12)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA PET PEPSI(13)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA PET PEPSI(14)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA PET PEPSI(15)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET PEPSI(16)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA PET PEPSI(17)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA PET PEPSI(18)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA PET PEPSI(19)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA PET PEPSI(20)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanSavanna(String name) {

        if (name.contentEquals("150 NAIRA C. SAVANNA")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. SAVANNA(2)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. SAVANNA(3)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. SAVANNA(4)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA C. SAVANNA(5)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA C. SAVANNA(5)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. SAVANNA(6)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. SAVANNA(7)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. SAVANNA(8)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1350 NAIRA C. SAVANNA(9)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA C. SAVANNA(10)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. SAVANNA(11)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. SAVANNA(12)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. SAVANNA(13)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2100 NAIRA C. SAVANNA(14)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2250 NAIRA C. SAVANNA(15)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. SAVANNA(16)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. SAVANNA(17)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. SAVANNA(18)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2850 NAIRA C. SAVANNA(19)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3000 NAIRA C. SAVANNA(20)")) {
            textView7th.setText(name);
            textView7th.setVisibility(View.VISIBLE);
            imageButton7th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetSavanna(String name) {

        if (name.contentEquals("100 NAIRA P. SAVANNA")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA P. SAVANNA(2)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA P. SAVANNA(3)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA P. SAVANNA(4)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA P. SAVANNA(5)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA P. SAVANNA(5)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA P. SAVANNA(6)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA P. SAVANNA(7)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA P. SAVANNA(8)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA P. SAVANNA(9)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1000 NAIRA P. SAVANNA(10)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA P. SAVANNA(11)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA P. SAVANNA(12)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA P. SAVANNA(13)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1400 NAIRA P. SAVANNA(14)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA P. SAVANNA(15)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA P. SAVANNA(16)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA P. SAVANNA(17)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA P. SAVANNA(18)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1900 NAIRA P. SAVANNA(19)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 NAIRA P. SAVANNA(20)")) {
            textView8th.setText(name);
            textView8th.setVisibility(View.VISIBLE);
            imageButton8th.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanSevenUp(String name) {

        if (name.contentEquals("150 NAIRA C. SEVENUP")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. SEVENUP(2)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. SEVENUP(3)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. SEVENUP(4)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. SEVENUP(5)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. SEVENUP(5)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. SEVENUP(6)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. SEVENUP(7)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. SEVENUP(8)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA C. SEVENUP(9)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA C. SEVENUP(10)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. SEVENUP(11)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. SEVENUP(12)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. SEVENUP(13)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA C. SEVENUP(14)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA C. SEVENUP(15)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. SEVENUP(16)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. SEVENUP(17)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. SEVENUP(18)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA C. SEVENUP(19)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA C. SEVENUP(20)")) {
            textView9th.setText(name);
            textView9th.setVisibility(View.VISIBLE);
            imageButton9th.setVisibility(View.VISIBLE);
        }
    }

    public void contentGlassSevenUp(String name) {

        if (name.contentEquals("80 NAIRA G. SEVENUP")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA G. SEVENUP(2)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA G. SEVENUP(3)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA G. SEVENUP(4)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 NAIRA G. SEVENUP(5)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 NAIRA G. SEVENUP(5)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA G. SEVENUP(6)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA G. SEVENUP(7)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA G. SEVENUP(8)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("720 NAIRA G. SEVENUP(9)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("800 NAIRA G. SEVENUP(10)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA G. SEVENUP(11)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA G. SEVENUP(12)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA G. SEVENUP(13)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1120 NAIRA G. SEVENUP(14)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1200 NAIRA G. SEVENUP(15)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA G. SEVENUP(16)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA G. SEVENUP(17)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA G. SEVENUP(18)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1520 NAIRA G. SEVENUP(19)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1600 NAIRA G. SEVENUP(20)")) {
            textView10th.setText(name);
            textView10th.setVisibility(View.VISIBLE);
            imageButton10th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetSevenUp(String name) {

        if (name.contentEquals("100 NAIRA P. SEVENUP")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA P. SEVENUP(2)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA P. SEVENUP(3)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA P. SEVENUP(4)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA P. SEVENUP(5)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA P. SEVENUP(5)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA P. SEVENUP(6)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA P. SEVENUP(7)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA P. SEVENUP(8)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA P. SEVENUP(9)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA P. SEVENUP(10)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA P. SEVENUP(11)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA P. SEVENUP(12)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA P. SEVENUP(13)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA P. SEVENUP(14)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA P. SEVENUP(15)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA P. SEVENUP(16)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA P. SEVENUP(17)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA P. SEVENUP(18)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA P. SEVENUP(19)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA P. SEVENUP(20)")) {
            textView11th.setText(name);
            textView11th.setVisibility(View.VISIBLE);
            imageButton11th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallGlassSprite(String name) {

        if (name.contentEquals("80 NAIRA SMALL G. SPRITE")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA SMALL G. SPRITE(2)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA SMALL G. SPRITE(3)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA SMALL G. SPRITE(4)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. SPRITE(5)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. SPRITE(5)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA SMALL G. SPRITE(6)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA SMALL G. SPRITE(7)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA SMALL G. SPRITE(8)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA SMALL G. SPRITE(9)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL G. SPRITE(10)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA SMALL G. SPRITE(11)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA SMALL G. SPRITE(12)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA SMALL G. SPRITE(13)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA SMALL G. SPRITE(14)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL G. SPRITE(15)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA SMALL G. SPRITE(16)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA SMALL G. SPRITE(17)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA SMALL G. SPRITE(18)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA SMALL G. SPRITE(19)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SMALL G. SPRITE(20)")) {
            textView12th.setText(name);
            textView12th.setVisibility(View.VISIBLE);
            imageButton12th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigGlassSprite(String name) {

        if (name.contentEquals("100 NAIRA BIG G. SPRITE")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BIG G. SPRITE(2)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BIG G. SPRITE(3)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA BIG G. SPRITE(4)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA BIG G. SPRITE(5)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA BIG G. SPRITE(5)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG G. SPRITE(6)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA BIG G. SPRITE(7)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA BIG G. SPRITE(8)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 NAIRA BIG G. SPRITE(9)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1000 NAIRA BIG G. SPRITE(10)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA BIG G. SPRITE(11)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG G. SPRITE(12)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA BIG G. SPRITE(13)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1400 NAIRA BIG G. SPRITE(14)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA BIG G. SPRITE(15)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA BIG G. SPRITE(16)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA BIG G. SPRITE(17)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG G. SPRITE(18)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1900 NAIRA BIG G. SPRITE(19)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 NAIRA BIG G. SPRITE(20)")) {
            textView13th.setText(name);
            textView13th.setVisibility(View.VISIBLE);
            imageButton13th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetSprite(String name) {

        if (name.contentEquals("100 NAIRA PET SPRITE")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PET SPRITE(2)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PET SPRITE(3)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET SPRITE(4)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PET SPRITE(5)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PET SPRITE(5)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET SPRITE(6)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA PET SPRITE(7)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA PET SPRITE(8)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA PET SPRITE(9)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA PET SPRITE(10)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA PET SPRITE(11)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET SPRITE(12)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA PET SPRITE(13)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA PET SPRITE(14)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA PET SPRITE(15)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET SPRITE(16)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA PET SPRITE(17)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA PET SPRITE(18)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA PET SPRITE(19)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA PET SPRITE(20)")) {
            textView14th.setText(name);
            textView14th.setVisibility(View.VISIBLE);
            imageButton14th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetTeem(String name) {

        if (name.contentEquals("100 NAIRA PET TEEM")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PET TEEM(2)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PET TEEM(3)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET TEEM(4)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PET TEEM(5)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA PET TEEM(5)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET TEEM(6)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA PET TEEM(7)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA PET TEEM(8)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA PET TEEM(9)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA PET TEEM(10)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA PET TEEM(11)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET TEEM(12)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA PET TEEM(13)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA PET TEEM(14)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA PET TEEM(15)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET TEEM(16)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA PET TEEM(17)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA PET TEEM(18)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA PET TEEM(19)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA PET TEEM(20)")) {
            textView15th.setText(name);
            textView15th.setVisibility(View.VISIBLE);
            imageButton15th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetLacasera(String name) {

        if (name.contentEquals("100 NAIRA PET LACASERA")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PET LACASERA(2)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 NAIRA PET LACASERA(3)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("400 NAIRA PET LACASERA(4)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA PET LACASERA(5)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA PET LACASERA(5)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET LACASERA(6)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("700 NAIRA PET LACASERA(7)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("800 NAIRA PET LACASERA(8)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 NAIRA PET LACASERA(9)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1000 NAIRA PET LACASERA(10)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA PET LACASERA(11)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1200 NAIRA PET LACASERA(12)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1300 NAIRA PET LACASERA(13)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1400 NAIRA PET LACASERA(14)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA PET LACASERA(15)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET LACASERA(16)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1700 NAIRA PET LACASERA(17)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1800 NAIRA PET LACASERA(18)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1900 NAIRA PET LACASERA(19)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 NAIRA PET LACASERA(20)")) {
            textView16th.setText(name);
            textView16th.setVisibility(View.VISIBLE);
            imageButton16th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetSmoov(String name) {

        if (name.contentEquals("150 NAIRA PET SMOOV")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA PET SMOOV(2)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("450 NAIRA PET SMOOV(3)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 NAIRA PET SMOOV(4)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA PET SMOOV(5)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA PET SMOOV(5)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA PET SMOOV(6)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1050 NAIRA PET SMOOV(7)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1200 NAIRA PET SMOOV(8)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1350 NAIRA PET SMOOV(9)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA PET SMOOV(10)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA PET SMOOV(11)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1800 NAIRA PET SMOOV(12)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1950 NAIRA PET SMOOV(13)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2100 NAIRA PET SMOOV(14)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2250 NAIRA PET SMOOV(15)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA PET SMOOV(16)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2550 NAIRA PET SMOOV(17)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2700 NAIRA PET SMOOV(18)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2850 NAIRA PET SMOOV(19)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3000 NAIRA PET SMOOV(20)")) {
            textView17th.setText(name);
            textView17th.setVisibility(View.VISIBLE);
            imageButton17th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallGlassCoke(String name) {

        if (name.contentEquals("80 NAIRA SMALL G. COKE")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA SMALL G. COKE(2)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA SMALL G. COKE(3)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA SMALL G. COKE(4)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. COKE(5)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. COKE(5)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA SMALL G. COKE(6)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA SMALL G. COKE(7)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA SMALL G. COKE(8)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA SMALL G. COKE(9)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL G. COKE(10)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA SMALL G. COKE(11)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA SMALL G. COKE(12)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA SMALL G. COKE(13)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA SMALL G. COKE(14)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL G. COKE(15)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA SMALL G. COKE(16)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA SMALL G. COKE(17)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA SMALL G. COKE(18)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA SMALL G. COKE(19)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SMALL G. COKE(20)")) {
            textView18th.setText(name);
            textView18th.setVisibility(View.VISIBLE);
            imageButton18th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigGlassCoke(String name) {

        if (name.contentEquals("100 NAIRA BIG G. COKE")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BIG G. COKE(2)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BIG G. COKE(3)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA BIG G. COKE(4)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA BIG G. COKE(5)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA BIG G. COKE(5)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG G. COKE(6)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA BIG G. COKE(7)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA BIG G. COKE(8)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA BIG G. COKE(9)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG G. COKE(10)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA BIG G. COKE(11)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG G. COKE(12)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA BIG G. COKE(13)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA BIG G. COKE(14)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG G. COKE(15)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA BIG G. COKE(16)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA BIG G. COKE(17)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG G. COKE(18)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA BIG G. COKE(19)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA BIG G. COKE(20)")) {
            textView19th.setText(name);
            textView19th.setVisibility(View.VISIBLE);
            imageButton19th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallPetCoke(String name) {

        if (name.contentEquals("100 NAIRA SMALL PET COKE")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA SMALL PET COKE(2)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA SMALL PET COKE(3)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL PET COKE(4)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA SMALL PET COKE(5)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA SMALL PET COKE(5)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL PET COKE(6)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA SMALL PET COKE(7)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL PET COKE(8)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA SMALL PET COKE(9)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA SMALL PET COKE(10)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA SMALL PET COKE(11)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL PET COKE(12)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA SMALL PET COKE(13)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA SMALL PET COKE(14)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SMALL PET COKE(15)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SMALL PET COKE(16)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA SMALL PET COKE(17)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SMALL PET COKE(18)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA SMALL PET COKE(19)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA SMALL PET COKE(20)")) {
            textView20th.setText(name);
            textView20th.setVisibility(View.VISIBLE);
            imageButton20th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigPetCoke(String name) {

        if (name.contentEquals("150 NAIRA BIG PET COKE")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BIG PET COKE(2)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA BIG PET COKE(3)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG PET COKE(4)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA BIG PET COKE(5)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA BIG PET COKE(5)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA BIG PET COKE(6)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA BIG PET COKE(7)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG PET COKE(8)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA BIG PET COKE(9)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG PET COKE(10)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA BIG PET COKE(11)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG PET COKE(12)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA BIG PET COKE(13)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA BIG PET COKE(14)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA BIG PET COKE(15)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA BIG PET COKE(16)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA BIG PET COKE(17)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA BIG PET COKE(18)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA BIG PET COKE(19)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA BIG PET COKE(20)")) {
            textView21st.setText(name);
            textView21st.setVisibility(View.VISIBLE);
            imageButton21st.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallGlassFanta(String name) {

        if (name.contentEquals("80 NAIRA SMALL G. FANTA")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA SMALL G. FANTA(2)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA SMALL G. FANTA(3)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA SMALL G. FANTA(4)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. FANTA(5)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. FANTA(5)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA SMALL G. FANTA(6)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA SMALL G. FANTA(7)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA SMALL G. FANTA(8)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA SMALL G. FANTA(9)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL G. FANTA(10)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA SMALL G. FANTA(11)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA SMALL G. FANTA(12)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA SMALL G. FANTA(13)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA SMALL G. FANTA(14)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL G. FANTA(15)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA SMALL G. FANTA(16)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA SMALL G. FANTA(17)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA SMALL G. FANTA(18)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA SMALL G. FANTA(19)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SMALL G. FANTA(20)")) {
            textView22nd.setText(name);
            textView22nd.setVisibility(View.VISIBLE);
            imageButton22nd.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigGlassFanta(String name) {

        if (name.contentEquals("100 NAIRA BIG G. FANTA")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BIG G. FANTA(2)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BIG G. FANTA(3)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA BIG G. FANTA(4)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA BIG G. FANTA(5)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("500 NAIRA BIG G. FANTA(5)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG G. FANTA(6)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA BIG G. FANTA(7)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA BIG G. FANTA(8)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 NAIRA BIG G. FANTA(9)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1000 NAIRA BIG G. FANTA(10)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA BIG G. FANTA(11)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG G. FANTA(12)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA BIG G. FANTA(13)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1400 NAIRA BIG G. FANTA(14)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA BIG G. FANTA(15)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA BIG G. FANTA(16)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA BIG G. FANTA(17)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG G. FANTA(18)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1900 NAIRA BIG G. FANTA(19)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 NAIRA BIG G. FANTA(20)")) {
            textView23rd.setText(name);
            textView23rd.setVisibility(View.VISIBLE);
            imageButton23rd.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallPetFanta(String name) {

        if (name.contentEquals("100 NAIRA SMALL P. FANTA")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA SMALL P. FANTA(2)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA SMALL P. FANTA(3)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL P. FANTA(4)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA SMALL P. FANTA(5)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA SMALL P. FANTA(5)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL P. FANTA(6)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA SMALL P. FANTA(7)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL P. FANTA(8)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA SMALL P. FANTA(9)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA SMALL P. FANTA(10)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA SMALL P. FANTA(11)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL P. FANTA(12)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA SMALL P. FANTA(13)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA SMALL P. FANTA(14)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SMALL P. FANTA(15)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SMALL P. FANTA(16)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA SMALL P. FANTA(17)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SMALL P. FANTA(18)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA SMALL P. FANTA(19)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA SMALL P. FANTA(20)")) {
            textView24th.setText(name);
            textView24th.setVisibility(View.VISIBLE);
            imageButton24th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigPetFanta(String name) {

        if (name.contentEquals("150 NAIRA BIG P. FANTA")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BIG P. FANTA(2)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA BIG P. FANTA(3)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG P. FANTA(4)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA BIG P. FANTA(5)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA BIG P. FANTA(5)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA BIG P. FANTA(6)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA BIG P. FANTA(7)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG P. FANTA(8)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA BIG P. FANTA(9)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG P. FANTA(10)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA BIG P. FANTA(11)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG P. FANTA(12)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA BIG P. FANTA(13)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA BIG P. FANTA(14)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA BIG P. FANTA(15)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA BIG P. FANTA(16)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA BIG P. FANTA(17)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA BIG P. FANTA(18)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA BIG P. FANTA(19)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA BIG P. FANTA(20)")) {
            textView25th.setText(name);
            textView25th.setVisibility(View.VISIBLE);
            imageButton25th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSachetWater(String name) {

        if (name.contentEquals("10 NAIRA PURE WATER")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("20 NAIRA PURE WATER(2)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("30 NAIRA PURE WATER(3)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("40 NAIRA PURE WATER(4)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("50 NAIRA PURE WATER(5)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("50 NAIRA PURE WATER(5)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("60 NAIRA PURE WATER(6)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("70 NAIRA PURE WATER(7)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("80 NAIRA PURE WATER(8)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("90 NAIRA PURE WATER(9)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("100 NAIRA PURE WATER(10)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("110 NAIRA PURE WATER(11)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("120 NAIRA PURE WATER(12)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("130 NAIRA PURE WATER(13)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("140 NAIRA PURE WATER(14)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("150 NAIRA PURE WATER(15)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA PURE WATER(16)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("170 NAIRA PURE WATER(17)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("180 NAIRA PURE WATER(18)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("190 NAIRA PURE WATER(19)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA PURE WATER(20)")) {
            textView26th.setText(name);
            textView26th.setVisibility(View.VISIBLE);
            imageButton26th.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetWater(String name) {

        if (name.contentEquals("60 NAIRA BOTTLE WATER")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("120 NAIRA BOTTLE WATER(2)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("180 NAIRA BOTTLE WATER(3)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA BOTTLE WATER(4)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 NAIRA BOTTLE WATER(5)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("300 NAIRA BOTTLE WATER(5)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("360 NAIRA BOTTLE WATER(6)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("420 NAIRA BOTTLE WATER(7)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA BOTTLE WATER(8)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("540 NAIRA BOTTLE WATER(9)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 NAIRA BOTTLE WATER(10)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("660 NAIRA BOTTLE WATER(11)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA BOTTLE WATER(12)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("780 NAIRA BOTTLE WATER(13)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("840 NAIRA BOTTLE WATER(14)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 NAIRA BOTTLE WATER(15)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA BOTTLE WATER(16)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1020 NAIRA BOTTLE WATER(17)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1080 NAIRA BOTTLE WATER(18)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1140 NAIRA BOTTLE WATER(19)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1200 NAIRA BOTTLE WATER(20)")) {
            textView27th.setText(name);
            textView27th.setVisibility(View.VISIBLE);
            imageButton27th.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanMaltaGold(String name) {

        if (name.contentEquals("150 NAIRA C. MALTAGOLD")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. MALTAGOLD(2)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. MALTAGOLD(3)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. MALTAGOLD(4)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA C. MALTAGOLD(5)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA C. MALTAGOLD(5)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. MALTAGOLD(6)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. MALTAGOLD(7)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. MALTAGOLD(8)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1350 NAIRA C. MALTAGOLD(9)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA C. MALTAGOLD(10)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. MALTAGOLD(11)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. MALTAGOLD(12)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. MALTAGOLD(13)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2100 NAIRA C. MALTAGOLD(14)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2250 NAIRA C. MALTAGOLD(15)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. MALTAGOLD(16)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. MALTAGOLD(17)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. MALTAGOLD(18)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2850 NAIRA C. MALTAGOLD(19)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3000 NAIRA C. MALTAGOLD(20)")) {
            textView28th.setText(name);
            textView28th.setVisibility(View.VISIBLE);
            imageButton28th.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanMaltina(String name) {

        if (name.contentEquals("150 NAIRA C. MALTINA")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. MALTINA(2)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. MALTINA(3)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. MALTINA(4)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. MALTINA(5)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. MALTINA(5)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. MALTINA(6)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. MALTINA(7)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. MALTINA(8)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA C. MALTINA(9)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA C. MALTINA(10)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. MALTINA(11)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. MALTINA(12)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. MALTINA(13)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA C. MALTINA(14)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA C. MALTINA(15)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. MALTINA(16)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. MALTINA(17)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. MALTINA(18)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA C. MALTINA(19)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA C. MALTINA(20)")) {
            textView29th.setText(name);
            textView29th.setVisibility(View.VISIBLE);
            imageButton29th.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanHimalt(String name) {

        if (name.contentEquals("150 NAIRA C. HIMALT")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. HIMALT(2)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. HIMALT(3)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. HIMALT(4)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA C. HIMALT(5)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("750 NAIRA C. HIMALT(5)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. HIMALT(6)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. HIMALT(7)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. HIMALT(8)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1350 NAIRA C. HIMALT(9)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA C. HIMALT(10)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. HIMALT(11)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. HIMALT(12)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. HIMALT(13)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2100 NAIRA C. HIMALT(14)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2250 NAIRA C. HIMALT(15)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. HIMALT(16)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. HIMALT(17)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. HIMALT(18)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2850 NAIRA C. HIMALT(19)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3000 NAIRA C. HIMALT(20)")) {
            textView30th.setText(name);
            textView30th.setVisibility(View.VISIBLE);
            imageButton30th.setVisibility(View.VISIBLE);
        }
    }

    public void contentCanMataGuinness(String name) {

        if (name.contentEquals("150 NAIRA C. MALTAGUINNESS")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA C. MALTAGUINNESS(2)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA C. MALTAGUINNESS(3)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA C. MALTAGUINNESS(4)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. MALTAGUINNESS(5)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA C. MALTAGUINNESS(5)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA C. MALTAGUINNESS(6)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA C. MALTAGUINNESS(7)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. MALTAGUINNESS(8)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA C. MALTAGUINNESS(9)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA C. MALTAGUINNESS(10)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA C. MALTAGUINNESS(11)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA C. MALTAGUINNESS(12)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA C. MALTAGUINNESS(13)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA C. MALTAGUINNESS(14)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA C. MALTAGUINNESS(15)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA C. MALTAGUINNESS(16)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA C. MALTAGUINNESS(17)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA C. MALTAGUINNESS(18)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA C. MALTAGUINNESS(19)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA C. MALTAGUINNESS(20)")) {
            textView31st.setText(name);
            textView31st.setVisibility(View.VISIBLE);
            imageButton31st.setVisibility(View.VISIBLE);
        }
    }

    public void contentFiveAliveJuice(String name) {


        if (name.contentEquals("500 NAIRA 5ALIVE JUICE")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA 5ALIVE JUICE(2)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA 5ALIVE JUICE(3)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA 5ALIVE JUICE(4)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA 5ALIVE JUICE(5)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA 5ALIVE JUICE(5)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA 5ALIVE JUICE(6)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3500 NAIRA 5ALIVE JUICE(7)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4000 NAIRA 5ALIVE JUICE(8)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4500 NAIRA 5ALIVE JUICE(9)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5000 NAIRA 5ALIVE JUICE(10)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5500 NAIRA 5ALIVE JUICE(11)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6000 NAIRA 5ALIVE JUICE(12)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6500 NAIRA 5ALIVE JUICE(13)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7000 NAIRA 5ALIVE JUICE(14)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7500 NAIRA 5ALIVE JUICE(15)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8000 NAIRA 5ALIVE JUICE(16)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8500 NAIRA 5ALIVE JUICE(17)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9000 NAIRA 5ALIVE JUICE(18)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9500 NAIRA 5ALIVE JUICE(19)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("10000 NAIRA 5ALIVE JUICE(20)")) {
            textView32nd.setText(name);
            textView32nd.setVisibility(View.VISIBLE);
            imageButton32nd.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallHollandiaJuice(String name) {

        if (name.contentEquals("300 NAIRA SMALL HOLLANDIA JUICE")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL HOLLANDIA JUICE(2)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA SMALL HOLLANDIA JUICE(3)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL HOLLANDIA JUICE(4)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA SMALL HOLLANDIA JUICE(5)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA SMALL HOLLANDIA JUICE(5)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SMALL HOLLANDIA JUICE(6)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA SMALL HOLLANDIA JUICE(7)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA SMALL HOLLANDIA JUICE(8)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2700 NAIRA SMALL HOLLANDIA JUICE(9)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3000 NAIRA SMALL HOLLANDIA JUICE(10)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3300 NAIRA SMALL HOLLANDIA JUICE(11)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3600 NAIRA SMALL HOLLANDIA JUICE(12)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3900 NAIRA SMALL HOLLANDIA JUICE(13)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("4200 NAIRA SMALL HOLLANDIA JUICE(14)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("4500 NAIRA SMALL HOLLANDIA JUICE(15)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4800 NAIRA SMALL HOLLANDIA JUICE(16)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5100 NAIRA SMALL HOLLANDIA JUICE(17)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5400 NAIRA SMALL HOLLANDIA JUICE(18)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("5700 NAIRA SMALL HOLLANDIA JUICE(19)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("6000 NAIRA SMALL HOLLANDIA JUICE(20)")) {
            textView33rd.setText(name);
            textView33rd.setVisibility(View.VISIBLE);
            imageButton33rd.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigHollandiaJuice(String name) {

        if (name.contentEquals("500 NAIRA BIG HOLLANDIA JUICE")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG HOLLANDIA JUICE(2)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG HOLLANDIA JUICE(3)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA BIG HOLLANDIA JUICE(4)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA BIG HOLLANDIA JUICE(5)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA BIG HOLLANDIA JUICE(5)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA BIG HOLLANDIA JUICE(6)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3500 NAIRA BIG HOLLANDIA JUICE(7)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4000 NAIRA BIG HOLLANDIA JUICE(8)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4500 NAIRA BIG HOLLANDIA JUICE(9)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5000 NAIRA BIG HOLLANDIA JUICE(10)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5500 NAIRA BIG HOLLANDIA JUICE(11)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6000 NAIRA BIG HOLLANDIA JUICE(12)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6500 NAIRA BIG HOLLANDIA JUICE(13)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7000 NAIRA BIG HOLLANDIA JUICE(14)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7500 NAIRA BIG HOLLANDIA JUICE(15)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8000 NAIRA BIG HOLLANDIA JUICE(16)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8500 NAIRA BIG HOLLANDIA JUICE(17)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9000 NAIRA BIG HOLLANDIA JUICE(18)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9500 NAIRA BIG HOLLANDIA JUICE(19)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("10000 NAIRA BIG HOLLANDIA JUICE(20)")) {
            textView34th.setText(name);
            textView34th.setVisibility(View.VISIBLE);
            imageButton34th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallChiExoticJuice(String name) {

        if (name.contentEquals("300 NAIRA SMALL CHIEXOTIC JUICE")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL CHIEXOTIC JUICE(2)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA SMALL CHIEXOTIC JUICE(3)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL CHIEXOTIC JUICE(4)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SMALL CHIEXOTIC JUICE(5)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SMALL CHIEXOTIC JUICE(5)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SMALL CHIEXOTIC JUICE(6)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA SMALL CHIEXOTIC JUICE(7)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA SMALL CHIEXOTIC JUICE(8)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA SMALL CHIEXOTIC JUICE(9)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA SMALL CHIEXOTIC JUICE(10)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3300 NAIRA SMALL CHIEXOTIC JUICE(11)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3600 NAIRA SMALL CHIEXOTIC JUICE(12)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3900 NAIRA SMALL CHIEXOTIC JUICE(13)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4200 NAIRA SMALL CHIEXOTIC JUICE(14)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4500 NAIRA SMALL CHIEXOTIC JUICE(15)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4800 NAIRA SMALL CHIEXOTIC JUICE(16)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5100 NAIRA SMALL CHIEXOTIC JUICE(17)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5400 NAIRA SMALL CHIEXOTIC JUICE(18)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5700 NAIRA SMALL CHIEXOTIC JUICE(19)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6000 NAIRA SMALL CHIEXOTIC JUICE(20)")) {
            textView35th.setText(name);
            textView35th.setVisibility(View.VISIBLE);
            imageButton35th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigChiExoticJuice(String name) {

        if (name.contentEquals("500 NAIRA BIG CHIEXOTIC JUICE")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG CHIEXOTIC JUICE(2)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA BIG CHIEXOTIC JUICE(3)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2000 NAIRA BIG CHIEXOTIC JUICE(4)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2500 NAIRA BIG CHIEXOTIC JUICE(5)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2500 NAIRA BIG CHIEXOTIC JUICE(5)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA BIG CHIEXOTIC JUICE(6)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3500 NAIRA BIG CHIEXOTIC JUICE(7)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("4000 NAIRA BIG CHIEXOTIC JUICE(8)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("4500 NAIRA BIG CHIEXOTIC JUICE(9)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("5000 NAIRA BIG CHIEXOTIC JUICE(10)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5500 NAIRA BIG CHIEXOTIC JUICE(11)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("6000 NAIRA BIG CHIEXOTIC JUICE(12)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("6500 NAIRA BIG CHIEXOTIC JUICE(13)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("7000 NAIRA BIG CHIEXOTIC JUICE(14)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("7500 NAIRA BIG CHIEXOTIC JUICE(15)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8000 NAIRA BIG CHIEXOTIC JUICE(16)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("8500 NAIRA BIG CHIEXOTIC JUICE(17)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("9000 NAIRA BIG CHIEXOTIC JUICE(18)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("9500 NAIRA BIG CHIEXOTIC JUICE(19)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("10000 NAIRA BIG CHIEXOTIC JUICE(20)")) {
            textView36th.setText(name);
            textView36th.setVisibility(View.VISIBLE);
            imageButton36th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallChivitaJuice(String name) {

        if (name.contentEquals("300 NAIRA SMALL CHIVITA JUICE")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL CHIVITA JUICE(2)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("900 NAIRA SMALL CHIVITA JUICE(3)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1200 NAIRA SMALL CHIVITA JUICE(4)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA SMALL CHIVITA JUICE(5)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("1500 NAIRA SMALL CHIVITA JUICE(5)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SMALL CHIVITA JUICE(6)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2100 NAIRA SMALL CHIVITA JUICE(7)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2400 NAIRA SMALL CHIVITA JUICE(8)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("2700 NAIRA SMALL CHIVITA JUICE(9)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3000 NAIRA SMALL CHIVITA JUICE(10)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3300 NAIRA SMALL CHIVITA JUICE(11)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3600 NAIRA SMALL CHIVITA JUICE(12)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("3900 NAIRA SMALL CHIVITA JUICE(13)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("4200 NAIRA SMALL CHIVITA JUICE(14)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("4500 NAIRA SMALL CHIVITA JUICE(15)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4800 NAIRA SMALL CHIVITA JUICE(16)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("5100 NAIRA SMALL CHIVITA JUICE(17)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("5400 NAIRA SMALL CHIVITA JUICE(18)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("5700 NAIRA SMALL CHIVITA JUICE(19)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("6000 NAIRA SMALL CHIVITA JUICE(20)")) {
            textView37th.setText(name);
            textView37th.setVisibility(View.VISIBLE);
            imageButton37th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigChivitaJuice(String name) {

        if (name.contentEquals("500 NAIRA BIG CHIVITA JUICE")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG CHIVITA JUICE(2)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG CHIVITA JUICE(3)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA BIG CHIVITA JUICE(4)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA BIG CHIVITA JUICE(5)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA BIG CHIVITA JUICE(5)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA BIG CHIVITA JUICE(6)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3500 NAIRA BIG CHIVITA JUICE(7)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4000 NAIRA BIG CHIVITA JUICE(8)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4500 NAIRA BIG CHIVITA JUICE(9)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5000 NAIRA BIG CHIVITA JUICE(10)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5500 NAIRA BIG CHIVITA JUICE(11)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6000 NAIRA BIG CHIVITA JUICE(12)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6500 NAIRA BIG CHIVITA JUICE(13)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7000 NAIRA BIG CHIVITA JUICE(14)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7500 NAIRA BIG CHIVITA JUICE(15)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8000 NAIRA BIG CHIVITA JUICE(16)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8500 NAIRA BIG CHIVITA JUICE(17)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9000 NAIRA BIG CHIVITA JUICE(18)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9500 NAIRA BIG CHIVITA JUICE(19)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("10000 NAIRA BIG CHIVITA JUICE(20)")) {
            textView38th.setText(name);
            textView38th.setVisibility(View.VISIBLE);
            imageButton38th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallHappyHourJuice(String name) {

        if (name.contentEquals("300 NAIRA SMALL HAPPYHOUR JUICE")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SMALL HAPPYHOUR JUICE(2)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA SMALL HAPPYHOUR JUICE(3)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL HAPPYHOUR JUICE(4)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SMALL HAPPYHOUR JUICE(5)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SMALL HAPPYHOUR JUICE(5)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SMALL HAPPYHOUR JUICE(6)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA SMALL HAPPYHOUR JUICE(7)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA SMALL HAPPYHOUR JUICE(8)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA SMALL HAPPYHOUR JUICE(9)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA SMALL HAPPYHOUR JUICE(10)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3300 NAIRA SMALL HAPPYHOUR JUICE(11)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3600 NAIRA SMALL HAPPYHOUR JUICE(12)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3900 NAIRA SMALL HAPPYHOUR JUICE(13)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4200 NAIRA SMALL HAPPYHOUR JUICE(14)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4500 NAIRA SMALL HAPPYHOUR JUICE(15")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4800 NAIRA SMALL HAPPYHOUR JUICE(16)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5100 NAIRA SMALL HAPPYHOUR JUICE(17)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5400 NAIRA SMALL HAPPYHOUR JUICE(18)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5700 NAIRA SMALL HAPPYHOUR JUICE(19)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6000 NAIRA SMALL HAPPYHOUR JUICE(20)")) {
            textView39th.setText(name);
            textView39th.setVisibility(View.VISIBLE);
            imageButton39th.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigHappyHourJuice(String name) {

        if (name.contentEquals("500 NAIRA BIG HAPPYHOUR JUICE")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG HAPPYHOUR JUICE(2)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG HAPPYHOUR JUICE(3)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA BIG HAPPYHOUR JUICE(4)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA BIG HAPPYHOUR JUICE(5)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2500 NAIRA BIG HAPPYHOUR JUICE(5)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA BIG HAPPYHOUR JUICE(6)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3500 NAIRA BIG HAPPYHOUR JUICE(7)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4000 NAIRA BIG HAPPYHOUR JUICE(8)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4500 NAIRA BIG HAPPYHOUR JUICE(9)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5000 NAIRA BIG HAPPYHOUR JUICE(10)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("5500 NAIRA BIG HAPPYHOUR JUICE(11)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6000 NAIRA BIG HAPPYHOUR JUICE(12)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("6500 NAIRA BIG HAPPYHOUR JUICE(13)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7000 NAIRA BIG HAPPYHOUR JUICE(14)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("7500 NAIRA BIG HAPPYHOUR JUICE(15)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8000 NAIRA BIG HAPPYHOUR JUICE(16)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("8500 NAIRA BIG HAPPYHOUR JUICE(17)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9000 NAIRA BIG HAPPYHOUR JUICE(18)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("9500 NAIRA BIG HAPPYHOUR JUICE(19)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("10000 NAIRA BIG HAPPYHOUR JUICE(20)")) {
            textView40th.setText(name);
            textView40th.setVisibility(View.VISIBLE);
            imageButton40th.setVisibility(View.VISIBLE);
        }
    }

    public void contentSmallGlassSchweppes(String name) {

        if (name.contentEquals("80 NAIRA SMALL G. SCHWEPPES")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA SMALL G. SCHWEPPES(2)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA SMALL G. SCHWEPPES(3)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA SMALL G. SCHWEPPES(4)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. SCHWEPPES(5)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SMALL G. SCHWEPPES(5)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA SMALL G. SCHWEPPES(6)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA SMALL G. SCHWEPPES(7)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA SMALL G. SCHWEPPES(8)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA SMALL G. SCHWEPPES(9)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SMALL G. SCHWEPPES(10)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA SMALL G. SCHWEPPES(11)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA SMALL G. SCHWEPPES(12)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA SMALL G. SCHWEPPES(13)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA SMALL G. SCHWEPPES(14)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SMALL G. SCHWEPPES(15)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA SMALL G. SCHWEPPES(16)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA SMALL G. SCHWEPPES(17)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA SMALL G. SCHWEPPES(18)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA SMALL G. SCHWEPPES(19)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SMALL G. SCHWEPPES(20)")) {
            textView41st.setText(name);
            textView41st.setVisibility(View.VISIBLE);
            imageButton41st.setVisibility(View.VISIBLE);
        }
    }

    public void contentBigGlassSchweppes(String name) {

        if (name.contentEquals("100 NAIRA BIG G. SCHWEPPES")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA BIG G. SCHWEPPES(2)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA BIG G. SCHWEPPES(3)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA BIG G. SCHWEPPES(4)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA BIG G. SCHWEPPES(5)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA BIG G. SCHWEPPES(5)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA BIG G. SCHWEPPES(6)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA BIG G. SCHWEPPES(7)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA BIG G. SCHWEPPES(8)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA BIG G. SCHWEPPES(9)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA BIG G. SCHWEPPES(10)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA BIG G. SCHWEPPES(11)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA BIG G. SCHWEPPES(12)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA BIG G. SCHWEPPES(13)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA BIG G. SCHWEPPES(14)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA BIG G. SCHWEPPES(15)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA BIG G. SCHWEPPES(16)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA BIG G. SCHWEPPES(17)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA BIG G. SCHWEPPES(18)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA BIG G. SCHWEPPES(19)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA BIG G. SCHWEPPES(20)")) {
            textView42nd.setText(name);
            textView42nd.setVisibility(View.VISIBLE);
            imageButton42nd.setVisibility(View.VISIBLE);
        }
    }

    public void contentPetZobo(String name) {

        if (name.contentEquals("80 NAIRA PET ZOBO")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA PET ZOBO(2)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA PET ZOBO(3)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA PET ZOBO(4)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET ZOBO(5)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET ZOBO(5)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA PET ZOBO(6)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA PET ZOBO(7)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA PET ZOBO(8)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA PET ZOBO(9)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA PET ZOBO(10)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA PET ZOBO(11)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA PET ZOBO(12)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA PET ZOBO(13)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA PET ZOBO(14)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET ZOBO(15)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA PET ZOBO(16)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA PET ZOBO(17)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA PET ZOBO(18)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA PET ZOBO(19)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET ZOBO(20)")) {
            textView43rd.setText(name);
            textView43rd.setVisibility(View.VISIBLE);
            imageButton43rd.setVisibility(View.VISIBLE);
        }

    }

    public void contentPetSchweppes(String name) {

        if (name.contentEquals("120 NAIRA PET SCHWEPPES")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA PET SCHWEPPES(2)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("360 NAIRA PET SCHWEPPES(3)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA PET SCHWEPPES(4)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET SCHWEPPES(5)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA PET SCHWEPPES(6)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("840 NAIRA PET SCHWEPPES(7)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA PET SCHWEPPES(8)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1080 NAIRA PET SCHWEPPES(9)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET SCHWEPPES(10)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1320 NAIRA PET SCHWEPPES(11)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA PET SCHWEPPES(12)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1560 NAIRA PET SCHWEPPES(13)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1680 NAIRA PET SCHWEPPES(14)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA PET SCHWEPPES(15)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1920 NAIRA PET SCHWEPPES(16)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2040 NAIRA PET SCHWEPPES(17)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2160 NAIRA PET SCHWEPPES(18)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2280 NAIRA PET SCHWEPPES(19)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA PET SCHWEPPES(20)")) {
            textView44th.setText(name);
            textView44th.setVisibility(View.VISIBLE);
            imageButton44th.setVisibility(View.VISIBLE);
        }
    }
    
    public void contentPetFiveAlive(String name) {

        if (name.contentEquals("200 NAIRA PET 5ALIVE")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA PET 5ALIVE(2)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA PET 5ALIVE(3)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA PET 5ALIVE(4)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA PET 5ALIVE(5)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA PET 5ALIVE(6)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA PET 5ALIVE(7)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA PET 5ALIVE(8)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA PET 5ALIVE(9)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA PET 5ALIVE(10)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2200 NAIRA PET 5ALIVE(11)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA PET 5ALIVE(12)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2600 NAIRA PET 5ALIVE(13)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2800 NAIRA PET 5ALIVE(14)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA PET 5ALIVE(15)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3200 NAIRA PET 5ALIVE(16)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3400 NAIRA PET 5ALIVE(17)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3600 NAIRA PET 5ALIVE(18)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3800 NAIRA PET 5ALIVE(19)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("4000 NAIRA PET 5ALIVE(20)")) {
            textView45th.setText(name);
            textView45th.setVisibility(View.VISIBLE);
            imageButton45th.setVisibility(View.VISIBLE);
        }
    }
    
    
}
