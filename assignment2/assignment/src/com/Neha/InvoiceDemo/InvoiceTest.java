package com.Neha.InvoiceDemo;

public class InvoiceTest {
    private  String PartNum;
    private String partDescription;
    private int partPrice;
    private int quantity;

    InvoiceTest() {

    }

    public InvoiceTest(String PartNum, String partDescription, int partPrice, int quantity) {
        this.PartNum = PartNum;
        this.partDescription = partDescription;
        this.partPrice = partPrice;
        this.quantity = quantity;

//        setQuantity(quantity);
//        setPrice(price);

    }
    public double invoiceAmt(){
        return partPrice * quantity;
    }
    public void setPartNum(String PartNum) {
        this.PartNum = PartNum;
    }
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public void setPartPrice(int partPrice) {
        if(partPrice< 0) {
            this.partPrice=0;
        }
        this.partPrice = partPrice;
    }
    public void setQuantity(int quantity) {
        if(quantity < 0)
            this.quantity=0;
        this.quantity = quantity;
    }
    public String getPartNum() {
        return PartNum;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public int getPartPrice() {
        return partPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "InvoiceTest{" +
                "PartNum='" + PartNum + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", partPrice='" + partPrice + '\'' +
                ", quantity=" + quantity +

                '}';
    }
}
