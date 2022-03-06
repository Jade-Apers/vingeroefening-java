public class Ingredient {
    string product;
    int quantity;

    Ingredient(string product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public string getProduct() {
        return String.format("%s", this.product);
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}