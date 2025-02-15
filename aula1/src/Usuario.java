/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Usuario {

    private int id;
    private String nome;
    private String endereco;
    private String email;
    private Byte receita;

    public void consultarMedicamento() {
        System.out.println("Consulta para pegar receita de medicamento!");
    }

    public void comprarMedicamento() {
        System.out.println("Comprar Medicamentos!!");
    }

    public void efetuarPagamento() {
        System.out.println("Efetuar pagamento!");
    }

    public int getid() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public Byte getReceita() {
        return receita;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setReceita(Byte receita) {
        this.receita = receita;
    }

    public float calcularImposto(float valor) {
        if (valor > 100) {
            return (float) (valor * 0.15);
        }
        return (float) (valor * 0.10);
    }
}
