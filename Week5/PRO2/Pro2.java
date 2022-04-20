public class Week5_2 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.printf("     RegularPolygon1         Perimeter : %5.2f           Area : %6.2f    \n", regularPolygon1.getPerimeter(),regularPolygon1.getArea());
        System.out.printf("     RegularPolygon2         Perimeter : %5.2f           Area : %6.2f    \n", regularPolygon2.getPerimeter(),regularPolygon2.getArea());
        System.out.printf("     RegularPolygon3         Perimeter : %5.2f           Area : %6.2f    \n", regularPolygon3.getPerimeter(),regularPolygon3.getArea());
    }
}
