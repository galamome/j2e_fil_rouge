package com.galamome.beans;

public class Bean_client {
    
	private String nomClient;
	private String prenomClient;
	private String adresseClient;
	private String telephoneClient;
	private String emailClient;  
    
    public String getNomClient() {
        return this.nomClient;
    }
    public String getPrenomClient() {
        return this.prenomClient;
    }
    public String getAdresseClient() {
        return this.adresseClient;
    }
    public String getTelephoneClient() {
        return this.telephoneClient;
    }    
    public String getEmailClient() {
        return this.emailClient;
    }      
    public void setNomClient( String nom ) {
        this.nomClient = nom;
    }
    public void setPrenomClient( String prenom ) {
        this.prenomClient = prenom;
    }
    public void setAdresseClient( String adresse ) {
        this.adresseClient = adresse;
    }    
    public void setTelephoneClient( String telephone ) {
        this.telephoneClient = telephone;
    } 
    public void setEmailClient( String email ) {
        this.emailClient = email;
    }      

}
