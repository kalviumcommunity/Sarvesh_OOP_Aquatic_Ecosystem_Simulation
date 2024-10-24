public class Fish extends AquaticEntity {

    private String name;
    private double size; 
    private String dietType;    
    public static int totalFish = 0;

    public Fish(String name, double size, String dietType, String location) {
        super(location);
        this.name = name;
        this.size = size;
        this.dietType = dietType;
        totalFish++;
    }

    @Override
    public void display() {
        System.out.println("Fish Name: " + name + ", Location: " + getLocation());
    }

    public void move() {
        System.out.println(name + " is swimming in the " + getLocation() + ".");
    }

    public void feed() {
        System.out.println(name + " is feeding on " + dietType + ".");
    }

    public String getName() {
        return this.name;
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


    public static int getTotalFish() {
        return totalFish;
    }
}