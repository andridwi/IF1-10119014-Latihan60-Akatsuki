/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan60.akatsuki;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas:IF-1
 * NIM  : 10119014
 */
class AnggotaAkatsuki extends Ninja {
     private String makananFavorit;
    
      
    public String getMakananFavorit() {
        return this.makananFavorit;
    }
    
    public void setMakananFavorit(String makananFavorit) {
        this.makananFavorit = makananFavorit;
    }
    
    public void tampilAnggota() {
        System.out.println("Nama\t\t: " + super.getNama());
        System.out.println("Asal Desa\t: " + super.getAsalDesa());
        System.out.println("Makanan Favorit\t: " + getMakananFavorit());
        System.out.println();
    }  
}
