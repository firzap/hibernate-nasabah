package com.gmail.faddikha.bankhibernate.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_nasabah", schema = "public")
public class Nasabah {
    
    ///////////////////////////////form atas
    @Id
    @Column(name = "id_cif")
    private int noCif;
    
    @Column(name = "cabang")
    private String cabang;
    
    @Column(name = "acc_officer")
    private String accOfficer;
    
    @Column(name = "nama_lengkap")
    private String namaLengkap;
    
    @Column(name = "nama_singkat")
    private String namaSingkat;
    
    @Column(name = "nama_alias")
    private String namaAlias;
    
    @Column(name = "nama_ibu")
    private String namaIbu;
    
    @Column(name = "jk")
    private char jenisKelamin;
    
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    
    @Column(name = "tgl_lahir")
    private Date tglLahir;
    
    @Column(name = "tgl_buka_rek")
    private Date tglBukaRek;
    
    /////////////////////////////form tengah
    private String jenisId;
    private int noId;
    private String alamat;
    private int rt;
    private int rw;
    private String kel;
    private String kec;
    private String kab;
    private String prov;
    private String negara;
    private Date masaBerlaku;
    private int kodePos;
    
    /////////////////////////////form bawah
    private int npwp;
    private int noHp;
    private String ket;

    public int getNoCif() {
        return noCif;
    }

    public void setNoCif(int noCif) {
        this.noCif = noCif;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getAccOfficer() {
        return accOfficer;
    }

    public void setAccOfficer(String accOfficer) {
        this.accOfficer = accOfficer;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNamaSingkat() {
        return namaSingkat;
    }

    public void setNamaSingkat(String namaSingkat) {
        this.namaSingkat = namaSingkat;
    }

    public String getNamaAlias() {
        return namaAlias;
    }

    public void setNamaAlias(String namaAlias) {
        this.namaAlias = namaAlias;
    }

    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public Date getTglBukaRek() {
        return tglBukaRek;
    }

    public void setTglBukaRek(Date tglBukaRek) {
        this.tglBukaRek = tglBukaRek;
    }

    public String getJenisId() {
        return jenisId;
    }

    public void setJenisId(String jenisId) {
        this.jenisId = jenisId;
    }

    public int getNoId() {
        return noId;
    }

    public void setNoId(int noId) {
        this.noId = noId;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRw() {
        return rw;
    }

    public void setRw(int rw) {
        this.rw = rw;
    }

    public String getKel() {
        return kel;
    }

    public void setKel(String kel) {
        this.kel = kel;
    }

    public String getKec() {
        return kec;
    }

    public void setKec(String kec) {
        this.kec = kec;
    }

    public String getKab() {
        return kab;
    }

    public void setKab(String kab) {
        this.kab = kab;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public Date getMasaBerlaku() {
        return masaBerlaku;
    }

    public void setMasaBerlaku(Date masaBerlaku) {
        this.masaBerlaku = masaBerlaku;
    }

    public int getKodePos() {
        return kodePos;
    }

    public void setKodePos(int kodePos) {
        this.kodePos = kodePos;
    }

    public int getNpwp() {
        return npwp;
    }

    public void setNpwp(int npwp) {
        this.npwp = npwp;
    }

    public int getNoHp() {
        return noHp;
    }

    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
    
}
