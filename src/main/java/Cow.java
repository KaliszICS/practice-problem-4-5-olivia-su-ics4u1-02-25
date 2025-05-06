public class Cow {
    private String name;
	private int age;
    private double weight;

	public Cow(String name, int age, double weight) {
		this.name = name;
		this.age = age;
        this.weight = weight;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

    public double getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.age + " - " + this.weight;
    }

    @Override
	public boolean equals(Object obj) { 
		if (obj == null || obj.getClass() != this.getClass()){
			return false;
		}
		Cow cow = (Cow)obj;
		if ((cow.getName().equals(this.name)) && (cow.getAge() == this.age) && (cow.getWeight() == this.weight)) {
			return true;
		}
		return false;
	}

}
