package projetoCriaçãoIphone;

import java.util.*;

import java.util.Scanner;

public class ReprodutorMusical extends Iphone {
    private Scanner in=in = new Scanner(System.in);
    private String[] music;

    public ReprodutorMusical() {
      
        music = new String[5];
        music[0] = "Luan Santana";
        music[1] = "Jorge & Matheus";
        music[2] = "Alok";
        music[3] = "Lagum";
        music[4] = "Gun's N Roses";
    }

    public void tocar() {
        for (String song : music) {
            System.out.println(song);
        }
    }

    public String selecionarMusica() {
        System.out.println("Selecione a música que você quer (índice de 0 a 4): ");
        int selectedIndex = in.nextInt();

        if (selectedIndex >= 0 && selectedIndex < music.length) {
            return music[selectedIndex];
        } else {
            return "Música inválida";
        }
        
    }

   
}

