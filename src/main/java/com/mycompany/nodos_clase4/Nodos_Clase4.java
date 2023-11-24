/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nodos_clase4;

import java.util.Scanner;

/**
 *
 * @author misael.perilla
 */
public class Nodos_Clase4 {

    public static void main(String[] args) {

//        Nodo nodoA = new Nodo();
//        Scanner scanner= new Scanner(System.in);
//        nodoA.setValor(scanner.nextInt());
//        Nodo nodoB = new Nodo();
//        nodoB.setValor(0);
//        Nodo nodoC = new Nodo();
//        nodoC.setValor(32);
//
//        nodoA.setSiguiente(nodoC);//A contiene a C
//        nodoB.setSiguiente(nodoA);//B contienen a A
//        // Por ende el orden de la lista es B-A-C
//
//        ImprimirLista(nodoB);

        
        
        Pila pila = new Pila();

        System.out.println("<<-- Ejemplo de Pila -->>\n\n");

        pila.agregar(4);
        pila.agregar(16);
        pila.agregar(12);
        pila.agregar(8);
        pila.agregar(65);

        System.out.println("<<-- Pila -->>");
        pila.listar();
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getTamanio());

        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
        pila.editar(12, 44);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
        pila.remover(16);
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

        System.out.println("\n<<-- Consulta si existe el valor 65 -->>");
        System.out.println(pila.buscar(65));

        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminar();

        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.esVacia());

        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
        //--------------------------------------------------------
        //--------------------------------------------------------
        System.out.println("\n\n<<-- Ejemplo de Cola -->>\n\n");

        Cola cola1 = new Cola();
        cola1.insertar(46);
        cola1.insertar(12);
        cola1.insertar(87);
        cola1.insertar(125);
        cola1.insertar(30);

        System.out.println("\n<<-- Mostrar Cola -->");
        cola1.listar();

        System.out.println("\n<<-- Tamaño -->");
        cola1.contar();

        cola1.extraer();

        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        cola1.estaVacia();

        System.out.println("\n<<-- Tamaño -->");
        cola1.contar();

        System.out.println("\n<<-- Mostrar Cola -->");
        cola1.listar();
    }

    public static void ImprimirLista(Nodo I) {
        Nodo Imaginario = I;
        while (Imaginario != null) {
            System.out.println(Imaginario.getValor());
            Imaginario = Imaginario.getSiguiente();

        }

    }
    
    
    public static void LlenarLista(){
        System.out.println("Por favor digite el valor a guardar:");
        Scanner scanner= new Scanner(System.in);//Objeto que permite capturar de Teclado
        //como el input () de Python
        Nodo inicio=new Nodo();
        inicio.setValor(scanner.nextInt());
    
    }
}
