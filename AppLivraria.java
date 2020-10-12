package segundoPeriodo.editoraAssociacao;

public class AppLivraria {

    public static void main(String[] args) {

        Editora editora = new Editora("Saber Infotech");
        Livro livro = new Livro(1, "Java com Aldo", "ASBJ125",editora);

        System.out.println(livro);




    }
}
