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
public class Medico extends Pessoa {
    private String especialidade;
    private String crm;
    //private AgendaMedico agenda;

    Medico(String nome, String cpf, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.cpf = cpf;
        this.especialidade = especialidade;
    }
    
    private void acessarProntuario(Paciente paciente)
    {
              
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }


}
