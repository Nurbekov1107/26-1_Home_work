import com.company.Car;
import com.company.Information;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car, Information> hashMap = new HashMap<>();
        hashMap.put(new Car(1, "01II110"), new Information(2015, "Mercedes", 6000, "Yellow"));
        hashMap.put(new Car(2, "04ZZ444"), new Information(2019, "Cadillac", 9000, "Grey"));
        hashMap.put(new Car(3, "07VV777"), new Information(2022, "Tesla", 17000, "Blue"));

        for (Map.Entry a : hashMap.entrySet()) {
            System.out.println(a.getKey() + " " + a.getValue());
        }


    }
}