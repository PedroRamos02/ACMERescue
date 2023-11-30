package Controladores;

import Aplicativo.Main;
import Equipamentos.Aplicacao;
import Eventos.Evento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorRelatorio implements Initializable {
    private Evento Evento;
    private EventoController evento;

    @FXML
    private Label LabelRelatorio;

    @FXML
    protected void botaoVoltaRealatorio(ActionEvent e){
        Main.changeScreen("main");
    }

   public void mostraRelatorio() {
       for (Evento e : evento.gerenciador.getEventos()) {
           LabelRelatorio.setText(evento.gerenciador.toString(e));
       }
   }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //mostraRelatorio();
    }
}
