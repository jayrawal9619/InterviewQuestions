package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; //static array -- size is fixed
		
		// dynamic array -- ArrayList
		// 1. It can contain duplicate Value/Elements
		// 2. It maintains insertion order
		// 3. It is not synchronized
		// 4. It allows random access to fetch the element because it store the values in the form of indexes.
		ArrayList ar = new ArrayList();
		
		ar.add(10);// 0
		ar.add(20);// 1
		ar.add(30);// 2
		
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add("Jay");//6
		ar.add(18.88);//7
		ar.add(true); // 8
		
		System.out.println(ar.size()); // size of array
		System.out.println(ar.get(4)); // to get the value from index
		
		// to print all value from arraylist use for loop or iterator
		
		for(int j = 0; j < ar.size(); j++) {
			System.out.println(ar.get(j));
		}
		
		// non generic vs generic:
		
		ArrayList<Integer> ar1 = new ArrayList<Integer> ();
		ar1.add(100);
		// ar1.add("Selenium"); -- Not allowed
		
		ArrayList<String> ar2 = new ArrayList<String> ();
		ar2.add("test");
		
		ArrayList<E> ar3 = new ArrayList<E> (); // E, if not sure about data types
		
		//Employee Class Object:
		Employee e1 = new Employee("Jay", 25, "QA");
		Employee e2 = new Employee("Harsh", 26, "Engineering");
		Employee e3 = new Employee("Bhavik", 24, "Admin");
		
		//create arraylist
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// Iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		System.out.println("AddAll concept");
		//********************
		
		//addAll()
		
		ArrayList<String> ar5 = new ArrayList<String> ();
		ar5.add("test");
		ar5.add("Himanshi");
		
		ArrayList<String> ar6 = new ArrayList<String> ();
		ar6.add("testical");
		ar6.add("Him");
		
		ar5.addAll(ar6);
	    
		for (int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**************");
		
		// removeAll
		
		ar5.removeAll(ar6);
		for (int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("********* ");
		
		// RetainAll
		
		ArrayList<String> ar7 = new ArrayList<String> ();
		ar7.add("test");
		ar7.add("Himanshi");
		
		ArrayList<String> ar8 = new ArrayList<String> ();
		ar8.add("test");
		ar8.add("Him");
		
		ar7.retainAll(ar8);
		for (int i=0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		
		
		}
	
	}

}
