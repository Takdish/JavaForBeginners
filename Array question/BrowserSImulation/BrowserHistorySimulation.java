
package BrowserSImulation;
import java.net.URI;
import java.util.*;
public class BrowserHistorySimulation {
   private LinkedList<String> lst = new LinkedList<>();

    private ListIterator<String> it = lst.listIterator(); //connect/access the linkedlist
   private String currentPage = null;
    void visitPage(String URL){
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        it.add(URL);
        currentPage = URL;
        System.out.println("Visited : " + URL);
    }
    void goBack(){
        if(it.hasPrevious()){
            currentPage  = it.previous();
            System.out.println("Go Backward : " + currentPage);
        }else{
            System.out.println("NO BACKWARD PAGES");
        }

    }
    void goForward(){
        if(it.hasNext()){
            currentPage =it.next();
            System.out.println("Forwarded : " + currentPage);
        }else{
            System.out.println("NO FORWARD PAGES ");
        }
    }
    void showCurrentPage(){
        if(currentPage==null){
            System.out.println("NO CURRENT PAGES");
        }
        else{
            System.out.println("Current Page : "  +  currentPage);
        }
    }
    static void main() {
        BrowserHistorySimulation simulation = new BrowserHistorySimulation();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n********************");
            System.out.println("Mini Browser Simulation");
            System.out.println("*********************");

            System.out.println("\n =========Browser Menu==========");
            System.out.println("1. Visit New Page ");
            System.out.println("2. Go Back ");
            System.out.println("3. Go Forward ");
            System.out.println("4. Show Current Page ");
            System.out.println("5. Exist ");
            System.out.print("Enter Choices : ");
            int Choice = sc.nextInt();
            sc.nextLine();
            switch (Choice){
                case 1:
                    System.out.print("Enter URL : ");
                    String URL = sc.nextLine();
                    simulation.visitPage(URL);
                    break;

                case 2:
                    simulation.goBack();
                    break;
                case 3:
                    simulation.goForward();
                    break;
                case 4:
                    simulation.showCurrentPage();
                    break;
                case 5:
                    System.out.println("Existing Browser");
                    return;

                default:
                    System.out.println("Invalid Choices");
            }
        }
    }
}
