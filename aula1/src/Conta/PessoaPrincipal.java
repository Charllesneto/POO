
package Conta;


public class PessoaPrincipal {
    public static void main(String [] args){
        
        Cliente oCliente = new Cliente ("052.055.256-54", "Charlles Neto", "Rua da paz","21", "carvalhocharlles4@gmail.com", "62998233419");
        
        /*Cliente oCliente = new Cliente();
        oCliente.setCpf ("052.055.256-54");
        oCliente.setNome("Charlles Neto");
        oCliente.setEndereco("Rua da paz");
        oCliente.setIdade("21"); */
        
        oCliente.imprimirCliente();
        
        Fornecedor oFornecedor = new Fornecedor ();
        
        oFornecedor.setCnpj ("052.055.0001/25");
        oFornecedor.setNome("tiago cardoso");
        oFornecedor.setEndereco("Rua da maria");
        oFornecedor.setIdade("35");
        oFornecedor.setEmail("Fornecedor@gmail.com");
        oFornecedor.setTelefone("62999865325");
        
        oFornecedor.imprimirFornecedor();
        
    }
    
}
