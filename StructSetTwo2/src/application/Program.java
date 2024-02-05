package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	
	public static void main(String[] args) {
		
		//exemplo com treeSet, mais poderia ser com as outras coleções
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a); //estamos passando uma outra coleção como argumento nesse exemplo o conjunto c é uma copia do a
		c.addAll(b); //estamosf azendo a união c com b
		System.out.println(c);
		
		// intersection > são os elementos que tem em comum no conjunto
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); // fazendo a intersection
		
		System.out.println(d);
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); // removendo do conjunto e todo mundo que está no conjunto b
		System.out.println(e);
	}

}
