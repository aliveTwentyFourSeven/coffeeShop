import java.util.*;
import java.io.*;
public class coffeeShop{
	public static void main (String [] args){
		System.out.println("\n\tWHAT YOU CAN ORDER\n");
		coffeeShop menu=new coffeeShop();
		System.out.println("Coffee Based\n");
		menu.displayCoffeeBasedMenu();
		System.out.println("\nTea Based\n");
		menu.displayTeaBasedMenu();
		System.out.println("\nPastries\n");
		menu.displayPastries();
		Scanner inputFromUser=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\tHey What are you having today");
		System.out.println("\nType D when done with order"); //or to cancel an order
		//for (int i=0;i<3;i++){ //make i<20 later
			menu.askUserForMenu();
			//System.out.println(menu.displayUserChoice());
			// }
		
		}
	public void displayCoffeeBasedMenu(){
		ArrayList<String> coffeeBased=new ArrayList<String>();
		coffeeBased.add("Americano");coffeeBased.add("Cuppuccino");coffeeBased.add("Caramel Latte");
		System.out.println(coffeeBased);
		}
	
	public ArrayList<String> displayTeaBasedMenu(){
		ArrayList<String> teaBased=new ArrayList<String>();
		teaBased.add("Hot Tea"); teaBased.add("Lemon Tea");teaBased.add("Ice Thai Tea");teaBased.add("Matcha Blend");
		System.out.println(teaBased);
		return teaBased;
		}
	public void displayPastries(){
		ArrayList<String> pastries=new ArrayList<String>();
		pastries.add("Fried Banana");pastries.add("Choco Lava");pastries.add("Chilli Tofu");pastries.add("Pop-Mallow");
		System.out.println(pastries);
		}
	public  ArrayList<String>  askUserForMenu(){  //quantity will be on host site, eg if there are two cups of hot tea I'll increment to count quantity
		ArrayList<String> userChoiceCollection=new ArrayList<String>();
		String orderWhatYouLike="userChoice";
		Scanner inputFromUser=new Scanner(System.in);
		for(int i=0;i<3;i++){
			orderWhatYouLike=inputFromUser.nextLine();
			if (orderWhatYouLike.compareToIgnoreCase("D")==0 && userChoiceCollection.isEmpty()){
				System.out.println("You Ordered Nothing");
				System.exit(0);
				}
			else{
				userChoiceCollection.add(orderWhatYouLike);
				}
			}
		if (userChoiceCollection.isEmpty()==false){
			System.out.println("");System.out.println("This is what you Ordered");System.out.println("");
			}
		System.out.println(Arrays.deepToString(userChoiceCollection.toArray()));
		return userChoiceCollection;
		}
