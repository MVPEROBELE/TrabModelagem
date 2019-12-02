/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Leonardo Gregório
 */
public class Atendente extends Funcionario{
public static ArrayList<Quarto> listaQuartos;

    public Atendente(String nome, String cpf) {
        this.nome =   nome;
        this.cpf = cpf;
        criaQuartos();
    }

    void criaQuartos(){
        reservarQuarto(101, null);
        reservarQuarto(102, null);
        reservarQuarto(103, null);
        reservarQuarto(104, null);
        reservarQuarto(201, null);
        reservarQuarto(202, null);
        reservarQuarto(203, null);
        reservarQuarto(204, null);
        reservarQuarto(301, null);
        reservarQuarto(302, null);
        reservarQuarto(303, null);
        reservarQuarto(304, null);
        
    }
    
    
    public static void cadastrarPaciente(String nome, String cpf, int nivelDeUrgencia,String planoDeSaude)
    {
        Paciente novo = new Paciente(nome,cpf,nivelDeUrgencia,planoDeSaude);
        Main.listaPacientes.add(novo);
        for(int i=0; i < Main.listaPacientes.size(); i++)
            System.out.println(Arrays.toString(Main.listaPacientes.toArray()));
    }
    public static Paciente pesquisarPaciente(String cpf)
    {
        for(int i=0; i<Main.listaPacientes.size(); i++)
        {
            if(Main.listaPacientes.get(i).getCpf().equals(cpf))
                return Main.listaPacientes.get(i);
        }
        return null;
    }
    public static Paciente pesquisarPacienteNome(String nome)
    {
        for(int i=0; i<Main.listaPacientes.size(); i++)
        {
            if(Main.listaPacientes.get(i).getNome().equals(nome))
                return Main.listaPacientes.get(i);
        }
        return null;
    }
    public static void deletarPaciente(Paciente paciente)
    {
        Main.listaPacientes.remove(paciente);
        paciente = null;
    }
    
    
    
    
    
    
    public static void cadastrarVisitante(String nome, String cpf, Paciente paciente)
    {
        Visitante novo = new Visitante(nome,cpf,paciente);
        System.out.println("antes de criar objeto");
        Main.listaVisitantes.add(novo);
        System.out.println("criou objeto");
        Main.listaVisitantes.forEach((_item) -> {
            System.out.println(Arrays.toString(Main.listaVisitantes.toArray()));
        });
    }
    public static Visitante pesquisarVisitanteNome(String nome)
    {
        for(int i=0; i<Main.listaVisitantes.size(); i++)
        {
            if(Main.listaVisitantes.get(i).getNome().equals(nome))
                return Main.listaVisitantes.get(i);
        }
        return null;
    }
    public static void deletarVisitante(Visitante visitante)
    {
        Main.listaVisitantes.remove(visitante);
        visitante = null;
    }
    
    /**
     *
     * @return
     */
    public static void consultarQuarto()
    {
     
        
    }
    public static void reservarQuarto(int num, String nomeP)
    {
        Quarto novo = new Quarto(num, nomeP);
        System.out.println("antes de criar objeto");
        listaQuartos.add(novo);
        System.out.println("criou objeto");
        Main.listaVisitantes.forEach((_item) -> {
            System.out.println(Arrays.toString(listaQuartos.toArray()));
        });
        
    }
    public static void consultarAgendaMedico()
    {
        
    }
    public static void consultarAgendaQuarto()
    {
        
    }

    public String toString()
    {
        return this.nome;
    }

}
