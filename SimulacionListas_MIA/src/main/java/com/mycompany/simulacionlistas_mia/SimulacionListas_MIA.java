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
        boolean cancelar = false; //para manejar la cancelación de la operación
        int n, i;
        int[] lista = new int[10]; //Creo un arreglo de tamañao de 10
        String entrada = JOptionPane.showInputDialog("Ingrese el número de elementos (el máximo es 10)");
        if (entrada == null || "".equals(entrada)) {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
            cancelar = true;
        }

        if (!cancelar) {
            n = Integer.parseInt(entrada);

            if (n > 10) {//Si es muy grande pues error xd
                JOptionPane.showMessageDialog(null, "Se ingresó un número mayor a 10, no se puede continuar con la acción");
            } else {//Si no continuamos con el proceso de crear la lista
                for (i = 0; i < n; i++) {//Ciclo for que solicita los elementos de la lista
                    String valorcito = JOptionPane.showInputDialog("Ingrese el elemento " + i + ":");
                    if (valorcito == null) {
                        JOptionPane.showMessageDialog(null, "Operación cancelada");
                        cancelar = true;
                        break;
                    }
                    lista[i] = Integer.parseInt(valorcito);
                }

                if (!cancelar) {
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

        }

    }

    //Función para generar la lista ligada
    public void listaLigada() {
        boolean cancelar = false; //para manejar la cancelación de la operación
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

            if (valor == null || "".equals(valor)) {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
                cancelar = true;
                break;
            }

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
        if (!cancelar) {
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
    }

    //Función para generar la lista doblemente ligada
    //Es basicamente la seguna pero reacondicionada con el doble apuntado
    public void listaDoblementeLigada() {
        boolean cancelar = false; //para manejar la cancelación de la operación
        int cabeza, actual, previo, fin;

        int[][] nodo = new int[10][3]; //Matriz para almacenar todo
        //Asigno valores iniciales para la lista enlazada simple
        cabeza = -1;
        actual = 0;
        previo = -1;
        fin = 0; //Bandera de finalización

        //Ciclo para ingresar todo 
        while (actual < 10 && fin == 0) {
            //Aquí comienzo a solicitar que ingrese la cantidad de elementos que desee
            String valor = JOptionPane.showInputDialog("Ingrese un elemento (ingrese -1 para terminar)");

            if (valor == null || "".equals(valor)) {
                JOptionPane.showMessageDialog(null, "Operación cancelada");
                cancelar = true;
                break;
            }

            int valorito = Integer.parseInt(valor);

            if (valorito == -1) {
                fin = 1;
            } else {

                nodo[actual][0] = valorito;
                nodo[actual][1] = cabeza;
                nodo[actual][2] = previo;

                if (cabeza != -1) {
                    nodo[cabeza][2] = actual;
                }
                cabeza = actual;
                previo = actual;
                actual = actual + 1;
            }
        }

        if (!cancelar) {
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
    }

    //Fucnión para generar la lista indexada
    //Es basicamente la primera pero reacondicionada con le índice que considero innecesario
    public void listaIndexada() {
        boolean cancelar = false; //para manejar la cancelación de la operación
        int n, i;
        int[] lista = new int[10];
        int[] indice = new int[10]; //Honestamente considero el índice como algo innecesario pero mi labor es no opinar
        String entrada = JOptionPane.showInputDialog("Ingrese el número de elementos (el máximo es 10)");

        if (entrada == null || "".equals(entrada)) {
            JOptionPane.showMessageDialog(null, "Operación cancelada");
            cancelar = true;
        }

        if (!cancelar) {
            n = Integer.parseInt(entrada);

            if (n > 10) {
                JOptionPane.showMessageDialog(null, "Se ingresó un número mayor a 10, no se puede continuar con la acción");
            } else {

                for (i = 0; i < n; i++) {
                    String valorcito = JOptionPane.showInputDialog("Ingrese el elemento " + i + ":");

                    if (valorcito == null) {
                        JOptionPane.showMessageDialog(null, "Operación cancelada");
                        cancelar = true;
                        break;
                    }

                    lista[i] = Integer.parseInt(valorcito);
                    indice[i] = i;
                }

                if (!cancelar) {
                    String textofinal = "[";
                    for (i = 0; i < n; i++) {
                        if (i == 0) {
                            textofinal += "Posición: "+String.valueOf(indice[i]) + "=" + String.valueOf(lista[i]);
                        } else {
                            textofinal += ", " + "Posición: "+String.valueOf(indice[i]) + "=" + String.valueOf(lista[i]);
                        }
                    }
                    textofinal += "]";
                    JOptionPane.showMessageDialog(null, "La lista que se ingresó es:\n" + textofinal);
                }

            }
        }

    }
}
