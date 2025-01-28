package problemStatement.ridehailingapplication;

// GPS Interface
public interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}
