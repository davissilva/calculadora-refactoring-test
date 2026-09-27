public class ConflitoQP3 {

    public int soma(int a, int b) {
        return somarInterno(a, b);
    }

    private int somarInterno(int a, int b) {
        return Math.addExact(a, b);
    }
}
