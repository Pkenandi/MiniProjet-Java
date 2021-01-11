package Projet.Administrateur;

import java.util.Vector;

import Projet.Acceuil.color;
import Projet.Administrateur.Comptes.Compte;

interface GestionCompte
{
	
	public void Creation(); // creation d'un compte
	
	public Vector<Compte> updateCompte(Integer id); // Mise à jour d'un compte
	
	public Vector<Compte> distroyCompte(Integer id); // Suppression d'un compte
	
	public void searchCompte(Integer id); // Recherche d'un compte
	
	public void displayAllCompte(); // Affichage d'un compte 
	
	
}

public class OperationsOnComptes implements GestionCompte{

	public Vector<Compte> compte;
	public Integer size;
	
	public OperationsOnComptes(Integer s) {
		this.size = s;
		compte = new Vector<Compte>(this.size);
	}

		// Creation d'un compte
	
	public void Creation()
	{
		
		compte.add(new Compte().Saisie());
		
	}
	
	//Modification d'un compte
	
	public Vector<Compte> updateCompte(Integer id)
	{
		Integer i;
		
		if (compte.isEmpty()) 
		{
			System.out.println(color.red+"\t  Empty Array "+color.reset);
		} else 
		{
			for ( i = 0; i < compte.size(); i++) 
			{
				if (compte.get(i).getId().equals(id)) 
				{
					compte.set(i, new Compte().Saisie());
					System.out.println(color.green+"\t  well updated  "+color.reset);
					break;
				}

			}
			
			if(i.equals(compte.size()))
				System.out.println(color.red + " Id not found !" +color.reset);
		}
		
		return compte;
	}
	
	// Recherche d'un compte
	
	public void searchCompte(Integer id)
	{
		Integer i;
		
		if (compte.isEmpty()) 
		{
			System.out.println(color.red+ "\t  Empty Array " + color.reset);
		} else 
		{
			for ( i = 0; i < compte.size(); i++) 
			{
				if (compte.get(i).getId().equals(id)) 
				{
					System.out.println( color.green+""+compte.get(i).toString()+""+color.reset);
					break;
				}
			}
			
			if(i.equals(compte.size()))
				System.out.println(color.red+"\t  Id not found !"+color.reset);
		}
	}
	
	// Affichage 
	
	public void displayAllCompte()
	{
		if(compte.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for(int i = 0; i < compte.size(); i++ )
			{
				System.out.println(compte.get(i).toString());
			}
		}
	}
	
	// Suppression d'un compte
	
	public Vector<Compte> distroyCompte(Integer id)
	{
		Integer i;
		
		if(compte.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for( i = 0; i < compte.size(); i++ )
			{
				if(compte.get(i).getId().equals(id))
				{
					compte.removeElementAt(i);
					System.out.println(color.green+"\t  Well deleted  "+color.reset);
					break;
				}
			}
			
			if(i.equals(compte.size()))
				System.out.println(color.red+"\t  Id not found !"+color.reset);
		}
		
		return compte;
	}
}