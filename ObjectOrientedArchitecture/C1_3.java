
public class C1_3 {
	public static void main(String[] args){
		Pair pair = new Pair();
		Instructor instructor = new Instructor("001");
		instructor.setName("kohama");
		
		Assistant assistant = new Assistant();
		assistant.setName("takano");
		assistant.setId("002");
		
		pair.setFirst(instructor);
		pair.setSecond(assistant);
		Person p1 = pair.getFirst();
		Person p2 = pair.getSecond();
		
		//この2行はたぶんいらない
		p1.getId();
		p2.getId();
	}
}
