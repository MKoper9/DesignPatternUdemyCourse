package singleton.patterns;

public class GameEngine {

    private int hp=100;
    private String characterName = "";

    private GameEngine instance;

    public GameEngine() {
    }

    void run(){
        while (true){
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }

    public GameEngine getInstance(){
        if(instance==null)
        {
            instance=new GameEngine();
        }
        return instance;
    }
}
