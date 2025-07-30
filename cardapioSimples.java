import java.util.Scanner;
public class HelloWord{
  public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("What's you wold like ?");
          System.out.println("1-isLatte");
          System.out.println("2-isIced");
          System.out.println("3-withMatcha");
          System.out.println("Type here:");
          int option = sc.nextInt();
        if(option == 1){
          System.out.println("espresso, milk, ice, syrup.");
        }else if(option == 2){
          System.out.println("matcha, oat milk, ice, vanilla.");
        }else if(option == 3){
          System.out.println("espresso, steamed milk.");
        }else{
          System.out.print("Select a drink to get started!");
        }      
  }
}
