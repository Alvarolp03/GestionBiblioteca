/*
 * El proyecto trata sobre una aplicacion parala gestion de una biblioteca
 * */
package controladores;

import java.util.ArrayList;
import java.util.Scanner;
import dto.LibroDto;
import servicios.MenusImplementacion;
import servicios.MenusInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;


public class Inicio {

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<LibroDto> libro = new ArrayList<>();
	
	public static void main(String[] args) {
		
		MenusInterfaz menu = new MenusImplementacion();
		OperativaInterfaz operativa = new OperativaImplementacion();
		
		boolean cerrar = false;
		
		do {
			
			switch(menu.menuPrincipal()) {
			
			case 1: 
				switch(menu.menuSecundario()) {
				
				case 1:
					operativa.altaLibro();
					break;
				
				case 2:
					operativa.bajaLibro();
					break;
				
				case 3:
					operativa.listarLibro();
					break;
				}
				break;
			
			case 2: 
				break;
			
			case 3:
				System.out.println("Aplicacion cerrada.");
				cerrar = true;
				break;
			}
			
		}while(!cerrar);

	}

}
