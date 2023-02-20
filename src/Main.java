import repository.HomeRepository;
import service.HomeService;
import service.HomeServiceImpl;

public class Main {
    public static void main(String[] args) {
        HomeRepository homeRepository = new HomeRepository();
        HomeService homeService = new HomeServiceImpl(homeRepository);

        System.out.println("Total Price Of Normal Homes = " + homeService.getTotalPriceOfNormalHomes());
        System.out.println("Total Price Of Villas = " + homeService.getTotalPriceOfVillas());
        System.out.println("Total Price Of Summer Homes = " + homeService.getTotalPriceOfSummerHomes());
        System.out.println("Total Price Of All Type Homes = " + homeService.getTotalPriceOfAllTypeHome());

        System.out.println("\n______________________________________________________________________________\n");

        System.out.println("Average of Square Meter Of All Normal Homes = " + homeService.getAverageSquareMeterOfNormalHomes());
        System.out.println("Average of Square Meter Of All Villas = " + homeService.getAverageSquareMeterOfVillas());
        System.out.println("Average of Square Meter Of All Summer Homes = " + homeService.getAverageSquareMeterOfSummerHomes());
        System.out.println("Average of Square Meter Of All Type Homes = " + homeService.getAverageSquareMeterOfAllTypeHomes());

        System.out.println("\n______________________________________________________________________________\n");

        System.out.println("Homes Of All Types By Number Of 3 Rooms And 1 Halls = ");
        homeService.getAllTypesOfHomesByTheNumberOfRoomsAndHalls(3, 1).forEach(System.out::println);
    }
}
