import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {


    @Test
    void sensor() {
        Thermostat thermostat = new Thermostat(n -> n < 0, n -> n + " Degrees Celsius");
        String result = thermostat.sensor(2.0);
        String expected = "2.0 Degrees Celsius";
        Assertions.assertEquals(expected,result);
    }
}