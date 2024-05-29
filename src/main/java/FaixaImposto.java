public class FaixaImposto extends FaixasIR2024 {

    /* Faixas do IR Parcela salarial em cada faixa Alíquota
    Faixa 1:    Até R$ 2.112                        isento
    Faixa 2:    De 2.112,01 até 2.826,66            7,5%
    Faixa 3:    De 2.826,67 até 3.751,06            15%
    Faixa 4:    De 3.751,07 até 4.664,68            22,5%
    Faixa 5:    Acima de R$ 4.664,68                27,5% */

    public int determinaFaixaIR(double salario) {
        if (salario >= faixa4) return 5;
        if (salario >= faixa3) return 4;
        if (salario >= faixa2) return 3;
        if (salario >= faixa1) return 2;
        return 1;
    }
}
