/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaRemedios;

/**
 *
 * @author IFSC
 */
public class remedioGenerico{
    public String nome;
    public int valor;

    public void imprimeRemedio(){
        System.out.println("Nome: "+nome);
        System.out.println("Valor: "+valor);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
