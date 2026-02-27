import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class positionLettre {
    public static void main(String[]args){

        char lettre = 'k';

        if (lettre >= 'a' && lettre <= 'z'){
            int position = lettre - 'a' + 1;
            AffichAlpha(position);
            System.out.println("La lettre " + "\"" + lettre + "\""+ " est a la position : " + position);
        }
        else if (lettre >= 'A' && lettre <= 'Z'){
            int position = lettre - 'A' + 1;
            AffichAlpha(position);
            System.out.println("La lettre " + "\"" + lettre + "\""+ " est a la position : " + position);
        }
        else {
            System.out.println("Ce n'est pas une lettre");
        }
        creerFichier();
    }

    public static void AffichAlpha(int position){
        char Alpha;
        char lettre;
        int i = 1;


        while (i <= position){
            lettre = (char) ('a' + i - 1);
            i++;
            System.out.println(lettre);
        }

    }
    
    public static void creerFichier () {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = LocalDateTime.now().format(format);

         String nomFichier = timestamp + ".txt";

         File file = new File(nomFichier);
        try {
            if (file.createNewFile()) {
                System.out.println("Fichier créé : " + file.getName());
            } else {
                System.out.println("Le fichier existe déjà.");
            }
        } catch (IOException e) {
            System.out.println("Erreur lors de la création du fichier.");
            e.printStackTrace();
        }
    }
}

