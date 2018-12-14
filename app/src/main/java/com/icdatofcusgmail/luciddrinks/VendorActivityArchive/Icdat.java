package com.icdatofcusgmail.luciddrinks.VendorActivityArchive;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class Icdat {

    private String drinkname;
    private int drinkimage;
    private boolean selected;
    private SmoothCheckBox smooth;

    Icdat(String drinkname, int drinkimage, SmoothCheckBox smoothe) {
        super();
        this.drinkimage = drinkimage;
        this.drinkname = drinkname;
        this.smooth = smoothe;
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname;
    }

    public int getDrinkimage() {
        return drinkimage;
    }

    public void setDrinkimage(int drinkimage) {
        this.drinkimage = drinkimage;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public SmoothCheckBox getSmooth() {
        return smooth;
    }

    public void setSmooth(SmoothCheckBox smooth) {
        this.smooth = smooth;
    }

}
