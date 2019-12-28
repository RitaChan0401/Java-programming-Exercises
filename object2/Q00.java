package object2;

public class Q00 {
	public static void main(String[] args){
		Character character = new Stone();
		System.out.println(character.getState());
		Character[] characters = {new Stone()};
		characters[0].reversed();
		System.out.print(characters[0].getState());
	}
}
