package com.vallegrande.asistencias;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptacion {

    public static String encriptar(String input) {
//        input = cifrar(input,5);
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String cifrar(String texto, int desplazamiento) {
        String iMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String iMinus = "abcdefghijklmnopqrstuvwxyz";
        String salida = "";
        for (int i = 0; i < texto.length(); i++) {
            if ((iMayus.indexOf(texto.charAt(i)) != -1) || (iMinus.indexOf(texto.charAt(i)) != -1)) {
                salida += (iMayus.indexOf(texto.charAt(i)) != -1) ? iMayus.charAt((iMayus.indexOf(texto.charAt(i)) + desplazamiento)%iMayus.length()) : iMinus.charAt((iMinus.indexOf(texto.charAt(i)) + desplazamiento)%iMinus.length());
            }else{
                texto += texto.charAt(i);
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(encriptar("demo"));
    }

}
