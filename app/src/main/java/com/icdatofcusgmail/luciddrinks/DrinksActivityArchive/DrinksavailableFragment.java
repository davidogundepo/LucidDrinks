package com.icdatofcusgmail.luciddrinks.DrinksActivityArchive;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.icdatofcusgmail.luciddrinks.LucidApplication;
import com.icdatofcusgmail.luciddrinks.R;
import com.icdatofcusgmail.luciddrinks.VendorActivityArchive.Icdat;

import java.util.ArrayList;

/**
 * Created by DAVID OGUNDEPO on 07/16/2017.
 *
 */

public class DrinksavailableFragment extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;
    MidFielder mf;
    DrinksmenuAdapter drinksmenuAdapter;
    LucidApplication MainApp;
    ArrayList<Icdat> Always = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.drinkmenufragment_drinkavailable, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MainApp = LucidApplication.getInstance();
        mf = (MidFielder) getActivity();
        listView = (ListView) getActivity().findViewById(R.id.listView);

        for( int i = 0; i < MainApp.selecteddrinks.size(); i++ ) {
            Icdat d = (Icdat) MainApp.selecteddrinks.get(i);
            Always.add(i,d);
        }

        drinksmenuAdapter = new DrinksmenuAdapter(getActivity(), Always);
        listView.setAdapter(drinksmenuAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mf.respond(position);
    }
}
