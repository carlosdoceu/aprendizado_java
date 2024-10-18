package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('X');


        System.out.println("Tamanho: "+conjunto.size());
        conjunto.add("Teste"); // nao aceita repeticao
        System.out.println("Tamanho: "+conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println("Tamanho: "+conjunto.size());

        System.out.println(conjunto.contains(1.2)); // verifica se 1.2 existe no conjunto
        System.out.println(conjunto.contains("Teste")); // verifica se "Teste" existe no conjunto



        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);
        System.out.println(conjunto);


        // conjunto.addAll(nums); // adiciona tudo aquilo que nao esta em um conjunto, nao aceitando repeticao
        conjunto.retainAll(nums);

        
        System.out.println(conjunto);
        
        conjunto.clear();
        System.out.println(conjunto);


    }
}
