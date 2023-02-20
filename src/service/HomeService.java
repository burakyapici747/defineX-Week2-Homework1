package service;
import model.Home;

import java.util.List;

public interface HomeService {
    double getTotalPriceOfNormalHomes();
    double getTotalPriceOfVillas();
    double getTotalPriceOfSummerHomes();
    double getTotalPriceOfAllTypeHome();
    double getAverageSquareMeterOfNormalHomes();
    double getAverageSquareMeterOfVillas();
    double getAverageSquareMeterOfSummerHomes();
    double getAverageSquareMeterOfAllTypeHomes();

    List<Home> getAllTypesOfHomesByTheNumberOfRoomsAndHalls(int numberOfRooms, int numberOfHalls);
}
