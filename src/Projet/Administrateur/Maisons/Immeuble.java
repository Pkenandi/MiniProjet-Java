package Projet.Administrateur.Maisons;

import java.util.Scanner;

enum Appart
{
	N(" Non Meubl� "),M(" Meubl� ");
	
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

enum Categorie // Categorie de l'immeuble
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
		
		if(categorie.toLowerCase().equals("res"))
		{
			this.categorie = Categorie.R.getCat();
		}else
			if(categorie.toLowerCase().equals("ad"))
				this.categorie = Categorie.Ad.getCat();
			else if(categorie.toLowerCase().equals("ens"))
				this.categorie = Categorie.Ens.getCat();
			else if(categorie.toLowerCase().equals("com"))
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
		
		System.out.print(" Identifiant :");
		super.Id = sc.nextInt();
		sc.nextLine();
		System.out.print(" < Adresse > ");
		super.adresse = new Adresse();
		adresse.Saisie();
		System.out.print(" Status ( Libre | Occup� ) : ");
		super.Status = sc.nextLine();
		System.out.print(" Nombre des pieces :  ");
		super.nombrePieces = sc.nextInt();
		super.Type = " Immeuble ";
		System.out.print(" Nombre etages : ");
		this.nombreEtages = sc.nextInt(); 
		sc.nextLine();
		System.out.print(" Categorie [ \n\tRes : Residentielle \n\tAd : Administrative \n\tEns : Enseignement \n\tCom : Commerciale \n\t] => :  ");
		this.categorie = sc.nextLine();
		
		if(categorie.toLowerCase().equals("res"))
		{
			this.categorie = Categorie.R.getCat();
		}else
			if(categorie.toLowerCase().equals("ad"))
				this.categorie = Categorie.Ad.getCat();
			else if(categorie.toLowerCase().equals("ens"))
				this.categorie = Categorie.Ens.getCat();
			else if(categorie.toLowerCase().equals("com"))
				this.categorie = Categorie.Com.getCat();
		
		System.out.print(" Nombre appartement : ");
		this.nombreAppart = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" Type Appart [ \n\t N : non meubl� \n\t M : meubl� \n\t ] => : "); 
		if(sc.nextLine().toUpperCase().equals("M"))
			this.typeAppart = Appart.M.getap();
		else
			this.typeAppart = Appart.N.getap();
		
		return new Immeuble(Id, adresse, Status, super.Type, super.nombrePieces , nombreEtages, categorie, nombreAppart, typeAppart);
		
	}

	@Override
	public String toString() {
		return "  Immeuble    [ \n Nombre Etages <" + nombreEtages + ">, \n Categorie : " 
					+ categorie + ",\n Nombre Appartement  : " + nombreAppart
				    + ",\n Type Appartement : " + typeAppart + ",\n Id : " 
				    + Id + ",\n  " + adresse.toString() + ",\n Status : " + Status
				    + ",\n Nombre Pieces : " + nombrePieces + "\n\t  ]";
	}
}
