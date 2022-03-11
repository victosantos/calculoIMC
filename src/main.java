public class main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Pessoa p1 = new Pessoa();
        // Pessoa p2 = new Pessoa("Victor", 25, "02");
        Pessoa p3 = new Pessoa("Hiroshi", 52, "03", 96.8, 1.85);

        if(p3.calcularIMC() == 1){
            System.out.println("Soprepeso");
        } else if (p3.calcularIMC() == 0) {
            System.out.println("Peso Saudável");
        } else {
            System.out.println("Abaixo do peso");
        }

        if(p3.ehMaiorIdade()){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        System.out.println(p3.toString());
    }
}
