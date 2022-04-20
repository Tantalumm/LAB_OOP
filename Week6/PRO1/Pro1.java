package PRO1;

public class Pro1 {
    public static void main(String[] args) {
        
        BMI Bmi = new BMI("Tan", 19, 120, 5, 8);
        System.out.printf("Name: %s \n", Bmi.getName());
        System.out.printf("Age: %d \n", Bmi.getAge());
        System.out.printf("weight: %.2f \n", Bmi.getWeight());
        System.out.printf("feet: %.2f \n", Bmi.getFeet());
        System.out.printf("inches: %.2f\n", Bmi.getInches());
        System.out.printf("BMI : %.2f\n", Bmi.getBMI());
        System.out.printf("Interpretation: %s\n", Bmi.getStatus());
        
    }
    
}
