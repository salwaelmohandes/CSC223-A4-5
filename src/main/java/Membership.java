import java.time.LocalDate;

public abstract class Membership {

    private int totalRidesLeft;

    private LocalDate lastPayment;

    public Membership() {
        this.totalRidesLeft = 0;
    }

    public int getTotalRidesLeft() {
        return totalRidesLeft;
    }

    public void setTotalRidesLeft(int totalRidesLeft) {
        this.totalRidesLeft = totalRidesLeft;
    }

    public LocalDate getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(LocalDate lastPayment) {
        this.lastPayment = lastPayment;
    }

    public int getMembershipInt(){
        return 0;
    }

}