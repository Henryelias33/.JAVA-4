// Classe Turma
public class testeturma {
    // Atributos privados
    private String nome;
    private String professor;
    private int semestre;
    private int quantidadeAlunos;

    // Construtor
    public Turma(String nome, String professor, int semestre, int quantidadeAlunos) {
        this.nome = nome;
        this.professor = professor;
        this.semestre = semestre;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    // Método para exibir as informações da turma
    public void exibirTurma() {
        System.out.println("Nome da Turma: " + nome);
        System.out.println("Professor: " + professor);
        System.out.println("Semestre: " + semestre);
        System.out.println("Quantidade de Alunos: " + quantidadeAlunos);
    }
}
 // Classe de teste
public class TesteTurma {
    public static void main(String[] args) {
        // Instanciando uma turma com valores fixos (sem uso de Scanner)
        Turma turma = new Turma("Turma A", "Maria Oliveira", 1, 30);

        // Exibindo as informações da turma
        System.out.println("Dados da turma criada:");
        turma.exibirTurma();

        // Suponha que o usuário deseje alterar a quantidade de alunos
        int novaQuantidadeAlunos = 35; // Novo valor fixo para quantidade de alunos
        turma.setQuantidadeAlunos(novaQuantidadeAlunos);

        // Exibindo as informações da turma novamente
        System.out.println("\nDados da turma após alteração:");
        turma.exibirTurma();
    }
}
javac Turma.java TesteTurma.java
java TesteTurma
