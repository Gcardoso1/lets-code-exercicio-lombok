package com.lombok.ic;

import lombok.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ICLombok implements IIC{

    //Indicando a criação dos métodos Getter e Setter
    @Getter
    @Setter
    private String nome;

    //Criação apenas do Getter
    @Getter
    private Integer idade;

    //Criação apenas do Setter
    @Setter
    private String raca;

    @Override
    public void imprimirRebelde(String nome, Integer idade, String raca) throws FileNotFoundException, UnsupportedEncodingException {
        @Cleanup PrintWriter writer = new PrintWriter("ic-lombok.txt", "UTF-8");
        writer.println("INTELIGENCIA CENTRAL");
        writer.println("Nome: " + nome + ", Idade: " + idade + " e Raça: " + raca);
    }

    public int solicitarIngresso(){
        return (int) Math.round(Math.random() * 1);
    }

}
