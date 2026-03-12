package COM.AppGamingBasic.example;

public class GameRunner {
    SuperMario game;
    public GameRunner(SuperMario superMario) {
        this.game = superMario;
    }

    public void run() {
        System.out.println("Running Game:" + game);
    }
}
