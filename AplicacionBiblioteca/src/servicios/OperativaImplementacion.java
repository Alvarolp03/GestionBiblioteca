package servicios;

import controladores.Inicio;
import dto.LibroDto;

public class OperativaImplementacion implements OperativaInterfaz {

	
	@Override
	public void altaLibro() {
		
		LibroDto libroNuevo = new LibroDto();
		
		System.out.println("Nombre del libro: ");
		Inicio.scanner.nextLine();
		String titulo = Inicio.scanner.nextLine();
		libroNuevo.setTitulo(titulo);
		
		System.out.println("Nombre del autor: ");
		String autor = Inicio.scanner.nextLine();
		libroNuevo.setAutor(autor);
		
		System.out.println("Introduce el ISBN: ");
		long isbn = Inicio.scanner.nextLong();
		libroNuevo.setIsbn(isbn);
		
		System.out.println("Introduce el numero de paginas: ");
		int numPagina = Inicio.scanner.nextInt();
		libroNuevo.setNumPagina(numPagina);
		
		Inicio.libro.add(libroNuevo);
		System.out.println("Libro guardado con exito.");
	}
	
	@Override
	public void bajaLibro() {
		
		System.out.println("Introduce el ISBN que desees brorrar: ");
		long isbn = Inicio.scanner.nextLong();
		
		boolean encontrado = false;
		
		for(int i = 0; i < Inicio.libro.size(); i++) {
			
			if(Inicio.libro.get(i).getIsbn() == isbn) {
				
				Inicio.libro.remove(i);
				encontrado = true;
				System.out.println("Libro elimninado.");
			}
		}
		
		if(!encontrado) {
			
			System.out.println("No se ha encontrado este libro.");
		}
	}
	
	
	@Override
	public void listarLibro() {
		
		for(LibroDto libro : Inicio.libro) {
			
			System.out.println(libro.toString());
		}
	}
	
}
