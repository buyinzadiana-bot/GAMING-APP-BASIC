package COM.AppGamingBasic.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//      var game = new SuperContraGame();
//        var game  = new SuperMario();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
//Hello?
//how are you
//am good
//am ok
//per