package book.shildt.chapter7;

public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;


    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    // дальность поездки транспортного средства
    int range() {
        return mpg * fuelcap;
    }

    // Вычисление объема топлива, требуемого
    // для прохождения заданного пути
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    Vehicle() {
    }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        //super(p, f, m);
        super.passengers = p;
        this.fuelcap = f;
        super.mpg = m;
        cargocap = c;
    }

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}

class Demo {
    public static void main(String[] args) {
        double gallons;
        int dist = 252;

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);

        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива.\n");

        gallons = pickup.fuelneeded(dist);
        System.out.println("Пикап может перевезти " + pickup.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива.");
    }
}