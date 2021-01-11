package Projet.Agent;

import java.util.Vector;

import Projet.Acceuil.color;
import Projet.Agent.Facture.Facture;


interface BillsManagement
{
	
	public void addFacture();
	
	public void displayAllFacture();
	
	public Vector<Facture> updateFacture(Integer num);
	
	public Vector<Facture> distroyFacture(Integer num);
	
	public void searchFacture(Integer num);
	
	
}


public class OperationsOnFacture implements BillsManagement
{
	public Vector<Facture> facture;
	public Integer Size;
	
	public OperationsOnFacture()
	{
		
	}
	
	public OperationsOnFacture(int S)
	{
		Size = S;
		facture = new Vector<Facture>(Size);
	}
	
	//Ajout d'une facture
	
	public void addFacture()
	{
		facture.add(new Facture().Saisie());
	}
	
	// Mise à jour
	
	public Vector<Facture> updateFacture(Integer Num)
	{
		Integer i;
		
		if(facture.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for( i = 0; i < facture.size(); i++)
			{
				if(facture.get(i).getNumero().equals(Num))
				{
					facture.set(i, new Facture().Saisie());
					System.out.println(color.purple+"\t  Well updated :/  "+color.reset);
					break;
				}
			}
			
			if(i.equals(facture.size()))
			{
				System.out.println(color.red+"\t  Not found in Array ! "+color.reset);
			}
		}
		
		return facture;
	}
	
	public void searchFacture(Integer Num)
	{
		Integer i;
		
		
		if(facture.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for( i = 0; i < facture.size(); i++)
			{
				if(facture.get(i).getNumero().equals(Num))
				{
					System.out.println(color.purple+facture.get(i).toString()+color.reset);
					break;
				}
			}
			
			if(i.equals(facture.size()))
			{
				System.out.println(color.red+"\t  Not found in Array ! "+color.reset);
			}
		}
		
	}
	
	// Affichage 
	
	public void displayAllFacture()
	{
		if(facture.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for(int i = 0; i < facture.size(); i++)
			{
				System.out.println(color.purple+facture.get(i).toString()+color.reset);
			}
		}
	}
	
	// Suppression 
	
	public Vector<Facture> distroyFacture(Integer Num)
	{
		Integer i;
		
		if(facture.isEmpty())
		{
			System.out.println(color.red+"\t  Empty Array ! "+color.reset);
		}else
		{
			for( i = 0; i < facture.size(); i++)
			{
				if(facture.get(i).getNumero().equals(Num))
				{
					facture.removeElementAt(i);
					System.out.println(color.purple+"\t  Well deleted !"+color.reset);
					break;
				}
			}
			
			if(i.equals(facture.size()))
			{
				System.out.println(color.red+"\t  Not found in Array ! "+color.reset);
			}
		}
		
		return facture;
	}

}
