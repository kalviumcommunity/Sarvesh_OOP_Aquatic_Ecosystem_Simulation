public class Fish {


    private String name;
    private double size; 
    private String dietType;
    private String location;

    public Fish(String name, double size, String dietType, String location) {
        this.name = name;
        this.size = size;
        this.dietType = dietType;
        this.location = location;
    }

    public void move() {
        System.out.println(name + " is swimming in the " + location + ".");
    }

    public void feed() {
        System.out.println(name + " is feeding on " + dietType + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getDietType() {
		return dietType;
	}

	public void setDietType(String dietType) {
		this.dietType = dietType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}