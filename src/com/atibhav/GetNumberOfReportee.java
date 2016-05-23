package com.atibhav;

import java.util.ArrayList;
import java.util.List;

// Scenario #1: Hierarchies/ Trees, Networks, or Graphs
public class GetNumberOfReportee {

	static List<PeopleManagerRelation> table = new ArrayList<>();
	
	static int count =0;
	
	public static void main(String[] args) {

		PeopleManagerRelation pmr1 = new PeopleManagerRelation("Bob", "Sally");
		PeopleManagerRelation pmr2 = new PeopleManagerRelation("Joseph", "Sally");
		PeopleManagerRelation pmr3 = new PeopleManagerRelation("Susan", "Bob");
		PeopleManagerRelation pmr4 = new PeopleManagerRelation("Sam", "Joseph");
		PeopleManagerRelation pmr5 = new PeopleManagerRelation("Betty", "Sam");
		
		
		table.add(pmr1);
		table.add(pmr2);
		table.add(pmr3);
		table.add(pmr4);
		table.add(pmr5);
		
		int count = 0;
		for (PeopleManagerRelation peopleManagerRelation : table) {
			if(peopleManagerRelation.getManager().equals("Sally")){
				count++;
			}
		}
		System.out.println("Number of direct reportee: "+count);
		System.out.println("Number of direct reportee: "+count);
	
		System.out.println("Number of All reportee under Sally: "+countEmployeesUnder("Sally"));
		System.out.println("Number of All reportee under Joseph: "+countEmployeesUnder("Joseph"));
		System.out.println("Number of All reportee under Betty: "+countEmployeesUnder("Betty"));
		
	}

	private static int countEmployeesUnder(String string) {
		// On the leaves there are zero reportee !!
		int count = 0;
		for (PeopleManagerRelation peopleManagerRelation : table) {
			if(peopleManagerRelation.getManager().equals(string)){
				count = count + 1;
				count = count + countEmployeesUnder(peopleManagerRelation.getName());
			}
		}
		return count;
		
	}
	
}