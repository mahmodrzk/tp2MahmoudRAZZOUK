package ma.emsi.tp2mahmoudrazzouk.jsf; // Déclaration du package

import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named(value = "bean") // Annotation indiquant que cet objet est géré par CDI (Contexts and Dependency Injection) avec le nom "bean"
@RequestScoped // Portée de l'objet bean (RequestScoped signifie que l'objet est créé pour chaque requête)

public class Bean {

    private int nombre; // Déclaration de la variable d'instance "nombre"

    public int getNombre() { // Méthode pour obtenir la valeur de "nombre"
        return nombre;
    }

    public void setNombre(int nombre) { // Méthode pour définir la valeur de "nombre"
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() { // Méthode pour obtenir une liste de nombres suivants
        int nb = 5; // Nombre de nombres suivants à générer
        List<Integer> l = new ArrayList<>(nb); // Création d'une liste d'entiers
        for (int i = nombre; i < nombre + nb; i++) { // Boucle pour générer les nombres suivants
            l.add(i); // Ajout du nombre à la liste
        }
        return l; // Retourne la liste des nombres suivants
    }

    public String afficher() { // Méthode pour rediriger vers une autre page
        return "affichage_3?nb=" + nombre + "&amp;faces-redirect=true"; // Retourne l'URL de redirection
    }
}
