/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nodos_clase4;

/**
 *
 * @author misael.perilla
 */
public class Nodos_Clase4 {

    public static void main(String[] args) {
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
}
