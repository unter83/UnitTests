import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.Car;
import repository.Motorcycle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {

    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
       car = new Car("Niva", "2123", 2005);
       motorcycle = new Motorcycle("Yamaha", "MT-03", 2021);
    }

    @Test
//             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    void testThatCarIsAVehicle() {
        assertTrue(car instanceof Car);
    }
    @Test
    //             - проверка того, объект Car создается с 4-мя колесами
    void testThatCarHas4Wheels () {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    //             - проверка того, объект Motorcycle создается с 2-мя колесами
    void testThatMotorcycleHas2Wheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    //             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    void testThatCarCanReach60InTestDrive () {
        car.testDrive();
        assertThat(car.getSpeed()).isLessThanOrEqualTo(60);
    }

    @Test
    //         - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())

    void testThatMotorcycleCanReach75InTestDrive () {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isLessThanOrEqualTo(75);
    }

    @Test
    //         - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)

    void testThatCarIsStoppedWhenParkIsEnabled () {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    //             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    void testThatMotorcycleIsStoppedWhenParkIsEnabled () {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
