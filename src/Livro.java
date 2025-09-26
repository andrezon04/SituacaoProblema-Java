public class Livro implements Imprestavel {
    private String codigo;
    private String titulo;
    private String autor;

    enum Status {
        DISPONIVEL,
        EMPRESTADO
    }

    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    private void emprestar() {

    }

    @Override
    public void emprestar(Usuario u) {

    }

    @Override
    public void devolver() {

    }
}