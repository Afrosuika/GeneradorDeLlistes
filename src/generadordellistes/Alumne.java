/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generadordellistes;


import java.util.ArrayList;

/**
 *
 * @author DmnT
 */
public class Alumne implements Comparable{
    private String cognoms;
    private String nom;
    private String grup;
    private ArrayList<String> materies;

    //implementació de compareTo
    @Override
    public int compareTo(Object o) {
        Alumne tempor = (Alumne)o;
        if(this.cognoms.compareTo(tempor.getCognoms())==0){
            return this.nom.compareTo(tempor.getNom());
        }else{
            return this.cognoms.compareTo(tempor.getCognoms());
        }
    }

    //getters i setters
    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public ArrayList<String> getMateries() {
        return materies;
    }

    public void setMateries(ArrayList<String> materies) {
        this.materies = materies;
    }
    
    //métode per a afegir una Materia al array de Strings(codis de materia)
    public void afegirMateria(String materia){
        this.materies.add(materia);
    }    
}
