package Projet.Administrateur.Maisons;

import java.util.Scanner;

enum Appart
{
	N(" Non Meublé "),M(" Meublé ");
	
	String ap;
	
	Appart(String a)
	{
		ap = a;
	}
	
	public String getap()
	{
		return ap;
	}
}

enum Categorie
{
	R("Residentielle"),Ad(" Administrative"),Ens(" Enseignement"),Com("Commerciale");
	
	String Cat;
	
	Categorie(String c)
	{
		Cat = c;
	}
	
	public String getCat()
	{
		return Cat;
	}
	
}

public class Immeuble extends Maison {
	
	private Integer nombreEtages;
	private String categorie;
	private Integer nombreAppart;
	private String typeAppart;
	
	public Immeuble()
	{
		
	}

	public Immeuble(Integer id, Adresse adresse, String status,String type, Integer nombrePieces, Integer nombreEtages,
			String categorie, Integer nombreAppart, String typeAppart) 
	{
		super(id, adresse, status, type, nombrePieces);
		this.nombreEtages = nombreEtages;
		
		if(categorie.toUpperCase().equals("R"))
		{
			this.categorie = Categorie.R.getCat();
		}else
			if(categorie.toUpperCase().equals("AD"))
				this.categorie = Categorie.Ad.getCat();
			else if(categorie.toUpperCase().equals("ENS"))
				this.categorie = Categorie.Ens.getCat();
			else if(categorie.toUpperCase().equals("COM"))
				this.categorie = Categorie.Com.getCat();
		
		this.nombreAppart = nombreAppart;
		
		if(typeAppart.toUpperCase().equals("M"))
			this.typeAppart = Appart.M.getap();
		else
			this.typeAppart = Appart.N.getap();
		
	}
	
	public Maison Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Id :");
		super.Id = sc.nextInt();
		sc.nextLine();
		System.out.print(" Adresse : ");
		super.adresse = new Adresse();
		adresse.Saisie();
		System.out.print(" Status ( Libre | Occupé ) : ");
		super.Status = sc.nextLine();
		System.out.print(" Nombre des pieces :  ");
		super.nombrePieces = sc.nextInt();
		super.Type = " Immeuble ";
		System.out.print(" Nombre etages : ");
		this.nombreEtages = sc.nextInt(); 
		sc.nextLine();
		System.out.print(" Categorie ( R | Ad | Ens | Com) : "); // R => residentielle; Ad=> administrative; Ens=> enseignement; Com=>Commerciale
		this.categorie = sc.nextLine();
		
		if(categorie.toUpperCase().equals("R"))
		{
			this.categorie = Categorie.R.getCat();
		}else
			if(categorie.toUpperCase().equals("AD"))
				this.categorie = Categorie.Ad.getCat();
			else if(categorie.toUpperCase().equals("ENS"))
				this.categorie = Categorie.Ens.getCat();
			else if(categorie.toUpperCase().equals("COM"))
				this.categorie = Categorie.Com.getCat();
		
		System.out.print(" Nombre Appartement : ");
		this.nombreAppart = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" Type Appart ( N | M ) : "); //N => Non meublé; M => Meublé
		if(sc.nextLine().toUpperCase().equals("M"))
			this.typeAppart = Appart.M.getap();
		else
			this.typeAppart = Appart.N.getap();
		
		return new Immeuble(Id, adresse, Status, super.Type, nombreAppart, nombreEtages, categorie, nombreAppart, typeAppart);
		
	}

	@Override
	public String toString() {
		return " [ Immeuble ]\n Nombre Etages <" + nombreEtages + ">, \n Categorie : " 
					+ categorie + ",\n Nombre Appartement  : " + nombreAppart
				    + ",\n Type Appartement : " + typeAppart + ",\n Id : " 
				    + Id + ",\n  " + adresse.toString() + ",\n Status : " + Status
				    + ",\n Nombre Pieces : " + nombrePieces + "\n ]";
	}
}
