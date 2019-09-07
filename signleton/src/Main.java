/**
 * 싱글톤 패턴
 * 시스템에서 하나만 생성해야할 객체를 위한 패턴 (1개의 인스턴스만 생성)
 */
public class Main {
    public static void main(String[] args) {
        SystemcSpacker spacker00 = SystemcSpacker.getInstance(); // 생성자가 없기때문에 static getInstance method 를 호출해준다
        SystemcSpacker spacker01 = SystemcSpacker.getInstance();

        System.out.println(spacker00.getVolume());
        System.out.println(spacker01.getVolume());

        spacker00.setVolume(5);

        System.out.println(spacker00.getVolume());
        System.out.println(spacker01.getVolume());

        // 인스턴스 동등성 비교
        System.out.println(spacker00 == spacker01);
    }
}
