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

        ICLombok rebeldeBuilder = ICLombok.builder()
                .nome(nome)
                .idade(idade)
                .raca(raca)
                .build();
        System.out.println("Rebelde com Builder: " + rebeldeBuilder.toString());

        try {
            if(rebeldeBuilder.solicitarIngresso() > 0) {
                System.out.println("O Rebelde foi admitido!");
                rebeldeBuilder.imprimirRebelde(rebeldeBuilder.getNome(), rebeldeBuilder.getIdade(), rebeldeBuilder.getRaca());
            }else{
                System.out.println("Desculpe, o Rebelde não foi admitido");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
