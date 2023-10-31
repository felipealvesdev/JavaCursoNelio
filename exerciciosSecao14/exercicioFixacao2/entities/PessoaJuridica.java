package exercicioFixacao2.entities;

public class PessoaJuridica extends Pessoa{

    private double numeroFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, double numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;

    }

    public double getNumeroFuncionarios() {
        return this.numeroFuncionarios;
    }

    @Override
    public double verImpostoAPagar() {
        if(this.numeroFuncionarios <= 10) {
            return super.getRendaAnual() * 0.16;
        }else {
            return super.getRendaAnual() * 0.14;
        }
    }
}
