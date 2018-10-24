
class Vehicle {
    int distance; //line n1

    Vehicle(int x) {
        this.distance = x;
    }

    public void increSpeed(int time) { //line n2
        int timeTravel = time; //line n3

        class Car {
            int value = 0;

            public void speed() {
                value = distance / timeTravel;
                System.out.println("Velocity with new speed" + value + "km/h");
            }
        }
        new Car().speed();
    }
}