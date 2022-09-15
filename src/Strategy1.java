import java.util.*;

public class Strategy1 implements Autonomous, TeleOp, EndGame {
    Random rand = new Random();

    @Override
    public int signalDetect() {
        return 0;
    }

    @Override
    public int coneStacking() {
        return 0;
    }

    @Override
    public int circuit() {
        return 0;
    }

    @Override
    public int endGameHighJunction(int maxCone) {
        return 0;
    }

    @Override
    public int junctionCapture() {
        return 0;
    }

    @Override
    public int cycleHighJunction(int maxCone) {
        return 0;
    }

    @Override
    public int CycleMiddleJunction(int maxCone) {
        return 0;
    }

    @Override
    public int CycleLowJunction(int maxCone) {
        return 0;
    }
}
