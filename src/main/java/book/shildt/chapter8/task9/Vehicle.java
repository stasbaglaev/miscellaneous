package book.shildt.chapter8.task9;

public class Vehicle implements IVehicle {
    private int passengers; // количество пассажиров
    private int fuelcap; // объем топливного бака (в галлонах)
    private int mpg; // потребление топлива (в милях на галлон)

    // Конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Дальность поездки транспортного средства
    @Override
    public int range() {
        return mpg * fuelcap;
    }

    // Вычисление объема топлива, требуемого
    // для прохождения заданного пути
    @Override
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Методы доступа к переменным экземпляра
    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int p) {
        passengers = p;
    }

    @Override
    public int getFuelcap() {
        return fuelcap;
    }

    @Override
    public void setFuelcap(int f) {
        fuelcap = f;
    }

    @Override
    public int getMpg() {
        return mpg;
    }

    @Override
    public void setMpg(int m) {
        mpg = m;
    }
}