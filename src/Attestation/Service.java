package Attestation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
    Set<Laptop> laptops = new HashSet<>();

    public Service() {
        Laptop laptop1 = new Laptop("Asus", 16, "Windows", "Серый");
        Laptop laptop2 = new Laptop("Asus", 8, "Linux", "Чёрный");
        Laptop laptop3 = new Laptop("Asus", 4, "Windows", "Чёрный");
        Laptop laptop4 = new Laptop("Asus", 16, "Windows", "Серый");
        Laptop laptop5 = new Laptop("Huawei", 8, "Windows", "Белый");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
    }

    public List<Laptop> filterLaptops(String inputCategory, String paramValue) {
        List<Laptop> filteredLaptops = new ArrayList<>();
        return switch (inputCategory) {
            case "1" -> {
                laptops.forEach(laptop -> {
                    if (laptop.getName().equalsIgnoreCase(paramValue)) {
                        filteredLaptops.add(laptop);
                    }
                });
                yield filteredLaptops;
            }
            case "2" -> {
                laptops.forEach(laptop -> {
                    if (laptop.getRam() >= Integer.parseInt(paramValue)) {
                        filteredLaptops.add(laptop);
                    }
                });
                yield filteredLaptops;
            }
            case "3" -> {
                laptops.forEach(laptop -> {
                    if (laptop.getOs().equalsIgnoreCase(paramValue)) {
                        filteredLaptops.add(laptop);
                    }
                });
                yield filteredLaptops;
            }
            case "4" -> {
                laptops.forEach(laptop -> {
                    if (laptop.getColor().equalsIgnoreCase(paramValue)) {
                        filteredLaptops.add(laptop);
                    }
                });
                yield filteredLaptops;
            }
            case null, default -> List.copyOf(laptops);
        };
    }
}
