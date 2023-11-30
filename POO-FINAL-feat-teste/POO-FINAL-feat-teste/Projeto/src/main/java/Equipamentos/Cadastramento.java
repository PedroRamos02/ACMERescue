package Equipamentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cadastramento {

    public ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public Cadastramento() {
        new ArrayList<Equipamento>();
    }

    public boolean addEquipamento(Equipamento equipamento){
        if ((consultaEquipamento(equipamento.getId()) == null)){
            equipamentos.add(equipamento);
            return true;
        }
        return false;
    }
    public Equipamento consultaEquipamento(int id) {
        for(int i = 0; i < equipamentos.size(); i++) {
            Equipamento aux = equipamentos.get(i);
            if(aux.getId()==(id))
                return aux;
        }
        return null;
    }

    public void ordenarEquipamentos() {
        Collections.sort(equipamentos, Comparator.comparing(Equipamento::getId));
    }

    public ArrayList<Equipamento> listaEquipamento(){
        return equipamentos;
    }
}
