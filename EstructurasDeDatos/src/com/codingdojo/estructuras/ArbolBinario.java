package com.codingdojo.estructuras;

public class ArbolBinario {
	
	private NodoArbol raiz;
	
	public ArbolBinario() {
		this.raiz = null;
	}

	public void agregarNodo(NodoArbol nuevoNodo) {
		if(this.raiz == null) {
			this.raiz = nuevoNodo;
		} else {
			NodoArbol aux = this.raiz;
			boolean noEncontrado = true;
			 while (noEncontrado) {
				 if(aux.getValor() > nuevoNodo.getValor()) {
					 if(aux.getIzquierdo() != null) {
						 aux = aux.getIzquierdo();
					 } else {
						 aux.setIzquierdo(nuevoNodo);
						 noEncontrado = false;
					 }
				 }
				 else {
					 if(aux.getDerecho() != null) {
						 aux = aux.getDerecho();
					 } else {
						 aux.setDerecho(nuevoNodo);
						 noEncontrado = false;
					 }
				 }
			 }
		}
	}
	
	public void inOrder(NodoArbol nodoActual) {
		if(nodoActual.getIzquierdo() != null) {
			inOrder(nodoActual.getIzquierdo());
		}
		System.out.print(nodoActual.getValor() + " - ");
		if(nodoActual.getDerecho() != null) {
			inOrder(nodoActual.getDerecho());
		}
	}
	
	public NodoArbol buscarValor(int numero) {
		NodoArbol aux = this.raiz;
		
		while(aux != null) {
			if(aux.getValor() == numero) {
				return aux;
			} else {
				if(aux.getValor() > numero) {
					aux = aux.getIzquierdo();
				} else {
					aux = aux.getDerecho();
				}
			}
		}
		return null;
	}
	
	public NodoArbol getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol raiz) {
		this.raiz = raiz;
	}

}
