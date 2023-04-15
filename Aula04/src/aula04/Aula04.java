package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.5);
        Caneta c2 = new Caneta("KKK", "Laranja" , 0.8);
        c1.status();
        System.out.println("");
        c2.status();
            
        
        
        
        
        
        //c1.setModelo("Bic"); //chamada pelo metodo acessor 
        //c1.modelo = "BIC"; //peguei diretamento o atributo
        //c1.setPonta(0.5);
        //c1.ponta = 0.5;
        //c1.status();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }

}
