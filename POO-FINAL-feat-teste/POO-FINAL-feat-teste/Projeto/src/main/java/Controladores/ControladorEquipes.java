package Controladores;

import Aplicativo.Main;
import Equipes.*;
import Equipes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ControladorEquipes {
    public static String verificaCod;
    Times times = new Times();
    @FXML
    private TextField CodEquip;
    @FXML
    private TextField Lat;
    @FXML
    private TextField Long;
    @FXML
    private Button cadEquips;
    @FXML
    private TextField quantEquip;
    @FXML
    private Label showTela;
    @FXML
    private Label labelText;
    @FXML
    private Button verEquips;
    @FXML
    private TextArea txt;

    @FXML
    protected void botaoInicialVoltarEqui(ActionEvent e){
        Main.changeScreen("main");
    }

    @FXML
    void cadEquipes() {

        try {
            String codinome = CodEquip.getText();
            boolean cod = false;
            for (Equipe e : times.getEquipes()) {
                if (codinome.equalsIgnoreCase(e.getCodinome())) {
                    cod = true;
                }
            }
            if (!cod == true) {
                Lat.setVisible(true);
                Long.setVisible(true);
                quantEquip.setVisible(true);
                txt.setText("Codinome: " + CodEquip.getText());


                    if(verificaCod()){
                    double latitude = Double.parseDouble(Lat.getText());
                    double longitude = Double.parseDouble(Long.getText());
                    int quant = Integer.parseInt(quantEquip.getText());

                   Equipe equipe = new Equipe(CodEquip.getText(), quant, latitude, longitude);
                   if(times.adiciona(equipe)) {
                       txt.setText("Cadastrado com sucesso");
                   }
                }

            } else {
                txt.setText("Codinome já cadastrado");
            }
        } catch (Exception e) {
            txt.setText(e.getMessage());
        }
    }

    @FXML
    void mostraEquipes() {
        txt.setText("");
        String texto = "";
        for (Equipe e : times.getEquipes()) {
            texto += e.toString();
        }
        txt.setText("\n" + texto);
    }
    @FXML
    void clear(){
        Lat.setText("");
        Long.setText("");
        CodEquip.setText("");
        quantEquip.setText("");

    }


    boolean verificaCod(){
        String codinome = CodEquip.getText();
        boolean cod = false;
        for (Equipe e : times.getEquipes()) {
            if (codinome.equalsIgnoreCase(e.getCodinome())) {
                cod = true;
            }
        }
        if (!cod == true) {
            return true;}
        return false;
        }
    }