package kz.astana.logistics.app;

import kz.astana.logistics.abstractfactory.Button;
import kz.astana.logistics.abstractfactory.Checkbox;
import kz.astana.logistics.abstractfactory.GUIFactory;
import kz.astana.logistics.factorymethod.Logistics;

public class DeliveryApplication {
    private Button button;
    private Checkbox checkbox;
    private Logistics logistics;

    public DeliveryApplication(GUIFactory factory, Logistics logistics) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.logistics = logistics;
    }

    public void run(String cargo, String destination) {
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}