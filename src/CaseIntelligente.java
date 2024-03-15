import java.util.ArrayList;
import java.util.List;

public class CaseIntelligente extends Case {
        private List<Case> lesVoisins;

        public CaseIntelligente(){
            super();
            lesVoisins = new ArrayList<>();
        }

        public void ajouteVoisine(Case uneCase){

        }

        public int nombreBombesVoisines(){
            return 0;
        }

        @Override
        public String toString(){
            return "00";
        }
}