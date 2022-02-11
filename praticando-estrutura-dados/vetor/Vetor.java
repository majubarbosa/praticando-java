package com.maju.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];	
		this.tamanho = 0;
		}
	
	/*public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) { 
				this.elementos[i] = elemento;
				break; //Quero que pare no primeiro null
			}
		}
	}*/
	
	public boolean adiciona(String elemento) {
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//B C D E F + +     tamanho = 5
	
	public void adiciona(int posicao, String elemento) {
		// primeiro vou verificar se a posicao eh valida
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		this.aumentaCapacidade();
		
		// verifico o tamanho real do vetor e movo todos os elementos ate chegar a posicao que eu desejo
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1]=this.elementos[i];
		}
		
		this.elementos[posicao]=elemento;
		this.tamanho++;
		
	}
	
	public void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length*2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos; //atribui o novo vetor ao vetor que estamos trabalhando na classe
		}
	}
	
	public String busca(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) {
		for (int i = 0; i <this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	// B D E F F -> POSICAO A SER REMOVIDA EH 1 (G)
	// 0 1 2 3 4 -> tamanho eh 5
	// a partir da posicao vc vai andar com os elentos do vetor na direcao da posicao
	
	public void remove(int posicao) {
		//verificar se a posicao eh valida
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		// Iterar a partir da posicao para mover os elementos do vetor e remover o que esta na posicao escolhida
		for (int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //reduz o tamanho real pois um elemento esta sendo deletado
	}
	
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		//para retornar apenas os espacos ocupados no vetor
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	

}
