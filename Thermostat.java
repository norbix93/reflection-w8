import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    private Predicate<Double> condition;
    private Function<Double,String> display;

    public Thermostat(Predicate<Double> condition, Function<Double,String> display) {
        this.condition = condition;
        this.display = display;
    }
    public String sensor(Double celsius){
        if(!condition.test(celsius)){
            return display.apply(celsius);
        }
        else
            return "Warning!";
    }
}
