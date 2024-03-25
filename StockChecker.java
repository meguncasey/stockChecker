import java.util.Scanner;
public class StockChecker {
    
    public static void main(String[] args){
      int stock = 40; 
      String UserWant; 
      Scanner sc = new Scanner(System.in); 
     
      System.out.println("Please enter add to add stock to program or remove to remove stock, else display to display stock"); 
      UserWant = sc.nextLine(); 
        
        if (UserWant.equals("add")) {
            
            System.out.println("how much stock do you want to add?"); 
            int AddStock = sc.nextInt(); 
            stock = stock + AddStock;
            System.out.println(stock);
        } else if (UserWant.equals("remove")){
            System.out.println("how much stock do you want to remove");
            int RemoveStock = sc.nextInt();
            stock = stock - RemoveStock;
            System.out.println(stock);
        } else {
            System.out.println(stock);
        } 
    }



      
      
    

    
}
