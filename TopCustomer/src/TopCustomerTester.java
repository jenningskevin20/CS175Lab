import java.util.ArrayList;

import java.util.Scanner;

public class TopCustomerTester {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

ArrayList<Double> sales = new ArrayList<Double>();

ArrayList<String> customers = new ArrayList<String>();

while(true){

System.out.print("Please enter the customer’s name (price 0 to quit): ");

String name =scan.nextLine();

System.out.print("Please enter " + name + "’s spending: ");

double price = scan.nextDouble();

scan.nextLine();

if(price == 0){

break;

}

sales.add(price);

customers.add(name);

}

String customerName = nameOfBestCustomer(sales, customers);

System.out.println("Best customer is "+customerName);

System.out.println("Largest sale index: "+findLargestSales(sales));

}

public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers){

double max = 0;

int maxIndex = 0;

for(int i=0; i<sales.size(); i++){

if(max < sales.get(i)){

max = sales.get(i);

maxIndex = i;

}

}

return customers.get(maxIndex);

}

public static int findLargestSales(ArrayList<Double> sales) {

double max = sales.get(0);

int maxIndex = 0;

for(int i=0;i<sales.size();i++) {

if(max<sales.get(i)) {

max = sales.get(i);

maxIndex=i;

}

}

return maxIndex;

}

}