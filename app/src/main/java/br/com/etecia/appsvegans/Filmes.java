package br.com.etecia.appsvegans;

public class Filmes {
    private String Titulo;

    private String Descrição;

    private String Categoria;

    private int imagem

    public Filmes(String titulo, String descrição, String categoria, int imagem) {
        this.Titulo = titulo;
        this.Descrição = descrição;
        this.Categoria = categoria;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
