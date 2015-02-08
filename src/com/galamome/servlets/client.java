package com.galamome.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.galamome.beans.Bean_client;

/**
 * Servlet implementation class client
 */
//@WebServlet(description = "Handles client creation", urlPatterns = { "/creationClient" })
public class client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public client() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Création du bean */
        Bean_client beanClient = new Bean_client();
        
        /* Initialisation de ses propriétés */
        beanClient.setNomClient(request.getParameter("nomClient"));
        beanClient.setPrenomClient(request.getParameter("prenomClient"));		
        beanClient.setAdresseClient(request.getParameter("adresseClient"));
        beanClient.setTelephoneClient(request.getParameter("telephoneClient"));
        beanClient.setEmailClient(request.getParameter("emailClient"));
        
        /* Stockage du bean dans l'objet request */
        request.setAttribute( "bean_client", beanClient );    
        
		this.getServletContext().getRequestDispatcher( "/afficherClient.jsp" ).forward( request, response );
		
		
	}


}
