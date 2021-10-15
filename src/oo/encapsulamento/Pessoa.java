package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobreNome;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		super();
		setIdade(idade);
		setNome(nome);
		setSobreNome(sobreNome);
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + sobreNome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade <= 120) {
			this.idade = idade;
		}
	}
}
