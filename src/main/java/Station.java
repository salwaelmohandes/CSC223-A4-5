import java.util.*;

/**
 * station class represents a station in the system
 */
public class Station {

    /** station name */
    private String name;

    /** number of maintenance requests */
    private int maintenanceRequest;

    /** the station capacity (how many bikes can it take?) */
    private int capacity;

    /** true if station has a kiosk */
    private boolean kioskBoolean;

    /** address of the station */
    private String address;

    /** list of bike ids associated with station */
    private LinkedList<Integer> bikeList;

    /**
     * Constructor to create a new station object that has no bikes
     *
     * @param nameValue               station name
     * @param maintenanceRequestValue number of maintenance requests
     * @param capacityValue           the station capacity
     * @param kioskBoolean            true if station has kiosk; otherwise false
     * @param address1                station address
     */
    Station(String nameValue,
                   Integer maintenanceRequestValue,
                   Integer capacityValue,
                   Boolean kioskBoolean,
            String address1) {
        this.name = nameValue;
        this.maintenanceRequest = maintenanceRequestValue;
        this.capacity = capacityValue;
        this.kioskBoolean = kioskBoolean;
        this.address = address1;
        this.bikeList = new LinkedList<>();
    }

    /**
     * Constructor to create a new station object that has bikes
     * @param nameValue name of station
     * @param maintenanceRequestValue number of maintenance requests
     * @param capacityValue the station capacity
     * @param kioskBoolean true if station has kiosk
     * @param address1 station address
     * @param bikeList list of bikes at station
     */
    Station(String nameValue,
            Integer maintenanceRequestValue,
            Integer capacityValue,
            Boolean kioskBoolean, String address1, LinkedList<Integer> bikeList) {
        this.name = nameValue;
        this.maintenanceRequest = maintenanceRequestValue;
        this.capacity = capacityValue;
        this.kioskBoolean = kioskBoolean;
        this.address = address1;
        this.bikeList = bikeList;
    }

    /**
     * returns name of station
     */
    String getStationName() {
        return this.name;
    }

    /**
     * returns number of bikes at station
     */
    int getBikes() {
        return bikeList.size();
    }

    /**
     * calculates number of available docks
     */
    int getAvailableDocks() {
        return (this.capacity - bikeList.size());
    }

    /**
     * return number of maint reqs
     */
    int getMaintenanceRequest() {
        return this.maintenanceRequest;
    }

    /**
     * set new number of maint reqs
     */
    void setMaintenanceRequest(int newNumRqst) {
        this.maintenanceRequest = newNumRqst;
    }

    /**
     * return capacity of station
     */
    int getCapacity() {
        return this.capacity;
    }

    /**
     * return whether station has kiosk
     */
    boolean getKioskBoolean() {
        return this.kioskBoolean;
    }

    /**
     * return address of station
     */
    String getAddress() {
        return this.address;
    }

    /**
     * returns list of bikes at station
     */
    LinkedList<Integer> getBikeList() {
        return bikeList;
    }

    /**
     * adds a bike to the bike list at station
     */
    void addToBikeList(int bikeId) {
        bikeList.add(bikeId);
    }

    /**
     * removes a bike from bike list at station
     * @param bike bike to be removed from station
     * @return boolean representing whether operation was successful
     */
    boolean removeFromBikeList(int bike) {
        // find index of bike ID in our linked list
        int bikeIndex = bikeList.indexOf(bike);

        // if our bike list doesn't contain this bike, return false
        if (bikeIndex == -1) { return false; }

        // remove bike from list and return true
        bikeList.remove(bikeIndex);
        return true;
    }

    /**
     * returns the bike list converted to a printable string
     */
    public String getBikeListToString(){
        return bikeList.toString().replaceAll("\\[", "").replaceAll("\\]","").replaceAll(" ", "");
    }

}