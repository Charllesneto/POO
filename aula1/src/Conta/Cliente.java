
package Conta;

    public class Cliente extends Pessoa {
        
    public Cliente(String cpf, String nome, String idade, String endereco, String email, String telefone, Float salario, Float IR){
        super(nome, idade, endereco, email, telefone);
        this.cpf = cpf;
        this.salario = salario; 
        this.IR = IR;
        
    }
   
    private String cpf;
    private Float salario, IR;


    public String getCpf() {
        return cpf;
    }
    public Float getSalario(){
        return salario;
    }
    public Float getIr(){
        return IR; 
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setSalario(Float salario){
        this.salario = salario;
    }
    public void setIr(Float IR){
        this.IR = IR; 
    }
    public float calcularSalario(Cliente oCliente){
        float valor_final = (salario * (IR/100));
        return valor_final;
    }
    public void imprimirCliente(){
        System.out.println("CPF do cliente: " +this.getCpf());
        System.out.println("Nome do cliente: " +super.getNome());
        System.out.println("Idade do  cliente: " +this.getIdade());
        System.out.println("Endereço  do cliente: " +this.getEndereco());
        System.out.println("Digite o email do cliente: "+ this.getEmail());
        System.out.println("Digite o telefone do cliente: "+ this.getTelefone());
    }
   
}


