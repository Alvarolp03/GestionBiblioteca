package servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import controladores.Inicio;
import dto.LibroDto;

public class FicherosImplementacion implements FicherosInterfaz {
	
	@Override
	public void escribirFichero() {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("libros.txt"))) {
			
			for(LibroDto libro : Inicio.libro) {
				
				String linea = libro.getTitulo().concat(";").concat(libro.getAutor().concat(";"))
								.concat(String.valueOf(libro.getIsbn()).concat(";"))
								.concat(String.valueOf(libro.getNumPagina()));
				
				bw.write(linea);
				bw.newLine();
			}
			
		}catch(IOException e) {
			
			System.out.println("Error al guardar libros: " + e.getMessage());
		}
	}
	
	@Override
	public void cargaArchivo() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("libros.txt"))) {
			
			String linea;
			
			while((linea = br.readLine()) != null) {
				
				String[] partes = linea.split(";");
				
				if(partes.length == 4) {
					
					LibroDto libro = new LibroDto();
					libro.setTitulo(partes[0]);
					libro.setAutor(partes[1]);
					libro.setIsbn(Long.parseLong(partes[2]));
					libro.setNumPagina(Integer.parseInt(partes[3]));
					
					Inicio.libro.add(libro);
				}
			}
			
			System.out.println("Libros cargados correctamente");
			
		}catch(IOException e) {
			
			System.out.println("Error al cargar los libros desde el fichero: " + e.getMessage());
		}
		
	}
	
	
}
