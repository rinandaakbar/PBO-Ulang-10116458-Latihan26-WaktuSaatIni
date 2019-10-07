/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan26.waktusaatini;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
import java.util.*;
import java.text.*;
public class PBOUlang10116458Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date hariSekarang = new Date();
        SimpleDateFormat ft = new 
        SimpleDateFormat("EEEE, d MMM yyyy " + "hh:mm:ss");
         System.out.println("Hari ini adalah hari : " 
                 + ft.format(hariSekarang));
    }
    
}
