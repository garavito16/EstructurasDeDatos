package com.codingdojo.aplicacion;

import com.codingdojo.estructuras.*;


public class Aplicacion {
	public static void main(String[] args) {
		DLL listaNumeros = new DLL();
		NodoDLL nodo1 = new NodoDLL(10);
		NodoDLL nodo2 = new NodoDLL(20);
		NodoDLL nodo3 = new NodoDLL(15);
		
		listaNumeros.agregaEnPosicion(nodo1, 0);
		listaNumeros.agregaEnPosicion(nodo2, 1);
		listaNumeros.agregaEnPosicion(nodo3, 1);
		
		//listaNumeros.eliminaEnPosicion(1);
		
		/*NodoDLL nodo2 = new NodoDLL(4);
		NodoDLL nodo3 = new NodoDLL(25);
		NodoDLL nodo4 = new NodoDLL(-20);
		NodoDLL nodo5 = new NodoDLL(8);
		
		listaNumeros.agregarAlFinal(nodo1);
		listaNumeros.agregarAlFinal(nodo2);
		listaNumeros.agregarAlFinal(nodo3);
		listaNumeros.agregarAlFinal(nodo4);
		listaNumeros.agregarAlFinal(nodo5);*/
		
		listaNumeros.imprimePrincipioFin();
		System.out.println("");
		listaNumeros.imprimeFinPrincipio();
		System.out.println("");
		
		ArbolBinario arbolito = new ArbolBinario();
		NodoArbol nodito1= new NodoArbol(100);
		NodoArbol nodito2= new NodoArbol(50);
		NodoArbol nodito3= new NodoArbol(200);
		NodoArbol nodito4= new NodoArbol(10);
		NodoArbol nodito5= new NodoArbol(80);
		NodoArbol nodito6= new NodoArbol(150);
		NodoArbol nodito7= new NodoArbol(500);
		
		arbolito.agregarNodo(nodito1);
		arbolito.agregarNodo(nodito2);
		arbolito.agregarNodo(nodito3);
		arbolito.agregarNodo(nodito4);
		arbolito.agregarNodo(nodito5);
		arbolito.agregarNodo(nodito6);
		arbolito.agregarNodo(nodito7);
		
		arbolito.inOrder(arbolito.getRaiz());
		System.out.println("");
		NodoArbol resultado = arbolito.buscarValor(70);
		
		if(resultado == null) {
			System.out.println("El valor no se encuentra en el arbol");
		} else {
			System.out.println("El nodo si se encuentra en el arbol "+resultado.getValor());
		}
	}
}

