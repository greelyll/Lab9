import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
class Main {
 static ArrayList<People> Person;
 static String filename;
 static FileReader myFile;
  
  public static void main(String[] args) {

Person = new ArrayList<People>();
filename = "Person.txt";
String name = {"Luke", "A", "B", "C", "D"};
int age = {"22", "87", "13", "55", "4"};
String color = {"red", "pink", "yellow", "black", "green"};
FileWriter toWriteFile;

try {
  toWriteFile = new FileWriter("data.txt");
  BufferedWriter output = new BufferedWriter(toWriteFile); 
for(int i=0; i<name.size(); i++) {
  ouput.write(Person.get(i).getName("Luke", "A", "B", "C", "D"));
  output.newLine();
  output.write(Integer.toString(Person.get(i).getAge("22", "87", "13", "55", "4")));
  output.newLine();
  output.write(Person.get(i).getColor("red", "pink", "yellow", "black", "green"));
  output.newLine();
  output.flush();
}
 
output.close();
}
catch (IOException exception) {
  System.out.println("An error occurred: " + exception);
}

try {
myFile = new FileReader("data.txt");
BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()) {
  name = reader.readLine();
  age = reader.readLine(); 
  color = reader.readLine();
  System.out.printf("%-10s %-10s %-10s %n", name, age, color);
}
reader.close();
} 
catch (IOException exception) {
  System.out.println("An error occurred: " + exception);
}
  }
}








  
  
