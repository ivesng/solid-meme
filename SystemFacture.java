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
	

		Article articles3 = new Article();

		articles3.setIdentifiant(1);
		articles3.setNom("cahier");
		articles3.setQuantiteStock(2);
		articles3.setPrixVente(500.00);
		articles3.setNbreArticle(3);

		Article articles4 = new Article();

		articles4.setIdentifiant(2);
		articles4.setNom("iphone13");
		articles4.setQuantiteStock(2);
		articles4.setPrixVente(100.00);
		articles4.setNbreArticle(2);



		Client clients2 = new Client();
	
		clients2.setNomClient("Enock");
		clients2.setId(2);
		clients2.setMatClient("124En");
		clients2.setTelephone("+241984763");

		Facture facture2 = new Facture();
		facture2.setNumeroFacture(2);
		facture2.setDateFacture("2022-01-20");
		facture2.setArticle(articles3);
		facture2.setArticle(articles4);
		facture2.setClient(clients2);

		ajouterFacture(facture2);

		Article articles5 = new Article();

		articles5.setIdentifiant(1);
		articles5.setNom("cartable");
		articles5.setQuantiteStock(2);
		articles5.setPrixVente(100.00);
		articles5.setNbreArticle(3);

		ArticleHabillent articles6 = new ArticleHabillent();

		articles6.setIdentifiant(1);
		articles6.setNumeroTaille(2);
		articles6.setNom("Pantalon");
		articles6.setLettreTaille("XXL");
		articles6.setQuantiteStock(2);
		articles6.setPrixVente(100.00);
		articles6.setNbreArticle(2);



		Client clients3 = new Client();
	
		clients3.setNomClient("Cherina");
		clients3.setId(2);
		clients3.setMatClient("124En");
		clients3.setTelephone("+241984763");

		Facture facture3 = new Facture();
		facture3.setNumeroFacture(2);
		facture3.setDateFacture("2022-01-20");
		facture3.setArticle(articles5);
		facture3.setArticle(articles6);
		facture3.setClient(clients3);

		ajouterFacture(facture3);

		ArticleHabillent articles7 = new ArticleHabillent();

		articles7.setIdentifiant(1);
		articles7.setNumeroTaille(2);
		articles7.setNom("Culotte");
		articles7.setLettreTaille("L");
		articles7.setQuantiteStock(2);
		articles7.setPrixVente(400.00);
		articles7.setNbreArticle(2);

		ArticleHabillent articles8 = new ArticleHabillent();

		articles8.setIdentifiant(2);
		articles8.setNumeroTaille(2);
		articles8.setNom("singlet");
		articles8.setLettreTaille("XXL");
		articles8.setQuantiteStock(2);
		articles8.setPrixVente(900.00);
		articles8.setNbreArticle(5);



		Client clients4 = new Client();
	
		clients4.setNomClient("Dyna");
		clients4.setId(4);
		clients4.setMatClient("124En");
		clients4.setTelephone("+241984763");

		Facture facture4 = new Facture();
		facture4.setNumeroFacture(4);
		facture4.setDateFacture("2022-01-20");
		facture4.setArticle(articles7);
		facture4.setArticle(articles8);
		facture4.setClient(clients4);

		ajouterFacture(facture4);


		ArticleHabillent articles9 = new ArticleHabillent();

		articles9.setIdentifiant(1);
		articles9.setNumeroTaille(2);
		articles9.setNom("chemise");
		articles9.setLettreTaille("L");
		articles9.setQuantiteStock(2);
		articles9.setPrixVente(400.00);
		articles9.setNbreArticle(2);

		ArticleHabillent articles10 = new ArticleHabillent();

		articles10.setIdentifiant(2);
		articles10.setNumeroTaille(2);
		articles10.setNom("pilovert");
		articles10.setLettreTaille("XXL");
		articles10.setQuantiteStock(2);
		articles10.setPrixVente(900.00);
		articles10.setNbreArticle(5);



		Client clients5 = new Client();
	
		clients5.setNomClient("Emmanuella");
		clients5.setId(5);
		clients5.setMatClient("124En");
		clients5.setTelephone("+241984763");

		Facture facture5 = new Facture();
		facture5.setNumeroFacture(5);
		facture5.setDateFacture("2022-01-20");
		facture5.setArticle(articles9);
		facture5.setArticle(articles10);
		facture5.setClient(clients5);

		ajouterFacture(facture5);


		System.out.println("----------------------------Par date-------------------------------");
		afficherFactures("2022-01-20");
		System.out.println("--------------------------Par Numero -------------------------------");
		afficherFacturee(1);
		System.out.println("----------------------------- Synthese ------------------------------");
		afficherSynthese();
	}



}