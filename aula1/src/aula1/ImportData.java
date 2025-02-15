package aula1;
import java.util.Date; 


public class ImportData {
    public void printData (Date objDate){
        System.out.println("A data de hoje em mil segundos é: " + objDate.getTime ());
    }
    
    public static void main (String[] args){
    
        Date objDate = new Date(); 
        ImportData oImport = new ImportData ();
        oImport.printData(objDate);
    }
      public void comparacao(int n1, int n2){
       int x = 10;
       int y = 20;
       if (x > y){
           return n1; {
       }else {
               return n2
               }
       }
       
   }
    
      
}
