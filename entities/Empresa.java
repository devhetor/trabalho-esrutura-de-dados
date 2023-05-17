package entities;

import java.util.HashMap;
import java.util.Map;

public class Empresa {

    private Map<String, Departamento> departamentos;

    public Empresa() {
        this.departamentos = new HashMap<>();
    }

    public void adicionarDepartamento(String nomeDepartamento, String nomeGerente) {
        Departamento departamento = new Departamento(nomeDepartamento, nomeGerente);
        this.departamentos.put(nomeDepartamento, departamento);
    }

    public void adicionarColaborador(String nomeDepartamento, String nomeColaborador) {
        Departamento departamento = this.departamentos.get(nomeDepartamento);
        if (departamento != null) {
            departamento.adicionarColaborador(nomeColaborador);
        }
    }
    
    public Departamento buscarDepartamentoPorNome(String nomeDepartamento) {
        for (Departamento departamento : departamentos.values()) {
            if (departamento.getNome().equals(nomeDepartamento)) {
                return departamento;
            }
        }
        return null;
    }

    public void imprimirDepartamentos() {
        for (Departamento departamento : this.departamentos.values()) {
            System.out.println("Departamento: " + departamento.getNome());
            System.out.println("Gerente: " + departamento.getNomeGerente());
            System.out.println("Colaboradores: " + departamento.getNomeColaboradores());
            System.out.println("-----------------------");
        }
    }

    public void imprimirColaboradoresPorDepartamento(String nomeDepartamento) {
        Departamento departamento = this.departamentos.get(nomeDepartamento);
        if (departamento != null) {
            System.out.println("Departamento: " + departamento.getNome());
            System.out.println("Gerente: " + departamento.getNomeGerente());
            System.out.println("Colaboradores: " + departamento.getNomeColaboradores());
            System.out.println("-----------------------");
        }
    }

    public void imprimirGerenteEDepartamentoPorColaborador(String nomeColaborador) {
        for (Departamento departamento : this.departamentos.values()) {
            if (departamento.temColaborador(nomeColaborador)) {
                System.out.println("Departamento: " + departamento.getNome());
                System.out.println("Gerente: " + departamento.getNomeGerente());
                System.out.println("Colaborador: " + nomeColaborador);
                System.out.println("-----------------------");
                break;
            }
        }
    }
    
   
}

