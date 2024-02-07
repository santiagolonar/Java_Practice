package day07_practice_tasks;

public class Item {

        public String itemName;
        public double unitPrice;
        public int quantity;

        public double calculateCost (){
          return  unitPrice * quantity;
            //System.out.println(calculateCost());
        }

        public String toString() {
            return "item{" +
                    "itemName='" + itemName + '\'' +
                    ", unitPrice=" + unitPrice +
                    ", quantity=" + quantity +
                    ", total price =" + calculateCost() +
                    '}';
        }
    }


