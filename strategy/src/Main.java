/**
 * 전략 패턴
 * 클라이언트는 다양한 전략중에서 현재 상황에 적합한 전략을 생성해 컨텍스트에 전략객체를 주입하는 패턴
 */
public class Main {
    public static void main(String[] args) {
        Strategy strategy = null;
        strategy = new StrategyGun(); // 전략생성

        Solider solider = new Solider();
        solider.runContext(strategy); // 전략주입
    }
}
