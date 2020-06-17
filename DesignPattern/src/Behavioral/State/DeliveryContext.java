package Behavioral.State;

/**
 * Created by Imran on 3/5/2020.
 */
public class DeliveryContext {
    private State currentState;
    private String packageId;

    public DeliveryContext(State currentState, String packageId)
    {
        super();
        this.currentState = currentState;
        this.packageId = packageId;

        if(currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update() {
        currentState.updateState(this);
    }
}
