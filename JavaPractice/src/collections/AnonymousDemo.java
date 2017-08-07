package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Ingredient{
	private String name;
	private int amount;
	
	Ingredient(String name, int amount){
		this.name = name;
		this.amount = amount;
	}
	
	public int getGrams() {
		return this.amount;
	}
	
	public String getName() {
		return this.name;
	}
}

public class AnonymousDemo {
	
	public static void main(String[] args) {
		Ingredient a = new Ingredient("Apple", 112);
		Ingredient b = new Ingredient("Orange", 236);
		Ingredient b2 = new Ingredient("Banana", 100);
		
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		ingredients.add(b2);
		ingredients.add(a);
		ingredients.add(b);
		
		Collections.sort(ingredients, new Comparator<Ingredient>() {
			public int compare(Ingredient a, Ingredient b) {
				// trick: form the neg/0/pos by subtraction
				return (a.getGrams() - b.getGrams());
			}
		});
		
		Iterator<Ingredient> itr = ingredients.iterator();
		
		
		System.out.print("sorted by grams (low to high):");
		while(itr.hasNext()){
			System.out.print(" " + itr.next().getName());
		}
		System.out.print("\n");

		Collections.sort(ingredients, new Comparator<Ingredient>() {
			public int compare(Ingredient a, Ingredient b) {
				// trick: form the neg/0/pos by subtraction
				return (b.getGrams() - a.getGrams());
			}
		});
		
		Iterator<Ingredient> itr2 = ingredients.iterator();
		System.out.print("sorted by grams (high to low):");
		while(itr2.hasNext()){
			System.out.print(" " + itr2.next().getName());
		}
		System.out.print("\n");
		
		Collections.sort(ingredients, new Comparator<Ingredient>() {
			public int compare(Ingredient a, Ingredient b) {
				// trick: form the neg/0/pos by subtraction
				String aName = a.getName().substring(1);
				String bName = b.getName().substring(1);
				return aName.compareTo(bName);
			}
		});
		System.out.print("sorted by second letter:");
		Iterator<Ingredient> itr3 = ingredients.iterator();
		while(itr3.hasNext()){
			System.out.print(" " + itr3.next().getName());
		}
		
	}
}
