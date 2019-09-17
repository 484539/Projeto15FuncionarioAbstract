/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor objVend1 = new Vendedor();
        
        objVend1.setNome("Lucas");
        objVend1.setSal_base(500);
        objVend1.setComissao(200);
        System.out.println("Vendedor: "+objVend1.getNome());
        System.out.println("Salario Base: "+objVend1.getSal_base());
        System.out.println("Comissão: "+objVend1.getComissao());
        System.out.println("Salario Final: "+objVend1.CalcularSalario());
        System.out.println("\n");
        
        Assistente objAss1 = new Assistente();
        
        objAss1.setNome("Biel");
        objAss1.setSal_base(200);
        System.out.println("Vendedor: "+objAss1.getNome());
        System.out.println("Salario Base: "+objAss1.getSal_base());
        System.out.println("Salario Final: "+objAss1.CalcularSalario());
        System.out.println("\n");
        
        Gerente objGer1 = new Gerente();
        
        objGer1.setNome("Renan");
        objGer1.setSal_base(1000);
        System.out.println("Vendedor: "+objGer1.getNome());
        System.out.println("Salario Base: "+objGer1.getSal_base());
        System.out.println("Salario Final: "+objGer1.CalcularSalario());
    }
    
}
