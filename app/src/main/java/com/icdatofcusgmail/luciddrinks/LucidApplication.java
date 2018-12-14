package com.icdatofcusgmail.luciddrinks;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.TreeMap;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class LucidApplication extends Application {

    public  String[] Diamond;
    public Bundle sellerOruko;
    public TextView Idtext;
    public TextView Nametext;
    private static LucidApplication instance;
    public JSONArray selecteddrinks;
    public JSONObject prices;

    //     String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SeventhString, EighthString, NinthString, TenthString, ElevenString, TwelveString, ThirteenString, FourteenString, FifteenString, SixteenString, SeventeenString, EighteenString, NineteenString, TwentyString, TwentyOneString, TwentyTwoString, TwentyThreeString, TwentyFourString, TwentyFiveString, TwentySixString, TwentySevenString, TwentyEightString, TwentyNineString, ThirtyString, ThirtyOneString, ThirtyTwoString, ThirtyThreeString, ThirtyFourString, ThirtyFiveString, ThirtySixString, ThirtySevenString, ThirtyEightString, ThirtyNineString, FourtyString, FourtyOneString, FourtyTwoString, FourtyThreeString;


    public static int parseOne, parseTwo, parseThree, parseFour, parseFive, parseSix, parseSeven, parseEight, parseNine, parseTen, parseEleven, parseTwelve, parseThirteen, parseFourteen, parseFifteen, parseSixteen, parseSeventeen, parseEighteen, parseNineteen, parseTwenty, parseTwentyOne, parseTwentyTwo, parseTwentyThree, parseTwentyFour, parseTwentyFive, parseTwentySix, parseTwentySeven, parseTwentyEight, parseTwentyNine, parseThirty, parseThirtyOne, parseThirtyTwo, parseThirtyThree, parseThirtyFour, parseThirtyFive, parseThirtySix, parseThirtySeven, parseThirtyEight, parseThirtyNine, parseFourty, parseFourtyOne, parseFourtyTwo, parseFourtyThree, parseFourtyFour, parseFourtyFive;
    public static String FirstSubString, SecondSubString, ThirdSubString, FourthSubString, FifthSubString, SixthSubString, SeventhSubString, EighthSubString, NinthSubString, TenthSubString, EleventhSubString, TwelvethSubString, ThirteenthSubString, FourteenthSubString, FifteenthSubString, SixteenthSubString, SeventeenthSubString, EighteenthSubString, NineteenthSubString, TwentiethSubString, TwentyOneSubString, TwentyTwoSubString, TwentyThreeSubString, TwentyFourSubString, TwentyFiveSubString, TwentySixSubString, TwentySevenSubString, TwentyEightSubString, TwentyNineSubString, ThirtySubString, ThirtyOneSubString, ThirtyTwoSubString, ThirtyThreeSubString, ThirtyFourSubString, ThirtyFiveSubString, ThirtySixSubString, ThirtySevenSubString, ThirtyEightSubString, ThirtyNineSubString, FourtySubString, FourtyOneSubString, FourtyTwoSubString, FourtyThreeSubString, FourtyFourSubString, FourtyFiveSubString;
    public static String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SeventhString, EighthString, NinthString, TenthString, ElevenString, TwelveString, ThirteenString, FourteenString, FifteenString, SixteenString, SeventeenString, EighteenString, NineteenString, TwentyString, TwentyOneString, TwentyTwoString, TwentyThreeString, TwentyFourString, TwentyFiveString, TwentySixString, TwentySevenString, TwentyEightString, TwentyNineString, ThirtyString, ThirtyOneString, ThirtyTwoString, ThirtyThreeString, ThirtyFourString, ThirtyFiveString, ThirtySixString, ThirtySevenString, ThirtyEightString, ThirtyNineString, FourtyString, FourtyOneString, FourtyTwoString, FourtyThreeString, FourtyFourString, FourtyFiveString;


    public JSONObject stack;

    public int allindrinkcounter = 0;

    public TreeMap<String,String> prev;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        selecteddrinks = new JSONArray();
        prices = new JSONObject();
        prev = new TreeMap<>();

        stack = new JSONObject();

        //"Can Mirinda", "Glass Mirinda", "Pet Mirinda", "Can Pepsi",
        // "Glass Pepsi", "Pet Pepsi", "Can Savanna", "Pet Savanna",
        // "Can SevenUp", "Glass SevenUp", "Pet SevenUp", "Small Glass Sprite",
        // "Big Glass Sprite", "Pet Sprite", "Pet Teem", "Pet Lacasera",
        // "Pet Smoov", "Small Glass Coke", "Big Glass Coke","Small Pet Coke",
        // "Big Pet Coke", "Small Glass Fanta", "Big Glass Fanta", "Small Pet Fanta",
        // "Big Pet Fanta", "Sachet Water", "Pet Water", "Can MaltaGold", "Can Maltina",
        // "Can Himalt", "Can MaltaGuinness", "5Alive Juice", "Small Hollandia Juice",
        // "Big Hollandia Juice", "Small ChiExotic Juice", "Big ChiExotic Juice",
        // "Small Chivita Juice", "Big Chivita Juice", "Small HappyHour Juice",
        // "Big HappyHour Juice", "Small Glass Schweppes", "Big Glass Schweppes",
        // "Pet Schweppes"

        //  JSONArray
        JSONArray can_mirinda = new JSONArray();
        can_mirinda.add("150 NAIRA C. MIRINDA");
        can_mirinda.add("300 NAIRA C. MIRINDA(2)");
        can_mirinda.add("450 NAIRA C. MIRINDA(3)");
        can_mirinda.add("600 NAIRA C. MIRINDA(4)");
        can_mirinda.add("750 NAIRA C. MIRINDA(5)");
        can_mirinda.add("900 NAIRA C. MIRINDA(6)");
        prices.put("Can Mirinda", can_mirinda);

        JSONArray glass_mirinda = new JSONArray();
        glass_mirinda.add("80 NAIRA G. MIRINDA");
        glass_mirinda.add("160 NAIRA G. MIRINDA(2)");
        glass_mirinda.add("240 NAIRA G. MIRINDA(3)");
        glass_mirinda.add("320 NAIRA G. MIRINDA(4)");
        glass_mirinda.add("400 NAIRA G. MIRINDA(5)");
        glass_mirinda.add("480 NAIRA G. MIRINDA(6)");
        prices.put("Glass Mirinda", glass_mirinda);

        JSONArray pet_mirinda = new JSONArray();
        pet_mirinda.add("100 NAIRA PET MIRINDA");
        pet_mirinda.add("200 NAIRA PET MIRINDA(2)");
        pet_mirinda.add("300 NAIRA PET MIRINDA(3)");
        pet_mirinda.add("400 NAIRA PET MIRINDA(4)");
        pet_mirinda.add("500 NAIRA PET MIRINDA(5)");
        pet_mirinda.add("600 NAIRA PET MIRINDA(6)");
        prices.put("Pet Mirinda", pet_mirinda);

        JSONArray can_pepsi = new JSONArray();
        can_pepsi.add("150 NAIRA CAN PEPSI");
        can_pepsi.add("300 NAIRA CAN PEPSI(2)");
        can_pepsi.add("450 NAIRA CAN PEPSI(3)");
        can_pepsi.add("600 NAIRA CAN PEPSI(4)");
        can_pepsi.add("750 NAIRA CAN PEPSI(5)");
        can_pepsi.add("900 NAIRA CAN PEPSI(6)");
        prices.put("Can Pepsi", can_pepsi);

        JSONArray glass_pepsi = new JSONArray();
        glass_pepsi.add("80 NAIRA GLASS PEPSI");
        glass_pepsi.add("160 NAIRA GLASS PEPSI(2)");
        glass_pepsi.add("240 NAIRA GLASS PEPSI(3)");
        glass_pepsi.add("320 NAIRA GLASS PEPSI(4)");
        glass_pepsi.add("400 NAIRA GLASS PEPSI(5)");
        glass_pepsi.add("480 NAIRA GLASS PEPSI(6)");
        prices.put("Glass Pepsi", glass_pepsi);

        JSONArray pet_pepsi = new JSONArray();
        pet_pepsi.add("100 NAIRA PET PEPSI");
        pet_pepsi.add("200 NAIRA PET PEPSI(2)");
        pet_pepsi.add("300 NAIRA PET PEPSI(3)");
        pet_pepsi.add("400 NAIRA PET PEPSI(4)");
        pet_pepsi.add("500 NAIRA PET PEPSI(5)");
        pet_pepsi.add("600 NAIRA PET PEPSI(6)");
        prices.put("Pet Pepsi", pet_pepsi);

        JSONArray can_savanna = new JSONArray();
        can_savanna.add("150 NAIRA C. SAVANNA");
        can_savanna.add("300 NAIRA C. SAVANNA(2)");
        can_savanna.add("450 NAIRA C. SAVANNA(3)");
        can_savanna.add("600 NAIRA C. SAVANNA(4)");
        can_savanna.add("750 NAIRA C. SAVANNA(5)");
        can_savanna.add("900 NAIRA C. SAVANNA(6)");
        prices.put("Can Savanna", can_savanna);

        JSONArray pet_savanna = new JSONArray();
        pet_savanna.add("100 NAIRA P. SAVANNA");
        pet_savanna.add("200 NAIRA P. SAVANNA(2)");
        pet_savanna.add("300 NAIRA P. SAVANNA(3)");
        pet_savanna.add("400 NAIRA P. SAVANNA(4)");
        pet_savanna.add("500 NAIRA P. SAVANNA(5)");
        pet_savanna.add("600 NAIRA P. SAVANNA(6)");
        prices.put("Pet Savanna", pet_savanna);

        JSONArray can_sevenUp = new JSONArray();
        can_sevenUp.add("150 NAIRA C. SEVENUP");
        can_sevenUp.add("300 NAIRA C. SEVENUP(2)");
        can_sevenUp.add("450 NAIRA C. SEVENUP(3)");
        can_sevenUp.add("600 NAIRA C. SEVENUP(4)");
        can_sevenUp.add("750 NAIRA C. SEVENUP(5)");
        can_sevenUp.add("900 NAIRA C. SEVENUP(6)");
        prices.put("Can SevenUp", can_sevenUp);

        JSONArray glass_sevenUp = new JSONArray();
        glass_sevenUp.add("80 NAIRA G. SEVENUP");
        glass_sevenUp.add("160 NAIRA G. SEVENUP(2)");
        glass_sevenUp.add("240 NAIRA G. SEVENUP(3)");
        glass_sevenUp.add("320 NAIRA G. SEVENUP(4)");
        glass_sevenUp.add("400 NAIRA G. SEVENUP(5)");
        glass_sevenUp.add("480 NAIRA G. SEVENUP(6)");
        prices.put("Glass SevenUp", glass_sevenUp);

        JSONArray pet_sevenUp = new JSONArray();
        pet_sevenUp.add("100 NAIRA P. SEVENUP");
        pet_sevenUp.add("200 NAIRA P. SEVENUP(2)");
        pet_sevenUp.add("300 NAIRA P. SEVENUP(3)");
        pet_sevenUp.add("400 NAIRA P. SEVENUP(4)");
        pet_sevenUp.add("500 NAIRA P. SEVENUP(5)");
        pet_sevenUp.add("600 NAIRA P. SEVENUP(6)");
        prices.put("Pet SevenUp", pet_sevenUp);

        JSONArray small_glass_sprite = new JSONArray();
        small_glass_sprite.add("80 NAIRA SMALL G. SPRITE");
        small_glass_sprite.add("160 NAIRA SMALL G. SPRITE(2)");
        small_glass_sprite.add("240 NAIRA SMALL G. SPRITE(3)");
        small_glass_sprite.add("320 NAIRA SMALL G. SPRITE(4)");
        small_glass_sprite.add("400 NAIRA SMALL G. SPRITE(5)");
        small_glass_sprite.add("480 NAIRA SMALL G. SPRITE(6)");
        prices.put("Small Glass Sprite", small_glass_sprite);

        JSONArray big_glass_sprite = new JSONArray();
        big_glass_sprite.add("100 NAIRA BIG G. SPRITE");
        big_glass_sprite.add("200 NAIRA BIG G. SPRITE(2)");
        big_glass_sprite.add("300 NAIRA BIG G. SPRITE(3)");
        big_glass_sprite.add("400 NAIRA BIG G. SPRITE(4)");
        big_glass_sprite.add("500 NAIRA BIG G. SPRITE(5)");
        big_glass_sprite.add("600 NAIRA BIG G. SPRITE(6)");
        prices.put("Big Glass Sprite", big_glass_sprite);

        JSONArray pet_sprite = new JSONArray();
        pet_sprite.add("100 NAIRA PET SPRITE");
        pet_sprite.add("200 NAIRA PET SPRITE(2)");
        pet_sprite.add("300 NAIRA PET SPRITE(3)");
        pet_sprite.add("400 NAIRA PET SPRITE(4)");
        pet_sprite.add("500 NAIRA PET SPRITE(5)");
        pet_sprite.add("600 NAIRA PET SPRITE(6)");
        prices.put("Pet Sprite", pet_sprite);

        JSONArray pet_teem = new JSONArray();
        pet_teem.add("100 NAIRA PET TEEM");
        pet_teem.add("200 NAIRA PET TEEM(2)");
        pet_teem.add("300 NAIRA PET TEEM(3)");
        pet_teem.add("400 NAIRA PET TEEM(4)");
        pet_teem.add("500 NAIRA PET TEEM(5)");
        pet_teem.add("600 NAIRA PET TEEM(6)");
        prices.put("Pet Teem", pet_teem);

        JSONArray pet_lacasera = new JSONArray();
        pet_lacasera.add("100 NAIRA PET LACASERA");
        pet_lacasera.add("200 NAIRA PET LACASERA(2)");
        pet_lacasera.add("300 NAIRA PET LACASERA(3)");
        pet_lacasera.add("400 NAIRA PET LACASERA(4)");
        pet_lacasera.add("500 NAIRA PET LACASERA(5)");
        pet_lacasera.add("600 NAIRA PET LACASERA(6)");
        prices.put("Pet Lacasera", pet_lacasera);

        JSONArray pet_smoov = new JSONArray();
        pet_smoov.add("150 NAIRA PET SMOOV");
        pet_smoov.add("300 NAIRA PET SMOOV(2)");
        pet_smoov.add("450 NAIRA PET SMOOV(3)");
        pet_smoov.add("600 NAIRA PET SMOOV(4)");
        pet_smoov.add("750 NAIRA PET SMOOV(5)");
        pet_smoov.add("900 NAIRA PET SMOOV(6)");
        prices.put("Pet Smoov", pet_smoov);

        JSONArray small_glass_coke = new JSONArray();
        small_glass_coke.add("80 NAIRA SMALL G. COKE");
        small_glass_coke.add("160 NAIRA SMALL G. COKE(2)");
        small_glass_coke.add("240 NAIRA SMALL G. COKE(3)");
        small_glass_coke.add("320 NAIRA SMALL G. COKE(4)");
        small_glass_coke.add("400 NAIRA SMALL G. COKE(5)");
        small_glass_coke.add("480 NAIRA SMALL G. COKE(6)");
        prices.put("Small Glass Coke", small_glass_coke);

        JSONArray big_glass_coke = new JSONArray();
        big_glass_coke.add("100 NAIRA BIG G. COKE");
        big_glass_coke.add("200 NAIRA BIG G. COKE(2)");
        big_glass_coke.add("300 NAIRA BIG G. COKE(3)");
        big_glass_coke.add("400 NAIRA BIG G. COKE(4)");
        big_glass_coke.add("500 NAIRA BIG G. COKE(5)");
        big_glass_coke.add("600 NAIRA BIG G. COKE(6)");
        prices.put("Big Glass Coke", big_glass_coke);

        JSONArray small_pet_coke = new JSONArray();
        small_pet_coke.add("100 NAIRA SMALL PET COKE");
        small_pet_coke.add("200 NAIRA SMALL PET COKE(2)");
        small_pet_coke.add("300 NAIRA SMALL PET COKE(3)");
        small_pet_coke.add("400 NAIRA SMALL PET COKE(4)");
        small_pet_coke.add("500 NAIRA SMALL PET COKE(5)");
        small_pet_coke.add("600 NAIRA SMALL PET COKE(6)");
        prices.put("Small Pet Coke", small_pet_coke);

        JSONArray big_pet_coke = new JSONArray();
        big_pet_coke.add("150 NAIRA BIG PET COKE");
        big_pet_coke.add("300 NAIRA BIG PET COKE(2)");
        big_pet_coke.add("450 NAIRA BIG PET COKE(3)");
        big_pet_coke.add("600 NAIRA BIG PET COKE(4)");
        big_pet_coke.add("750 NAIRA BIG PET COKE(5)");
        big_pet_coke.add("900 NAIRA BIG PET COKE(6)");
        prices.put("Big Pet Coke", big_pet_coke);

        JSONArray small_glass_fanta = new JSONArray();
        small_glass_fanta.add("80 NAIRA SMALL G. FANTA");
        small_glass_fanta.add("160 NAIRA SMALL G. FANTA(2)");
        small_glass_fanta.add("240 NAIRA SMALL G. FANTA(3)");
        small_glass_fanta.add("320 NAIRA SMALL G. FANTA(4)");
        small_glass_fanta.add("400 NAIRA SMALL G. FANTA(5)");
        small_glass_fanta.add("480 NAIRA SMALL G. FANTA(6)");
        prices.put("Small Glass Fanta", small_glass_fanta);

        JSONArray big_glass_fanta = new JSONArray();
        big_glass_fanta.add("100 NAIRA BIG G. FANTA");
        big_glass_fanta.add("200 NAIRA BIG G. FANTA(2)");
        big_glass_fanta.add("300 NAIRA BIG G. FANTA(3)");
        big_glass_fanta.add("400 NAIRA BIG G. FANTA(4)");
        big_glass_fanta.add("500 NAIRA BIG G. FANTA(5)");
        big_glass_fanta.add("600 NAIRA BIG G. FANTA(6)");
        prices.put("Big Glass Fanta", big_glass_fanta);

        JSONArray small_pet_fanta = new JSONArray();
        small_pet_fanta.add("100 NAIRA SMALL P. FANTA");
        small_pet_fanta.add("200 NAIRA SMALL P. FANTA(2)");
        small_pet_fanta.add("300 NAIRA SMALL P. FANTA(3)");
        small_pet_fanta.add("400 NAIRA SMALL P. FANTA(4)");
        small_pet_fanta.add("500 NAIRA SMALL P. FANTA(5)");
        small_pet_fanta.add("600 NAIRA SMALL P. FANTA(6)");
        prices.put("Small Pet Fanta", small_pet_fanta);

        JSONArray big_pet_fanta = new JSONArray();
        big_pet_fanta.add("150 NAIRA BIG P. FANTA");
        big_pet_fanta.add("300 NAIRA BIG P. FANTA(2)");
        big_pet_fanta.add("450 NAIRA BIG P. FANTA(3)");
        big_pet_fanta.add("600 NAIRA BIG P. FANTA(4)");
        big_pet_fanta.add("750 NAIRA BIG P. FANTA(5)");
        big_pet_fanta.add("900 NAIRA BIG P. FANTA(6)");
        prices.put("Big Pet Fanta", big_pet_fanta);

        JSONArray sachet_water = new JSONArray();
        sachet_water.add("10 NAIRA PURE WATER");
        sachet_water.add("20 NAIRA PURE WATER(2)");
        sachet_water.add("30 NAIRA PURE WATER(3)");
        sachet_water.add("40 NAIRA PURE WATER(4)");
        sachet_water.add("50 NAIRA PURE WATER(5)");
        sachet_water.add("60 NAIRA PURE WATER(6)");
        prices.put("Sachet Water", sachet_water);

        JSONArray pet_water = new JSONArray();
        pet_water.add("60 NAIRA BOTTLE WATER");
        pet_water.add("120 NAIRA BOTTLE WATER(2)");
        pet_water.add("180 NAIRA BOTTLE WATER(3)");
        pet_water.add("240 NAIRA BOTTLE WATER(4)");
        pet_water.add("300 NAIRA BOTTLE WATER(5)");
        pet_water.add("360 NAIRA BOTTLE WATER(6)");
        prices.put("Pet Water", pet_water);

        JSONArray can_maltagold = new JSONArray();
        can_maltagold.add("150 NAIRA C. MALTAGOLD");
        can_maltagold.add("300 NAIRA C. MALTAGOLD(2)");
        can_maltagold.add("450 NAIRA C. MALTAGOLD(3)");
        can_maltagold.add("600 NAIRA C. MALTAGOLD(4)");
        can_maltagold.add("750 NAIRA C. MALTAGOLD(5)");
        can_maltagold.add("900 NAIRA C. MALTAGOLD(6)");
        prices.put("Can MaltaGold", can_maltagold);

        JSONArray can_maltina = new JSONArray();
        can_maltina.add("150 NAIRA C. MALTINA");
        can_maltina.add("300 NAIRA C. MALTINA(2)");
        can_maltina.add("450 NAIRA C. MALTINA(3)");
        can_maltina.add("600 NAIRA C. MALTINA(4)");
        can_maltina.add("750 NAIRA C. MALTINA(5)");
        can_maltina.add("900 NAIRA C. MALTINA(6)");
        prices.put("Can Maltina", can_maltina);

        JSONArray can_himalt = new JSONArray();
        can_himalt.add("150 NAIRA C. HIMALT");
        can_himalt.add("300 NAIRA C. HIMALT(2)");
        can_himalt.add("450 NAIRA C. HIMALT(3)");
        can_himalt.add("600 NAIRA C. HIMALT(4)");
        can_himalt.add("750 NAIRA C. HIMALT(5)");
        can_himalt.add("900 NAIRA C. HIMALT(6)");
        prices.put("Can Himalt", can_himalt);

        JSONArray can_maltaguinness = new JSONArray();
        can_maltaguinness.add("150 NAIRA C. MALTAGUINNESS");
        can_maltaguinness.add("300 NAIRA C. MALTAGUINNESS(2)");
        can_maltaguinness.add("450 NAIRA C. MALTAGUINNESS(3)");
        can_maltaguinness.add("600 NAIRA C. MALTAGUINNESS(4)");
        can_maltaguinness.add("750 NAIRA C. MALTAGUINNESS(5)");
        can_maltaguinness.add("900 NAIRA C. MALTAGUINNESS(6)");
        prices.put("Can MaltaGuinness", can_maltaguinness);

        JSONArray fivealive_juice = new JSONArray();
        fivealive_juice.add("500 NAIRA 5ALIVE JUICE");
        fivealive_juice.add("1000 NAIRA 5ALIVE JUICE(2)");
        fivealive_juice.add("1500 NAIRA 5ALIVE JUICE(3)");
        fivealive_juice.add("2000 NAIRA 5ALIVE JUICE(4)");
        fivealive_juice.add("2500 NAIRA 5ALIVE JUICE(5)");
        fivealive_juice.add("3000 NAIRA 5ALIVE JUICE(6)");
        prices.put("5Alive Juice", fivealive_juice);

        JSONArray small_hollandia_juice = new JSONArray();
        small_hollandia_juice.add("300 NAIRA SMALL HOLLANDIA JUICE");
        small_hollandia_juice.add("600 NAIRA SMALL HOLLANDIA JUICE(2)");
        small_hollandia_juice.add("900 NAIRA SMALL HOLLANDIA JUICE(3)");
        small_hollandia_juice.add("1200 NAIRA SMALL HOLLANDIA JUICE(4)");
        small_hollandia_juice.add("1500 NAIRA SMALL HOLLANDIA JUICE(5)");
        small_hollandia_juice.add("1800 NAIRA SMALL HOLLANDIA JUICE(6)");
        prices.put("Small Hollandia Juice", small_hollandia_juice);

        JSONArray big_hollandia_juice = new JSONArray();
        big_hollandia_juice.add("500 NAIRA BIG HOLLANDIA JUICE");
        big_hollandia_juice.add("1000 NAIRA BIG HOLLANDIA JUICE(2)");
        big_hollandia_juice.add("1500 NAIRA BIG HOLLANDIA JUICE(3)");
        big_hollandia_juice.add("2000 NAIRA BIG HOLLANDIA JUICE(4)");
        big_hollandia_juice.add("2500 NAIRA BIG HOLLANDIA JUICE(5)");
        big_hollandia_juice.add("3000 NAIRA BIG HOLLANDIA JUICE(6)");
        prices.put("Big Hollandia Juice", big_hollandia_juice);

        JSONArray small_chiexotic_juice = new JSONArray();
        small_chiexotic_juice.add("300 NAIRA SMALL CHIEXOTIC JUICE");
        small_chiexotic_juice.add("600 NAIRA SMALL CHIEXOTIC JUICE(2)");
        small_chiexotic_juice.add("900 NAIRA SMALL CHIEXOTIC JUICE(3)");
        small_chiexotic_juice.add("1200 NAIRA SMALL CHIEXOTIC JUICE(4)");
        small_chiexotic_juice.add("1500 NAIRA SMALL CHIEXOTIC JUICE(5)");
        small_chiexotic_juice.add("1800 NAIRA SMALL CHIEXOTIC JUICE(6)");
        prices.put("Small ChiExotic Juice", small_chiexotic_juice);

        JSONArray big_chiexotic_juice = new JSONArray();
        big_chiexotic_juice.add("500 NAIRA BIG CHIEXOTIC JUICE");
        big_chiexotic_juice.add("1000 NAIRA BIG CHIEXOTIC JUICE(2)");
        big_chiexotic_juice.add("1500 NAIRA BIG CHIEXOTIC JUICE(3)");
        big_chiexotic_juice.add("2000 NAIRA BIG CHIEXOTIC JUICE(4)");
        big_chiexotic_juice.add("2500 NAIRA BIG CHIEXOTIC JUICE(5)");
        big_chiexotic_juice.add("3000 NAIRA BIG CHIEXOTIC JUICE(6)");
        prices.put("Big ChiExotic Juice", big_chiexotic_juice);

        JSONArray small_chivita_juice = new JSONArray();
        small_chivita_juice.add("300 NAIRA SMALL CHIVITA JUICE");
        small_chivita_juice.add("600 NAIRA SMALL CHIVITA JUICE(2)");
        small_chivita_juice.add("900 NAIRA SMALL CHIVITA JUICE(3)");
        small_chivita_juice.add("1200 NAIRA SMALL CHIVITA JUICE(4)");
        small_chivita_juice.add("1500 NAIRA SMALL CHIVITA JUICE(5)");
        small_chivita_juice.add("1800 NAIRA SMALL CHIVITA JUICE(6)");
        prices.put("Small Chivita Juice", small_chivita_juice);

        JSONArray big_chivita_juice = new JSONArray();
        big_chivita_juice.add("500 NAIRA BIG CHIVITA JUICE");
        big_chivita_juice.add("1000 NAIRA BIG CHIVITA JUICE(2)");
        big_chivita_juice.add("1500 NAIRA BIG CHIVITA JUICE(3)");
        big_chivita_juice.add("2000 NAIRA BIG CHIVITA JUICE(4)");
        big_chivita_juice.add("2500 NAIRA BIG CHIVITA JUICE(5)");
        big_chivita_juice.add("3000 NAIRA BIG CHIVITA JUICE(6)");
        prices.put("Big Chivita Juice", big_chivita_juice);

        JSONArray small_happyhour_juice = new JSONArray();
        small_happyhour_juice.add("300 NAIRA SMALL HAPPYHOUR JUICE");
        small_happyhour_juice.add("600 NAIRA SMALL HAPPYHOUR JUICE(2)");
        small_happyhour_juice.add("900 NAIRA SMALL HAPPYHOUR JUICE(3)");
        small_happyhour_juice.add("1200 NAIRA SMALL HAPPYHOUR JUICE(4)");
        small_happyhour_juice.add("1500 NAIRA SMALL HAPPYHOUR JUICE(5)");
        small_happyhour_juice.add("2000 NAIRA SMALL HAPPYHOUR JUICE(6)");
        prices.put("Small HappyHour Juice", small_happyhour_juice);

        JSONArray big_happyhour_juice = new JSONArray();
        big_happyhour_juice.add("500 NAIRA BIG HAPPYHOUR JUICE");
        big_happyhour_juice.add("1000 NAIRA BIG HAPPYHOUR JUICE(2)");
        big_happyhour_juice.add("1500 NAIRA BIG HAPPYHOUR JUICE(3)");
        big_happyhour_juice.add("2000 NAIRA BIG HAPPYHOUR JUICE(4)");
        big_happyhour_juice.add("2500 NAIRA BIG HAPPYHOUR JUICE(5)");
        big_happyhour_juice.add("3000 NAIRA BIG HAPPYHOUR JUICE(6)");
        prices.put("Big HappyHour Juice", big_happyhour_juice);

        JSONArray small_glass_schweppes = new JSONArray();
        small_glass_schweppes.add("80 NAIRA SMALL G. SCHWEPPES");
        small_glass_schweppes.add("160 NAIRA SMALL G. SCHWEPPES(2)");
        small_glass_schweppes.add("240 NAIRA SMALL G. SCHWEPPES(3)");
        small_glass_schweppes.add("320 NAIRA SMALL G. SCHWEPPES(4)");
        small_glass_schweppes.add("400 NAIRA SMALL G. SCHWEPPES(5)");
        small_glass_schweppes.add("480 NAIRA SMALL G. SCHWEPPES(6)");
        prices.put("Small Glass Schweppes", small_glass_schweppes);

        JSONArray big_glass_schweppes = new JSONArray();
        big_glass_schweppes.add("100 NAIRA BIG G. SCHWEPPES");
        big_glass_schweppes.add("200 NAIRA BIG G. SCHWEPPES(2)");
        big_glass_schweppes.add("300 NAIRA BIG G. SCHWEPPES(3)");
        big_glass_schweppes.add("400 NAIRA BIG G. SCHWEPPES(4)");
        big_glass_schweppes.add("500 NAIRA BIG G. SCHWEPPES(5)");
        big_glass_schweppes.add("600 NAIRA BIG G. SCHWEPPES(6)");
        prices.put("Big Glass Schweppes", big_glass_schweppes);

        JSONArray pet_zobo = new JSONArray();
        pet_zobo.add("80 NAIRA PET ZOBO");
        pet_zobo.add("160 NAIRA PET ZOBO(2)");
        pet_zobo.add("240 NAIRA PET ZOBO(3)");
        pet_zobo.add("320 NAIRA PET ZOBO(4)");
        pet_zobo.add("400 NAIRA PET ZOBO(5)");
        pet_zobo.add("480 NAIRA PET ZOBO(6)");
        prices.put("Pet Zobo", pet_zobo);

        JSONArray pet_schweppes = new JSONArray();
        pet_schweppes.add("120 NAIRA PET SCHWEPPES");
        pet_schweppes.add("240 NAIRA PET SCHWEPPES(2)");
        pet_schweppes.add("360 NAIRA PET SCHWEPPES(3)");
        pet_schweppes.add("480 NAIRA PET SCHWEPPES(4)");
        pet_schweppes.add("600 NAIRA PET SCHWEPPES(5)");
        pet_schweppes.add("720 NAIRA PET SCHWEPPES(6)");
        prices.put("Pet Schweppes", pet_schweppes);

        JSONArray pet_5alive = new JSONArray();
        pet_5alive.add("200 NAIRA PET 5ALIVE");
        pet_5alive.add("400 NAIRA PET 5ALIVE(2)");
        pet_5alive.add("600 NAIRA PET 5ALIVE(3)");
        pet_5alive.add("800 NAIRA PET 5ALIVE(4)");
        pet_5alive.add("1000 NAIRA PET 5ALIVE(5)");
        pet_5alive.add("1200 NAIRA PET 5ALIVE(6)");
        prices.put("Pet 5Alive", pet_5alive);

    }

    public static LucidApplication getInstance(){
        return instance;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

}