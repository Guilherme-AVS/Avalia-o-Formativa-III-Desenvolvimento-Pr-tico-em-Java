package service;

import model.Livro;
import java.util.ArrayList;

public class BibliotecaService {
    private ArrayList<Livro> acervo;

    public BibliotecaService() {
        this.acervo = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        acervo.add(livro);
        System.out.println("Livro cadastrado com sucesso: " + livro.getTitulo());
    }

    public void listarLivros() {
        if (acervo.isEmpty()) {
            System.out.println("O acervo está vazio.");
            return;
        }
        for (Livro livro : acervo) {
            System.out.println(livro.toString());
        }
    }

    public Livro buscarLivro(String codigo) throws LivroNaoEncontradoException {
        for (Livro livro : acervo) {
            if (livro.getCodigo().equals(codigo)) {
                return livro;
            }
        }
        throw new LivroNaoEncontradoException("Livro com o código '" + codigo + "' não existe no acervo.");
    }
}