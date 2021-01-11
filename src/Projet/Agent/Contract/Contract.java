package Projet.Agent.Contract;

import java.util.Scanner;


public class Contract 
{
	
	private Integer numContrat; 
	private double prixLoyer;
	private String Reglement;
	private Integer codeClient;
	
	
	public Integer getNumContrat() {
		return numContrat;
	}

	public void setNumContrat(Integer numContrat) {
		this.numContrat = numContrat;
	}

	public double getPrixLoyer() {
		return prixLoyer;
	}

	public void setPrixLoyer(double prixLoyer) {
		this.prixLoyer = prixLoyer;
	}

	public String getReglement() {
		return Reglement;
	}

	public void setReglement(String reglement) {
		Reglement = reglement;
	}

	public Integer getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(Integer codeClient) {
		this.codeClient = codeClient;
	}

	public Contract(Integer numContrat, Integer codeClient, double pL, String reglement) 
	{
		this.numContrat = numContrat;
		Reglement = reglement;
		this.prixLoyer = pL;
		this.codeClient = codeClient;
			
	}
	
	public Contract()
	{
		
	}
	
	public Contract Saisie()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Numero contrat : ");
		this.numContrat = sc.nextInt();
		System.out.print(" Code Client : ");
		this.codeClient = sc.nextInt();
		System.out.print(" Prix loyer : ");
		this.prixLoyer = sc.nextDouble();
		sc.nextLine();
		System.out.print(" Reglement : ");
		this.Reglement = sc.nextLine();

		return new Contract(this.numContrat,this.codeClient,this.prixLoyer,this.Reglement);

	}

	@Override
	public String toString() 
	{
		return " Contract    [\n   numero : " + this.numContrat + ",\n   Loyer : " + this.prixLoyer + 
				",\n   Reglement : <" + this.Reglement+ "> ,\n   code du client : " + this.codeClient + " \n\t ] ";
	}

	
}
