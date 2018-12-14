package com.icdatofcusgmail.luciddrinks.VendorActivityArchive;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

class VendorAdapter extends BaseAdapter {

    private Context c;
    private ArrayList<Icdat> icdats;
    private Map<Integer, Boolean> isCheckMap = new HashMap<>();
    private List<Map<String, String>> data;
    private SparseBooleanArray mSelectedItemsIds;
    private LucidApplication app;

    VendorAdapter(Context c, ArrayList<Icdat> icdats) {
        super();
        mSelectedItemsIds = new SparseBooleanArray();
        this.c = c;
        this.icdats = icdats;

        app = LucidApplication.getInstance();
        configCheckMap(false);
    }

    private void configCheckMap(boolean bool) {
        for (int i = 0; i < icdats.size(); i++) {
            isCheckMap.put(i, bool);
        }
    }


    @Override
    public int getCount() {
        return icdats == null ? 0 : icdats.size();
    }

    @Override
    public Object getItem(int position) {
        return icdats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.va_imagemodel, parent, false);
            holder = new ViewHolder();
            holder.textView = convertView.findViewById(R.id.textmodel);
            holder.imageView = convertView.findViewById(R.id.imagemodel);
            holder.smooth = convertView.findViewById(R.id.smoothie);

            convertView.setTag(holder);
            convertView.setTag(R.id.textmodel, holder.textView);
            convertView.setTag(R.id.imagemodel, holder.imageView);
            convertView.setTag(R.id.smoothie, holder.smooth);

        } else {
            holder = (ViewHolder) convertView.getTag();
            holder.smooth.setTag(position);

        }
        final Icdat icdat = icdats.get(position);
        holder.getSmoothnNicelookingBOX().setTag(position);
        holder.getSmoothnNicelookingBOX().setChecked(icdat.isSelected());
        holder.getDrinkName().setText(icdat.getDrinkname());
        holder.getImageName().setImageResource(icdat.getDrinkimage());


        if (compareIndex(icdat) == -1){
            holder.smooth.setChecked(false);
        } else {
            holder.smooth.setChecked(true);
        }
        //Set Data
        holder.imageView.setImageResource(icdats.get(position).getDrinkimage());
        holder.textView.setText(icdats.get(position).getDrinkname());

        holder.smooth.setTag(icdat);
        return convertView;
    }


    private int compareIndex(Icdat icdat){
        int olonje = -1;
        for(int daveed = 0; daveed < app.selecteddrinks.size(); daveed++){
            Icdat PhilFvsEithin= (Icdat) app.selecteddrinks.get(daveed);
            if(PhilFvsEithin.getDrinkname().equals(icdat.getDrinkname())){
                olonje = daveed;
            }
        }
        return olonje;
    }
    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }


    static class ViewHolder {
        SmoothCheckBox smooth;
        TextView textView;
        ImageView imageView;

        SmoothCheckBox getSmoothnNicelookingBOX() {
            return smooth;
        }

        TextView getDrinkName() {
            return textView;
        }

        ImageView getImageName() {
            return imageView;
        }

    }

    void toggleSelection(int position) {
        selectView(position, !mSelectedItemsIds.get(position));
    }

    private void selectView(int position, boolean value) {
        if (value) {
            mSelectedItemsIds.put(position, true);
        } else {
            mSelectedItemsIds.delete(position);
        }
        notifyDataSetChanged();
    }

}
