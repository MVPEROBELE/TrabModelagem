/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.Arrays;

/**
 *
 * @author Leonardo Gregório
 */
public class Administrador extends Atendente {

    
    
    
    public Administrador(String nome, String cpf) {
        super(nome, cpf);
    }

    public static void cadastrarAtendente(String nome, String cpf)
    {
        Atendente novo = new Atendente(nome,cpf);
        System.out.println("dsp de criar objeto");
            Main.listaAtendentes.add(novo);
        System.out.println("add na lista");
        Main.listaVisitantes.forEach((_item) -> {
            System.out.println(Arrays.toString(Main.listaAtendentes.toArray()));
        });
    }
    public static Atendente pesquisarAtendenteNome(String nome)
    {
        for(int i=0; i<Main.listaAtendentes.size(); i++)
        {
            if(Main.listaAtendentes.get(i).getNome().equals(nome))
                return Main.listaAtendentes.get(i);
        }
        return null;
    }
    public static void deletarAtendente(Atendente atendente)
    {
        Main.listaAtendentes.remove(atendente);
        atendente = null;
    }
    
    
    public static void cadastrarMedico(String nome, String cpf, String crm, String especialidade)
    {
        Medico novo = new Medico(nome,cpf,crm,especialidade);
        System.out.println("antes de criar objeto");
        Main.listaMedicos.add(novo);
        System.out.println("criou objeto");
        Main.listaMedicos.forEach((_item) -> {
            System.out.println(Arrays.toString(Main.listaMedicos.toArray()));
        });
    }
    public static Medico pesquisarMedicoNome(String nome)
    {
        for(int i=0; i<Main.listaMedicos.size(); i++)
        {
            if(Main.listaMedicos.get(i).getNome().equals(nome))
                return Main.listaMedicos.get(i);
        }
        return null;
    }
    public static void deletarMedico(Medico medico)
    {
        Main.listaMedicos.remove(medico);
        medico = null;
    }
    
    
    public static void cadastrarEnfermeiro(String nome, String cpf, String coren)
    {
        Enfermeiro novo = new Enfermeiro(nome,cpf,coren);
        System.out.println("antes de criar objeto");
        Main.listaEnfermeiros.add(novo);
        System.out.println("criou objeto");
        Main.listaEnfermeiros.forEach((_item) -> {
            System.out.println(Arrays.toString(Main.listaEnfermeiros.toArray()));
        });
    }
    public static Enfermeiro pesquisarEnfermeiroNome(String nome)
    {
        for(int i=0; i<Main.listaEnfermeiros.size(); i++)
        {
            if(Main.listaEnfermeiros.get(i).getNome().equals(nome))
                return Main.listaEnfermeiros.get(i);
        }
        return null;
    }
    public static void deletarEnfermeiro(Enfermeiro enfermeiro)
    {
        Main.listaEnfermeiros.remove(enfermeiro);
        enfermeiro = null;
    }
    
    
    
    
    
    

}
