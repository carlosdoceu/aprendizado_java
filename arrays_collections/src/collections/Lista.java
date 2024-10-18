package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");


        listaUsuarios.add(u1);
        listaUsuarios.add(new Usuario("Maria"));
        listaUsuarios.add(new Usuario("Joao"));
        listaUsuarios.add(new Usuario("Gessica"));
        listaUsuarios.add(new Usuario("Carlos"));
        listaUsuarios.add(new Usuario("Manu"));

        System.out.println(listaUsuarios.get(3).nome);


        System.out.println(">>>>"+listaUsuarios.remove(1));

        System.out.println(listaUsuarios.remove(new Usuario("Manu")));
        System.out.println("Tem ? "+listaUsuarios.contains(new Usuario("Carlos")));
        System.out.println("Tem ? "+listaUsuarios.contains(new Usuario("Maria")));


        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.nome);
        }


      

    }
}
