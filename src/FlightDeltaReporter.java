public class FlightDeltaReporter implements Observer {
    private Flight previousFlight;

    public FlightDeltaReporter(FlightFeed feed) {
        this.previousFlight = null;
        feed.register(this);
    }

    @Override
    public void update(Flight flight) {
        if (previousFlight != null && flight != null) {
            // Calculate and print deltas
            float deltaLongitude = flight.longitude - previousFlight.longitude;
            float deltaLatitude = flight.latitude - previousFlight.latitude;
            float deltaVelocity = flight.velocity - previousFlight.velocity;
            float deltaAltitude = flight.baro_altitude - previousFlight.baro_altitude;

            System.out.println("DELTA: Longitude: " + deltaLongitude +
                    ", Latitude: " + deltaLatitude +
                    ", Velocity: " + deltaVelocity +
                    ", Altitude: " + deltaAltitude);
        }

        previousFlight = flight;
    }
}