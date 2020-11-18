package Homework_3;

import java.util.HashSet;
import java.util.Set;

public class UnionMethod {

		   public static void main(String args[]) {
		      HashSet <Integer> set1 = new HashSet <Integer>();
		      HashSet <Integer> set2 = new HashSet <Integer>();
		      set1.add(52);
		      set1.add(56);
		      set1.add(2);
		      System.out.println("Set1 = "+ set1);
		      set2.add(52);
		      set2.add(56);
		      set2.add(5);
		      set2.add(8);
		      System.out.println("Set2 = "+ set2);
		      set1.addAll(set2);
		      System.out.println("Union = "+ set1);
		   }
		}