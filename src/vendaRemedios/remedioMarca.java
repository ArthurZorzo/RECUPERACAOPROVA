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
public class remedioMarca extends remedioGenerico{
    public String marca;
    
    public void imprimeRemedio(){
        System.out.println("Marca: "+marca);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
