package launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    private  String musician;

    public CD(String musician) {
        this.producer = producer;
        this.musician = musician;
    }

    @Override
    public void spin() {
        System.out.println("This CD is spinning");
    }

    @Override
    public boolean store() {
        System.out.println("Store data");
        return  false;
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
