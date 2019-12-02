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
public class Enfermeiro extends Pessoa {
    private String coren;

    Enfermeiro(String nome, String cpf, String coren) {
        this.nome = nome;
        this.cpf = cpf;
        this.coren = coren;
    }
    
    private boolean acessarHistorico(Paciente paciente)
    {
        return false;        
    };

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
}
