package dto;

public class LibroDto {


	long isbn;
	int numPagina;
	String titulo;
	String autor;
	
	// contructor vacio
	public LibroDto() {
		
	}
	
	// constructor con para metros
	public LibroDto(long isbn, int numPagina, String titulo, String autor) {
		
        this.isbn = isbn;
        this.numPagina = numPagina;
        this.titulo = titulo;
        this.autor = autor;
    }
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Titulo: ".concat(titulo).concat("\n")
				.concat("Autor: ").concat(autor).concat("\n")
				.concat("ISBN: ").concat(String.valueOf(isbn)).concat("\n")
				.concat("Numero de paginas: ").concat(String.valueOf(numPagina));
	}
	
	
	
}
