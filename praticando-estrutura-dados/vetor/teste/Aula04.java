package com.maju.estruturadados.vetor.teste;

import com.maju.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
	Vetor vetor= new Vetor(10);
		
		vetor.adiciona("elemento01");
		vetor.adiciona("elemento02");
		vetor.adiciona("elemento03");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
	}

}
