
public class Cliente {

	private String nome;
	private int idade;
	private String UF;

    public Cliente(String nome, int idade, String UF) {
        this.nome = nome;
        this.idade = idade;
        this.UF = UF;
    }

	public String getNome() {
		return nome;
	}

    public int getIdade() {
		return idade;
	}

    public String getUF() {
		return UF;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public void setIdade(int idade) {
		this.idade = idade;
	}

    public void setUF(String UF) {
		this.UF = UF;
	}

}
