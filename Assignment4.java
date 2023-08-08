public class Assignment4{
    public static void main(String[] args) {
          /* 
            Single Loop, Nested Loops
            Via +

            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
         */

         int x=0;
         int y=5;
         int z=y;

         while(x++ <14){ 
            System.out.print("+ ");
            
            
            if(x==y){
                y=x + --z;
                System.out.println();
            }
         }
         int max = 5; 
         int i = 1;
 
         while (i <= max) {
             int j = 1;
 
             while (j <= i) {
                 System.out.print("+ ");
                 j++;
             }
 
             System.out.println();
             i++;
         }
    }
}