package exercicioFixacao2.entities;

public class PessoaFisica extends Pessoa{

    private double gastoSaude;


    public PessoaFisica(String name, double rendaAtual, double gastoSaude) {
        super(name, rendaAtual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return this.gastoSaude;
    }

    @Override
    public double verImpostoAPagar(){
        if(super.getRendaAnual() <= 20000) {
            return super.getRendaAnual() * 0.15;
        } else {
            return ((super.getRendaAnual() * 0.25) - (this.gastoSaude * 0.5));
        }
    }
}
