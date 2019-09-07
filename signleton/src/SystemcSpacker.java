public class SystemcSpacker {
    private static SystemcSpacker instance; // 하나의 객체만 사용하기위해 정적으로 선언해둔다
    private int volume; // 스피커볼륨 default

    // 생성자 접근자를 private 하여 다른곳에서 생성되는것을 막는다.
    private SystemcSpacker() {
        this.volume = 2;
    }

    public static SystemcSpacker getInstance() {
        // instance가 없다면 새로 생성해준다, 있다면 기존객체를 돌려준다.
        if (instance == null) {
            instance = new SystemcSpacker();
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
