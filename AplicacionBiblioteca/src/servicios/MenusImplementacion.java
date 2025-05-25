package servicios;

import controladores.Inicio;

public class MenusImplementacion implements MenusInterfaz {
	
	@Override
	public byte menuPrincipal() {
		
		byte opcionPrincipal;
		
		System.out.println("---- MENU BIBLIOTECA ----");
		System.out.println("1. Gestion de Libros");
		System.out.println("2. Buscar Libros");
		System.out.println("3. Cerrar Aplicacion");
		opcionPrincipal = Inicio.scanner.nextByte();
		
		return opcionPrincipal;
	}
	
	@Override
	public byte menuSecundario() {
		
		byte opcionSubmenu;
		
		System.out.println("---- GESTION DE LIBROS ----");
		System.out.println("1. Alta Libro");
		System.out.println("2. Baja Libro");
		System.out.println("3. Listar Libros");
		opcionSubmenu = Inicio.scanner.nextByte();
		
		return opcionSubmenu;
	}
}
