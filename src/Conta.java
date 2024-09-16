public class Conta {
    private String nomeDoCliente;
    private String tipoConta;
    private double saldoDaConta;

    public Conta(String nomeDoCliente, String tipoConta, double saldoDaConta) {
        this.nomeDoCliente = nomeDoCliente;
        this.tipoConta = tipoConta;
        this.saldoDaConta = saldoDaConta;
        this.exibirInformacoesConta();
    }

    private String getNomeDoCliente() {
        return nomeDoCliente;
    }

    private void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    private String getTipoConta() {
        return this.tipoConta;
    }

    private double getSaldoDaConta() {
        return saldoDaConta;
    }

    private void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public void exibirInformacoesConta() {
        System.out.println("*******************************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome do Cliente :" + this.getNomeDoCliente());
        System.out.println("Tipo Conta      :" + this.getTipoConta());
        System.out.println("Saldo da Conta  :" + "R$ "+this.getSaldoDaConta());
        System.out.println("*******************************************************");


    }

    public void consultarSaldo() {
        System.out.println("O saldo atual é R$ " + this.getSaldoDaConta());
    }

    public void receberValor(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido. Digite um valor acima de 0.0");
        } else {
            this.setSaldoDaConta(this.getSaldoDaConta() + valor);
            System.out.println("Saldo atualizado R$ " + this.getSaldoDaConta());
        }
    }

    public void transferirValor(double valor){
        if (valor <= 0) {
            System.out.println("Valor inválido. Digite um valor acima de 0.0");
        } else if (valor > this.getSaldoDaConta()) {
            System.out.println("Saldo insuficiente para realizar operação");
        } else {
            this.setSaldoDaConta(this.getSaldoDaConta() - valor);
            System.out.println("Saldo atualizado R$ " + this.getSaldoDaConta());
        }
    }

}
