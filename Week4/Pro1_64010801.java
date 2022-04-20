

public class Pro1_64010801{
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrent(34.5);
        stock1.setCurrent(34.35);
        System.out.println("Symbol : " + stock1.getSymbol());
        System.out.println("Name : " + stock1.getName());
        System.out.println("Previous Closing Price : " + stock1.getPrevious());
        System.out.println("current Price : "+ stock1.getCurrent());
        System.out.println("Percent Changed : "+ stock1.getChangePercent()+" % ");
    }
}