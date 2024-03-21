public class Usuario {
    private int idade;
    private String nome;
    private int anoDeNascimento;
    private String genero;
    private int numeroDeIrmaos;

    public Usuario(String nome, int idade, int anoDeNascimento, String genero, int numeroDeIrmaos) {
        this.genero = genero;
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.numeroDeIrmaos = numeroDeIrmaos;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroDeIrmaos() {
        return numeroDeIrmaos;
    }
}
