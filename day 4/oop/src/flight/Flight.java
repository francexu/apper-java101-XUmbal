package flight;

public class Flight {
    // Fields/Properties
    int seats; // instance variable - wala sa kahit anong method
    int passengers;

    // Constructor - to initialize an object's properties
    Flight() {
        seats = 10;
        passengers = 0;
    }

    // Method
    // TODO validate if there are available seats left. If none, display "Full"
    public void addPassenger() {
        if (seats > 0) {
            this.passengers++; // this is used to eliminate the confusion between the fields and parameters if they have the same name (pwede i-omit kung walang kapangalan na variable)

            // decrease seat every time passenger is added
            this.seats--;
        } else
        {
            System.out.println("Full");
        }
    }

    // TODO set new value of seat so addPassenger is allowed again
    public void setNumberOfSeats(int seats) {
        this.seats = seats - this.passengers;
    }
}
