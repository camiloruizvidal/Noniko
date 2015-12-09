package com.httpsolucionescrv.noniko;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MILO on 08/12/2015.
 */
public class AdapterRestaurantes extends BaseAdapter
{
    protected Activity activity;
    protected ArrayList<Restaurante> items;

    public AdapterRestaurantes(Activity activity,ArrayList<Restaurante> items)
    {
        this.items=items;
        this.activity=activity;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView==null)
        {
            LayoutInflater inf= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.lista_restaurantes,null);
        }
        Restaurante res = items.get(position);

        TextView name = (TextView) v.findViewById(R.id.nombre);
        TextView telefono = (TextView) v.findViewById(R.id.numeroTelefono);
        TextView direccion = (TextView) v.findViewById(R.id.direccion);
        name.setText(res.getNombre());
        telefono.setText(res.getTelefono());
        direccion.setText(res.getDireccion());
        return v;
    }
}

