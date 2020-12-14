import java.util.ArrayList;

import java.util.Scanner;

public class TopCustomer {

public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

ArrayList<Double> sales = new ArrayList<Double>();

ArrayList<String> customers = new ArrayList<String>();

while(true){

System.out.println("Customer name: ");

String name =scan.nextLine();

System.out.println("Customer sales: ");

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

System.out.println("Enter the sale to be searched: ");

double searched = scan.nextDouble();

System.out.println("Find sale "+searched+": "+findSales(sales, searched));

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

public static int findSales(ArrayList<Double> sales, double sale) {

for(int i=0;i<sales.size();i++) {

if(sales.get(i) == sale) {

return i;

}

}

return -1;

}

}