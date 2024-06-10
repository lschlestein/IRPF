public class Pessoa {
    private String nome;
    private final double salario;
    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
