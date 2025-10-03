package string;

public class Special_Characters {

    public static void main(String[] args) { 
        
        //----\"\"  ---- this is used for Double quotes. 
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt) ; 

        //----\''  ---- this is used for Double quotes.  
        String txt2 = "It\'s alright.";
        System.out.println(txt2);
        
        // The sequence --\\--  inserts a single backslash in a string: 
        String txt3 = "The character \\ is called backslash.";
        System.out.print(txt3);
    }

}
