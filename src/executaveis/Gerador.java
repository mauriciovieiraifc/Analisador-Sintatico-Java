/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executaveis;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mauricio
 */

// Gera as classes de configuração .java a partir dos arquivos .flex e .cup
public class Gerador {

    public static void gerar(String path1, String path2, String[] pathS) throws IOException, Exception {
        String home = "/home/mauricio/NetBeansProjects/AnalisadorSintatico"; 
        
        File file;

        file = new File(path1);
        jflex.Main.generate(file);

        file = new File(path2);
        jflex.Main.generate(file);

        java_cup.Main.main(pathS);

        Path pathSym = Paths.get(home + "/src/sintatico/sym.java");
        if (Files.exists(pathSym)) {
            Files.delete(pathSym);
        }

        Files.move(
                Paths.get(home + "/sym.java"),
                Paths.get(home + "/src/sintatico/sym.java")
        );

        Path pathSin = Paths.get(home + "/src/sintatico/Sintatico.java");
        if (Files.exists(pathSin)) {
            Files.delete(pathSin);
        }

        Files.move(
                Paths.get(home + "/Sintatico.java"),
                Paths.get(home + "/src/sintatico/Sintatico.java")
        );
    }

    public static void main(String[] args) throws Exception {
        String path1 = "/home/mauricio/NetBeansProjects/AnalisadorSintatico/src/lexico/Lexico.flex";
        String path2 = "/home/mauricio/NetBeansProjects/AnalisadorSintatico/src/sintatico/LexicoCup.flex";
        String[] pathS = {"-parser", "Sintatico", "/home/mauricio/NetBeansProjects/AnalisadorSintatico/src/sintatico/Sintatico.cup"};

        gerar(path1, path2, pathS);
    }

}
