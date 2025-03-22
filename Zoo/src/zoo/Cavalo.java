
package zoo;


public class Cavalo extends Animal {
    private String raca;

   
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
   
   public void imprimirCavalo(Cavalo cavalo){
       System.out.println("Tamanho Cavalo: "+cavalo.getTamanho());
       System.out.println("Cor cavalo: "+cavalo.getCor());
       System.out.println("Raça: "+ cavalo.getRaca());
   }
   
    public void fugir(String local){
        
        System.out.println("Fugindo para: " + local);
       
    }
    
}
