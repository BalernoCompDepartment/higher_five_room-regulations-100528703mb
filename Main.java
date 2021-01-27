import java.util.Scanner;


class dimensions {
  double length;
  double width;
  double height;
  double airSpace;
}



class Main {
  public static void main(String[] args) {
    
    
    dimensions measuredRoom = new dimensions();
    measuredRoom = getDimensions();

    int legalPeople = calculatePersons(measuredRoom);

     displayNoPeople(legalPeople);

  }


public static dimensions getDimensions() { 
   dimensions localRoom = new dimensions();
   localRoom.length = getValidReal(2.0, 20.0, "Please enter length between 2 and 20 metres");
   localRoom.width = getValidReal(2.0, 20.0, "Please enter width between 2 and 20 metres");
   localRoom.height = getValidReal(2.0, 10.0, "Please enter height between 2 and 10 metres");
   localRoom.airSpace = getValidReal(5.0, 15.0, "Please enter air space between 5 and 5 meters cubed");
      
return localRoom;
}

public static double getValidReal (double min, double max, String msg) {
  
  double input;
  input = Keyboard.getReal(msg);
  while (input < min || input > max) {
    System.out.println("Please enter a valid input");
    input = Keyboard.getReal(msg);
  }
  
  return input;
}

public static int calculatePersons (dimensions localRoom) {
 
  double volume = localRoom.length * localRoom.width * localRoom.height;
  double people = volume/localRoom.airSpace;
  
  return (int) Math.floor(people);

}

public static void displayNoPeople(int noPeople) {
  System.out.println("The max number of legal people is " + noPeople);
}
  

}