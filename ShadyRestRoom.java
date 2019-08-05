/* Exercise 3a and 3b page 277

  Filename: ShadyRestRoom.java
  Author: Amit
  Date 8/1/19

  Application for decision of room type and price */


import javax.swing.JOptionPane;

public class ShadyRestRoom
{

  // Modify the code below
  public static void main (String args[])
   {
      // Variables and Constants
      int selection;
      int selection2;
      int price;
      String result;
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, QPRICE2 = 140, KPRICE = 139, KPRICE2 = 154, SPRICE = 165, SPRICE2 = 180;
      final String QSTRING = "Queen bed", KSTRING = "King bed", SSTRING = "Suite with a king bed and pull-out couch", LSTRING = "Lake View",
         PSTRING = "Park View", INVALIDSTRING = "an invalid option";
     
      // Input Phase
      selection = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select which room type you want >> \n1. Queen Bed \n2. King Bed \n3. King Bed with Pullout Couch"));
      selection2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like: \n1. Lake View \n2. Park View"));

      if(selection == 1)
      {
         result = QSTRING;
         price = QPRICE;
      } if (selection == 1)
        {        
         if (selection2 == 1)
          {
            result = LSTRING;
            price = QPRICE2;
          } 
          else if (selection2 == 2)
          { 
            result = PSTRING;
            price = QPRICE;
          }
        }   
      if (selection == 2)
         {
            result = KSTRING;
            price = KPRICE;
         }
      else if (selection == 3)
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             } 


      JOptionPane.showMessageDialog(null, "You selected " + result + " $" + price);
   }
}