/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geovana1703;
import java.util.ArrayList;
import java.util.Scanner;




public class Internacao {
   private Paciente objPaciente; 
   private Medico objMedico;
   private String dataEntrada;
   private static int qtdConsulta;
   private String motivoInternacao;
   private static int totaldeDias;
   private double valorConsulta =100;
    private int QtdConsulta;

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public static int getTotaldeDias() {
        return totaldeDias;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public static void setTotaldeDias(int totaldeDias) {
        Internacao.totaldeDias = totaldeDias;
    }
   
    
    /**
     * @return the objPaciente
     */
    public Paciente getObjPaciente() {
        return objPaciente;
    }

    /**
     * @param objPaciente the objPaciente to set
     */
    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    /**
     * @return the objMedico
     */
    public Medico getObjMedico() {
        return objMedico;
    }

    /**
     * @param objMedico the objMedico to set
     */
    public void setObjMedico(Medico objMedico) {
        this.objMedico = objMedico;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the qtdConsulta
     */
    public static int getQtdConsulta() {
        return qtdConsulta;
    }

    /**
     * @param aQtdConsulta the qtdConsulta to set
     */
    public static void setQtdConsulta(int aQtdConsulta) {
        qtdConsulta = aQtdConsulta;
    }

    
    }
    

