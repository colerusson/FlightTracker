
public class FlightMonitor {
	
	public static void main(String[] args) {
	
		FlightFeed feed = new FlightFeed();
		FlightStatusReporter statusReporter = new FlightStatusReporter(feed);
		FlightDeltaReporter deltaReporter = new FlightDeltaReporter(feed);
		feed.start();
	}
	
}