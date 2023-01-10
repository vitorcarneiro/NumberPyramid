import java.util.Scanner;

public class App {
     public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter base number: ");  
        int baseNumber = reader.nextInt();
        System.out.println("Enter top number: ");  
        int topNumber = reader.nextInt();
        reader.close();
        System.out.println("--------------------------------");  

        if (baseNumber >= topNumber)
            for (; topNumber <= baseNumber; topNumber++) {
                for (int i = 0; i < topNumber; i++)
                System.out.print(topNumber);        
                
                System.out.println();        
            }
        else
          for (; topNumber >= baseNumber; topNumber--) {
                for (int i = 0; i < topNumber; i++)
                System.out.print(topNumber);        
                
                System.out.println();        
            }
    }
}
