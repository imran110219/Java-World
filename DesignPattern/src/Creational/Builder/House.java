package Creational.Builder;

public class House {
    //All final attributes
    private final int walls; // required
    private final int doors; // required
    private final int windows; // required
    private final int garden; // optional
    private final int garage; // optional

    private House(HouseBuilder houseBuilder){
        this.walls = houseBuilder.walls;
        this.doors = houseBuilder.doors;
        this.windows = houseBuilder.windows;
        this.garden = houseBuilder.garden;
        this.garage = houseBuilder.garage;
    }

    @Override
    public String toString() {
        return "House: has "+this.walls+" walls, "+
                this.doors+" doors, "+
                this.windows+" windows, "+
                this.garden+" sized garden, "+
                this.garage+" sized garage";
    }

    public static class HouseBuilder{
        private final int walls;
        private final int doors;
        private int windows;
        private int garden;
        private int garage;

        public HouseBuilder(int wallNumber, int doorNumber){
            this.walls = wallNumber;
            this.doors = doorNumber;
        }

        public HouseBuilder windows(int windowNumber){
            this.windows = windowNumber;
            return this;
        }

        public HouseBuilder garden(int gardenSize){
            this.garden = gardenSize;
            return this;
        }

        public HouseBuilder garage(int garageSize){
            this.garage = garageSize;
            return this;
        }

        public House build() {
            House house =  new House(this);
            return house;
        }
    }
}
