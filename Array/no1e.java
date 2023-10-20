
public class no1e {
    
     public static void main(String[] args) {
         int []array = { 1,2,3,4,5};
         System.out.println(
                 "effect of passing reference to entire array are : %"+
                 "the values of the original array are : %n");
         
         for (int value : array)
         System.out.printf(" %d", value);
         modifyArray (array);
         System.out.printf("%n%nThe valuesof the modified array are : %n");
         for (int value : array)
             System.out.printf("%d", value);
         System.out.printf(
                 "%n%n effect of passing reference to entire array are : %n"+
                 "array [3] before modifyElement : %d%n", array [3]);
               }
     public static void modifyArray (int []array2) {
           for(int counter = 0; counter < array2.length; counter++)
               array2 [counter]*=2;
     }
     public static void modifyelement (int element){
         element *=2;
         System.out.printf(" value of element in modifyElement: %d%n", element);
     }
    
}
