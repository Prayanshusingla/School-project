package class2;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test3 {
  
//Inner class Car
public class Car{
//Private variables
private int carID;
private double carCost;
//Random class object
private Random r = new Random();
  
//Constructor
public Car() {
//Generates random values for both class variables in a range
carID = r.nextInt((999 - 100 + 1) + 100);
carCost = r.nextDouble()*(999999 - 100000) + 100000;
}
//Setters
public void setCarID(int carID) { this.carID = carID; }

public void setCarCost(double carCost) { this.carCost = carCost; }
  
//To print object in a readable format
@Override
public String toString(){
return String.format("%-20d%.2f",carID,carCost);
}
}
  
public static void main(String[] args) throws IOException{
  
//Creating array list of inner class objects
ArrayList<test3.Car> cars = new ArrayList<>();
  
/* WRITE DATA TO FILE
Writing data to Car.dat file - file path is specified, if you don't specify file path
file will be created in same directory
*/
try(FileWriter writes = new FileWriter("Car.dat")){
//Loops 10 times
for(int i=0;i<10;i++){
//Creates new inner class object each time and stores in the array list
cars.add((new test3()).new Car());
writes.write(cars.get(i).toString() + "\n");
}
}
  
/* READ DATA FROM FILE TO ARRAY LIST
Reads data from Car.dat file and stores it in an array list of inner class objects
*/
ArrayList<CarShowRoom.Car> output = new ArrayList<>();
try(FileReader fileRead = new FileReader("Car.dat")){
//Scanner object to read data from file
Scanner reader = new Scanner(fileRead);
//Loops till it reaches end of he file
while(reader.hasNext()){
//For each Line prints inner class object details
test3 room = new test3();
test3.Car car = room.new Car();
car.setCarID(reader.nextInt());
car.setCarCost(reader.nextDouble());
output.add(car);
}
}
/* DISPLAYS OUTPUT
Displays output from array list to screen
*/
System.out.println("=============================================");
System.out.println("WELCOME TO THE CAR SHOWROOM");
System.out.println("=============================================");
System.out.println(String.format("%-20s%s","Car ID","Car Cost"));
System.out.println("=============================================");
for(int i=0;i<output.size();i++){
System.out.println(output.get(i));
}
}
}