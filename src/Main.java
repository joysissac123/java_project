
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;
}

public class Main {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok(
                "GLE", "Mercedes", 2020, 350000, "white", 5
        );

        CarWithLombok car2 = new CarWithLombok(
                "GLE", "Mercedes", 2020, 350000, "white", 5
        );

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Color: " + car1.getColor());

        System.out.println("Are cars equal? " + car1.equals(car2));

        System.out.println("Car 1 hash code: " + car1.hashCode());
        System.out.println("Car 2 hash code: " + car2.hashCode());

        car1.setColor("black");
        System.out.println("Updated color: " + car1.getColor());
        System.out.println("Are cars equal after update? "
                + car1.equals(car2));
    }
}