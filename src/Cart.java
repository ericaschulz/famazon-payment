public class Cart {
    public static void sayGoodbye() {
        System.out.println("Thanks for using Famazon Cart!");

    }
    public static void sayHello() {
        System.out.println("Famazon Cart v 1.0 *started*");
    }
    public static void main(String[] args) {
        sayHello();
        boolean doWeHaveArguments = false;
        //String argsLength = args.length.toString();
        //bad code, see below
        int length = args.length;
        if (args.length > 1) {
            doWeHaveArguments = true;
            System.out.println("We have arguments!");
        }
        if (doWeHaveArguments == true) {
            //if true, let the user know
            //awesome but they are not needed
            System.out.println("We don't need them.");

        } else {
            // otherwise let them know thanks
            // for not spamming
            System.out.println("Thanks for not spamming!");
        }
        {

        }
    }
}
