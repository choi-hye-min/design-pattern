public class Solider {
    public void runContext(Strategy strategy){
        System.out.println("전략 선택 완료!");
        strategy.runStrategy();
    }
}
