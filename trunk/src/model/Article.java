package model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Article implements Comparable<Article> {


	@Override
	public String toString() {
		return "Article [code=" + code + "]";
	}

	public Article(Integer code, String nom, double prix, int stock) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}


	@Override
	public int compareTo(Article art) {
		return this.code.compareTo(art.code);

	}


	@Override
	public int hashCode() {
		return code.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Article){
			if(this.code.equals(((Article) obj).code)
					&& this.nom.equals(((Article) obj).nom)
					&& this.prix == ((Article) obj).prix
					&& this.stock == ((Article) obj).stock
				)
				return true;
			else
				return false;
		}else
			return false;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int tock) {
		this.stock = tock;
	}

	@Id
	@Column(name="CODE", nullable=false)
	private Integer code;

	@Column(name="NOM", nullable=true)
	private String nom;

	@Column(name="PRIX", nullable=true)
	private double prix;

	@Column(name="STOCK", nullable=true)
	private int stock;



}
