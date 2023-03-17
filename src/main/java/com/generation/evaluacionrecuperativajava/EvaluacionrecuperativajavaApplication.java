package com.generation.evaluacionrecuperativajava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.evaluacionrecuperativajava.models.Producto;
import com.generation.evaluacionrecuperativajava.models.Ventas;


@SpringBootApplication
public class EvaluacionrecuperativajavaApplication {
	HashMap

	//1) Se debe crear una función que permita guardar un arreglo de una cierta cantidad de productos y que luego los muestre
	public static void productos(){
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Cuántos productos desea ingresar al sistema?  ");
		int cantidadProductos = teclado.nextInt();
		for(int i = 1; i<= cantidadProductos; i++){
			Producto producto = new Producto();
			teclado.nextLine();

			do{
				System.out.println("Ingrese el nombre del producto n°"+ i);
				producto.setNombre(teclado.nextLine());
				System.out.println("Ingrese la categoría del producto n°" +i);
				producto.setCategoria(teclado.nextLine());
				// System.out.println("Ingrese el precio del producto n°" + i);
				//producto.setPrecio(teclado.nextDouble());
				System.out.println("Ingrese el stock del producto n°" + i);
				producto.setStock(teclado.nextInt());

			}while (i>cantidadProductos);
			listaProductos.add(producto);
		}
		System.out.println("Los productos ingresados son: "+listaProductos);
	}

	/*2)Se debe crear una función que permita a don José obtener las ganancias sobre una venta (ocupar HashMap).*/
		/**
		 * 
		 */
		public static void ventas(){
		Scanner teclado = new Scanner(System.in);
	  	HashMap <String, Double> ventas = new HashMap<>();
		int cantidadProductos;
		System.out.println("Indique la cantidad de productos de la venta: ");
		cantidadProductos = teclado.nextInt();
		teclado.nextLine();
		
		String productoVenta = "";
		Double precioProducto = 0.0;
		
		for(int i = 1; i <= cantidadProductos; i++){
			productoVenta = "";
			precioProducto = 0.0;
			System.out.println("Indique el producto n°" + i + " de la venta");
			productoVenta = teclado.nextLine();
			System.out.println("Ingrese el precio del producto n°"+ i + " de la venta");
			precioProducto = teclado.nextDouble();
			teclado.nextLine();
			ventas.putIfAbsent(productoVenta, precioProducto);
		}
		int suma = 0;
		for (Double i : ventas.values()) {
			suma += i;
		}
		 System.out.println("Los ingresos totales por la venta son: $"+ suma);
	  }
	  

	// /*
	//  * 3) Se debe crear una función que dado un diccionario de productos con sus respectivos precios se obtenga, la ganancia total, el producto más caro y el producto más barato.
	//  * 

	//  */
	public static void dicionario(ArrayList<Double>notas){
		Double mayor = 0.0;
		Double menor = 1000000000.0;
		Double suma = 0.0;
		Double promedio = 0.0;
        // recorremos el arreglo en este caso de tipo Double
		for (int i = 0; i < notas.size(); i++) {
			//sumamos las notas 
			suma = suma + notas.get(i); 
			// ocupo dos if, y por que no un if else, por que aca necesito que si o si se cumplan las dos condiciones, y no que si no se cumpla la primera pase a al else recien
			// obligo al programa que pase si o si por los dos if
			if(notas.get(i)>mayor){
				mayor = notas.get(i);
			}
			if(notas.get(i)<menor){
				menor = notas.get(i);
			}

		}
		//sacamos el promedio y lo guardamos en la variable promedio 
		promedio = suma/notas.size();
        // mostramos el resultado
		System.out.println("La nota mas alta fue: "+mayor+"\nla nota mas baja fue: "+menor+ "\nel promedio de notas es de: "+promedio);
	}




	private static Double precioProducto(String productoVenta, Double precioProducto) {
			return null;
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EvaluacionrecuperativajavaApplication.class, args);
		
		
		Scanner teclado = new Scanner(System.in);

		int opcion=1;
		while(opcion!=0){
			do {
				System.out.println("Bienvenido");
				System.out.println("Ingresa 1 si quieres ingresar productos al sistema y verlos");
				System.out.println("Ingresa 2 si quieres ver la ganancia de la venta");
				System.out.println("Ingresa 3 si quiere ver ");
				System.out.println("Ingresa 0 para salir del menú");
				System.out.print("Ingresa tu opcion: ");
				opcion=teclado.nextInt();

			} while (opcion < 0 || opcion > 3);
			if(opcion==1){
				productos();
		
		} else if(opcion ==2){
			ventas();
		}
	}	
}

}

