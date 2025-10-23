import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Car {
    private String model;
    private int year;

    public void makeBeBe(){
        System.out.println(model + "(" + year +") делает Би-Бип");
    }
}