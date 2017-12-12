package f17comp1030dec12;

/**
 *
 * @author jwright
 */
public class F17COMP1030Dec12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //example of how to convert String's into numbers
        String s1 = "10";
        String s2 = "15";
        System.out.printf("s1 + s2 = %s %n", s1+s2);
        
        //int is a "primative" data type, not an object, so we need to 
        //use the Integer class to convert a String into a number
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        System.out.printf("n1 + n2 = %d %n", n1+n2);
        
        //we can also convert an int into a String by using the "toString" method
        String newString = Integer.toString(n2);
        
    }
    
}
