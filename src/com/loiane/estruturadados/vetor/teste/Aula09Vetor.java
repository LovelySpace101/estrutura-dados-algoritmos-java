package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09Vetor {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de Dados");
		vetor.adiciona(0,"http://loiane.training");
		vetor.adiciona(3,"http://loiane.com");
		vetor.adiciona("Java");
		vetor.adiciona("Vetor");
		vetor.adiciona("Array");

		System.out.println(vetor.tamanho());

		vetor.remove(5);
		vetor.remove(4);
		vetor.remove(0);
		
		System.out.println(vetor);
	}
}