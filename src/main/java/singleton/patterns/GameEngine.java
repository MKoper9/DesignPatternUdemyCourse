package singleton.patterns;

public class GameEngine {

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
}
