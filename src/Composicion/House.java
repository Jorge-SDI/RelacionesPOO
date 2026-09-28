package Composicion;
import java.util.List;
import java.util.ArrayList;

public class House {

    private String houseName;
    private List<Room> rooms;

    public House(String houseName) {
        this.houseName = houseName;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public int getTotalRooms() {
        return rooms.size();
    }
}
