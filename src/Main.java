/**
 * Created by LaroSelf on 02.04.2016.
 */
public class Main {

     static Long compute(Byte a, Integer b){
         Long c = new Long(a+b) ;
     return  c;}

    public static void main(String[] args) {
        byte c= 127;
         Byte a = Byte.valueOf(c);

        Integer b = Integer.valueOf(20000);

        System.out.println(compute(a,b));


    }
}
