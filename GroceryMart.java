public class GroceryMart {
    private String customer_name;
    private int customer_id;
    private int customer_phone_no;
    private int customer_acc_bal;
    private String customer_add;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCustomer_phone_no() {
        return customer_phone_no;
    }

    public void setCustomer_phone_no(int customer_phone_no) {
        this.customer_phone_no = customer_phone_no;
    }

    public int getCustomer_acc_bal() {
        return customer_acc_bal;
    }

    public void setCustomer_acc_bal(int customer_acc_bal) {
        this.customer_acc_bal = customer_acc_bal;
    }

    public String getCustomer_add() {
        return customer_add;
    }

    public void setCustomer_add(String customer_add) {
        this.customer_add = customer_add;
    }

    public void allowShopping(int billing_amount){
        customer_acc_bal=500;
        if (customer_acc_bal>=billing_amount){
            System.out.println("Shopping Allowed. ");
            customer_acc_bal=customer_acc_bal-billing_amount;
            System.out.println("Remaining Balance: "+customer_acc_bal);
        }
        else{
            System.out.println("Low Balance!!! Cannot shop");
        }
    }
    public void addBalance(int adding_amount){
        customer_acc_bal=customer_acc_bal+adding_amount;
        System.out.println("Current Bank Balance is : "+customer_acc_bal);
    }
}
