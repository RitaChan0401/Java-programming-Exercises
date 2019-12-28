public class U8_1 {
    public static void main(String[] args) {
        PetOwner petOwner = new PetOwner("ザギトワ");
        petOwner.addPet(new Dog("マサル"));
        petOwner.addPet(new Cat("イリースカ"));

        System.out.println(petOwner.say("マサル" , "こんにちは"));
        System.out.println(petOwner.say("イリースカ" , "こんにちは"));
    }
}

// UML 演習