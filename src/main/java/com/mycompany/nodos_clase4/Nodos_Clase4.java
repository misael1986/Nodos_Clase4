/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nodos_clase4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author misael.perilla
 */
public class Nodos_Clase4 {

    public static void main(String[] args) {

//        //ArrayList<Nodo> lista= new ArrayList<>();//Listas predeterminadas en Java
//        Nodo nodo1 = new Nodo();
//        nodo1.setValor(23);
//
//        Nodo nodo2 = new Nodo();
//        nodo2.setValor(-3);
//
//        Nodo nodo3 = new Nodo();
//        nodo3.setValor(20);
//
//        nodo1.setSiguiente(nodo3);
//        nodo3.setSiguiente(nodo2);
//
//        Nodo nodo4 = new Nodo();
//        nodo4.setValor(45);
//        nodo2.setSiguiente(nodo4);
//        Nodo lista = LlenarLista();
//
//        ImprimirLista(lista);
//        Pila pila = new Pila();
//
//        System.out.println("<<-- Ejemplo de Pila -->>\n\n");
//
//        pila.agregar(4);
//        pila.agregar(16);
//        pila.agregar(12);
//        pila.agregar(8);
//        pila.agregar(65);
//
//        System.out.println("<<-- Pila -->>");
//        pila.listar();
//        System.out.println("\n<<-- Tamaño -->");
//        System.out.println(pila.getTamanio());
//
//        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
//        pila.retirar();
//        pila.listar();
//        System.out.println("Tamaño: " + pila.getTamanio());
//
//        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
//        pila.editar(12, 44);
//        pila.listar();
//        System.out.println("Tamaño: " + pila.getTamanio());
//
//        System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
//        pila.remover(16);
//        pila.listar();
//        System.out.println("Tamaño: " + pila.getTamanio());
//
//        System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
//        System.out.println(pila.buscar(65));
//
//        System.out.println("\n<<-- Elimina la pila -->>");
//        pila.eliminar();
//
//        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
//        System.out.println(pila.esVacia());
//
//        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
//        //--------------------------------------------------------
        // --------  COLAS --------
//        //--------------------------------------------------------
//        System.out.println("\n\n<<-- Ejemplo de Cola -->>\n\n");
//
//        Cola cola1 = new Cola();
//        cola1.insertar(46);
//        cola1.insertar(12);
//        cola1.insertar(87);
//        cola1.insertar(125);
//        cola1.insertar(30);
//
//        System.out.println("\n<<-- Mostrar Cola -->");
//        cola1.listar();
//
//        System.out.println("\n<<-- Tamaño -->");
//        cola1.contar();
//
//        cola1.extraer();
//
//        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
//        cola1.estaVacia();
//
//        System.out.println("\n<<-- Tamaño -->");
//        cola1.contar();
//
//        System.out.println("\n<<-- Mostrar Cola -->");
//        cola1.listar();
//      colas (Queue) y pilas (Stack)
        Persona p = new Persona();
        p.setPrimerNombre("Misael");
        p.setSegundoNombre("Fernando");
        p.setEdad(37);

        Persona p2 = new Persona("Humberto", "Tuiran", 28);
        p2.setEdad(29);
        Persona p3 = new Persona("Pedro", "Perez", 70);
        p2.setEdad(29);
        
        

        Stack<Persona> pila = new Stack();
        pila.add(p);
        pila.add(p2);
        pila.add(p3);

        
        
        System.out.println("primero: " + pila.peek().getPrimerNombre());

        Queue<Persona> cola = new LinkedList<>();
        cola.add(p);
        cola.add(p2);
        cola.add(p3);
        System.out.println("primero: " + cola.peek().getPrimerNombre());
        
        
        

    }

    public static void ImprimirLista(Nodo I) {
        System.out.println("Imprimiendo Lista");
        Nodo Imaginario = I;
        while (Imaginario != null) {
            System.out.println(Imaginario.getValor());
            Imaginario = Imaginario.getSiguiente();

        }

    }

    public static Nodo LlenarLista() {
        Scanner scanner = new Scanner(System.in);//Objeto que permite capturar de Teclado
        Nodo inicio = new Nodo();

        System.out.println("Digite el tama\u00F1o");// ñ en Unicode
        int tamanho = scanner.nextInt();
        for (int i = 0; i < tamanho; i++) {

            System.out.println("Por favor digite el valor a guardar:");
            int valorAgregar = scanner.nextInt();
            if (i == 0) {
                inicio.setValor(valorAgregar);
            } else {

                Nodo nuevo = new Nodo();
                nuevo.setValor(valorAgregar);
                while (inicio.getSiguiente() != null) {
                    if (inicio.getSiguiente() == null) {
                        inicio.setSiguiente(nuevo);
                    }

                }
            }

        }

        return inicio;

    }
}
