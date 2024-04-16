
public class Client {
	public static void main(String[] args) {
		Dog millionDog = Dog.getBuilder().setAge(4).setName("Million").setVaccinated(true).build();
		Dog almondDog = Dog.getBuilder().setName("Almond").setAge(3).setVaccinated(true).build();
		
		System.out.println(millionDog.getName());
		System.out.println(almondDog.getName());
	}
}
