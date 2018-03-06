package com.example.jinadiwathsala.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.security.PublicKey;

/**
 * Created by Jinadi Wathsala on 3/6/2018.
 */

public class CustomAdapter extends BaseAdapter{

    Context c;
    String[] names ={"Sri Lanka","America","India","Maldives","Australia","Bngadesh","Caneda","Nepal"};

   public CustomAdapter (Context ctx){
       this.c =ctx;
   }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int pos) {
        return names[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertview, ViewGroup viewGroup) {

       if(convertview == null){
           LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertview=inflater.inflate(R.layout.listviewitem,null);
       }

        //get view
        TextView nametxt = (TextView) convertview.findViewById(R.id.name);

       // se t Data
        nametxt.setText(names[pos]);

         return convertview;
    }
}
