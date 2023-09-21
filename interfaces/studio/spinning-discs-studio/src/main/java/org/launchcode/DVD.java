package launchcode;

public class DVD extends BaseDisc implements  OpticalDisc{

    public String musician;
    @Override
    public void spin() {

    }

    @Override
    public boolean store() {
        return false;
    }

    @Override
    public double write() {
        return 0;
    }

    @Override
    public boolean read() {
        return false;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
