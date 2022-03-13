package com.technoelevate.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		arrayList.add(new Employee(24,"pavitra",24,56000));
		arrayList.add(new Employee(15,"sonia",43,42000));
		arrayList.add(new Employee(16,"subhashini",68,120000));
		arrayList.add(new Employee(19,"ananya",10,10000));
		
	    System.out.println("enter the sorting criteria");
	     System.out.println("press 1 for id soritng");
	     System.out.println("press 2 for age sorting");
	     System.out.println("press 3 for name sorintg");
	     System.out.println("press 4 for salary soritng");
	     Scanner scanner=new Scanner(System.in);
	      int criteria=scanner.nextInt();
	      
	      switch(criteria){
	      case 1:Collections.sort(arrayList, new Employee());
	              for(Employee employee:arrayList) {
	            	  System.out.println(employee);
	              }
	              break;
	      case 2: Collections.sort(arrayList, new SortByAge());
	               for(Employee employee:arrayList) {
	            	   System.out.println(employee);
	               }
	               break;
	      case 3:Collections.sort(arrayList, new SortByName());
	              for(Employee employee:arrayList) {
	            	  System.out.println(employee);
	            	  
	              }
	              break;
	      case 4:Collections.sort(arrayList, new SortBySalary());
	               for(Employee employee:arrayList) {
	            	   System.out.println(employee);
	               }
	               
	      
	      }
		

	}
	
	
	
}
