package f17comp1030dec12;

/**
 *
 * @author jwright
 */
public class ArrayExperiments {
    public static void main(String[] args)
    {
        String[] presents = {"Xbox","PS4","Macbook","Loot","Pony","new car"};
        
        displayArray(presents);
        displayReverseOrder(presents);
        displayLowerCase(presents);
    }
    
    public static void displayArray(String[] array)
    {
        System.out.print("[");
        for (int i=0; i<array.length; i++)
        {
            if (i<array.length-1)
                System.out.printf("%s, ", array[i]);
            else
                System.out.printf("%s]%n", array[i]);
        }
    }
    
    
    public static void displayReverseOrder(String[] array)
    {
        System.out.print("[");
        for (int i=array.length-1; i>=0; i--)
        {
            if (i>0)
                System.out.printf("%s, ", array[i]);
            else
                System.out.printf("%s]%n", array[i]);
        }
    }
    
    public static void displayLowerCase(String[] array)
    {
        System.out.print("[");
        for (int i=0; i<array.length; i++)
        {
            if (i<array.length-1)
                System.out.printf("%s, ", array[i].toLowerCase());
            else
                System.out.printf("%s]%n", array[i].toLowerCase());
        }
    }
}
