package entidades;

public class Produto {

  private Integer quantidade;
  private Double preco;
  private String nome;

  public Produto() {
  }

  public Produto(Integer quantidade, Double preco, String nome) {
    this.quantidade = quantidade;
    this.preco = preco;
    this.nome = nome;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
