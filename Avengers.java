/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supereroi;

public class Avengers {
	private int HP;
	private String nome;
	private String colore;
	private int arma;
	private int potere;
	
	public Avengers() {
	}
	
	public Avengers(int HP, String nome, String colore, int arma, int potere) {
		this.HP = HP;
		this.nome = nome;
		this.colore = colore;
		this.arma = arma;
		this.potere = potere;
	}
	
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public int getHP() {
		return HP;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setColore(String colore ) {
		this.colore = colore;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setArma(int arma ) {
		this.arma = arma;
	}
	
	public int getArma() {
		return arma;
	}
	
	public void setPotere(int potere) {
		this.potere = potere;
	}
	
	public int getPotere() {
		return potere;
	}
	
	public void attacco(Avengers nomeNemico) {
		nomeNemico.setHP(nomeNemico.getHP()-(this.potere+this.arma));
                System.out.println("L'HP di "+nomeNemico.getNome()+ " ora e' "+ nomeNemico.getHP());
	}
	
	public void death() {
		System.out.println("YOU DIED, PRESS F TO PAY RESPECT");
	}
	
}
