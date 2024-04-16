
public class Dog {
	
	//to create complex objects step by step, providing the clients to create or implement the actual object with variations
	//for that we can go with base class with numerous sub classes extending it
	//or giant constructor - in which client has to initiate the object in the same order of arguments
	// in ordeer to avoid such confusion, not to follow any pattern or numbers of configs
	//we can go with builder design pattern
	//house requirement for client is great example
	
//setting the private variables
	private String name;
	private int age;
	private boolean isVaccinated;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVaccinated() {
		return isVaccinated;
	}
	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Dog(DogBuilder dogBuilder) {
		this.name = dogBuilder.getName();
		this.age = dogBuilder.getAge();
		this.gender = dogBuilder.getGender();
		this.isVaccinated = dogBuilder.isVaccinated();
		if(isVaccinated!=true) {
			throw new IllegalArgumentException();
		}
	}
	
	//static method - no need to create seperate dog object
	public static DogBuilder getBuilder() {
		return new DogBuilder();
	}
	
	
	static class DogBuilder{
		private String name;
		private int age;
		private boolean isVaccinated;
		private String gender;
		public String getName() {
			return name;
		}
		public DogBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public int getAge() {
			return age;
		}
		public DogBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		public boolean isVaccinated() {
			return isVaccinated;
		}
		public DogBuilder setVaccinated(boolean isVaccinated) {
			this.isVaccinated = isVaccinated;
			return this;
		}
		public String getGender() {
			return gender;
		}
		public DogBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Dog build() {
			return new Dog(this);
		}
	}
	
}
