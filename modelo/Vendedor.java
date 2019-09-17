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
public class Vendedor extends Funcionario{
    
    private double Comissao;

    public Vendedor() {
    }

    public Vendedor(double Comissao) {
        this.Comissao = Comissao;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSal_base() {
        return sal_base;
    }

    @Override
    public void setSal_base(double sal_base) {
        this.sal_base = sal_base;
    }
    @Override
    public double CalcularSalario(){
        return this.sal_base + this.Comissao;
    }
    
    
    
}
