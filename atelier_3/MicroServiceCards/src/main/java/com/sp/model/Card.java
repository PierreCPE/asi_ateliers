package com.sp.model;


public class Card {

	private int id;
	private int userid;
	private int prix;
	private String name;
	private String description;
	private String imgUrl;
	private String family;
	private String affinity;
	private int hp;
	private int energy;
	private int attack;
	private int defence;
	
	public Card() {
		
	}
	
	
	public Card(int userid, String name,String description, String imgUrl,String family,String affinity,int hp,int energy,int attack,int defence) {
		this.userid = userid;
		this.prix = 50;
		
		this.name = name;
		this.description = description;		
		this.imgUrl=imgUrl;
		this.family = name;
		this.affinity = name;
		this.hp = hp;
		this.energy = energy;
		this.attack = attack;
		this.defence = defence;
	}

	public int getUserId() {
		return this.userid;
	}

	public void setUserId(int proprietaire) {
		this.userid = proprietaire;
	}

	public int getId() {
		return this.id;
	}
	

	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	  // GETTER AND SETTER
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;	
		}

		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
		
		public String getImgUrl() {
			return imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		
		
		public String getFamily() {
			return family;
		}
		public void setFamily(String family) {
			this.family = family;
		}
		
		
		public String getAffinity() {
			return affinity;
		}
		public void setAffinity(String affinity) {
			this.affinity = affinity;
		}
		
		
		public int getHp() {
			return hp;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}
		
		
		public int getEnergy() {
			return energy;
		}
		
		public void setEnergy(int energy) {
			this.energy = energy;
		}
		
		
		public int getAttack() {
			return attack;
		}
		public void setAttack(int attack) {
			this.attack = attack;
		}
		
		
		public int getDefence() {
			return defence;
		}
		public void setDefence(int defence) {
			this.defence = defence;
		}
		
		@Override
		public String toString() {
			return "Card [id=" + id + ", proprietaire=" + this.getUserId() + ", prix=" + prix + ", name=" + name
					+ ", description=" + description + ", imgUrl=" + imgUrl + ", family=" + family + ", affinity="
					+ affinity + ", hp=" + hp + ", energy=" + energy + ", attack=" + attack + ", defence=" + defence
					+ "]";
		}
}