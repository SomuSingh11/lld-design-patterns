package behavioral.state.vendingMachine.pattern.state;

import behavioral.state.vendingMachine.pattern.context.VendingMachine;

public interface MachineState {
    void selectItem(VendingMachine context, String itemCode);
    void insertCoin(VendingMachine context, double amount);
    void dispenseItem(VendingMachine context);
}
