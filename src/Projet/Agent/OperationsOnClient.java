package Projet.Agent;

import java.io.*;
import java.util.*;
import Projet.Agent.Client.Client;
import Projet.Agent.Client.ClientFidele;
import Projet.Agent.Client.ClientRare;


interface ClientManagement
{
	public void addClient(); // Ajout d'un client
	
	public Vector<Client> updateClient(Integer Code);// Mise à jour d'un client
	
	public void displayAllClient(); // Affichage des clients
	
	public void searchClient(Integer Code); // Recherche d'un client
	
	public void distroyClient(Integer Code); // Suppression d'un client
	
}


public class OperationsOnClient implements ClientManagement {
	
	
	//				---- OPERATIONS SUR UN CLIENT OU LOCATEUR ----
	private Integer Size;
	public static Vector<Client> client;
	
	public OperationsOnClient()
	{
		
	}
	
	public OperationsOnClient(Integer s)
	{
		Size = s;
		client = new Vector<Client>(Size);
	}
	// Ajout

	public void addClient() {

		client.add(new Client().Saisie());
		
	}
	
	//Mise à jour

	public Vector<Client> updateClient(Integer Code)
	{
		Integer i;
		
		if(client.isEmpty())
		{
			System.out.println("  Impossible to update ");
		}else
		{
			for( i = 0; i < client.size(); i++)
			{
				if(client.get(i).getCode().equals(Code))
				{
					if(client.get(i).getCategorie().toLowerCase().equals("fidele"))
					{
						client.set(i, new ClientFidele().Saisie());
						break;
					}else if(client.get(i).getCategorie().toLowerCase().equals("rare"))
					{
						client.set(i, new ClientRare().Saisie());
						System.out.println("\n\t Modificiation effectuer avec succès :/ ");
						break;
					}
				}
			}
			
			if(i.equals(client.size()))
			{
				System.out.println(" Code not found ");
			}
			
		}
		return client;
	}
	
	// Affichage
	
	public void displayAllClient()
	{
		if(client.isEmpty())
		{
			System.out.println(" Le tableau est vide !!!");
		}else
		{
			for(int i = 0; i < client.size(); i++)
			{
				System.out.println(client.get(i).toString()+"\n ");
			}
		}
	}
	
	public void searchClient(Integer Code)
	{
		Integer i;
		
		if(client.isEmpty())
		{
			System.out.println(" Aucune client existant !");
		}else
		{
			for( i = 0; i < client.size(); i++)
			{
				if(client.get(i).getCode().equals(Code))
				{
					System.out.println(client.get(i).toString());
					break;
				}
			}
			
			if(i.equals(client.size()))
			{
				System.out.println(" Code not found ");
			}
		}
		
	}
	
	//Suppression 
	
	public void distroyClient(Integer Code)
	{
		Integer i;
		
		if(client.isEmpty())
		{
			System.out.println(" Tableau vide !!");
		}else 
		{
			for(i = 0; i < client.size(); i++)
			{
				if(client.get(i).getCode().equals(Code))
				{
					client.removeElementAt(i);
					System.out.println("\n\t Client supprimer avec succès ! ");
					break;
				} 
			}
			
			if(i.equals(client.size()))
			{
				System.out.println(" Pas de client trouver avec le code <" + Code +"> !");
			}
		}
	}
	
}
