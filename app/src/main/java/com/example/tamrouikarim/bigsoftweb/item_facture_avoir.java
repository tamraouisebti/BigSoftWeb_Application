package com.example.tamrouikarim.bigsoftweb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class item_facture_avoir extends BaseAdapter {

    LayoutInflater facture_avoir_inflater;
    List<String> numero_liste= new LinkedList<>();
    List<String>  client_liste= new LinkedList<>();
    List<String>  date_liste= new LinkedList<>();
    List<String> facture_liste= new LinkedList<>();
    List<String> montant_ttc_liste= new LinkedList<>();
    List<String>  reste_payer_liste= new LinkedList<>();
    List<String>  etat_compta_liste= new LinkedList<>();
    List<String> mode_avoir_liste= new LinkedList<>();
    List<String>  unite_liste= new LinkedList<>();



    public  item_facture_avoir(Context c, List<String> numero, List<String>  client, List<String>  date,List<String> facture,
                               List<String> montant_ttc, List<String>  reste_payer, List<String>  etat_compta,List<String> mode_avoir, List<String>  unite)
    {facture_avoir_inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        numero_liste=numero;
        client_liste=client;
        date_liste=date;
        facture_liste=facture;
        montant_ttc_liste=montant_ttc;
        reste_payer_liste=reste_payer;
        etat_compta_liste=etat_compta;
        mode_avoir_liste=mode_avoir;
        unite_liste=unite;
    }





    @Override
    public int getCount() {
        return numero_liste.size();
    }

    @Override
    public Object getItem(int position) {
        return numero_liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v =facture_avoir_inflater.inflate(R.layout.liste_facture_avoir_layout,null);

        TextView numero=(TextView) v.findViewById(R.id.numero_liste_avoir_txt);
        TextView client=(TextView) v.findViewById(R.id.client_liste_avoir_txt);
        TextView date=(TextView) v.findViewById(R.id.date_liste_avoir_txt);
        TextView facture=(TextView) v.findViewById(R.id.facture_liste_avoir_txt);
        TextView mode_avoir=(TextView) v.findViewById(R.id.mode_liste_avoir_txt);
        TextView etat_compta=(TextView) v.findViewById(R.id.etat_compta_liste_avoir_txt);
        TextView montant_ttc=(TextView) v.findViewById(R.id.montant_ttc_liste_avoir_txt);
        TextView reste_payer=(TextView) v.findViewById(R.id.reste_payer_liste_avoir_txt);
        TextView unite=(TextView) v.findViewById(R.id.unite_liste_avoir_txt);


        if(numero_liste.get(position)!=null)numero.setText(numero_liste.get(position));
        if(client_liste.get(position)!=null)client.setText(client_liste.get(position));
        if(date_liste.get(position)!=null)date.setText(date_liste.get(position));
        if(facture_liste.get(position)!=null)facture.setText(facture_liste.get(position));
        if(mode_avoir_liste.get(position)!=null)mode_avoir.setText(mode_avoir_liste.get(position));
        if(etat_compta_liste.get(position)!=null)etat_compta.setText(etat_compta_liste.get(position));
        if(montant_ttc_liste.get(position)!=null)montant_ttc.setText(montant_ttc_liste.get(position));
        if(reste_payer_liste.get(position)!=null)reste_payer.setText(reste_payer_liste.get(position));
        if(unite_liste.get(position)!=null)unite.setText(unite_liste.get(position));






        return v;
    }
}
