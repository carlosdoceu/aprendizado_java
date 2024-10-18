package classe;

public class AreaCircTest {
    

    

    public static void main(String[] args) {
        AreaCirc ac1 = new AreaCirc(10);
        AreaCirc ac2 = new AreaCirc(5);

       

        System.out.printf("%.2f \n%.2f " ,ac1.area(), ac2.area());
        System.out.printf("\n%5.2f",AreaCirc.PI);
    }


}
