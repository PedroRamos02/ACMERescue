package Equipes;

import java.util.ArrayList;

public class Times {
    ArrayList<Equipe> equipes = new ArrayList<>();
    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }
    public boolean adiciona(Equipe equipe){
        return equipes.add(equipe);
    }

}
