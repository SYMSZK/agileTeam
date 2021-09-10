package projectvendingmachine;

public class Runner {
    public static void main(String[] args) {
        Products product=new Products();
        Methods methods =new Methods();
        System.out.println("merhaba alisverise hos geldiniz!...");
        double money=methods.money();
        System.out.println("hesabinizda " + money +"dolar var");
        product.setPrice(methods.select(product));
        money = methods.balance(product.getPrice(), money, product);
        methods.purchase(product.getPrice(), money, product);



    }
}
