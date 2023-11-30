package Controladores;

import Aplicativo.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControladorPrincipal {

    @FXML
    protected void botaoInicialEquipamento(ActionEvent e){
        Main.changeScreen("equipamento");
    }

    @FXML
    protected void botaoInicialEquipe(ActionEvent e){
        Main.changeScreen("equipe");
    }

    @FXML
    protected void botaoInicialEvento(ActionEvent e){
        Main.changeScreen("evento");
    }

    @FXML
    protected void botaoInicialRelatorio(ActionEvent e){
        Main.changeScreen("relatorio");
    }

    @FXML
    protected void botaoInicialAtendimento(ActionEvent e){
        Main.changeScreen("atendimento");
    }
}
