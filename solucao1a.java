public class solucao1a {
    //atributos privados   
    private String nome;
    private int idade;
    private double peso;
    private boolean formando;
    private char sexo;
    
    //método construtor
    public Aluno(String n, int i, double p, char s) {
       nome = n;
       idade = i;
       peso = p;
       sexo = s;
       formando = false;
    }
      
       //métodos acesso
       public String getNome() {
         resturn nome;
      }
         
       public int getIdade() {
         resturn idade;
      }
      
       public double getPeso() {
         resturn peso;
      }
      
       public boolean getFormando() {
         resturn formando;
      }
      
      public char getSexo() {
        resturn sexo;
      }
     
     //métodos modificadores
     public void setNome(String n) {
       nome =n;
     }
     
     public void setIdade(int i) {
       idade =i;
     }
     
     public void setPeso(double p) {
       peso =p;
     }
     
     public void setFormando(boolean f) {
       formando =f;
     }
     
     public void setSexo(chart s) {
       sexo =s;
     }
 }
    
    
       
       
     
     
     
       
       
    