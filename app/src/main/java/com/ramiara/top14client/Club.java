package com.ramiara.top14client;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

/**
 * Classe métier d'un Bordereau
 * Décrit les données d'un Bordereau
 */
public class Bordereau {

    /**
     * ID du Bordereau
     */
    public int id;
    /**
     * Date du Bordereau
     */
    public Date date;
    /**
     * nom de l'utilisateur
     */
    public int nom_user;
    /**
     * prenom de l'utilisateur
     */
    public int prenom_user;
    /**
     * statut du Bordereau
     */
    public String statut;

    /**
     * Classement dans le TOP 14
     */
    public int classement;

    /**
     * Constructeur
     * Construit un objet à partir d'un JSONObject
     * @param jsonObject
     */
    public Bordereau(JSONObject jsonObject) {
        try {
            id = jsonObject.getInt("Id");
            date = jsonObject.getString("date");
            nom_user = jsonObject.getInt("Nom");
            prenom_user = jsonObject.getString("Prenom");
            statut = jsonObject.getString("Statut");
            classement = jsonObject.getInt("classement");
        } catch (JSONException e) {
            Log.d(MainActivity.LOG_TAG,"Erreur lors de la conversion de l'objet JSON en objet Bordereau");
            e.printStackTrace();
        }
    }

    /**
     * Convertit l'objet courant en array
     * @return le tableau
     */
    public String[] toArray() {
        String data[] = {
                Integer.toString(id),
                nom,
                couleurs,
                stade,
                fichierEcusson,
                Integer.toString(classement)
        };
        return data;
    }

}
