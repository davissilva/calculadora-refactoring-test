public class SemConflitoQP3 {

    public double calcularDesconto(double valor) {
        double desconto = valor * 0.10;
        double resultado = valor - desconto;
        return resultado;
    }

    // Espaço proposital entre as regiões modificadas.
    // O parent1 modificará o método acima.
    // O parent2 modificará somente o método abaixo.
    //
    // Isso permite que os dois lados alterem o mesmo arquivo
    // sem gerar conflito textual.
    //
    // QP3:
    // grupo 1 = arquivo conflitante
    // grupo 2 = arquivo modificado sem conflito

    public String gerarCodigo(String prefixo, int numero) {
        return prefixo + "-" + numero;
    }
}
