package com.codingdojo.estructuras;

public class DLL {
	//doble link list
	private NodoDLL head;
	private NodoDLL tail;
	private int length;
	
	public DLL() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void agregaAlFrente(NodoDLL nuevoNodo) {
		if (this.head == null) {
			this.head = nuevoNodo;
			this.tail = nuevoNodo;
		} else {
			nuevoNodo.setNext(this.head);
			this.head.setPrev(nuevoNodo);
			this.head = nuevoNodo;
		}
		this.length++;
	}
	
	public void eliminaAlFrente() {
		if(this.head == null) {
			System.out.println("La lista esta vacia");
		} else {
			this.head = this.head.getNext();
			this.head.setPrev(null);
		}
	}
	
	public void agregarAlFinal(NodoDLL nuevoNodo) {
		if(this.tail == null) {
			this.head = nuevoNodo;
			this.tail = nuevoNodo;
		} else {
			nuevoNodo.setPrev(this.tail);
			this.tail.setNext(nuevoNodo);
			this.tail = nuevoNodo;
		}
		this.length++;
	}
	
	public void eliminaAlFinal() {
		if(this.head == null) {
			System.out.println("La lista esta vacia");
		} else {
			this.tail = this.tail.getPrev();
			this.tail.setNext(null);
		}
	}
	
	public void imprimePrincipioFin() {
		NodoDLL aux = this.head;
		while (aux != null ) {
			System.out.print(aux.getValor() + " -> ");
			aux = aux.getNext();
		}
	}
	
	public void imprimeFinPrincipio() {
		NodoDLL aux = this.tail;
		while (aux != null ) {
			System.out.print(aux.getValor() + " -> ");
			aux = aux.getPrev();
		}
	}
	
	public void agregaEnPosicion(NodoDLL nuevoNodo,int indice) {
		if (indice <= this.length) {
			if (this.head == null) {
				/*this.head = nuevoNodo;
				this.tail = nuevoNodo;*/
				agregaAlFrente(nuevoNodo);
			} else {
				
				if(indice == this.length) {
					/*nuevoNodo.setPrev(this.tail);
					this.tail.setNext(nuevoNodo);
					this.tail = nuevoNodo;*/
					agregarAlFinal(nuevoNodo);
				} else {
					NodoDLL aux1 = this.head;
					NodoDLL aux2 = aux1;
					int cont = 0;
					
					while(cont < indice) {
						aux1 = aux2;
						aux2 = aux2.getNext();
						cont++;
					}
					
					aux1.setNext(nuevoNodo);
					aux2.setPrev(nuevoNodo);
					nuevoNodo.setNext(aux2);
					nuevoNodo.setPrev(aux1);
				}			
			}
		} else {
			System.out.println("La lista aun no contiene el numero de nodos indicado");
		}
	}
	//elimina al frente, elimina en posicion elimina al final
	
	public void eliminaEnPosicion(int indice) {
		if (indice <= this.length) {
			if (this.head == null) {
				eliminaAlFrente();
			} else {
				
				if(indice == this.length) {
					eliminaAlFinal();
				} else {
					NodoDLL aux1 = this.head;
					NodoDLL aux2 = aux1;
					int cont = 0;
					
					while(cont < indice) {
						aux1 = aux2;
						aux2 = aux2.getNext();
						cont++;
					}
					
					aux1.setNext(aux2.getNext());
					aux1.setPrev(aux2);
				}			
			}
		} else {
			System.out.println("La lista aun no contiene el numero de nodos indicado");
		}
	}

	public NodoDLL getHead() {
		return head;
	}

	public void setHead(NodoDLL head) {
		this.head = head;
	}

	public NodoDLL getTail() {
		return tail;
	}

	public void setTail(NodoDLL tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
