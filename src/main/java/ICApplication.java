import com.lombok.ic.IC;
import com.lombok.ic.ICLombok;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ICApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer idade;
        String nome;
        String raca;

        System.out.println("Digite o nome: ");
        nome = input.next();

        System.out.println("Digite a idade: ");
        idade = input.nextInt();

        System.out.print("Humano \nGree \nRakata\n");
        System.out.println("Selecione uma das raças: ");
        raca = input.next();

        ICLombok cafeBuilder = ICLombok.builder()
                .nome(nome)
                .idade(idade)
                .raca(raca)
                .build();
        System.out.println("Café com Builder: " + cafeBuilder.toString());

        try {
            cafeBuilder.imprimirRebelde(cafeBuilder.getNome(), cafeBuilder.getIdade(), cafeBuilder.getRaca());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
