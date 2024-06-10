public class ImpostoDeRenda extends FaixasIR2024 {
    private final Pessoa pessoa;
    private double valor;
    private int faixa;
    private FaixaImpostoRenda faixaImposto = new FaixaImpostoRenda();
    private double salario;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.salario = pessoa.getSalario();
    }

    public double calcularImpostoDeRendaAPagar(double salarioACalcular) {
        double irAPagar = 0;
        if (salarioACalcular > faixa4) {
            irAPagar = (salario - faixa4) * 0.275;//alíquota 27,5% para Faixa 5
            salarioACalcular = faixa4;
        }
        if (salarioACalcular > faixa3) {
            irAPagar += (salarioACalcular - faixa3) * 0.225;//alíquota 22,5% para Faixa 4
            salarioACalcular = faixa3;
        }
        if (salarioACalcular > faixa2) {
            irAPagar += (salarioACalcular - faixa2) * 0.15;//alíquota 15% para Faixa 2
            salarioACalcular = faixa2;
        }
        if (salarioACalcular > faixa1) {
            irAPagar += (salarioACalcular - faixa1) * 0.075;//alíquota 7,5% para Faixa 2
        }
        return irAPagar;
    }

    public void calcular() {
        faixa = faixaImposto.determinaFaixaIR(salario);
        valor = calcularImpostoDeRendaAPagar(salario);
    }

    public void imprimir() {
        System.out.printf("%s seu salário é R$ %.2f sua faixa de imposto é %d e o valor do imposto de renda a ser pago é: R$ %.2f%n", pessoa.getNome(), salario, faixa, valor);
    }
}
