public class BMI{
    private String name;
    private int age;
    private double weight;
    private double height;
    private double feet;
    private double inches;
    public static final double KILOGRAM_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;


    public BMI (String Nname, int Nage, double Nweight, double Nfeet, double Ninches)
    {
        name = Nname;
        age = Nage;
        weight = Nweight;
        feet = Nfeet;
        inches = Ninches;
        height = (feet*12) + inches; // set value in inches
        
    }


    public double getBMI()
    {
        double bmi = weight * KILOGRAM_PER_POUND /((height*METERS_PER_INCH)*(height * METERS_PER_INCH));
        return (bmi * 100) / 100;
    }

    public String getStatus()
    {
        double bmi = getBMI();
        if(bmi < 18.5)
            return "Underweight";
        else if ( 18.5 <= bmi && bmi < 25)
            return "Normal";
        else if (25 <= bmi &&bmi < 30)
            return "Overweight";
        else 
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getInches() {
        return inches;
    }

    public double getFeet() {
        return feet;
    }

}