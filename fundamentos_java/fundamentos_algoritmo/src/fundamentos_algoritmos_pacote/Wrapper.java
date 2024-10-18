package fundamentos;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Wrapper {

    public static void main(String[] args){

        // Scanner entrada = new Scanner(System.in);
        //byte
        Byte b = 100;
        Short s = 1000;
        // Integer i = Integer.parseInt(entrada.next());
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';

        System.out.println(c+"...");
    }

}
