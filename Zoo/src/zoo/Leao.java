
package zoo;

public class Leao extends Animal {
    
    public Leao(){}
    public Leao(float tamanho, String cor, Boolean Juba){
       super(tamanho, cor);
       this.juba = juba;
   }
    
    private boolean juba;

    public boolean getJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
    public void imprimirLeao(Leao leao){
        System.out.println("Tamanho Leao: " +leao.getTamanho());
        System.out.println("Cor Leao: "+leao.getCor());
        System.out.println("Raça Leao: "+leao.getJuba());
        
    }
    
    public void cacar(String animalCacado){
        System.out.println("Leao caçando o animal: "+animalCacado);
    }
}
