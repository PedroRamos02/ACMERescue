package Aplicativo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene equipamentoScene;
    private static Scene equipeScene;
    private static Scene eventoScene;
    private static Scene relatorioScene;
    private static Scene atendimentoScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;

        primaryStage.setTitle("Pagina Inicial");

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("paginaInicial.fxml"));
        mainScene = new Scene(fxmlMain, 500, 600);
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));

        Parent fxmlEquipamento = FXMLLoader.load(getClass().getResource("Pedro.fxml"));
        equipamentoScene = new Scene(fxmlEquipamento, 500, 600);
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));

        Parent fxmlEquipe = FXMLLoader.load(getClass().getResource("Victor.fxml"));
        equipeScene = new Scene(fxmlEquipe, 500, 600);
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));

        Parent fxmlEvento = FXMLLoader.load(getClass().getResource("Antonio.fxml"));
        eventoScene = new Scene(fxmlEvento, 500, 600);
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));

        Parent fxmlRelatorio = FXMLLoader.load(getClass().getResource("RelatorioGeral.fxml"));
        relatorioScene = new Scene(fxmlRelatorio, 500, 600);
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));

        Parent fxmlAtendimento = FXMLLoader.load(getClass().getResource("Atendimento.fxml"));
        atendimentoScene = new Scene(fxmlAtendimento, 500, 600);
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/4370/4370758.png"));

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void changeScreen(String scr){
        switch (scr){
            case "main":
                stage.setScene(mainScene);
                break;
            case "equipamento":
                stage.setScene(equipamentoScene);
                break;
            case "equipe":
                stage.setScene(equipeScene);
                break;
            case "evento":
                stage.setScene(eventoScene);
                break;
            case "relatorio":
                stage.setScene(relatorioScene);
                break;
            case "atendimento":
                stage.setScene(atendimentoScene);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}