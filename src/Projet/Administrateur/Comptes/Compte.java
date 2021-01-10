package Projet.Administrateur.Comptes;

import java.util.Scanner;

enum Type
{
	Ad("Administrateur"),Gr(" Gerant ");
	
	String T;
	
	Type(String t)
	{
		T = t;
	}
	
	public String getT()
	{
		return T;
	}
	
}

public class Compte 
{

	private Integer Id;
	private String nom;
	private String prenom;
	private Integer Tel;
	private String type;
	
	public Integer getId()
	{
		return this.Id;
	}
	
	public String getnom()
	{
		return nom;
	}
	
	public String gettype()
	{
		return type;
	}
	
	public Compte()
	{
		
	}
	
	public Compte(Integer id, String nom, String prenom, Integer tel, String type) 
	{
		Id = id;
		this.nom = nom;
		this.prenom = prenom;
		Tel = tel;
		this.type = type;
		
	}
	
	public Compte Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Id compte : ");
		this.Id = sc.nextInt();
		sc.nextLine();
		System.out.print(" Nom de l'utilisateur : ");
		this.nom = sc.nextLine();
		System.out.print(" Prenom de l'utilisateur : ");
		this.prenom = sc.nextLine();
		System.out.print(" Tel : ");
		this.Tel = sc.nextInt(); 
	    sc.nextLine();
		System.out.print(" Type compte ( Admin /Gr ) : ");
		this.type = sc.nextLine();
		
		return new Compte(this.Id,this.nom,this.prenom,this.Tel,this.type);
	}

	@Override
	public String toString() {
		return "Compte [ Id Compte : " + Id + ", Nom : " + nom + ", Prenom : " + prenom + ", Tel : " + Tel + ", Type compte : " + type + " ] ";
	}
	
	
	
	
}
