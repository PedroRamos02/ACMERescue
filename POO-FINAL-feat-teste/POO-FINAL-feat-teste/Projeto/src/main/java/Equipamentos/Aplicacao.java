package Equipamentos;

import java.util.ArrayList;

public class Aplicacao {
    Cadastramento cE = new Cadastramento();

    public String cBarco(int id, String nome, double custoDia, int capacidade){
        Equipamento equipamento = new Barco(id, nome, custoDia, capacidade);
        if (cE.addEquipamento(equipamento)){
            cE.ordenarEquipamentos();
            return "Barco cadastrado!";
        } else {
            return "Erro: Este Barco já foi cadastrado!";
        }
    }
    public String cCaminhao(int id, String nome, double custoDia, double capacidade){
        Equipamento equipamento = new CaminhaoTanque(id, nome, custoDia, capacidade);
        if (cE.addEquipamento(equipamento)){
            cE.ordenarEquipamentos();
            return "Caminhão Tanque cadastrado!";
        } else {
            return "Erro: Este Caminhão já foi cadastrado!";
        }
    }
    public String cadEscavadeira(int id, String nome, double custoDia,String combustivel, double carga){
        Equipamento equipamento = new Escavadeira(id, nome, custoDia, combustivel, carga);
        if (cE.addEquipamento(equipamento)){
            cE.ordenarEquipamentos();
            return "Escavadeira cadastrada!";
        } else {
            return "Erro: Esta Escavadeira já foi cadastrada!";
        }
    }
    public String mostrarEquipamentos(){
        ArrayList<Equipamento> eqi = cE.listaEquipamento();
        if (eqi != null && !eqi.isEmpty()){
            StringBuilder equipamentoStr = new StringBuilder();
            for (Equipamento equipamento: eqi) {
                equipamentoStr.append(equipamento.toString()).append("\n");
            }
            return equipamentoStr.toString();
        }
        return "Nenhum evento cadastrado";
    }
}