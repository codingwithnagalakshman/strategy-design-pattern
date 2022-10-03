import com.codingwithbrothers.interfaces.Duck;
import com.codingwithbrothers.interfaces.impl.FlyRocketPowered;
import com.codingwithbrothers.utils.MallardDuck;
import com.codingwithbrothers.utils.ModelDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        System.out.println("=====I am Mallard Duck=========");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        System.out.println("\n");

        System.out.println("=====I am Model Duck=========");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("\n");
    }
}