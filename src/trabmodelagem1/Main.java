/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.ArrayList;
import visao.TelaLogin;
import trabmodelagem1.Atendente;

/**
 *
 * @author Leonardo Gregório
 */
public class Main {
    private static Main hospital = new Main();
    
    
    
    
    public static ArrayList<Paciente> listaPacientes;
    public static ArrayList<Enfermeiro> listaEnfermeiros;
    public static ArrayList<Medico> listaMedicos;
    public static ArrayList<Atendente> listaAtendentes;
    public static ArrayList<Visitante> listaVisitantes;
    
    
    private Main()
    {
        this.listaPacientes = new ArrayList();
        this.listaEnfermeiros = new ArrayList();
        this.listaMedicos = new ArrayList();
        this.listaVisitantes = new ArrayList();
        this.listaAtendentes = new ArrayList();
   
    }

    public static Main getInstance()
    {
        return hospital;
    }

    
    
    
   
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            }
        });
        
        Atendente.cadastrarPaciente("Vulia Jaladares", "42069", 1, "Caixa");
        Atendente.cadastrarPaciente("Greo Legorio", "666", 4, "GEAP");
        Atendente.cadastrarPaciente("Rafa Ela", "9090", 1, "SUS");
        
        
    }
    
}
