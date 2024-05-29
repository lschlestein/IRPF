public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Lucas", 5700);
        ImpostoDeRenda ir = new ImpostoDeRenda(p);
        ir.calculaImpostoDeRenda();
    }
}
