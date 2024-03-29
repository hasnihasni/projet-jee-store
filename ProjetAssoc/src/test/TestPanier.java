package test;

import model.Article;
import model.Panier;

public class TestPanier {
	public static void main(String[] args) {
		Article art12 = new Article(12, "article12", 12.9, 2);
		Article art11 = new Article(11, "article11", 12.9, 2);
		Article art43 = new Article(43, "article43", 12.9, 2);
		Article art1 = new Article(1, "article1", 12.9, 2);
		Panier mon_panier = new Panier();
		System.out.println(mon_panier.toString());
		mon_panier.addArticle(art12,1);
		System.out.println(mon_panier.toString());
		mon_panier.addArticle(art11,1);
		System.out.println(mon_panier.toString());
		mon_panier.addArticle(art43,1);
		System.out.println(mon_panier.toString());
		mon_panier.addArticle(art1,100);
		System.out.println(mon_panier.toString());
		mon_panier.addArticle(art12,1);
		mon_panier.addArticle(art43,95);
		mon_panier.addArticle(art12,1);
		mon_panier.addArticle(art11,1);
		mon_panier.addArticle(art11,1);
		mon_panier.addArticle(art11,1);
		System.out.println(mon_panier.toString());
	}
}
