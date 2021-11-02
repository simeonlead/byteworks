package Meal;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList<String> meal = new LinkedList<String>();
		
		//Adding Meal to the List
		
		 meal.add("Beans");
		 meal.add("Rice");
		 meal.add("yan and Egg");
		 meal.add("Semovita");
		
		// Removing meal
		// This will remove Yam and Egg at index 2
		 meal.remove(2);
	}
	
	//Iterating through the meal
	//finding meal
	private static void printList(LinkedList<String> linkedList) {
		Iterator<String> i=linkedList.iterator();
		while(i.hasNext()) {
			System.out.println("The meals are " + i.hasNext());
		}
	}
		// Generate to String 
		@Override
		public String toString() {
			return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	}
	

