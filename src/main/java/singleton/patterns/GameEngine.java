package singleton.patterns;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUUID=123456789;
    private int hp=100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    public GameEngine() {
    }

    void run(){
        while (true){
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

    public static GameEngine getInstance(){
//        if(instance==null)
//        {
//            synchronized (GameEngine.class){
//                instance=new GameEngine();
//            }
//        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
