package streams;

public class Produto {

    private String nome;
    private Double preco;
    private Boolean freteGratuito;

    public Produto(String nome, Double preco, Boolean freteGratuito) {
        this.nome = nome;
        this.preco = preco;
        this.freteGratuito = freteGratuito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getFreteGratuito() {
        return freteGratuito;
    }

    public void setFreteGratuito(Boolean freteGratuito) {
        this.freteGratuito = freteGratuito;
    }
}
