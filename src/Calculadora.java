// src/Calculadora.java
public class Calculadora {
    public int soma(int a, int b) {
        System.out.println("Calculando a soma...");
        int resultado = somarInterno(a, b);
        return resultado;
    }


    private int somarInterno(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.soma(10, 5));
        System.out.println("Subtrai: " + calc.subtrai(10, 5));
    }
}
