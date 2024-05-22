import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCase1 {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        
        case1(2000, 1300);
        case1(2000, 2000);
        case1(2000, 2900);


    }
    public static void case1 (double salarioBase, double salarioPretendido){

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }        
        else if(salarioBase == salarioPretendido) { 
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando reusltado dos demais candidatos");
        } 

        


    }


}
