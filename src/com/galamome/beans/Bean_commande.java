package com.galamome.beans;

public class Bean_commande {
	/* Propriétés du bean */
    private Bean_client client;
    private String date;
    private Double montant;
    private String modePaiement;
    private String statutPaiement;
    private String modeLivraison;
    private String statutLivraison;
    public Bean_client getClient() {
        return client;
    }
    public void setClient( Bean_client client ) {
        this.client = client;
    }
    public String getDate() {
        return date;
    }
    public void setDate( String date ) {
        this.date = date;
    }
    public Double getMontant() {
        return montant;
    }
    public void setMontant( Double montant ) {
        this.montant = montant;
    }
    public String getModePaiement() {
        return modePaiement;
    }
    public void setModePaiement( String modePaiement ) {
        this.modePaiement = modePaiement;
    }
    public String getStatutPaiement() {
        return statutPaiement;
    }
    public void setStatutPaiement( String statutPaiement ) {
        this.statutPaiement = statutPaiement;
    }
    public String getModeLivraison() {
        return modeLivraison;
    }
    public void setModeLivraison( String modeLivraison ) {
        this.modeLivraison = modeLivraison;
    }
    public String getStatutLivraison() {
        return statutLivraison;
    }
    public void setStatutLivraison( String statutLivraison ) {
        this.statutLivraison = statutLivraison;
    }

}
