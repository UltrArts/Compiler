/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */
public class Ficheiro {
    
    static String nome_projeto;
    
    public static void criar(String nome){
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nome+".jeans"))) {
            nome_projeto=nome+".jeans";
        } catch (IOException ex) {
            Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
