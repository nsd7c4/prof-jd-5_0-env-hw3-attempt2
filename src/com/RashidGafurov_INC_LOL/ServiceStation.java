package com.RashidGafurov_INC_LOL;

public class ServiceStation {
    public void check(Vehicle v) {
        System.out.println("Обслуживаем " + v.getModelName());
        for (int i = 0; i < v.getWheelsCount(); i++) {
            v.updateTyre();
        }

        if (v.getClass() == Car.class) {
            ((Car) v).CheckEngine();
        }
        if (v.getClass() == Truck.class) {
            ((Truck) v).CheckEngine();
            ((Truck) v).CheckTrailer();
        }
    }
}
