
package Conta;
import java.util.Scanner;
/**
 *
 * @author charlles
 */
public class UsaConta {
    
    public static void main(String[] argumentos){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Scanner scan = new Scanner(System.in);
        /*
        conta1.setNome("Tiago");
        conta2.setNome("Maria");
        
        //depositnado nas contas
        conta1.depositar(50);
        conta2.depositar(10);
        */ 
        System.out.println("Informe o nome: ");
        conta1.setNome(scan.next());
        
        System.out.println("Digite o Saldo: ");
        double saldo = scan.nextDouble();
        
        System.out.println("Digite a porcetagem: ");
        double porcetagem = scan.nextDouble();
        
        conta1.depositar2(saldo, porcetagem);
        
        
        System.out.printf("Saldo: %.2f",conta1.getSaldo());
        System.out.println("\n Nome: "+ conta1.getNome());
        
        System.out.println("-------MENU-----------");
        System.out.println(" 0 - SAIR ");
        System.out.println("1- CALCULAR NOVAMENTE! ");
        int opcao = scan.nextInt();
        
        while (opcao == 1){
            System.out.println("Informe o nome: ");
            conta1.setNome(scan.next());
            
            System.out.println("Digite o saldo");
            double saldo2 = scan.nextDouble();
            
            System.out.println("Digite a porcetagem: ");
            double porcetagem2 = scan.nextDouble();
            
            conta1.depositar2(saldo, porcetagem);
            
            System.out.printf("Saldo: %.2f",conta1.getSaldo());
            System.out.println("\n Nome: "+ conta1.getNome());
        
            System.out.println("-------MENU-----------");
            System.out.println(" 0 - SAIR ");
            System.out.println("1- CALCULAR NOVAMENTE! ");
            opcao = scan.nextInt();
        
           
           
        }
        /*
        System.out.println("Conta 1 - Nome: " +conta1.getNome());
        System.out.printf("Conta 1 - Saldo " +conta1.getSaldo());
        
        System.out.println("Conta 2 - Nome: " +conta2.getNome());
        System.out.println("Conta 2 - Saldo: " +conta2.getSaldo());
        */
        
        
   
        
    }
}
