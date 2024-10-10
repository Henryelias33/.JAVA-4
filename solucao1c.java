// Classe Produto
public class solucao1c {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public solucao1c(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Métodos modificadores (setters)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para exibir as informações do produto
    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}

// Classe de teste
public class java:50: error: <identifier> expected
 public class solucao1c  {
    public static void main(String[] args) {
        // Instanciando um produto com valores fixos (sem uso de Scanner)
        Produto produto = new Produto("Celular", 1500.00, 5);

        // Exibindo as informações do produto
        produto.exibirProduto();
    }
}
