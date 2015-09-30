import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Driver {

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
		Vector<Paciente> pacientes = new Vector<Paciente>();
		//Paciente[] pacientes = new Paciente[cantLineas];//se instancia un arreglo de asociaciones para guardar las palabras
		for(int i = 0; i < cantLineas; i++){
			parte = lineas[i].split(",");//se separa la palabra donde se encuentre la coma
			//parte[0] = parte[0].substring(1);//se obtiene la primera palabra
			parte[1] = parte[1].substring(1);//se obtiene la segunda palabra
			parte[2] = parte[2].substring(1);
			pacientes.add(new Paciente(parte[0], parte[1], parte[2]));//se colocan en el arreglo
		}
		for(int i = 0; i < cantLineas; i++){
			System.out.println(pacientes.get(i).getNombre());
			System.out.println(pacientes.get(i).getDescripcion());
			System.out.println(pacientes.get(i).getCodigo());
		}
	}

}
