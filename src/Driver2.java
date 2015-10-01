//Universidad del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Guillermo Javier de Leon Archila, 14022
//Jose pablo Ortega Grajeda, 14565
//Driver2: clase encargada de leer el archivo de texto y mostrar el orden en pantalla

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Driver2 {

	public static void main(String[] args) {
		BufferedReader reader;
		String linea = "";
		int cantLineas = 0;
		int contador = 0;
		
		try {//revisa la cantidad de líneas que hay en el archivo
			reader = new BufferedReader(new FileReader("pacientes.txt"));
			while (reader.readLine() != null) cantLineas++;
			reader.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		String[] lineas = new String [cantLineas];//se instancia un arreglo donde se guardará cada línea del archivo
		try {
			reader = new BufferedReader(new FileReader("pacientes.txt"));
			while((linea = reader.readLine()) != null)
			{
			    lineas[contador] = linea;//se guarda cada línea del archivo
			    contador++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] parte;
		Vector<Paciente> pacientes = new Vector<Paciente>();//Se instancia un vector para guardar cada paciente
		for(int i = 0; i < cantLineas; i++){
			parte = lineas[i].split(",");//se separa la frase donde se encuentre la coma
			parte[1] = parte[1].substring(1);//se obtiene la segunda palabra
			parte[2] = parte[2].substring(1);//se obtiene la tercera palabra (en el índice 0 está la primera)
			pacientes.add(new Paciente(parte[0], parte[1], parte[2]));//se colocan en el vector
		}
	
		PriorityQueue<Paciente> colaPacientes = new PriorityQueue<Paciente>(pacientes); //se instancia una cola prioritaria con el vector de pacientes
		for(int i = 0; i < cantLineas; i++){
			System.out.println(colaPacientes.poll().toString());//se remueve el menor de la cola, y se muestra en pantalla
		}
	}
}


