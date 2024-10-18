package collections;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
            Map<Integer, String> usuarios = new HashMap<>();
            usuarios.put(1,"Ana");
            usuarios.put(2,"Joao");
            usuarios.put(3,"Gessica");
            usuarios.put(4,"Carlos");
            usuarios.put(5,"Manu");


            System.out.println(usuarios.size());
            System.out.println(usuarios.isEmpty());

            System.out.println("keyset: " +usuarios.keySet());
            System.out.println("values: "+usuarios.values());
            System.out.println("entryset: "+usuarios.entrySet());


            System.out.println(usuarios.containsKey(20));
            System.out.println(usuarios.containsValue("Gessica"));

            for (int key : usuarios.keySet()) {
                System.out.println(key);
            }

            for (String values : usuarios.values()) {
                    System.out.println(values);
            }

            for(Entry<Integer, String> registro: usuarios.entrySet()){
                System.out.println(registro.getKey()+"->>>"+registro.getValue());
            }

    }
}
