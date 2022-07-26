package be.digitalcity.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Chien> liste = Arrays.asList(
                new Chien("Titus", 3, Couleur.NOIR),
                new Chien( "Tito", 6, Couleur.BEIGE),
                new Chien("Medor", 1, Couleur.NOIR),
                new Chien("Akira", 8, Couleur.BLANC)
        );

        List<Integer> listeNbrs = Arrays.asList(1,2,3,4,5,6,7,8,9);


        //rechercheParNom(liste, "titus");
//        rechercheViaCritere(
//                liste, (chien) -> chien.getName().contains("Tit") && chien.getCouleur().equals(Couleur.BEIGE),
//
//                //(chien) -> System.out.println(chien) MEME INSTRUCTION QUE EN BAS
//                System.out::println
//        );

        sommeDesCarresNbrsImpairs(listeNbrs);

    }

    //CALCULER LA SOMME DES CARRéS DES NOMBRES IMPAIRS DE LA LISTE SUIVANTE {1,2,3,4,5,6,7,8,9} VIA LES stream<Integer>
    public static void sommeDesCarresNbrsImpairs(List<Integer> numbers) {

        int sum = numbers.stream()
                .filter(n -> n % 2 != 0 )
                .map(n -> n*n)
                .peek(System.out::println)
                .reduce(0, Integer::sum);

        System.out.println("Sum is " + sum);
        }

    public static void rechercheParNom(List<Chien> data, String name) {
        for(Chien c : data) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
            }
        }
    }

    public static void rechercheViaCritere(List<Chien> data, Predicate<Chien> predicate, Consumer<Chien> consumer) {
        for(Chien c : data) {
            if(predicate.test(c)) {
                consumer.accept(c);
            }
        }
    }
}



