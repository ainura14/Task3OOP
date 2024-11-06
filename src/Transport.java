public class Transport {
    public String types;
    String brand;
    int year;
    int price;
    public Transport(String types, String brand){
        this.types = types;
        this.brand = brand;
        this.year = 2020;
        this.price = 20000;
    }
    public Transport(String brand){
        this.types = "Nexia";
        this.brand = brand;
        this.year = 2003;
        this.price = 20300;
    }
    public Transport(int year, int price){
        this.types = "Tran";
        this.brand = "DB";
        this.year = year;
        this.price = price;
    }
    public Transport(int price){
        this.types = "Car";
        this.brand = "Honda";
        this.year = 2024;
        this.price = price;
    }

    public String showTransportInfo(){
        return String.format("""
                Type: %s
                Brand: %s
                Year: %d
                Price: %d
                """, types, brand, year, price);
    }
}
