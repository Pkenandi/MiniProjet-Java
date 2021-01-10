package Projet.Administrateur.Maisons;

import java.util.Scanner;

class Adresse
{
	private String Ville;
	private String Gouvernorat;
	private String Cite;
	
	public String getVille()
	{
		return Ville;
	}
	
	public String getGouv()
	{
		return Gouvernorat;
	}
	
	public String getCite()
	{
		return Cite;
	}
	
	public Adresse()
	{
		
	}
	
	public Adresse(String V, String G, String C)
	{
		this.Ville = V;
		this.Gouvernorat = G;
		this.Cite = C;
	}
	
	public Adresse Saisie()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\t Ville : ");
		this.Ville = sc.nextLine();
		System.out.println("\t Gouvernorat : ");
		this.Gouvernorat = sc.nextLine();
		System.out.println("\t Cité : ");
		this.Cite = sc.nextLine();
		
		return new Adresse(this.Ville, this.Gouvernorat,this.Cite);
	}
	
	public String toString()
	{
		return " Adresse : \n\t  Ville de " + this.getVille() + " dans le gouvernorat de " + this.getGouv() + " Cité " + this.getCite() ;
	}
	
}

public class Maison {
	
	protected Integer Id;
	protected Adresse adresse;
	protected String Status;
	protected String Type;
	protected Integer nombrePieces;
	
	public Integer getId()
	{
		return this.Id;
	}
	
	public String getType()
	{
		return this.Type;
	}
	
	public Maison(Integer id, Adresse adresse, String status, String type, Integer nombrePieces) {

		Id = id;
		this.adresse = adresse;
		Status = status;
		this.Type = type;
		this.nombrePieces = nombrePieces;
	}
	
	public Maison()
	{
		
	}
	
	public Maison Saisie()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Type maison ( Immeuble | Villa ) : ");
		this.Type = sc.nextLine();
		
		if(this.Type.toLowerCase().equals("immeuble"))
		{
			return new Immeuble().Saisie();
		}else if(this.Type.toLowerCase().equals("villa"))
		{
			return new Villa().Saisie();
		}else
			return null;
		/*System.out.println(" Id :");
		this.Id = sc.nextInt();
		sc.nextLine();
		System.out.println(" Adresse : ");
		this.adresse = new Adresse();
		adresse.Saisie();
		System.out.println(" Status ( Libre | Occupé ) : ");
		this.Type = sc.nextLine();
		System.out.println(" Nombre des pieces :  ");
		this.nombrePieces = sc.nextInt();
		this.Status = sc.nextLine();
		System.out.println(" Type ( Immeuble | Villa ) : ");
		if(sc.nextLine().toLowerCase().equals("immeuble"))
			
		
		return new Maison(Id, this.adresse, Status, Type, nombrePieces);*/
	}

	@Override
	public String toString() {
		return "Maison \n    [ Id : " + Id + "," + adresse.toString() + ", Status : " + Status + ", <"+ this.Type +">, Nombre pieces : <" + nombrePieces
				+ "> ]";
	}
	
}