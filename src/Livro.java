import java.time.LocalDate;

public class Livro {
    private int id;
    private String nome;
    private Autor autor;
    private boolean disponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizado;

    public Livro(int id, String nome, Autor autor, boolean disponivel, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualizado() {
        return dataAtualizado;
    }

    public void setDataAtualizado(LocalDate dataAtualizado) {
        this.dataAtualizado = dataAtualizado;
    }

}
