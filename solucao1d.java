// Classe de teste
public class solucao1d {
    public static void main(String[] args) {
        // Instanciando uma disciplina com valores fixos (sem uso de Scanner)
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", "João Silva", 2, true);

        // Exibindo as informações da disciplina
        disciplina.exibirDisciplina();
    }
}
// Classe Disciplina
public class solucao1d {
    // Atributos privados
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    // Construtor
    public Disciplina(String nome, String professor, int semestre, boolean ofertada) {
        this.nome = nome;
        this.professor = professor;
        this.semestre = semestre;
        this.ofertada = ofertada;
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

    public boolean isOfertada() {
        return ofertada;
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

    public void setOfertada(boolean ofertada) {
        this.ofertada = ofertada;
    }

    // Método para exibir as informações da disciplina
    public void exibirDisciplina() {
        System.out.println("Nome da Disciplina: " + nome);
        System.out.println("Professor: " + professor);
        System.out.println("Semestre: " + semestre);
        System.out.println("Ofertada: " + (ofertada ? "Sim" : "Não"));
    }
}
