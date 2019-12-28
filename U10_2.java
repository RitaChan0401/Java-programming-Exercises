public class U10_2 {
    public static void main(String[] args) {
        Peach peach1 = new Peach("もも");
        peach1.setPrice(250);
        Peach peach2 = new Peach("白桃");
        peach2.setPrice(300);
        Kiwi kiwi  = new Kiwi("キウイ");
        kiwi.setPrice(91);

        FruitBasket fruitBasket = new FruitBasket();
        fruitBasket.add(peach1);
        fruitBasket.add(peach2);
        fruitBasket.add(kiwi);

        System.out.println(fruitBasket.getName() + "\n" + fruitBasket.getPrice());

    }
}



