package Projet.Agent.Client;

import java.util.*;
import java.lang.*;

public class ClientFidele extends Client
{
	
	private double Remise;
	
	public double getRemise()
	{
		return this.Remise;
	}

	public ClientFidele() 
	{
		
		
	}
	
	public ClientFidele(Integer code, String nom, String prenom, Integer tel, String cat, double r) 
	{
		super(code, nom, prenom, tel, cat);
		this.Remise = r;
	}
	
	public Client Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Code : ");
		this.Code = sc.nextInt();
		sc.nextLine();
		System.out.print(" Nom : ");
		this.Nom = sc.nextLine();
		System.out.print(" Prenom : ");
		this.Prenom = sc.nextLine();
		System.out.print(" Telephone : ");
		this.Tel = sc.nextInt();
		sc.nextLine();
		super.Categorie = "fidele";
		this.Remise = 0.7;
		
		return new ClientFidele(super.Code, super.Nom, super.Prenom, super.Tel, super.Categorie, this.Remise);
	}

	@Override
	public String toString() {
		return "Client Fidele [\n Code : " + Code + ",\n Nom : " + Nom + ","
				    + "\n Prenom : " + Prenom + ",\n Tel : "
					+ Tel + ",\n Categorie=" + Categorie + " \n]";
	}

}
