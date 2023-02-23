package service;

import enums.HomeType;
import model.Home;
import repository.HomeRepository;

import java.util.List;

public class HomeServiceImpl implements HomeService{
    private final HomeRepository homeRepository;

    public HomeServiceImpl(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @Override
    public double getTotalPriceOfNormalHomes() {
        return calculateTotalPriceByHomeType(HomeType.NORMALHOUSE);
    }

    @Override
    public double getTotalPriceOfVillas() {
        return calculateTotalPriceByHomeType(HomeType.VILLA);
    }

    @Override
    public double getTotalPriceOfSummerHomes() {
        return calculateTotalPriceByHomeType(HomeType.SUMMERHOUSE);
    }

    @Override
    public double getTotalPriceOfAllTypeHome() {
        return getAll().stream()
                .mapToDouble(Home::getPrice)
                .sum();
    }

    @Override
    public double getAverageSquareMeterOfNormalHomes() {
        return calculateAverageSquareMeterByHomeType(HomeType.NORMALHOUSE);
    }

    @Override
    public double getAverageSquareMeterOfVillas() {
        return calculateAverageSquareMeterByHomeType(HomeType.VILLA);
    }

    @Override
    public double getAverageSquareMeterOfSummerHomes() {
        return calculateAverageSquareMeterByHomeType(HomeType.SUMMERHOUSE);
    }

    @Override
    public double getAverageSquareMeterOfAllTypeHomes() {
        return getAll().stream()
                .mapToDouble(Home::getSquareMeter)
                .average()
                .orElse(0.0);
    }

    @Override
    public List<Home> getAllTypesOfHomesByTheNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls) {
        return homeRepository.getAllHomesByNumberOfRoomsAndNumberOfHalls(numberOfRooms, numberOfHalls);
    }

    private List<Home> getAll(){
        return homeRepository.getAllHomes();
    }

    private double calculateTotalPriceByHomeType(HomeType homeType){
        return homeRepository.getAllHomesByType(homeType).stream()
                .filter(home -> home.getHomeType() == homeType)
                .mapToDouble(Home::getPrice)
                .sum();
    }

    private double calculateAverageSquareMeterByHomeType(HomeType homeType){
        return homeRepository.getAllHomesByType(homeType).stream()
                .filter(home -> home.getHomeType() == homeType)
                .mapToDouble(Home::getSquareMeter)
                .average()
                .orElse(0.0);
    }
}
