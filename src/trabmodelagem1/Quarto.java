/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Gregório
 */
public class Quarto {
    public int numeroQuarto;
    private int maxVisitas;
    public Paciente paciente;
    private ArrayList visitas;
    public String nomePaciente;
    
    
    Quarto(int numQuarto, String nome)
    {
        numeroQuarto=numQuarto;
        nomePaciente = nome;
        this.visitas = new ArrayList();
    }

   
    
    public void alteraQuarto(Paciente pacientes){
        
        if (pacientes!=null){
            this.paciente=pacientes;
        this.nomePaciente=paciente.getNome();
        }
        else 
        {
            paciente=null;
            this.nomePaciente=null;
        }
        
    }
    public String nomePaciente (){
        return nomePaciente;
    }
    private boolean quartoCheio()
    {
        if(visitas.size() == maxVisitas)
            return true;
        else
            return false;
    }
}
