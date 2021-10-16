class LabExr2A {

    private String itemName;
    private double itemPrice, amountDue;
    private int itemQuantity;
    
    public void setItemName(String newItemName){
        itemName=newItemName;
    }
    public void setTotalCost(int quantity,double price){
        itemPrice=price;
        itemQuantity=quantity;
}
    public String getItemName(){
        return itemName;
}
    public double getTotalCost(){
        amountDue=itemPrice*itemQuantity;
        return amountDue;
    }
    public void readInput(){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the name of the item you are purchasing.");
        itemName=a.nextLine();
   
        System.out.println("Enter the quantity and price separated by a space.");
        itemQuantity=a.nextInt();
        itemPrice=a.nextDouble();
    }

    public void writeOutput(){
        System.out.println("You are purchasing "+itemQuantity+" "+itemName+"(s)at "+itemPrice+" each."+"\nAmount due is "+getTotalCost());

    
    }
}
