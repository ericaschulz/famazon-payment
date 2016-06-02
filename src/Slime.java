public class Slime {
    public static void main(String[] args) {
        String userInput = args[0];
        //user input should be y,n,Y,N
        switch(userinput) {
            case "y":
            case "Y":
                System.out.println("OK, thank you.");
                break;
            case "N":
            case "n":
                System.out.println("Ok, why not?");
                break;
            default:
                System.out.println("We could not interpret your input.");
                break;
        }
        String[] friends = {
                "Jake", "Steve", "Donna", "Lauren", "Mike"

        };
        // this is an array of Strings
        //aka String[]
        //a list of strings
        // a collection of strings
        // loop thru every item in []
        // list them in terminal
        // declare a counter (incrementer)
        // condition to evaluate to true
        // if true, do {block}
        // counter++; repeat
        for(int counter = 0; counter < friends.length; counter++) {
            System.out.println("Guess who's about to get slimed?!");
            System.out.println(friends[counter]);
            System.out.println(friends[counter] + "JUST GOT SLIMED!!");
        } //end for
        String[] pirates = {

        };
    }

    }
