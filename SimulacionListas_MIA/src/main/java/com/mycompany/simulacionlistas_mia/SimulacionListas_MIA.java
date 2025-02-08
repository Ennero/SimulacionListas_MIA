package com.mycompany.simulacionlistas_mia;

import javax.swing.JOptionPane;

/**
 *
 * @author Enner
 */
public class SimulacionListas_MIA {

    //Función principal que se encarga de iniciar la interfaz gráfica
    public static void main(String[] args) {
        System.out.println("Iniciando el programa");
        gui inicio = new gui();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);

    }

    //Función para generar una lista contigua
    public void listaContigua() {
        int n, i;
        int[] lista = new int[10]; //Creo un arreglo de tamañao de 10
        String entrada = JOptionPane.showInputDialog("Ingrese el número de elementos (el máximo es 10)");
        n = Integer.parseInt(entrada);

        if (n > 10) {//Si es muy grande pues error xd
            JOptionPane.showMessageDialog(null, "Se ingresó un número mayor a 10, no se puede continuar con la acción");
        } else {//Si no continuamos con el proceso de crear la lista
            for (i = 0; i < n; i++) {//Ciclo for que solicita los elementos de la lista
                String valorcito = JOptionPane.showInputDialog("Ingrese el elemento " + i + ":");
                lista[i] = Integer.parseInt(valorcito);
            }
            String textofinal = "[";
            for (i = 0; i < n; i++) {
                if (i == 0) {
                    textofinal += String.valueOf(lista[i]);
                } else {
                    textofinal += ", " + String.valueOf(lista[i]);
                }
            }
            textofinal += "]";
            JOptionPane.showMessageDialog(null, "La lista que se ingresó es:\n" + textofinal);
        }
    }

    //Función para generar la lista ligada
    public void listaLigada() {
        int cabeza, actual, fin;

        int[][] nodo = new int[10][2]; //Matriz para almacenar todo
        //Asigno valores iniciales para la lista enlazada simple
        cabeza = -1;
        actual = 0;
        fin = 0; //Bandera de finalización

        //Ciclo para ingresar todo 
        while (actual < 10 && fin == 0) {
            //Aquí comienzo a solicitar que ingrese la cantidad de elementos que desee
            String valor = JOptionPane.showInputDialog("Ingrese un elemento (ingrese -1 para terminar)");
            int valorito = Integer.parseInt(valor);
            if (valorito == -1) {
                fin = 1;
            } else {
                nodo[actual][0] = valorito;
                nodo[actual][1] = cabeza;
                cabeza = actual;
                actual = actual + 1;
            }
        }
        //Ciclo para ir recorriendo la lista
        String textofinal = "[";
        actual = cabeza;
        boolean primero = true; //bandera para que se muestre bonito

        while (actual != -1) {
            if (primero) {
                textofinal += nodo[actual][0];
                primero = false;
            } else {
                textofinal += ", " + nodo[actual][0];
            }
            actual = nodo[actual][1]; //Me muevo al siguiente nodo
        }
        textofinal += "]"; //Cierro todo
        JOptionPane.showMessageDialog(null, "La lista que se ingresó es:\n" + textofinal);
    }

    //Función para generar la lista doblemente ligada





}
