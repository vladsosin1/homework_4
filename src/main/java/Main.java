public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW X5", 2015);
        Car car2 = new Car("Honda Civic", 2018);

        System.out.println("\nАвтомобили:\n" + "модель: " + car1.getModel() + ", год выпуска: " + car1.getYear() + "\nмодель: " + car2.getModel() + ", год выпуска: " + car2.getYear());

        System.out.println("\nПроверка звукового сигнала:\n");
        car1.makeBeBe();
        car2.makeBeBe();

        System.out.println("\nЗаменяем автомобили....\n");
        car1.setModel("Audi A6");
        car1.setYear(2023);

        car2.setModel("Nissan Silvia");
        car2.setYear(1998);

        System.out.println("Результат после замены:\n" +  "модель: " + car1.getModel() + ", год выпуска: " + car1.getYear() + "\nмодель: " + car2.getModel() + ", год выпуска: " + car2.getYear());

        System.out.println("\nПроверка звукового сигнала:\n");
        car1.makeBeBe();
        car2.makeBeBe();
    }
}