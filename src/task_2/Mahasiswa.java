/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Status;
    char[] Nilai = new char[10];
    int i = 0;
    
    Mahasiswa(){
        
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getStatus() {
        return Status;
    }

    public char[] getNilai() {
        return Nilai;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setNilai(char[] Nilai) {
        this.Nilai = Nilai;
    }
    
    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }
    
    public void addNilai(char nilai){
        i++;
        if (i <= 10){
            Nilai[i] = nilai;
        }
    }
    public char getNilai(int i){
        return Nilai[i+1];
        
    }
    public String toString(){
        String w =  NIM+" "+Nama+" "+Status+" "+ " = ";
        for (int j = 0; j <= i; j++) {
            w = w + Nilai[j] + " ";
        }
        return w;
    }
    public char cekNilai(Mahasiswa m){
        char w;
        for (char j = 'A'; j < 'E'; j++) {
            for (int k = 0; k < i; k++) {
                //if (Nilai[k] == j){
                  //  for (int l = 0; l < m.i; l++) {
                if (j == Nilai[k]){
                    for (int l = 0; l <= i; l++) {
                        if (j == m.Nilai[l]){
                            return j;
                        }       
                    }
                }
            }
        }
        return Nilai[i];     
    }
}
