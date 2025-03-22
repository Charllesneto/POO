
package zoo;

import java.util.Locale;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Leao oLeao = new Leao();
        Cavalo oCavalo = new Cavalo();
        String localFuga; 
        String animalCacado;
        String comida;
        
        System.out.println("Digite o tamanho do cavalo:");
        oCavalo.setTamanho(scan.nextFloat());
        System.out.println("Digite o tamanho do leao:");
        oLeao.setTamanho(scan.nextFloat());
        
        System.out.println("Digite a cor do cavalo:");
        oCavalo.setCor(scan.next());
        System.out.println("Digite a cor do Leão:");
        oLeao.setCor(scan.next());
        
        System.out.println("Digite o que o animal comeu");
        comida = scan.next();
        
        System.out.println("Digite a raça do cavalo");
        oCavalo.setRaca(scan.next());
        
        System.out.println("Digite para onde o cavalo fugiu:");
        localFuga = scan.next();
        
        System.out.println("Digite se o lao tem juba ou nao true ou false");
        oLeao.setJuba(scan.nextBoolean());
        
        System.out.println("Digite o animal que o leao caçou");
        animalCacado = scan.next();
        
        oCavalo.comer(comida);
        oLeao.comer(comida);
        
        oCavalo.imprimirCavalo(oCavalo);
        oCavalo.fugir(localFuga);
        
        oLeao.imprimirLeao(oLeao);
        oLeao.cacar(animalCacado);
        
        scan.close();
        
        
        
    }
      
    
}
