package Projet.Agent.Client;

import java.util.Scanner;

enum Type
{
	F("fidele"), R("rare");
	
	String type;
	
	Type(String t)
	{
		type = t;
	}
	
	public String toString()
	{
		return type;
	}
	
}

public class Client {
	
	protected Integer Code;
	protected String Nom;
	protected String Prenom;
	protected Integer Tel;
	protected String Categorie;
	
	public Integer getCode() {
		return Code;
	}

	public String getCategorie() {
		return Categorie;
	}
	
	public Client() {
		
	}
	
	public Client(Integer code, String nom, String prenom, Integer tel, String cat)
	{
		Code = code;
		Nom = nom;
		Prenom = prenom;
		Tel = tel;
		this.Categorie = cat;
		
	}
	
	public String toString()
	{
		return "\t Code :  " + this.Code + "| Nom :  " + this.Nom + "| Prenom : " + this.Prenom + "| Tel : "+ this.Tel + "| Categorie : " + this.Categorie;
	}
	
	public Client Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Categorie ( Fidele | Rare ) : ");
		this.Categorie = sc.nextLine();
		
		if(Categorie.toLowerCase().equals("fidele"))
		{
			return new ClientFidele().Saisie();
		}else 
		{
			return new ClientRare().Saisie();
		}

	}
	
}
