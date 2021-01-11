package Projet.Acceuil;

import java.io.IOException;
import java.util.Scanner;

import Projet.Administrateur.OperationsOnComptes;
import Projet.Administrateur.OperationsOnMaison;
import Projet.Agent.OperationsOnClient;
import Projet.Agent.OperationsOnContract;
import Projet.Agent.OperationsOnFacture;
import Projet.Agent.Contract.Contract;

public class Show 
{
	
	public static void Boot() throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		Integer reponse;
			
		 							// Administrateur
		
		OperationsOnComptes Ooc = new OperationsOnComptes(1);
		OperationsOnMaison Oom = new OperationsOnMaison(1);   
		
											// Gerant
		
		OperationsOnClient Ooclt = new OperationsOnClient(1);       
		OperationsOnContract Ooct = new OperationsOnContract(1);
		OperationsOnFacture Oof = new OperationsOnFacture(1);		
		
		do
		{

			System.out.println("\n\n\n"+color.blue);
			System.out.println("\t        ### BIENVENU ###    ");
			System.out.println("\t Societé de Location Immobilière    "+color.reset);
			System.out.println("\n");
			System.out.println("\t Connectez-vous en tant que : \n");
			System.out.println("\t  [ 1 ]   Administrateur ");
			System.out.println("\t  [ 2 ]   Gerant ");
			
			System.out.print("\n\n\t    ==> : ... ");

			Integer choice = sc.nextInt();

			switch (choice) {
			case 1: {
				Integer Rep;


				do {
					
					System.out.println(color.blue+"\t    [#]   Authentification   [#] \n");
					sc.nextLine();
					System.out.print("\n\t Enter your password :  "+color.reset);
					String password = sc.nextLine();
					
					if(Integer.parseInt(password) == 1234)
					{
						
						System.out.println("\n\n");
						System.out.println( color.green +"\t   You're connected as an < Admin > "+ color.reset);
						System.out.println("\n\t [ 1 ] Gerer les Comptes ");
						System.out.println("\n\t [ 2 ] Gerer les Maisons ");
						
						System.out.print("\n\t ==> : ...  ");
						Integer choice_1 = sc.nextInt();

						switch (choice_1) {
							
						case 1:{
							
							Integer rep;
							
							do {
								
								System.out.println("\n\n");
								System.out.println("\t Gestion des < Comptes > ");
								System.out.println("\n\t [ 1 ] Ajouter un compte ");
								System.out.println("\n\t [ 2 ] Modifier un compte");
								System.out.println("\n\t [ 3 ] Supprimer un compte");
								System.out.println("\n\t [ 4 ] Rechercher un compte");
								System.out.println("\n\t [ 5 ] Afficher tout les Comptes ");
								System.out.print("\n\t ==> : ...  ");
								
								Integer compte = sc.nextInt();

								if (compte.equals(1)) 
								{
									System.out.println("\n\t  < Creation d'un Compte >  \n");
									Ooc.Creation();
									
									System.out.println(color.green+"\n\t Creation effectuer avec succès :/ "+color.reset);
									
								} else 
									if (compte.equals(2)) 
									{
										System.out.println("\n\t < Modification d'un Compte > \n ");
										Scanner sc1 = new Scanner(System.in);
										
										System.out.print("\n\t Id du Compte  :  ");
										Integer id = sc1.nextInt();
										
										Ooc.updateCompte(id);

								} else 
									if (compte.equals(3)) 
									{
										System.out.println("\n\t < Suppression d'un Compte > \n");
										
										Scanner sc2 = new Scanner(System.in);
										System.out.print("\n\t Id du compte :  ");
										Integer id = sc2.nextInt();
										
										Ooc.distroyCompte(id);
										
								} else 
									if (compte.equals(4)) 
									{
										System.out.println("\n\t < Recherche d'un Compte > \n");
										Scanner sc3 = new Scanner(System.in);
										System.out.print("\n\t Id du Compte :  ");
										
										Integer id = sc3.nextInt();
										
										Ooc.searchCompte(id);
										
								} else if (compte.equals(5)) 
								{
									System.out.println("\n\t< Affichage des tout les Comptes > \n");
									
									Ooc.displayAllCompte();
								}

								System.out.println("\n\n\t [ 1 ] Retour au Menu < Comptes >");
								System.out.println("\n\t [ 2 ] Sortir du programme ");
								
								System.out.println("\n\t ==> :  ");
								
								rep = sc.nextInt();
								
								
							}while(rep.equals(1));
							
							break;
						}
						
						case 2:
						{
							Integer rep;
							
							do
							{
								
								System.out.println("\n\n");
								System.out.println("\t Gestion des < Maisons > ");
								System.out.println("\n\t [ 1 ] Ajouter une maison ");
								System.out.println("\n\t [ 2 ] Modifier une maison ");
								System.out.println("\n\t [ 3 ] Supprimer une maison ");
								System.out.println("\n\t [ 4 ] Rechercher une maison ");
								System.out.println("\n\t [ 5 ] Afficher toutes les maisons  ");
								System.out.print("\n\t ==> : ...  ");
								Integer maison = sc.nextInt();

								if (maison.equals(1)) 
								{
									System.out.println("\n\t  < Ajout d'une maison >  \n");
									Oom.addHouse();
									
									System.out.println(color.green+"\n\t Ajout effecter avec succès :/ "+color.reset);
									
								} else 
									if (maison.equals(2)) 
									{
										System.out.println("\n\t < Modification des données d'une Maison > \n ");
										Scanner sc1 = new Scanner(System.in);
										
										System.out.print("\n\t Id de la maison  :  ");
										Integer id = sc1.nextInt();
										
										Oom.updateHouse(id);

								} else 
									if (maison.equals(3)) 
									{
										System.out.println("\n\t < Suppression d'une Maison > \n");
										Scanner sc2 = new Scanner(System.in);
										
										System.out.print("\n\t Id de la maison :  ");
										Integer id = sc2.nextInt();
										
										Oom.distroyHouse(id);
										
								} else 
									if (maison.equals(4)) 
									{
										System.out.println("\n\t < Recherche d'une Maison > \n");
										Scanner sc3 = new Scanner(System.in);
										
										System.out.print("\n\t Id de la maison :  ");
										Integer id = sc3.nextInt();
										
										Oom.searchHouse(id);
										
								} else 
									if (maison.equals(5))
									{
										System.out.println("\n\t< Affichage des tout les Maisons > \n");
										Oom.displayAllHouse();
									}

								System.out.println("\n\n\t [ 1 ] Retour au Menu < Maison >");
								System.out.println("\n\t [ 2 ] Sortir du programme ");
								System.out.println("\n\t ==> :  ");
								rep = sc.nextInt();
								
							}while(rep.equals(1));
							
							break;
						}

						}
						
					}else {
						System.out.println(color.red+"\t Password invalid ! back to Menu and try again ... "+color.reset);
						break;
					}

					System.out.println(" \n\t [ 1 ] Retour au Menu < Administrateur >");
					System.out.println(" \n\t [ 2 ] Exit ");
					Rep = sc.nextInt();

				} while (Rep.equals(1));
				break;
			}

			case 2: {

				Integer Rep,i;
				
				do {
					
						System.out.println(color.blue+"\t    [#]   Authentification   [#] \n");
						sc.nextLine();
						System.out.print("\n\t Enter your Username :..  "+color.reset);
						String userName = sc.nextLine();
						
						for(i = 0; i < Ooc.compte.size(); i++)
						{
							if((Ooc.compte.get(i).getnom().equals(userName)) && (Ooc.compte.get(i).gettype().toLowerCase().equals("gerant")))
							{
								System.out.println("\n\n");
								System.out.println(color.purple+"\t  Welcom [ " + userName +" ] as < Gerant >"+color.reset);
								System.out.println("\n\t [ 1 ] Gerer les clients ");
								System.out.println("\n\t [ 2 ] Gerer les contrats ");
								System.out.println("\n\t [ 3 ] Gerer les factures ");
								System.out.print("\n\t ==> : ...  ");
								Integer choice_1 = sc.nextInt();
	
								switch (choice_1) {
	
								case 1: {
	
									Integer rep;
	
								do {
										
										System.out.println("\n\n");
										System.out.println("\t Gestion des < Clients > ");
										System.out.println("\n\t [ 1 ] Ajouter  ");
										System.out.println("\n\t [ 2 ] Modifier ");
										System.out.println("\n\t [ 3 ] Supprimer ");
										System.out.println("\n\t [ 4 ] Rechercher ");
										System.out.println("\n\t [ 5 ] Afficher tout les client ");
										System.out.print("\n\t ==> : ...  ");
										Integer client = sc.nextInt();
	
										if (client.equals(1)) 
										{
											System.out.println("\n\t  < Ajout d'un Client ou Locataire >  \n");
											Ooclt.addClient();
											
											System.out.println(color.purple+"\n\t Ajout effectuer avec succès :/ "+color.reset);
											
										} else 
											if (client.equals(2)) 
											{
												
												System.out.println("\n\t < Modification d'un Client > \n ");
												
												Scanner sc1 = new Scanner(System.in);
												System.out.print("\n\t Code du client :  ");
												
												Integer code = sc1.nextInt();
												
												Ooclt.updateClient(code);
	
										} else 
											if (client.equals(3)) 
											{
												
												System.out.println("\n\t < Suppression d'un Client > \n");
												
												Scanner sc2 = new Scanner(System.in);
												System.out.print("\n\t Code du client :  ");
												Integer code = sc2.nextInt();
												
												Ooclt.distroyClient(code);
											
										} else 
											if (client.equals(4)) 
											{
												
												System.out.println("\n\t < Recherche d'un Client > \n");
												
												Scanner sc3 = new Scanner(System.in);
												System.out.print("\n\t Code du client  :  ");
												Integer code = sc3.nextInt();
												
												Ooclt.searchClient(code);
												
										} else 
											if (client.equals(5)) 
											{
												System.out.println("\n\t< Affichage des tout les Clients > \n");
												Ooclt.displayAllClient();
											}
	
											System.out.println("\n\n\t [ 1 ] Retour au Menu ");
											System.out.println("\n\t [ 2 ] Sortir du programme ");
											System.out.println("\n\t ==> :  ");
											
											rep = sc.nextInt();
	
									} while (rep.equals(1));
	
									break;
	
								}
	
								case 2: {
									Integer rep;
	
									do {
	
										System.out.println("\n\n");
										System.out.println("\t Gestion des < Contrats > ");
										System.out.println("\n\t [ 1 ] Ajouter un contrat ");
										System.out.println("\n\t [ 2 ] Modifier un contract ");
										System.out.println("\n\t [ 3 ] Supprimer un contract ");
										System.out.println("\n\t [ 4 ] Rechercher un contract ");
										System.out.println("\n\t [ 5 ] Afficher tout les contract ");
										System.out.print("\n\t ==> : ...  ");
										Integer contract = sc.nextInt();
	
										if (contract.equals(1)) 
										{
											System.out.println("\n\t  < Ajout d'un Contrat de location >  \n");
											Contract ct = new Contract();
											Scanner sc1 = new Scanner(System.in);
											
											Integer ctr;
											
											System.out.print(" Numero contrat : ");
											ct.setNumContrat(sc.nextInt());
											System.out.print(" Code Client : ");
											int code = sc1.nextInt();
											for(ctr = 0; ctr < OperationsOnClient.client.size(); ctr++)
											{
												if(OperationsOnClient.client.get(ctr).getCode().equals(code))
												{
													ct.setCodeClient(code);
													break;
												}
											}
											
											if(ctr.equals(OperationsOnClient.client.size()))
											{
												System.out.println(color.red+"\t Invalid code !"+color.reset);
												break;
											}
											
											System.out.print(" Prix loyer : ");
											double pl = sc.nextDouble();
											
											for(ctr = 0; ctr < OperationsOnClient.client.size(); ctr++)
											{
												if(OperationsOnClient.client.get(ctr).getCategorie().toLowerCase().equals("fidele"))
												{
													double value = 0.7;
													pl *=  value;
													ct.setPrixLoyer(pl);
													break;
												}
											}
											
											if(ctr.equals(OperationsOnClient.client.size()))
												ct.setPrixLoyer(pl);
											
											sc.nextLine();
											System.out.print(" Reglement : ");
											ct.setReglement(sc.nextLine());
											
											Ooct.contract.add(new Contract(ct.getNumContrat(), ct.getCodeClient(), ct.getPrixLoyer(), ct.getReglement()));
											
											System.out.println(color.purple+"\n\t Well added "+color.reset);
											
										} else if (contract.equals(2)) 
										{
											System.out.println("\n\t < Modification d'un Contrat > \n ");
											
											Scanner sc1 = new Scanner(System.in);
											System.out.print("\n\t Numero du contract  :  ");
											Integer num = sc1.nextInt();
											
											Ooct.updateContract(num);
											
										} else if (contract.equals(3)) 
										{
											System.out.println("\n\t < Suppression d'un Contrat > \n");
											Scanner sc2 = new Scanner(System.in);
											
											System.out.print("\n\t Numero du contrat  :  ");
											Integer code = sc2.nextInt();
											
											Ooct.distroyContract(code);
											
										} else 
											if (contract.equals(4)) 
											{
												System.out.println("\n\t < Recherche d'un Contrat > \n");
												Scanner sc3 = new Scanner(System.in);
												
												System.out.print("\n\t Numero du contract :  ");
												Integer code = sc3.nextInt();
												
												Ooct.searchContract(code);
												
										} else 
											if (contract.equals(5)) 
											{
												System.out.println("\n\t< Affichage des tout les Contrats > \n");
												Ooct.displayAllContract();
											}
	
										System.out.println("\n\n\t [ 1 ] Retour au Menu ");
										System.out.println("\n\t [ 2 ] Sortir du programme ");
										System.out.println("\n\t ==> :  ");
										rep = sc.nextInt();
	
									} while (rep.equals(1));
									break;
								}
	
								case 3: {
	
									Integer rep;
	
									do {
	
										System.out.println("\n\n");
										System.out.println("\t Gestion des < Factures > ");
										System.out.println("\n\t [ 1 ] Ajouter une facture ");
										System.out.println("\n\t [ 2 ] Modifier une facture ");
										System.out.println("\n\t [ 3 ] Supprimer une facture ");
										System.out.println("\n\t [ 4 ] Rechercher une facture ");
										System.out.println("\n\t [ 5 ] Afficher toutes les factures ");
										System.out.print("\n\t ==> : ...  ");
										Integer facture = sc.nextInt();
	
										if (facture.equals(1)) 
										{
											System.out.println("\n\t  < Ajout d'une facture >  \n");
											Oof.addFacture();
											
											System.out.println(color.purple+"\n\t Well Added :/ "+color.reset);
											
										} else 
											if (facture.equals(2)) 
											{
												System.out.println("\n\t < Modification d'une Facture > \n ");
												Scanner sc1 = new Scanner(System.in);
												
												System.out.print("\n\t Numero de la facture :  ");
												Integer num = sc1.nextInt();
												
												Oof.updateFacture(num);
												
										} else 
											if (facture.equals(3)) 
											{
												System.out.println("\n\t < Suppression d'une Facture > \n");
												Scanner sc2 = new Scanner(System.in);
												
												System.out.print("\n\t Numero de la facture  :  ");
												Integer code = sc2.nextInt();
												
												Oof.distroyFacture(code);
												
										} else 
											if (facture.equals(4)) 
											{
												System.out.println("\n\t < Recherche d'une Facture > \n");
												Scanner sc3 = new Scanner(System.in);
												
												System.out.print("\n\t Numero de la facture :  ");
												Integer code = sc3.nextInt();
												
												Oof.searchFacture(code);
												
										}else
											if (facture.equals(5)) 
											{
												
												System.out.println("\n\t< Affichage des toutes les Factures > \n");
												Oof.displayAllFacture();
											}
	
										System.out.println("\n\n\t [ 1 ] Retour au Menu ");
										System.out.println("\n\t [ 2 ] Sortir du programme ");
										System.out.println("\n\t ==> :  ");
										rep = sc.nextInt();
	
								} while (rep.equals(1));

								break;
							}
							}
							
							break;
							
						}
					
					}
					
					if(i.equals(Ooc.compte.size()))
					{
						System.out.println(color.red+"\t  Sorry !!  Username not valide, back to menu and try again ...\n "+color.reset);
						break;
					}
					
					System.out.println(" \n\t [ 1 ] Retour au Menu de < Gerant >");
					System.out.println(" \n\t [ 2 ] Exit ");
					Rep = sc.nextInt();

				} while (Rep.equals(1));

				break;
			}
			case 3:
				break;
			}
			
			System.out.println("\t [ 1 ] Retour au menu < Acceuil > ");
			System.out.println("\t [ 2 ] Exit ");
			System.out.println("  ==> : ");
			reponse = sc.nextInt();
			
		}while(reponse.equals(1));
	}

}