import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(){
        autores.add(jorgeAmado);
        autores.add(machadoDeAssis);
        autores.add(clariceLispector);
        autores.add(pauloCoelho);
        autores.add(carolinaMariaDeJesus);

        livros.add(capitaesDeAreia);
        livros.add(gabrielacravoecanela);
        livros.add(domcasmurro);
        livros.add(quincasborba);
        livros.add(ahoradaestrela);
        livros.add(lacosdefamilia);
        livros.add(oalquimista);
        livros.add(brida);
        livros.add(quartodedesejo);
        livros.add(diariodebitita);
    }

    Autor jorgeAmado = (new Autor(1, "Jorge Amado", LocalDate.of(1912,8,10)));
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

    public void listarLivrosDisponiveis(){
        System.out.println("LIVROS DISPONÍVEIS: ");

        for (Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println("ID: " + livro.getId());
                System.out.println("Título: " + livro.getNome());
                System.out.println("Autor: " + livro.getAutor().getNome());
                System.out.println("------------------------");
            }
        }
    }

    public Livro buscarPorId(int id){
        for (Livro livro : livros){
            if (livro.getId() == id){
                return livro;
            }
        }
        return null;
    }

    public void realizarEmprestimo(int id, String nomeCliente){
        Livro livro = buscarPorId(id);

        if (livro == null){
            System.out.println("LIVRO NÃO ENCONTRADO");
        }

        if (!livro.isDisponivel()){
            System.out.println("LIVRO INDISPONÍVEL PARA EMPRÉSTIMO");
        }

        int novoIdEmprestimo = emprestimos.size() + 1;
        Emprestimo novoEmprestimo = new Emprestimo(
          novoIdEmprestimo,
          livro,
          nomeCliente,
          LocalDate.now(),
          null
        );

        emprestimos.add(novoEmprestimo);
        livro.setDisponivel(false);

        System.out.println("\n✅ Empréstimo realizado com sucesso!");
        System.out.println("Livro: " + livro.getNome());
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Data: " + LocalDate.now());
        System.out.println("Data de devolução: " + LocalDate.now().plusDays(3));

        for (Emprestimo emprestimo: emprestimos){
            System.out.println("Livro: " + emprestimo.getLivro());
            System.out.println("Autor: " + emprestimo.getLivro().getAutor());
            System.out.println("Nome do Cliente: " + emprestimo.getNomeCliente());
        }
    }
}
