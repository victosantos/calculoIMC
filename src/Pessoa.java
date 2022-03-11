public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String iD) {
        this.nome = nome;
        this.idade = idade;
        ID = iD;
    }

    public Pessoa(String nome, int idade, String iD, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        ID = iD;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        if((peso / Math.pow(altura, 2)) < 20){
            return -1;
        } else if ((peso / Math.pow(altura, 2)) < 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(){
        if(idade < 18){
            return false;
        } else {
            return true;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa {\n" +
                    "\tID: " + ID + ",\n" +
                    "\tidade: " + idade + ",\n" +
                    "\tnome: " + nome + ",\n" +
                    "\taltura: " + altura + ",\n" +
                    "\tpeso: " + peso + ",\n" +
                "}";
    }

    
}
