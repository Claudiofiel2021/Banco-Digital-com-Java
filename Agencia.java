public class Agencia {

    private int numero;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                '}';
    }
}
