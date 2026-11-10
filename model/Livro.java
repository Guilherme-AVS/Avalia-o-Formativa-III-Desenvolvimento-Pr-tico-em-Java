package model;

import interfaces.Emprestavel;

public class Livro implements Emprestavel {
    private String codigo;
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false; 
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isEmprestado() { return emprestado; }

    @Override
    public void emprestar() {
        if (emprestado) {
            System.out.println("Aviso: O livro '" + titulo + "' já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Sucesso: Livro '" + titulo + "' emprestado!");
        }
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            System.out.println("Aviso: O livro '" + titulo + "' já está disponível.");
        } else {
            emprestado = false;
            System.out.println("Sucesso: Livro '" + titulo + "' devolvido!");
        }
    }

    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return "[" + codigo + "] " + titulo + " - " + autor + " | Status: " + status;
    }
}