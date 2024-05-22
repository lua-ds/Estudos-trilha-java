import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoCase2 {
    public static void main(String[] args) {
        selecao();
    }
    public static void selecao(){
        
        double salarioBase = 2000.0;
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int totalSelecionado = 0;
        int proximoCandidato = 0;
        
        while(totalSelecionado < 5 && proximoCandidato < candidatos.length)
        {
            String candidato = candidatos [proximoCandidato++];
            double valorPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " está pedindo " + valorPretendido);
            
            if(valorPretendido > salarioBase)
            {
                System.out.println("QUE PENA!! O candidato " + candidato + " NÃO foi selecionado ");
				
			}
            
            else
            {
				System.out.println("LEGAL!! O candidato " + candidato + " foi selecionado ");				
                totalSelecionado++;			
            }
        }
        
       
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    } 


}
