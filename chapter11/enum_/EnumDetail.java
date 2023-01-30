package enum_;

/**
 * @author 何蛋
 * @version 1.0
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASICCMUSIC.playing();
    }
}

class A {

}

//enum Season3 extends A{
//
//}
interface IPlaying {
    public void playing();
}

enum Music implements IPlaying {
    CLASICCMUSIC;

    @Override
    public void playing() {
        System.out.println("播放好听的音乐...");
    }
}