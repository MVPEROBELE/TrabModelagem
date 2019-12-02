/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

/**
 *
 * @author Leonardo Gregório
 */
public class Visitante extends Pessoa{
    private Paciente paciente;

    Visitante(String nome, String cpf, Paciente paciente) {
        this.nome = nome;
        this.cpf = cpf;
        this.paciente = paciente;
    }


    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
    public String toString()
    {
        return this.nome;
    }
}
