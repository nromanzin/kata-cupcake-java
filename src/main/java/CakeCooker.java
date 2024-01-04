public class CakeCooker {
    public static void main(String[] args) {
        System.out.println("Cooking cakes");
        // cooking 1 cupcake
        Cake cupcake = new Cupcake();
        System.out.println("Name: " + cupcake.name + "; Price: " + cupcake.price);

        // cooking 1 cookie
        Cake cookie = new Cookie();
        System.out.println("Name: " + cookie.name + "; Price: " + cookie.price);
    }
}
