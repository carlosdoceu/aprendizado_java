package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Joao";
        u1.email = "joao@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Joao";
        u2.email = "joao@gmail.com";

        System.out.println(u1 ==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));

        

    }

}
