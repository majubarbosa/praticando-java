package com.maju.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		//ArraList eh uma classe nativa do Java.util
		//Possui todos os metodos vistos nas aulas anteriores
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//Adicionando elemento no vetor
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		//Adicionando na posicao, o elemento desejado
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//Buscando se o elemento existe no vetor
		boolean existe = arrayList.contains("A");
		if (existe){
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		//Retornando a posicao do elemento buscado
		int pos = arrayList.indexOf("B");
		if (pos > -1){
			System.out.println("Elemento existe no array na pos " + pos);
		} else {
			System.out.println("Elemento não existe no array " + pos);
		}
		
		//Trazendo o elemento na posicao indicada
		System.out.println(arrayList.get(2));
		
		//Removendo elementos na posicao + Removendo elemento passando o elemento 
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
		
		//Trazendo o tamanho do vetor
		System.out.println(arrayList.size());
	}

}
