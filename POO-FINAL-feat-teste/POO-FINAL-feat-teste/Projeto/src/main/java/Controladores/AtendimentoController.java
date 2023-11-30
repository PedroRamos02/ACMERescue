package Controladores;

import Aplicativo.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AtendimentoController {
    @FXML
    private Button botaoCiclone;
    @FXML
    private Button botaoSeca;
    @FXML
    private Button botaoTerremoto;
    @FXML
    private TextField textRecebe;
    @FXML
    private TextField textRecebe2;

    @FXML
    protected void botaoInicialVoltarAtend(ActionEvent e){
        Main.changeScreen("main");
    }
    @FXML
    public void setVisibleTerremoto() {
        textRecebe.setVisible(true);
        textRecebe.setText("Magnitude");
    }

    @FXML
    public void setVisibleCiclone() {
        textRecebe.setVisible(true);
        textRecebe.setText("Velocidade");
        textRecebe2.setVisible(true);
        textRecebe2.setText("precipitação");
    }

    @FXML
    public void setVisibleSeca() {
        textRecebe.setVisible(true);
        textRecebe.setText("Estiagem");
    }

}