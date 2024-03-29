package model;

import java.util.ArrayList;
import java.util.Collections;

import model.comparator.CompareLignePanierOnArticle;

public class Panier {

	ArrayList<LignePanier> lignesPanier;
	
	public Panier() {
		lignesPanier = new ArrayList<LignePanier>();
	}
	
	@Override
	public String toString() {
		String s =  "Panier : \n";
		for(LignePanier l : lignesPanier){
			s+=l.toString()+"\n";
		}
		
		return s;
		
	}

	/**
	 * M�thode addArticle
	 * Permet d'ajouter un article au panier.
	 * Utilise la recherche binaire (dichotomie) afin de placer l'article dans le panier.
	 * Si ce dernier existe d�ja, il incremente la quantit�.
	 * Utilise la classe comparator CompareLignePanierOnArticle
	 * @param art
	 */
	public void addArticle(Article art, int quantite){
		LignePanier nvlle_ligne = new LignePanier(art, quantite);
		int index = Collections.binarySearch(lignesPanier,nvlle_ligne, new CompareLignePanierOnArticle());
		if(index < 0){
			lignesPanier.add((-index)-1, nvlle_ligne);
		}
		else{
			lignesPanier.get(index).setQuantite(lignesPanier.get(index).getQuantite()+quantite);
		}
	}
	
	
	/**
	 * Renvoi le nombre d'article dans le panier
	 * @return
	 */
	public int getNumberArticle(){
		int number = 0;
		for(LignePanier l:lignesPanier){
			number += l.getQuantite();
		}
		return number;
	}

	public ArrayList<LignePanier> getLignesPanier() {
		return lignesPanier;
	}
	
	public void removeArticle(Article art){
		LignePanier nvlle_ligne = new LignePanier(art, 1);
		int index = Collections.binarySearch(lignesPanier,nvlle_ligne, new CompareLignePanierOnArticle());
		if(index >= 0){
			lignesPanier.remove(index);
		}
		
	}
	
	public void majArticle(Article art, int quantite){
		LignePanier nvlle_ligne = new LignePanier(art, quantite);
		int index = Collections.binarySearch(lignesPanier,nvlle_ligne, new CompareLignePanierOnArticle());
		if(index >= 0){
			lignesPanier.get(index).setQuantite(quantite);
		}
		
	}
}
