package kz.astana.logistics;

import kz.astana.logistics.abstractfactory.GUIFactory;
import kz.astana.logistics.abstractfactory.MacOSFactory;
import kz.astana.logistics.abstractfactory.WindowsFactory;
import kz.astana.logistics.app.DeliveryApplication;
import kz.astana.logistics.factorymethod.Logistics;
import kz.astana.logistics.factorymethod.RoadLogistics;
import kz.astana.logistics.factorymethod.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Delivery mode (ROAD / SEA): ");
        String deliveryInput = scanner.nextLine().trim();

        System.out.print("UI platform (WINDOWS / MACOS): ");
        String platformInput = scanner.nextLine().trim();

        Logistics logistics = null;
        if (deliveryInput.equalsIgnoreCase("ROAD")) {
            logistics = new RoadLogistics();
        } else if (deliveryInput.equalsIgnoreCase("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println("Error: Wrong delivery mode choice!");
            return;
        }

        GUIFactory guiFactory = null;
        if (platformInput.equalsIgnoreCase("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (platformInput.equalsIgnoreCase("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println("Error: Wrong UI platform choice!");
            return;
        }

        DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);
        app.run("laboratory equipment", "Aktau warehouse");
    }
}