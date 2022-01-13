package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
	  ArrayList<Double> liste = new ArrayList<Double>();
	  
	  if (input.isEmpty()) return null;
	  else {
		  for (Integer i : input) {
			  Double newNumber = Double.valueOf(((i* 2) + 3) ^ 5);
			  liste.add(newNumber);
		  }
	  }
	  return liste;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
	  ArrayList<String> liste = new ArrayList<String>();
	  ArrayList<String> liste2 = new ArrayList<String>();
	  ArrayList<String> listeRes = new ArrayList<String>();
	  
	  if (input.isEmpty()) return null;
	  else {
		  for (int i = 0;i<input.size();i++) {
			  if (i==0) {
				  liste.add(input.get(i).substring(0, 1).toUpperCase());
			  }else {
				  liste.add(input.get(i));
			  }
		  }
		  //Copy liste
		  liste2.addAll(liste);
		  
		  //Double Result
		  listeRes.addAll(liste);
		  listeRes.addAll(liste2);
	  }
	  return listeRes;
  }

}
