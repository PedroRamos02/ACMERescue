package Controladores;

import Aplicativo.Main;
import Equipamentos.Aplicacao;
import Equipamentos.Equipamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


public class ControladorEquipamentos implements Initializable {

    @FXML
    private ChoiceBox<String> ChoiceBox;

    private String[] equipamento = {"Barco","Caminhão tanque", "Escavadeira"};
    @FXML
    private Label LabelId;

    @FXML
    private  Label LabelInsiraTexto;

    @FXML
    private Label LabelInicial;

    @FXML
    private Label LabelLista;

    @FXML
    private Label LabelNome;

    @FXML
    private Label LabelCusto;

    @FXML
    private Label LabelCombustivel;

    @FXML
    private Label LabelInfoCadastro;

    @FXML
    private Label LabelCarga;

    @FXML
    private Label LabelCapacidade;

    @FXML
    private TextField TextCapacidade;

    @FXML
    private TextField TextId;

    @FXML
    private TextField TextNome;

    @FXML
    private TextField TextCusto;

    @FXML
    private TextField TextCombustivel;

    @FXML
    private TextField TextCarga;

    @FXML
    private Button ButtonLimpar;

    @FXML
    private Button ButtonCadastrar;

    @FXML
    private Button ButtonVerificar;


    Aplicacao aplicacao = new Aplicacao();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ocultarCampos();
        ChoiceBox.getItems().addAll(equipamento);
        ChoiceBox.setOnAction(event -> choiceBoxChange());
    }

    public void choiceBoxChange() {
        String selectedEvent = ChoiceBox.getValue();
        ocultarCampos();
        if ("Barco".equals(selectedEvent)) {
            TextCapacidade.setVisible(true);
            LabelCapacidade.setVisible(true);
        } else if ("Caminhão tanque".equals(selectedEvent)) {
            TextCapacidade.setVisible(true);
            LabelCapacidade.setVisible(true);
        } else if ("Escavadeira".equals(selectedEvent)) {
            TextCombustivel.setVisible(true);
            LabelCombustivel.setVisible(true);
            TextCarga.setVisible(true);
            LabelCarga.setVisible(true);
        }

    }
    public void cadastrarCampos() {
        try {
            String mensagem = "";
            int id = Integer.parseInt(TextId.getText());
            String nome = TextNome.getText();
            double custoDia = Double.parseDouble(TextCusto.getText());
            String selectedEvent = ChoiceBox.getValue();
            if (selectedEvent.equals("Barco")){
                int capacidade = Integer. parseInt(TextCapacidade.getText());
                mensagem = aplicacao.cBarco(id, nome, custoDia,capacidade);
                System.out.println(aplicacao.mostrarEquipamentos());
                mostrarInfo(mensagem);
            }
            else if(selectedEvent.equals("Caminhão tanque")){
                double capacidade = Double.parseDouble(TextCapacidade.getText());
                mensagem = aplicacao.cCaminhao(id, nome, custoDia, capacidade);
                mostrarInfo(mensagem);
            }
            else if (selectedEvent.equals("Escavadeira")) {
                String combustivel = (TextCombustivel.getText());
                double carga = Double.parseDouble(TextCarga.getText());
                mensagem = aplicacao.cadEscavadeira(id, nome, custoDia, combustivel,carga);
                mostrarInfo(mensagem);
            }
        } catch (Exception e) {
            LabelInfoCadastro.setText(e.getMessage());
        }
    }
    @FXML
    private void limparCampos() {
        TextCombustivel.setText(null);
        TextCarga.setText(null);
        TextCapacidade.setText(null);
        TextCusto.setText(null);
        TextNome.setText(null);
        TextId.setText(null);
        LabelInfoCadastro.setText(null);
        LabelId.setVisible(true);
        LabelNome.setVisible(true);
        LabelCusto.setVisible(true);
        LabelCapacidade.setVisible(true);
        ChoiceBox.setVisible(true);
        LabelLista.setVisible(false);
        LabelCombustivel.setVisible(true);
        LabelCarga.setVisible(true);
        LabelInicial.setVisible(true);
        LabelInsiraTexto.setVisible(true);
        TextCombustivel.setVisible(true);
        TextCarga.setVisible(true);
        TextCapacidade.setVisible(true);
        TextCusto.setVisible(true);
        TextNome.setVisible(true);
        TextId.setVisible(true);
    }
    public void ocultarCampos() {
        TextCombustivel.setVisible(false);
        LabelCombustivel.setVisible(false);
        TextCarga.setVisible(false);
        LabelCarga.setVisible(false);
        TextCapacidade.setVisible(false);
        LabelCapacidade.setVisible(false);
        LabelLista.setVisible(false);
    }

    public void listaCadastrados() {
        TextCombustivel.setVisible(false);
        TextCarga.setVisible(false);
        TextCapacidade.setVisible(false);
        TextCusto.setVisible(false);
        TextNome.setVisible(false);
        TextId.setVisible(false);
        LabelInfoCadastro.setVisible(false);
        LabelId.setVisible(false);
        LabelNome.setVisible(false);
        LabelCusto.setVisible(false);
        LabelCapacidade.setVisible(false);
        ChoiceBox.setVisible(false);
        LabelCombustivel.setVisible(false);
        LabelCarga.setVisible(false);
        LabelInicial.setVisible(false);
        LabelInsiraTexto.setVisible(false);
        LabelLista.setVisible(true);
        LabelLista.setText(aplicacao.mostrarEquipamentos());
    }
    public void mostrarInfo(String mensagem){
        LabelInfoCadastro.setVisible(true);
        LabelInfoCadastro.setText(mensagem);
    }

    @FXML
    protected void botaoInicialVoltarEquipamento(ActionEvent e){
        Main.changeScreen("main");
    }
}