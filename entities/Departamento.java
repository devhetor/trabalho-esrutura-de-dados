package entities;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private String nomeGerente;
    private List<String> nomeColaboradores;

    public Departamento(String nome, String nomeGerente) {
        this.nome = nome;
        this.nomeGerente = nomeGerente;
        this.nomeColaboradores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public List<String> getNomeColaboradores() {
        return nomeColaboradores;
    }

    public void adicionarColaborador(String nomeColaborador) {
        this.nomeColaboradores.add(nomeColaborador);
    }

    public boolean temColaborador(String nomeColaborador) {
        return this.nomeColaboradores.contains(nomeColaborador);
    }
    
    

}

