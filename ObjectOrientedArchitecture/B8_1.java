public class B8_1{
	public static void main(String[] args){
		Wallet wallet1 = new Wallet();
		wallet1.add(new Coin50());
		wallet1.add(new Coin50());
		wallet1.add(new Coin100());
		Wallet wallet2 = new Wallet();
		wallet1.add(wallet2);
		wallet2.add(new Coin100());
		System.out.println(wallet2.getValue());
		System.out.println(wallet1.getValue());
	}
}