public class DacodaToCharArray {
    public static void main(String[] args){

        //Store a string in a variable
        String str = "When Someone Tells You Who They Are, Believe Them.";
        
        //Declare a new char array variable. The toCharArray method will
        //make it possible retreive letters vertically.
        char array[] = str.toCharArray();
        
        //In oreder to retreive the vertical iteration, we are going
        //to call it traversed_characters, traverse through the array and print it out.
        for(char traversed_characters : array){
            System.out.println(traversed_characters);
        }
    }
    
}
