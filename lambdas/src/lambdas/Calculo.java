package lambdas;

@FunctionalInterface
public interface Calculo {
    public abstract double executar(double a, double b);

    default String metodoDefault() {
        return "metodo default";

    }
    static String metodoStatic() {
        return "metodo static";
    }

}