/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geovana1703;


public class Medico {
    private String nome;
    private String crm;
    private Paciente objPaciente; 
    private Enfermeiro objEnfermeiro;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
}
