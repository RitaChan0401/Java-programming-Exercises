package object2;

public class Q1 {
	public static void main(String[] args){
		Character[] characters = {new Stone(), new BrankChar(), new Stone()};
		characters[1].reversed();
		System.out.print(characters[0].getState());
		System.out.print(characters[1].getState());
		System.out.println(characters[2].getState());
	}
}
