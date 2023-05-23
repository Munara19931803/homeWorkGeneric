public class Box <T,R>{

    private String color;
    private int quantity;

    public static <R>R generic(Box box){
        R box1=(R)box;
        return box1;
    }
    public Box() {
    }

    public Box(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
