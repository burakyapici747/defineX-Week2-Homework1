package repository;

import enums.HomeType;
import model.Home;
import model.NormalHome;
import model.SummerHome;
import model.Villa;

import java.util.List;
import java.util.stream.Collectors;

public class HomeRepository {
    private final List<Home> homes;

    public HomeRepository(){
        homes = List.of(
                new NormalHome(250000.0, 120.0, 3, 1, HomeType.NORMALHOUSE),
                new NormalHome(10000.0, 115.0, 2, 1, HomeType.NORMALHOUSE),
                new NormalHome(55500.0, 130.0, 4, 2, HomeType.NORMALHOUSE),
                new Villa(1000000.0, 250.0, 5, 2, HomeType.VILLA),
                new Villa(247000.0, 278.0, 6, 2, HomeType.VILLA),
                new Villa(343000.0, 336.0, 4, 3, HomeType.VILLA),
                new SummerHome(279000.0, 210.0, 3,1, HomeType.SUMMERHOUSE),
                new SummerHome(1500000.0, 325.0, 4,2, HomeType.SUMMERHOUSE),
                new SummerHome(750000.0, 420.0, 6, 3, HomeType.SUMMERHOUSE)
        );
    }

    public List<Home> getAllHomesByType(HomeType homeType){
        return homes.stream()
                .filter(home -> home.getHomeType() == homeType)
                .collect(Collectors.toList());
    }

    public List<Home> getAllHomes(){
        return homes;
    }

    public List<Home> getAllHomesByNumberOfRoomsAndNumberOfHalls(int numberOfRooms, int numberOfHalls){
        return homes.stream()
                .filter(home -> home.getNumberOfRooms() == numberOfRooms && home.getNumberOfHalls() == numberOfHalls)
                .collect(Collectors.toList());
    }

}
