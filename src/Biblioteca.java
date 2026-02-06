import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    Autor jorgeAmado = new Autor(1, "Jorge Amado", LocalDate.of(1912,8,10));
    Autor machadoDeAssis = new Autor(2,"Machado de Assis", LocalDate.of(1839,6,21));
    Autor clariceLispector = new Autor(3, "Clarice Lispector", LocalDate.of(1920,12,10));
    Autor pauloCoelho = new Autor(4, "Paulo Coelho", LocalDate.of(1947,8,24));
    Autor carolinaMariaDeJesus = new Autor(5,"Carolina Maria de Jesus", LocalDate.of(1914,3,14));

    Livro capitaesDeAreia = new Livro(1, "Capitães",
                                     jorgeAmado, true,LocalDate.of(2026,1,26));
    Livro gabrielacravoecanela = new Livro(2,"Gabriela, Cravo e Canela",
                                          jorgeAmado, true, LocalDate.of(2026,2,6));
    Livro domcasmurro = new Livro(3,"Dom Casmurro",
                                          machadoDeAssis, true, LocalDate.of(2025,8,7));
    Livro quincasborba = new Livro(4,"Quincas Borba",
                                          machadoDeAssis, true, LocalDate.of(2025,9,15));
    Livro ahoradaestrela = new Livro(5,"A Hora da Estrela",
                                          clariceLispector, true, LocalDate.of(2025,1,13));
    Livro lacosdefamilia = new Livro(6,"Laços de Família",
                                          clariceLispector, true, LocalDate.of(2026,1,6));
    Livro oalquimista = new Livro(7,"O Alquimista",
                                          pauloCoelho, true, LocalDate.of(2025,3,7));
    Livro brida = new Livro(8,"Brida",
                                          pauloCoelho, true, LocalDate.of(2025,10,17));
    Livro quartodedesejo = new Livro(9,"Quarto de Desejo",
                                          carolinaMariaDeJesus, true, LocalDate.of(2025,8,13));
    Livro diariodebitita = new Livro(10,"Diário de Bitita",
                                          carolinaMariaDeJesus, true, LocalDate.of(2025,12,4));

}
