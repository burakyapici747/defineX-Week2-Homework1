package enums;

public enum HomeType {
    NORMALHOUSE("Normal Home"),
    VILLA("Villa"),
    SUMMERHOUSE("Summer Home");

    private final String homeType;
    
    HomeType(String homeType){
        this.homeType = homeType;
    }

    public String getHomeType(){
        return this.homeType;
    }

}
