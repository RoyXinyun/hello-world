public class xinxing {
    public static void main(String [] args){
        double a,b;
        for( double y = 7; y >= -7;y -= 0.1){
            for( double x = -1.5; x <= 1.5; x += 0.04){
                a = x * x + y * y - 1;
                b = x * x * y * y * y;
               if( a * a * a - b <= 0.0 ) {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
            }System.out.println("");
        }
    }
}
