package com.gmail.faddikha.bankhibernate.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "master_nasabah")
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
    @Column(name = "jenis_id")
    private String jenisId;
    
    @Column(name = "no_id")
    private String noId;
    
    @Column(name = "alamat")
    private String alamat;
    
    @Column(name = "rt")
    private int rt;
    
    @Column(name = "rw")
    private int rw;
    
    @Column(name = "kel")
    private String kel;
    
    @Column(name = "kec")
    private String kec;
    
    @Column(name = "kab")
    private String kab;
    
    @Column(name = "prov")
    private String prov;
    
    @Column(name = "negara")
    private String negara;
    
    @Column(name = "masa_berlaku")
    private Date masaBerlaku;
    
    @Column(name = "kode_pos")
    private String kodePos;
    
    /////////////////////////////form bawah    
    @Column(name = "npwp")
    private String npwp;
    
    @Column(name = "no_hp")
    private String noHp;
    
    @Column(name = "ket")
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

    public String getNoId() {
        return noId;
    }

    public void setNoId(String noId) {
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

    public String getKodePos() {
        return kodePos;
    }

    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
    
}
