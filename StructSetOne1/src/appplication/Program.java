package appplication;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		/*
		 * Este trecho de código em Java demonstra o uso de diferentes implementações da
		 * interface Set - HashSet, TreeSet e LinkedHashSet, e algumas operações comuns
		 * que podem ser realizadas com conjuntos. Aqui está uma explicação detalhada do
		 * que está acontecendo:
		 * 
		 * HashSet:
		 * 
		 * HashSet é uma implementação da interface Set que armazena elementos sem
		 * repetição e não garante a ordem dos elementos. No código, um conjunto set é
		 * criado usando HashSet. Três elementos são adicionados ao conjunto ("Tv",
		 * "Notebook", "Tablet"). É verificado se o conjunto contém o elemento
		 * "Notebook". Um loop é usado para iterar sobre os elementos do conjunto e
		 * imprimi-los. TreeSet:
		 * 
		 * TreeSet é outra implementação da interface Set, mas os elementos são
		 * armazenados em ordem natural (ou usando um comparador fornecido no momento da
		 * criação do TreeSet). Um conjunto treeSet é criado usando TreeSet. Os mesmos
		 * três elementos são adicionados ao conjunto. São realizadas operações de
		 * remoção condicional com removeIf, onde elementos com determinadas
		 * propriedades (tamanho maior ou igual a 3, começando com a letra 'T') são
		 * removidos. Verifica-se novamente se o conjunto contém o elemento "Notebook".
		 * Um loop é usado para iterar sobre os elementos do conjunto e imprimi-los.
		 * LinkedHashSet:
		 * 
		 * LinkedHashSet é uma terceira implementação da interface Set que mantém a
		 * ordem de inserção dos elementos. Um conjunto linkedHashSet é criado usando
		 * LinkedHashSet. Os mesmos três elementos são adicionados ao conjunto.
		 * Verifica-se novamente se o conjunto contém o elemento "Notebook". Um loop é
		 * usado para iterar sobre os elementos do conjunto e imprimi-los. Em resumo, o
		 * código demonstra as diferenças entre as implementações HashSet, TreeSet e
		 * LinkedHashSet da interface Set, destacando suas características de ordenação
		 * e a forma como os elementos são armazenados e acessados.
		 */

		Set<String> set = new HashSet<>(); // HashSet ele é mais rapido mais não retornar a ordem

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}

		System.out.println();

		/*
		 * Claro, vou explicar melhor como usar um comparador ao criar um TreeSet.
		 * 
		 * Quando você cria um TreeSet em Java, por padrão, os elementos são ordenados
		 * de acordo com a ordem natural dos elementos (se eles implementam a interface
		 * Comparable) ou de acordo com a ordem de inserção (se você usar um TreeSet
		 * vinculado). No entanto, você também pode fornecer seu próprio comparador para
		 * definir a ordem dos elementos.
		 * 
		 * Aqui está como você faria isso:
		 *
		 * 
		 * Criando um Comparador: Você precisa criar uma classe que implemente a
		 * interface Comparator. Essa interface tem um método compare que você precisa
		 * implementar. Esse método recebe dois objetos do tipo que você está comparando
		 * e retorna um valor inteiro que indica a ordem dos objetos.
		 * 
		 * Por exemplo, se você estiver trabalhando com Strings e quiser ordená-las em
		 * ordem reversa de comprimento, você poderia criar um comparador assim:
		 * 
		 * java
		 *
		 *
		 * import java.util.Comparator;
		 * 
		 * public class ReverseLengthComparator implements Comparator<String> {
		 * 
		 * @Override public int compare(String s1, String s2) { return
		 * Integer.compare(s2.length(), s1.length()); } }
		 * 
		 * 
		 * 
		 * Usando o Comparador ao Criar o TreeSet: Depois de criar o comparador, você
		 * pode passá-lo como argumento ao criar o TreeSet. Isso informará ao TreeSet
		 * para usar esse comparador para determinar a ordem dos elementos, em vez da
		 * ordem natural.
		 * 
		 * Por exemplo:
		 * 
		 * import java.util.Set; import java.util.TreeSet;
		 * 
		 * public class Main { public static void main(String[] args) { Set<String> set
		 * 
		 * = new TreeSet<>(new ReverseLengthComparator()); set.add("banana");
		 * 
		 * set.add("apple"); set.add("orange"); System.out.println(set); // Imprime:
		 * [banana, orange, apple] } }
		 * 
		 * Neste exemplo, o TreeSet é criado com um comparador que ordena as strings em
		 * ordem reversa de comprimento. Portanto, ao imprimir o conjunto, as strings
		 * são ordenadas de acordo com esse critério específico.
		 */

		Set<String> treeSet = new TreeSet<>(); // TreeSet ele ordena os dados

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		// set.remove("Tablet");

		set.removeIf(x -> x.length() >= 3); // colocamos predicado x -> talque ex: remove todo mundo que tenha pelo
											// menos 3 caracteres
		set.removeIf(x -> x.charAt(0) == 'T'); // colocamos predicado x -> talque ex: remove todo mundo que tenha a
												// letra igual 'T'
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}

		System.out.println();

		Set<String> linkedHashSet = new LinkedHashSet<>(); // LinkedHashSet ele manteve as ordens que os elementos foram
															// inseridos

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}

	}

}
