
package Conta;


public class Fornecedor extends Pessoa {
   
   
    private String cnpj;
    private Float valor, imposto; 

    public String getCnpj() {
        return cnpj;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getImposto() {
        return imposto;
    }

    public void setImposto(Float imposto) {
        this.imposto = imposto;
    }
    

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public float calcularImposto(Fornecedor oFornecedor){
        float valor_total = valor + (valor * (imposto/100));
        return valor_total; 
    }
   
    public void imprimirFornecedor(){
        System.out.println("CNPJ do Fornecedor: " +this.getCnpj());
        System.out.println("Nome do Fornecedor: " +super.getNome());
        System.out.println("Idade do Fornecedor " +this.getIdade());
        System.out.println("Endereço  do Fornecedor: " +this.getEndereco());
        System.out.println("Email do Fornecedor: "+ this.getEmail());
        System.out.println("Telefone do Fornecedor: "+ this.getTelefone());
    }
   
}
    

