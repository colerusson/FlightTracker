public class FlightStatusReporter implements Observer {

    public FlightStatusReporter(FlightFeed feed) {
        feed.register(this);
    }

    @Override
    public void update(Flight flight) {
        if (flight != null)
            System.out.println("STATUS: " + flight.toString());
        else
            System.out.println("STATUS: no flight");
    }
}