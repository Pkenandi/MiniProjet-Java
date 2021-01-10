package Projet.Agent;

import java.util.Vector;

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
			System.out.println(" Aucune facture editée !");
		}else
		{
			for( i = 0; i < facture.size(); i++)
			{
				if(facture.get(i).getNumero().equals(Num))
				{
					facture.set(i, new Facture().Saisie());
					break;
				}
			}
			
			if(i.equals(facture.size()))
			{
				System.out.println(" Num not found ");
			}
		}
		
		return facture;
	}
	
	public void searchFacture(Integer Num)
	{
		Integer i;
		
		
		if(facture.isEmpty())
		{
			System.out.println(" Aucune facture editée !");
		}else
		{
			for( i = 0; i < facture.size(); i++)
			{
				if(facture.get(i).getNumero().equals(Num))
				{
					System.out.println(facture.get(i).toString());
					break;
				}
			}
			
			if(i.equals(facture.size()))
			{
				System.out.println(" Num not found ");
			}
		}
		
	}
	
	// Affichage 
	
	public void displayAllFacture()
	{
		if(facture.isEmpty())
		{
			System.out.println(" Aucune facture existante !");
		}else
		{
			for(int i = 0; i < facture.size(); i++)
			{
				System.out.println(facture.get(i).toString());
			}
		}
	}
	
	// Suppression 
	
	public Vector<Facture> distroyFacture(Integer Num)
	{
		Integer i;
		
		if(facture.isEmpty())
		{
			System.out.println(" Aucune facture editée !");
		}else
		{
			for( i = 0; i < facture.size(); i++)
			{
				if(facture.get(i).getNumero().equals(Num))
				{
					facture.removeElementAt(i);
					System.out.println(" Suppression effectuer avec succès !");
					break;
				}
			}
			
			if(i.equals(facture.size()))
			{
				System.out.println(" Num not found ");
			}
		}
		
		return facture;
	}

}
