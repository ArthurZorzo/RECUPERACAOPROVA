/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendaRemedios;

import java.util.Scanner;

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        remedioGenerico abacavir = new remedioGenerico();
        remedioGenerico acarbose = new remedioGenerico();
        remedioGenerico aciclovir = new remedioGenerico();
        remedioMarca aclasta = new remedioMarca();
        remedioMarca actos = new remedioMarca();
        
        String generico1;
        String generico2;
        String generico3;
        int valorGenerico1;
        int valorGenerico2;
        int valorGenerico3;
        int desconto1;
        int desconto2;
        int desconto3;
        
        String nomeRemedioMarca1;
        String nomeRemedioMarca2;
        String nomeMarca1;
        String nomeMarca2;
        int valorMarca1;
        int valorMarca2;

        int total;
        
        //generico
        System.out.println("Digite o nome do 1o remedio generico comprado");
        generico1 = leia.nextLine();
        
        System.out.println("Digite o nome do 2o remedio generico comprado");
        generico2 = leia.nextLine();
        
        System.out.println("Digite o nome do 3o remedio generico comprado");
        generico3 = leia.nextLine();
        
        System.out.println("Digite o valor do 1o remedio generico comprado");
        valorGenerico1 = leia.nextInt();
        
        System.out.println("Digite o valor do 2o remedio generico comprado");
        valorGenerico2 = leia.nextInt();
        
        System.out.println("Digite o valor do 3o remedio generico comprado");
        valorGenerico3 = leia.nextInt();
        
        //Marca
        System.out.println("Digite o nome do 1o remedio de marca comprado");
        nomeRemedioMarca1 = leia.nextLine();
        
        System.out.println("Digite o nome do 2o remedio de marca comprado");
        nomeRemedioMarca2 = leia.nextLine();
        
        System.out.println("Digite o nome da marca do 1o remedio de marca");
        nomeMarca1 = leia.nextLine();
        
        System.out.println("Digite o nome da marca do 2o remedio de marca");
        nomeMarca2 = leia.nextLine();
        
        System.out.println("Digite o valor do 1o remedio de marca comprado");
        valorMarca1 = leia.nextInt();
        
        System.out.println("Digite o valor do 2o remedio de marca comprado");
        valorMarca2 = leia.nextInt();
        
        //calculo desconto generico
        desconto1 = valorGenerico1-((valorGenerico1*20)/100);
        desconto2 = valorGenerico2-((valorGenerico1*20)/100);
        desconto3 = valorGenerico3-((valorGenerico1*20)/100);
        
        //calculo total
        total = (desconto1+desconto2+desconto3+valorMarca1+valorMarca2);
        
        //generico
        abacavir.setNome(generico1);
        abacavir.setValor(desconto1);
        
        acarbose.setNome(generico2);
        acarbose.setValor(desconto2);
        
        aciclovir.setNome(generico3);
        aciclovir.setValor(desconto3);
        
        //marca
        aclasta.setNome(nomeRemedioMarca1);
        aclasta.setMarca(nomeMarca1);
        aclasta.setValor(valorMarca1);
        
        actos.setNome(nomeRemedioMarca2);
        actos.setMarca(nomeMarca2);
        actos.setValor(valorMarca2);
        
        //imprime
        aclasta.imprimeRemedio();
        actos.imprimeRemedio();
        abacavir.imprimeRemedio();
        acarbose.imprimeRemedio();
        aciclovir.imprimeRemedio();
        System.out.println("Total da compra: "+total);
    }
}