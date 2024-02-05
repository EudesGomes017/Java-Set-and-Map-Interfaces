package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	/*
	 * Um site de internet registra um log de acessos dos usuários. Um registro de
	 * log consiste no nome de usuário (apenas uma palavra) e o instante em que o
	 * usuário acessou o site no padrão ISO 8601, separados por espaço, conforme
	 * exemplo. Fazer um programa que leia o log de acessos a partir de um arquivo,
	 * e daí informe quantos usuários distintos acessaram o site.
	 */

	/*
	 * Um objeto Scanner é criado para receber entradas do usuário via console. Ele
	 * solicita ao usuário que insira o caminho completo do arquivo de log. Leitura
	 * do Arquivo de Log:
	 * 
	 * O caminho do arquivo fornecido pelo usuário é armazenado na variável path. Um
	 * bloco try-with-resources é usado para abrir um BufferedReader para ler o
	 * arquivo. Isso garante que o BufferedReader seja fechado corretamente após a
	 * leitura do arquivo. Um HashSet chamado set é criado para armazenar as
	 * entradas de log únicas. Isso garantirá que cada entrada seja única, ignorando
	 * duplicatas. Cada linha do arquivo de log é lida usando o BufferedReader. Para
	 * cada linha, os campos são divididos usando espaço em branco como delimitador.
	 * O primeiro campo é o nome de usuário e o segundo campo é a data e hora no
	 * formato Instant. Um objeto LogEntry é criado com o nome de usuário e a data e
	 * hora obtidos da linha do arquivo. O objeto LogEntry é adicionado ao conjunto
	 * set. Contagem de Usuários Únicos:
	 * 
	 * Após a leitura completa do arquivo, a mensagem é impressa informando o total
	 * de usuários únicos encontrados no arquivo de log. Isso é feito obtendo o
	 * tamanho do conjunto set. Tratamento de Exceções:
	 * 
	 * Qualquer exceção de E/S (IOException) que possa ocorrer durante a leitura do
	 * arquivo é capturada e tratada. Se ocorrer um erro, uma mensagem de erro será
	 * impressa. Em resumo, esta classe lê um arquivo de log, extrai os nomes de
	 * usuário e as datas de entrada, armazena-os em um conjunto para eliminar
	 * entradas duplicadas e, finalmente, conta o número total de usuários únicos no
	 * arquivo.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");// digitamos o caminho do arquivo
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));

				set.add(new LogEntry(username, moment));

				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
