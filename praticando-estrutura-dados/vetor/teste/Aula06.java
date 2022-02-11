package com.maju.estruturadados.vetor.teste;

import com.maju.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		Vetor vetor= new Vetor(10);
		
		vetor.adiciona("elemento01"); //0
		vetor.adiciona("elemento02"); //1
		vetor.adiciona("elemento03"); //2

		System.out.println(vetor.busca("elemento04"));

	}

}
