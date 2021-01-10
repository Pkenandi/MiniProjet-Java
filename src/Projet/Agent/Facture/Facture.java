package Projet.Agent.Facture;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Facture 
{
	
	private Integer Numero;
	private String Type;
	private double montant;
	private String delai;
	
	public Integer getNumero()
	{
		return this.Numero;
	}
	
	public Facture()
	{
		
	}
	
	public Facture(Integer Num, String T, double M, String delai)
	{
		this.Numero = Num;
		this.Type = T;
		this.montant = M;
		this.delai = delai;

	}
	
	public Facture Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Numero de la facture : ");
		this.Numero = sc.nextInt();
		sc.nextLine();
		System.out.print(" Type facture (eau|gaz|elec) : ");
		this.Type = sc.nextLine();		
		System.out.print(" Date de paiement (dd/mm/yyyy) : ");
		this.delai = sc.nextLine();
		System.out.print(" Montant : ");
		this.montant = sc.nextInt();

		
		return new Facture(this.Numero,this.Type,this.montant,this.delai);
	}

	@Override
	public String toString() {
		return "Facture  \n   [ Numero : " + Numero + ", Type : " + Type + ", montant : " + montant + ", delai : " + delai + " ]";
	}

}
