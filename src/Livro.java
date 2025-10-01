public class Livro implements Imprestavel {
    private String codigo;
    private String titulo;
    private String autor;

    enum Status {
        DISPONIVEL,
        EMPRESTADO
    }

    //    Criação de construtores
    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    //    Criação de getters e setters
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

    //    Criação dos métodos
    public void emprestar() {
        Status emprestado = Status.EMPRESTADO;
    }

    public void devolver() {
        Status devolver = Status.DISPONIVEL;
    }

    @Override
    public void emprestar(Usuario u) {
    }

    @Override
    public String toString() {
        return "Livro(s) Adicionado(s): \nCódigo do livro: " + codigo + "\n Título: " + titulo + "\nAutor: " + autor+"\n";
    }
}