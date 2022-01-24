import java.util.ArrayList;

public class RoadTrip {

  public static ArrayList<GeoLocation> roadTrip = new ArrayList<GeoLocation>();

  static int i = 0;


  public void addStop(String name, double latitude, double longitude) {
    GeoLocation location = new GeoLocation(name, latitude, longitude);
    roadTrip.add(location);
    i += 1;
  }

  public String toString() {
    String result = "";
    int size = roadTrip.size();
    for (int i = 0; i < size; i++) {
      result += i + 1 + ". " + roadTrip.get(i).toString() + "\n";
    }
    return result;
  }

  // Get the total number of stops in the trip

  public int getNumberOfStops() {
    return i;
  }

  // Get the total miles of the trip

  public double getTripLength() {
    double numberOfMiles = 0;
    int size = roadTrip.size();
    for (int i = 0; i < size - 1; i++) {
      if ((i - 1) != size) {
        numberOfMiles += roadTrip.get(i).distanceFrom(roadTrip.get(i + 1));
      }
    }
    return numberOfMiles;
  }
}