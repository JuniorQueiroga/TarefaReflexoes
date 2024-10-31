package br.com.queiroga.reflections;

public class AppReflections {
    public AppReflections() {
    }

    public static void main(String[] args) {
        Class clazz = Produto.class;
        System.out.println(clazz);
        System.out.println(AnotacaoTabela.class);
    }
}
