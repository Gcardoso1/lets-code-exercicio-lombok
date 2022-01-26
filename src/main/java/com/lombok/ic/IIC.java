package com.lombok.ic;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface IIC {
    void imprimirRebelde(String nome, Integer idade, String raca) throws FileNotFoundException, UnsupportedEncodingException;
}
