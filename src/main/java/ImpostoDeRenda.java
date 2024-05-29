public class ImpostoDeRenda extends FaixasIR2024 {
    private Pessoa pessoa;
    private FaixaImposto faixaImposto = new FaixaImposto();
    private double salario;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.salario = pessoa.getSalario();
    }
    public double determinaImpostoDeRendaAPagar(double salarioACalcular) {
        double irAPagar = 0;
        if (salarioACalcular > faixa4) {
            irAPagar = (salario - faixa4) * 0.275;
            salarioACalcular = faixa4;
        }
        if (salarioACalcular > faixa3) {
            irAPagar += (salarioACalcular - faixa3) * 0.225;
            salarioACalcular = faixa3;
        }
        if (salarioACalcular > faixa2) {
            irAPagar += (salarioACalcular - faixa2) * 0.15;
            salarioACalcular = faixa2;
        }
        if (salarioACalcular > faixa1) {
            irAPagar += (salarioACalcular - faixa1) * 0.075;
        }
        return irAPagar;
    }

    public void calculaImpostoDeRenda() {
        int faixa = faixaImposto.determinaFaixaIR(salario);
        double valorImposto = determinaImpostoDeRendaAPagar(salario);
        System.out.printf("O sua faixa de imposto é %d valor do imposto de renda a ser pago é: R$ %.2f%n", faixa, valorImposto);
    }
}
