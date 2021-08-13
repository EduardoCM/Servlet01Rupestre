package beans;

public class Libro {

	private int id;

	private String titulo;

	private String genero;

	private String autor;

	private boolean novedad;
	
	public Libro() {
		
	}

	public Libro(int id, String titulo, String genero, String autor, boolean novedad) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
		this.novedad = novedad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isNovedad() {
		return novedad;
	}

	public void setNovedad(boolean novedad) {
		this.novedad = novedad;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", autor=" + autor + ", novedad="
				+ novedad + "]";
	}

}
