import java.math.BigDecimal;

public class Conta {
    
    private int numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;
    // private DecimalFormat df = new DecimalFormat("#.###,00");
    
    public Conta() {
    }

    public Conta(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
