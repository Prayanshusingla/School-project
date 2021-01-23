package class2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test4 {
  

public class Walmart{

private int prodID;
private double prodCost;
private Random r = new Random();
  
public Walmart() {

prodID = r.nextInt((888 - 111 + 1) + 11);
prodCost = r.nextDouble()*(150 - 20) + 10;
}
public void setprodID(int prodID) { this.prodID = prodID; }
public void setprodCost(double prodCost) { this.prodCost = prodCost; }

@Override
public String toString(){
return String.format("%-15d%.4f",prodID,prodCost);
}
}
  
public static void main(String[] args) throws IOException{
  
ArrayList<test4.Walmart> prods = new ArrayList<>();

try(FileWriter writes = new FileWriter("prod.dat")){

for(int i=0;i<20;i++){
prods.add((new test4()).new Walmart());
writes.write(prods.get(i).toString() + "\n");
}
}
  
ArrayList<test4.Walmart> output = new ArrayList<>();
try(FileReader fileRead = new FileReader("prod.dat")){
	
Scanner reader = new Scanner(fileRead);
while(reader.hasNext()){
test4 aisel = new test4();
test4.Walmart prod = aisel.new Walmart();
prod.setprodID(reader.nextInt());
prod.setprodCost(reader.nextDouble());
output.add(prod);
}
}
//----//
System.out.println("Walmart");
System.out.println(String.format("%-15s%s","product ID","product Cost"));
for(int i=0;i<output.size();i++){
System.out.println(output.get(i));
}
}
}