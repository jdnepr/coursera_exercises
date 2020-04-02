package State_pattern_package;
//The interface defines operations which each state must handle.
public interface PackageState {
    public void updateState(DeliveryContext ctx);
}
