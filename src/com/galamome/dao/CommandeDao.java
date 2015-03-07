package com.galamome.dao;

import java.util.List;

import com.galamome.beans.Commande;

public interface CommandeDao {
    void creer( Commande client ) throws DAOException;

    Commande trouver( long id ) throws DAOException;

    List<Commande> lister() throws DAOException;

    void supprimer( Commande client ) throws DAOException;
}