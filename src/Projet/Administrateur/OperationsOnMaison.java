package Projet.Administrateur;

import java.util.Vector;

import Projet.Administrateur.Maisons.Immeuble;
import Projet.Administrateur.Maisons.Maison;
import Projet.Administrateur.Maisons.Villa;


interface HouseManegement
{
	public void addHouse(); // Ajout d'une maison
	
	public Vector<Maison> updateHouse(Integer id); // Mise à jour d'une maison
	
	public Vector<Maison> distroyHouse(Integer id); // Suppression d'une maison
	
	public void searchHouse(Integer id); // Recherche d'une maison
	
	public void displayAllHouse(); // Affichage des toutes les maisons
	
}

public class OperationsOnMaison implements HouseManegement
{
	public Vector<Maison> maison;
	public Integer size;
	
	public OperationsOnMaison() {
		
	}
	
	public  OperationsOnMaison(Integer s)
	{
		size = s;
		maison = new Vector<Maison>(size);
	}
	
	//Ajout d'une maison
	
	@Override
	public void addHouse() {
		
		maison.add(new Maison().Saisie());
		
	}

	// Mise à jour des données d'une maison
	
	@Override
	public Vector<Maison> updateHouse(Integer id) 
	{
		Integer i;
		
		if(maison.isEmpty())
		{
			System.out.println("\t Empty Array ");
		}else
		{
			for( i = 0; i < maison.size(); i++)
			{
				if(maison.get(i).getId().equals(id))
				{
					if(maison.get(i).getType().toLowerCase().equals("immeuble"))
					{
						maison.set(i, new Immeuble().Saisie());
						break;
					}else if(maison.get(i).getType().toLowerCase().equals("villa"))
					{
						maison.set(i, new Villa().Saisie());
						break;
					}
				}
				
			}
			
			if(i.equals(maison.size()))
			{
				System.out.println("\t  Id not found !");
			}
			
		}
		
		return maison;
	}

	//Suppression d'une maison
	
	@Override
	public Vector<Maison> distroyHouse(Integer id) 
	{
		int i;
		
		if(maison.isEmpty())
		{
			System.out.println(" Empty Array or Id not found !");
		}else
		{
			for(i = 0; i < maison.size(); i++)
			{
				if(maison.get(i).getId().equals(id))
				{
					maison.removeElementAt(i);
					System.out.println(" Well deleted :/");
					break;
				}
			}
			
			if(i == maison.size())
			{
				System.out.println("\t  Id not found !");
			}
		}
		
		return maison;
	}
	
	// Recherche d'une maison
	
	@Override
	public void searchHouse(Integer id) 
	{
		int i;
		
		if(maison.isEmpty())
		{
			System.out.println(" Empty Array ");
		}else
		{
			for(i = 0; i < maison.size(); i++)
			{
				if(maison.get(i).getId().equals(id))
				{
					System.out.println(maison.get(i).toString());
					break;
				}
				
			}
			
			if(i == maison.size())
			{
				System.out.println("\t  Id not found !");
			}
		}
		
	}

	@Override
	public void displayAllHouse() 
	{
		if(maison.isEmpty())
		{
			System.out.println(" Empty Array ");
		}else {
			for(int i = 0; i < maison.size(); i++)
				System.out.println(maison.get(i).toString());
		}
		
		
	}

}
