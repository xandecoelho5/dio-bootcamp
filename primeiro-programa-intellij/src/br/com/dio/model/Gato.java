package br.com.dio.model;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {
    }

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gato gato = (Gato) o;

        if (nome != null ? !nome.equals(gato.nome) : gato.nome != null) return false;
        if (cor != null ? !cor.equals(gato.cor) : gato.cor != null) return false;
        return idade != null ? idade.equals(gato.idade) : gato.idade == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (cor != null ? cor.hashCode() : 0);
        result = 31 * result + (idade != null ? idade.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
