package Projet.Agent;

import java.util.Vector;

import Projet.Agent.Contract.Contract;


interface ContractManagement
{
	public void addContract(); // ajout d'un contract
	
	public Vector<Contract> updateContract(Integer num); // Mise à jour d'un contract
	
	public void displayAllContract(); // Affichage des tout les contracts
	
	public void searchContract(Integer num); // Recherche d'un contract
	
	public Vector<Contract> distroyContract(Integer num); // Suppression d'un contract
	
}


public class OperationsOnContract implements ContractManagement{

//		---- OPERATIONS SUR UN CONTRAT DE LOCATION ----

	public Vector<Contract> contract;
	public Integer Size;

	public OperationsOnContract() {

	}

	public OperationsOnContract(int S) {
		Size = S;
		contract = new Vector<Contract>(Size);
	}

//Etablissement contrat

	public void addContract() {

		contract.add(new Contract().Saisie());

	}

//Modification d'un contrat

	public Vector<Contract> updateContract(Integer Num) 
	{
		Integer i;
		
		if (contract.isEmpty()) {
			System.out.println(" Aucun contract établit ");
		} else 
		{
			for (i = 0; i < contract.size(); i++) 
			{
				if (contract.get(i).getNumContrat().equals(Num)) 
				{
					contract.set(i, new Contract().Saisie());
					break;
				}

			}
			
			if(i.equals(contract.size()))
			{
				System.out.println(" Num not found ");
			}
		}

		return contract;
	}

	// Recherche

	public void searchContract(Integer Num) 
	{
		Integer i;
		
		if (contract.isEmpty()) 
		{
			System.out.println(" Aucun contrat edité !");
		} else 
		{
			for ( i = 0; i < contract.size(); i++) 
			{
				if (contract.get(i).getNumContrat().equals(Num)) 
				{
					System.out.println(contract.get(i).toString());
					break;
				}
			}
			
			if(i.equals(contract.size()))
			{
				System.out.println(" Num not found ");
			}
		}
	}

// Affichage des contrats

	public void displayAllContract() {
		if (contract.isEmpty()) {
			System.out.println(" Aucun contrat à afficher !!");
		} else {
			for (int i = 0; i < contract.size(); i++) {
				System.out.println(contract.get(i).toString());
			}
		}
	}

// Suppression d'un contract

	public Vector<Contract> distroyContract(Integer num) 
	{
		Integer i;
		
		if (contract.isEmpty())
			System.out.println(" Aucun contract existant !");
		else {
			for ( i = 0; i < contract.size(); i++) {
				if (contract.get(i).getNumContrat().equals(num)) 
				{
					contract.removeElementAt(i);
					System.out.println("\t Well deleted :/ ");
					break;
				}
			}
			
			if(i.equals(contract.size()))
			{
				System.out.println(" Code not found ");
			}
		}

		return contract;
	}

}
