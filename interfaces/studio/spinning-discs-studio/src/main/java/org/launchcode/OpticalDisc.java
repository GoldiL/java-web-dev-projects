package launchcode;

public interface OpticalDisc {

    void spin();
    boolean store();//returns true if successful

    double write();

    boolean read();
}
