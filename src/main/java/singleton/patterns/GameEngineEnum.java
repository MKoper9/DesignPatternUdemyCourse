package singleton.patterns;

public enum GameEngineEnum {
    INSTANCE("Lala");

    private int hp=100;
    private String characterName = "";

    private GameEngineEnum(String characterName) {
        this.characterName = characterName;
    }

    void run(){
        while (true){
            //czekamy na input gracza
            //zmieniamy stan gry
            //renderujemy grafike
        }
    }
}
