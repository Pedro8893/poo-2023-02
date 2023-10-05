// Classe que representa um carro
class Livro {
    private String titulo; // Atributo privado
    private String autor; // Atributo privado
    private String ano; // Atributo privado
    private String editora; // Atributo privado

// Construtor da classe
public Pessoa(String titulo, String autor, String editora, int ano) {
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.editora = editora;
    

}

 // Get para Atributos
 public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}

public int getAno() {
    return ano;
}

public String getEditora() {
    return editora;
}

// Set para Atributos
public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public void setAno(int ano) {
    this.ano = ano;
}

public void setEditora(String editora) {
    this.editora = editora;
}

// Mostrar o estado da instância 

public String toString() {
    return titulo + "\n" + autor + "\n" + editora + ", " + ano;
}

public class TestaLivro {
public static void main(String[] args) {
    // Criando instâncias dos três livros mais vendidos pela Amazon
    Livro livro1 = new Livro("O mundo de Sofia", "Jostein Gaarder", 2012, "Seguinte");
    Livro livro2 = new Livro("O menino do pijama listrado", "John Boyne", 2007, "Seguinte");
    Livro livro3 = new Livro("Anos de chumbo e outros contos", "Chico Buarque", 2021, "Companhia das Letras");

    // Exibir as instâncias
    System.out.println("Livro 1:\n" + livro1);
    System.out.println("\nLivro 2:\n" + livro2);
    System.out.println("\nLivro 3:\n" + livro3);
}

}
}