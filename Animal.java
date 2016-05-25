/**********************************************************
Class: Animal.java
Desc: Keeps track of animals, etc.
Name: Brody Jackson
Date: 4/4/2016
Version: 1.0
 **********************************************************/

public class Animal {
	private String whereFrom;
	private String type;
	private String diet;
	private int legs;
	private int arms;

	public Animal(String w, String t, String d, int l, int a){
		whereFrom=w;
		type=t;
		diet=d;
		legs=l;
		arms=a;
	}

	public String getWhereFrom(){
		return whereFrom;
	}

	public String getType(){
		return type;
	}

	public String getDiet(){
		return diet;
	}

	public int getLegs(){
		return legs;
	}

	public int getArms(){
		return arms;
	}

	public void setWhereFrom(String w){
		whereFrom=w;
	}

	public void setType(String t){
		type=t;
	}

	public void setDiet(String d){
		diet=d;
	}

	public void setLegs(int l){
		legs=l;
	}

	public void setArms(int a){
		arms=a;
	}

	public String toString(){
		String hold;
		hold=getType();
		return ("You are a: "+hold);
	}
}