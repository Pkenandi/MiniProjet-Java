package Projet.Administrateur.Maisons;

import java.util.Scanner;

public class Villa extends Maison {
	
	private double jardinTaille;
	private double tailleEspace;
	
	public Villa(Integer id, Adresse adresse, String status, String type, Integer nombrePieces, double Jt,double tailleEspace) 
	{	
		super(id, adresse, status, type, nombrePieces);
		
		this.jardinTaille = Jt;
		this.tailleEspace = tailleEspace;
		
	}
	
	public Villa()
	{
		
	}
	
	public Maison Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Id :");
		super.Id = sc.nextInt();
		sc.nextLine();
		System.out.println(" Adresse : ");
		super.adresse = new Adresse();
		adresse.Saisie();
		System.out.println(" Status ( Libre | Occupé ) : ");
		super.Status = sc.nextLine();
		System.out.println(" Nombre des pieces :  ");
		super.nombrePieces = sc.nextInt();
		sc.nextLine();
		super.Type = " Villa ";
		System.out.println(" taille du jardin : ");
		this.jardinTaille = sc.nextDouble();
		System.out.println(" Taille de la surface : ");
		this.tailleEspace = sc.nextDouble();
		
		return new Villa(super.Id,super.adresse,super.Status, super.Type,super.nombrePieces,this.jardinTaille,this.tailleEspace);
	}

	@Override
	public String toString() {
		return " Villa :\n[\n  Id : " + super.Id +",\n " + super.adresse.toString() 
				+"\n Type : <"+ super.Type + ">\n  Status :  <" + super.Status +"> "
				+ "possedant un jardin de " + this.jardinTaille + "m et une surface de " + this.tailleEspace+"m² \n  "
				+ "\n  avec <" + super.nombrePieces+" > Pieces \n]";
	}
	
	

}
