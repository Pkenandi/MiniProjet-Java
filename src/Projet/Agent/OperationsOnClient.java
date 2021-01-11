package Projet.Agent;

import java.io.*;
import java.util.*;

import Projet.Acceuil.color;
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
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
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
						System.out.println(color.purple+"\n\t  Well updated  :/ "+color.reset);
						break;
					}
				}
			}
			
			if(i.equals(client.size()))
			{
				System.out.println(color.red+"\t  Not found in Array ! "+color.reset);
			}
			
		}
		return client;
	}
	
	// Affichage
	
	public void displayAllClient()
	{
		if(client.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for(int i = 0; i < client.size(); i++)
			{
				System.out.println(color.purple+""+client.get(i).toString()+"\n "+color.reset);
			}
		}
	}
	
	public void searchClient(Integer Code)
	{
		Integer i;
		
		if(client.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for( i = 0; i < client.size(); i++)
			{
				if(client.get(i).getCode().equals(Code))
				{
					System.out.println(color.purple+client.get(i).toString()+color.reset);
					break;
				}
			}
			
			if(i.equals(client.size()))
			{
				System.out.println(color.red+"\t  Not found in Array ! "+color.reset);
			}
		}
		
	}
	
	//Suppression 
	
	public void distroyClient(Integer Code)
	{
		Integer i;
		
		if(client.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else 
		{
			for(i = 0; i < client.size(); i++)
			{
				if(client.get(i).getCode().equals(Code))
				{
					client.removeElementAt(i);
					System.out.println(color.purple+"\n\t  Well deleted ! "+color.reset);
					break;
				} 
			}
			
			if(i.equals(client.size()))
			{
				System.out.println(color.red+"\t  Not found in Array ! "+color.reset);
			}
		}
	}
	
}
