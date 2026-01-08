public class Main {

   public static void main(String []args) {

      //Create a new String -> SHORTCUT!
      String lebron = "GOAT";
      // But are actually OBJECTS
      // The original way to create a String:
      String steph = new String("GOAT");

      // All objects can be created using this pattern:
      // ClassName objectName = new ClassName();
      BuildABear polarBear = new BuildABear();
      // "BuildABear polarBear" is DECLARING a variable of type BuildABear
      // "new BuildABear" is CALLING a CONSTRUCTOR to set up the object

      // Look at our new object
      System.out.println(polarBear);
   }
}
