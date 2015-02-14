package br.triadworks.javaweb.modelo;

public class Produto {
	private String nome;
	private String descricao;
	private Integer valor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
}
