public class FunctionClass {
    /*Function should be prepared craeted in class scope
     * meaning either top or bottom of main
     */
    void printSomething(){
        System.out.println("This function prints ");
    }
    /*void is considered a data type that returns nothing */
    int returnInt(){
        int data = 10;
        return data;
    }
    public static void main(String[] args) {
        /*to call a normal function should make object 
         * Note: Just remember the syntax for now
        */
        FunctionClass fc= new FunctionClass();
        fc.printSomething();
        /*can be used multiple times */
        fc.printSomething();

        int functionReturnInt= fc.returnInt();
        System.out.println("Function returns " + functionReturnInt );
    }
   
  

}