/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geovana1703;

import java.util.Scanner;


public class TesteHospital {
        public static void main(String[] args) {
        Paciente p = new Paciente();
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        System.out.println("Digite o nome do Paciente: ");
           p.setNome(entrada.nextLine());
        System.out.println("Nome do paciente: "+p.getNome());
        System.out.println("Digite a idade do Paciente: ");
            p.setIdade(entrada.nextInt());
        System.out.println("Data da Consulta: ");
            p.setDataEntrada(entrada.next());
        System.out.println("A data da Consulta é: "+p.getDataEntrada());
        
        //cadastrando pacientes
        //---------------------------------------------------------------
        Medico m = new Medico();
        
        System.out.println("Digite o nome do Médico: ");
            m.setNome(entrada.next());
        System.out.println("Nome do médico: "+m.getNome());
        System.out.println("Digite o CRM do Médico: ");
            m.setCrm(entrada.next());
        System.out.println("CRM do Médico: "+m.getCrm());
        //cadastrando médicos
        //---------------------------------------------------------------
        Enfermeiro e = new Enfermeiro();
        
        System.out.println("Digite o nome do Enfermeiro: ");
            m.setNome(entrada.next());
        System.out.println("Nome do médico: "+e.getNome());
        System.out.println("Digite o COFEN do Enfermeiro: ");
            m.setCrm(entrada.next());
        System.out.println("COFEN do Enfermeiro: "+e.getCofen());
        //cadatrando enfermeiro
        //---------------------------------------------------------------
        Internacao i = new Internacao();
            i.setObjPaciente(p);
            i.setObjMedico(m);
        System.out.println("Digite a data da internacao: ");
            i.setDataEntrada(entrada.next());
        System.out.println("O paciente entrou no dia: "+i.getDataEntrada());
        System.out.println("Qual o motivo da internação? ");
            i.setMotivoInternacao(entrada.next());
        System.out.println("Quantidade de dias que o paciente ficou internado: ");
            Internacao.setTotaldeDias(Internacao.getTotaldeDias() +1);
            System.out.println("A quantidade de dias que o paciente ficou internado foi: "+Internacao.getTotaldeDias());
        // internacao
        //----------------------------------------------------------------
        Internacao.setQtdConsulta(Internacao.getQtdConsulta() + 1);
        System.out.println("A quantidade de internações nesse dia será de: "+Internacao.getQtdConsulta());
        // qtd de internacao
        //----------------------------------------------------------------
        System.out.println("Valor da Internacao: "+(Internacao.getTotaldeDias()+100.00));
       
    }
        
         
       
        
    }
        
        
        
            
        
        
        
        
        
            
        
        
    
    
      

