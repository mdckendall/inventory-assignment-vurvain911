import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    ArrayList<Inventory> Storage = new ArrayList<Inventory>();

    Scanner input = new Scanner(System.in);

    do{
      Inventory placeholder;
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      Integer userInput = input.nextInt();

      if(userInput == 1)
      {
        System.out.println("Enter the name:");
        input.nextLine();
        String itemName = input.nextLine();
        System.out.println("Enter the serial number:");
        String serialNumber = input.nextLine();
        System.out.println("Enter the value in dollars (whole number):");
        Integer valueNum = input.nextInt();

        placeholder = new Inventory(itemName, serialNumber, valueNum);
        Storage.add(placeholder);
      }
      else if(userInput == 2)
      {
        System.out.println("Enter the serial number of the item to delete:");
        input.nextLine();
        String deletion = input.nextLine();

        for(int i = 0; i < Storage.size(); i++)
          {
            if(Storage.get(i).getSerialNum().equals(deletion))
            {
              Storage.remove(i);
            }
          }
      }
      else if(userInput == 3)
      {
        System.out.println("Enter the serial number of the item to change:");
        input.nextLine();
        String change = input.nextLine();
        System.out.println("Enter the new name:");
        String newName = input.nextLine();
        System.out.println("Enter the new value in dollars (whole number):");
        Integer newVal = input.nextInt();
        input.nextLine();
        
        for(int j = 0; j < Storage.size(); j++)
        {
          if(Storage.get(j).getSerialNum().equals(change))
          {
            Storage.set(j, new Inventory(newName, Storage.get(j).getSerialNum(), newVal));
          }
        }
      }
      else if(userInput == 4)
      {
        for(int a = 0; a < Storage.size(); a++)
        {
          System.out.println(Storage.get(a).getName() + ", " + Storage.get(a).getSerialNum() + ", " + Storage.get(a).getValue());    
        }
      }
      else if(userInput == 5)
      {
        break;
      }
      else
      {
        break;
      }
    } while (true);
    input.close();
  }
}