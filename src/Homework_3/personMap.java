package Homework_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class personMap {
	public static void main (String []args) {
  HashMap <String,String> persons = new HashMap<String,String> ();
  persons.put ("Natalia", "Melnyk");
  persons.put("Bohdan","Lashko");
  persons.put("Maria","Kobur");
  persons.put("Maria","Besiada");
  persons.put("Bohdan","Lashko");
  persons.put("Oleksandr","Diedov");
  persons.put("Vitaliy","Klytchko");
  persons.put("Andriy", "Sadovyi");
  persons.put("Olga", "Horbach");
  persons.put ("Natalia", "Melnyk");
  System.out.println(persons);
  String itemToRemove = "Natalia";
  Iterator<HashMap.Entry<String,String>>
     iterator =persons.entrySet().iterator();
  while (iterator.hasNext()) {
	  HashMap.Entry<String, String>
	  entry = iterator.next();
	  if (itemToRemove.contentEquals(entry.getValue())) {
		  iterator.remove();
	  }
  }
  System.out.println(persons);
  
  for (String i:persons.keySet()) {
	  System.out.println("Name is " + i + "value" + persons.get(i));
	  Set set = new HashSet<>();
	  List list = new ArrayList<>();
	  for (HashMap.Entry<String, String > mapVal : persons.entrySet()) {
          if(!set.add(mapVal.getValue())){
              list.add(mapVal.getValue());
          } else {
              set.add(mapVal.getValue());
          }
      }
      for (HashMap.Entry<String, String> mapVal : persons.entrySet()){
          if (list.contains(mapVal.getValue())){
              System.out.println("Persons with the same names:" + mapVal.getKey() + " " + mapVal.getValue());
  }
      }	
  }
	}
}
/*for (Map.Entry<String, String> entry : map.entrySet()) {
System.out.println(entry.getKey() + " " + entry.getValue());
}
*/