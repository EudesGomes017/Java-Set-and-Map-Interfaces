package entities;

import java.util.Objects;

public class Product implements Comparable<Product> {

	/*
	 * Esta classe em Java, chamada Product, representa um produto com um nome e um
	 * preço. Aqui está uma explicação detalhada de cada parte:
	 * 
	 * Atributos:
	 * 
	 * name: Uma string que representa o nome do produto. price: Um número de ponto
	 * flutuante (Double) que representa o preço do produto. Construtor:
	 * 
	 * O construtor Product(String name, Double price) recebe um nome e um preço e
	 * inicializa os atributos correspondentes. Métodos:
	 * 
	 * toString(): Este método sobrescreve o método toString() da classe Object para
	 * retornar uma representação em string do objeto Product. Ele retorna uma
	 * string que contém o nome e o preço do produto. compareTo(Product other): Este
	 * método sobrescreve o método compareTo() da interface Comparable. Ele compara
	 * dois objetos Product com base em seus nomes, ignorando maiúsculas e
	 * minúsculas. Ele converte os nomes para maiúsculas usando toUpperCase() antes
	 * de compará-los usando o método compareTo() de String. A lógica do método
	 * compareTo() compara os nomes dos produtos para determinar a ordem. Se o nome
	 * do produto atual for "maior" (no sentido de ordenação alfabética) do que o
	 * nome do outro produto, retorna um número positivo. Se for "menor", retorna um
	 * número negativo. Se forem iguais, retorna zero.
	 * 
	 * Este método é usado para ordenar instâncias de Product em uma coleção, como
	 * um TreeSet ou TreeMap, onde a ordem dos elementos é importante.
	 * 
	 * Outros Métodos:
	 * 
	 * A classe não mostra explicitamente os métodos hashCode() e equals(Object
	 * obj), mas se fossem necessários para esta classe, eles seriam implementados
	 * para garantir que objetos Product com os mesmos atributos fossem considerados
	 * iguais. Isso é particularmente útil ao usar coleções que dependem desses
	 * métodos, como HashMap ou HashSet. Em resumo, a classe Product encapsula as
	 * informações de um produto, permitindo a inicialização com um nome e um preço,
	 * a representação em string e a comparação com base no nome para permitir a
	 * ordenação.
	 */

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}

	// (... get / set / hashCode / equals)
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product other) {

		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

}
