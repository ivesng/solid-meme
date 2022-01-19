import java.util.*;

class Article{
	private int identifiant;
	private String nom;
	private Double prixVente;
	private int quantiteStock;
	private int nbreArticle;

	public Article(){}


	public void setIdentifiant(int identifiant){ 
		this.identifiant = identifiant; 
	}
	public int getIdentifiant(){ return this.identifiant; }
	public void setNom(String nom){ this.nom = nom; }
	public String getNom(){ return this.nom; }
	public void setNbreArticle(int nbreArticle){ this.nbreArticle = nbreArticle; }
	public int getNbreArticle(){ return this.nbreArticle; }
	
	public void setPrixVente(Double prixVente){ 
		if (prixVente > 0) {
			this.prixVente = prixVente; 
		}else{}
		
	}
	 Double getPrixVente(){ return this.prixVente; }
	void setQuantiteStock( int quantiteStock) { 
		if (quantiteStock > 0) {
			this.quantiteStock = quantiteStock; 
		}else{}
		
	}

	 int getQuantiteStock(){
		if (this.quantiteStock > 0) {
			return this.quantiteStock;
		}else{
			return 0;
		}
	}


	 int approvionnement(int nombre)
	{
		if (nombre > 0) 
		{
			return this.quantiteStock + nombre;
		}else{
			return 0;
		}
	}

	int vendre(int nombre)
	{
		if ((nombre > 0) && (this.quantiteStock > nombre)) {
			return this.quantiteStock -  nombre;
		}else{
			return 0;
		}
	}
}

class ArticleHabillent extends Article{
	private int numeroTaille;
	private String lettreTaille;
	private String tissu;

	public ArticleHabillent(){}

	public void setNumeroTaille(int numeroTaille){ this.numeroTaille = numeroTaille; }
	public int getNumeroTaille(){ return this.numeroTaille; }
	public void setLettreTaille(String lettreTaille){ this.lettreTaille = lettreTaille; }
	public String getLettreTaille(){ return this.lettreTaille; }
}


public class Facture{
	private int numeroFature;
	private String dateFacture;
	private List<Article> articles;
	private Client client;


	public Facture(){
		articles = new ArrayList<>();
	}

	public void setNumeroFacture(int numeroFature) { this.numeroFature = numeroFature; }
	public int getNumeroFacture() { return this.numeroFature; }

	public void setDateFacture(String dateFacture) { this.dateFacture = dateFacture; }

	public String getDateFacture() { return this.dateFacture; }
	public void setArticle(Article articles){ this.articles.add(articles); }

	public List<Article> getArticle(){ return this.articles; }
	public void setClient(Client client){ this.client = client; }
	public Client getClient(){ return this.client; }

	public void afficherFacture(){
		System.out.println("Numero : " + this.getNumeroFacture());
		System.out.println("Date  : " + this.getDateFacture());
		System.out.println("Nom client : " + this.getClient().getNomClient());
		for (int i= 0;i < this.getArticle().size(); i++) {
			System.out.println("Nom article :" + this.getArticle().get(i).getNom());
			System.out.println("Quantite : " +this.getArticle().get(i).getQuantiteStock());
			System.out.println("Prix : " +this.getArticle().get(i).getPrixVente());
		}
		System.out.println("Total :"+ calculerTotal());
	}
	public int calculerTotal(){
		int nbre = 0;
		for (int i=0;i< this.getArticle().size(); i++) {
			nbre += this.getArticle().get(i).getPrixVente() * this.getArticle().get(i).getQuantiteStock();
		}
		return nbre;
	}

}



class Client{
	private int id;
	private String nomClient;
	private String matClient;
	private String telephone;

	public Client(){}

	public void setId(int id){this.id = id; }
	public int getId(){ return this.id; }
	public void setNomClient(String nomClient){this.nomClient = nomClient; }
	public String getNomClient(){ return this.nomClient; }
	public void setMatClient(String matClient){this.matClient = matClient; }
	public String getMatClient(){ return this.matClient; }
	public void setTelephone(String telephone){this.telephone = telephone; }
	public String getTelephone(){ return this.telephone; }

}

