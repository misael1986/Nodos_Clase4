/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodos_clase4;

/**
 *
 * @author misael.perilla
 */
public class Cola {
    //Declaración de atributos

    private Nodo inicio;
    private Nodo termino;

    //Constructor sin parametros
    public Cola() {
        inicio = null;
        termino = null;
    }

    //Metodo insertar
    public void insertar(int dato) {
        Nodo i = new Nodo();
        i.setValor(dato);
        i.setSiguiente(null);
        if (inicio == null & termino == null) {
            inicio = i;
            termino = i;
        }
        termino.setSiguiente(i);
        termino = termino.getSiguiente();
    }

    //Metodo extraer dato
    public int extraer() {
        int dato = inicio.getValor();
        inicio = inicio.getSiguiente();
        return dato;
    }

    //Metodo para comprobar que la cola no esta vacia
    public boolean estaVacia() {
        boolean cola = false;
        if (inicio == null & termino == null) {
            cola = true;
            System.out.println("La cola esta vacia");
        } else {
            System.out.println("La cola no esta vacia");
            cola = false;
        }
        return cola;
    }

    //Metodo para contar los elementos de la cola
    public int contar() {
        int contador = 0;
        Nodo c = this.inicio;
        while (c != null) {
            contador++;
            c = c.getSiguiente();
        }
        System.out.println("Numero de datos en la cola: " + contador);
        return contador;
    }

    
     public void listar(){
        // Crea una copia de la cola.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
    
    
    //Metodo toString
    public String toString() {
        Nodo c = this.inicio;
        String s = "";
        while (c != null) {
            s = s + c.toString();
            c = c.getSiguiente();
        }
        return s;
    }
}
