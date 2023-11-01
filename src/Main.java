import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Villa v1 = new Villa(5, 250, 5000000);
        Butik b1 = new Butik(100, 150, 1000000);
        Etage e1 = new Etage(200, 50, 3, 2000000);

        ArrayList<Ejendom> tabel = new ArrayList<>();
        tabel.add(v1);
        tabel.add(b1);
        tabel.add(e1);

        for (int i = 0; i < tabel.size(); i++){
            tabel.get(i).udskriv();
        }
    }
}