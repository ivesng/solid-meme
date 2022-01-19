import java.util.*;
class SystemFacture{
	static List<Facture> factures = new ArrayList<>();

	public static void ajouterFacture(Facture facture)
	{
		factures.add(facture);
		System.out.println("Avec succes");

	}
	public static void afficherFactures(String date){
		for (int i=0;i<factures.size();i++) {
			if (factures.get(i).getDateFacture().equals(date)) {
				factures.get(i).afficherFacture();
				
			}
		}
	}
	public static void afficherSynthese(){
		for (int i=0;i<factures.size();i++) {
			factures.get(i).afficherFacture();
		}
	}

	public static void afficherFacturee(int numeroFature){
		for (int i=0;i<factures.size();i++) {
			if (factures.get(i).getNumeroFacture() == numeroFature) {
				 factures.get(i).afficherFacture();
			}
		}
	}

	public static void main(String[] args) {
		

		Client clients = new Client();
		clients.setNomClient("Patrick");
		clients.setId(1);
		clients.setMatClient("124P");
		clients.setTelephone("0984763");

		Article articles = new Article();
		articles.setIdentifiant(1);
		articles.setNom("pc");
		articles.setQuantiteStock(2);
		articles.setPrixVente(12.500);
		articles.setNbreArticle(2);

		Article articles2 = new Article();

		articles2.setIdentifiant(2);
		articles2.setNom("stylo");
		articles2.setQuantiteStock(2);
		articles2.setPrixVente(14.500);
		articles2.setNbreArticle(2);

		Facture facture = new Facture();
		facture.setNumeroFacture(1);
		facture.setDateFacture("2020-01-20");
		facture.setArticle(articles);
		facture.setArticle(articles2);
		facture.setClient(clients);

	
		ajouterFacture(facture);
	


		System.out.println("----------------------------Par date-------------------------------");
		afficherFactures("2022-01-20");
		System.out.println("--------------------------Par Numero -------------------------------");
		afficherFacturee(1);
		System.out.println("----------------------------- Synthese ------------------------------");
		afficherSynthese();
	}



}
