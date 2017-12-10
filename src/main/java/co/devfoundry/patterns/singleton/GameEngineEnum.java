package co.devfoundry.patterns.singleton;

public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp =100;
    private String characterName = "";

    private GameEngineEnum(String name) {
        this.characterName = name;

    }

    public void run() {
        while(true) {
            //czekamy na input gracza
            //zmienamy stan gry
            //renderujemy grafike
        }
    }


}
