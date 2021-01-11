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
		System.out.print(" User name : ");
		this.nom = sc.nextLine();
		System.out.print(" Prenom  : ");
		this.prenom = sc.nextLine();
		System.out.print(" Tel : ");
		this.Tel = sc.nextInt(); 
	    sc.nextLine();
		System.out.print(" Type compte ( Admin | gerant ) : ");
		this.type = sc.nextLine();
		
		return new Compte(this.Id,this.nom,this.prenom,this.Tel,this.type);
	}

	@Override
	public String toString() {
		return "Compte [\n\tId Compte : " + Id + ",\n\tNom : " + nom + ",\n\tPrenom : " 
									+ prenom + ",\n\tTel : " + Tel + ",\n\tType compte : " + type + " \n\t ] ";
	}
	
	
	
	
}
