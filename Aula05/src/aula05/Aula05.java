/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

public class Aula05 {
    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1);
        p1.setDono("Gabriel");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        p1.sacar(150);
        p1.fecharConta();
                
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2);
        p2.setDono("Daniel");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
