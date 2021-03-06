package com.gmail.faddikha.bankhibernate.controller;

import com.gmail.faddikha.bankhibernate.entity.Nasabah;
import com.gmail.faddikha.bankhibernate.repository.NasabahDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nasabah")
@CrossOrigin( origins = "http://localhost:4200")
public class NasabahController {
    
    @Autowired
    private NasabahDao nasabahDao;
    
    @GetMapping("/list")
    public List<Nasabah> getList(){
        return this.nasabahDao.getList();
    }
    
    @GetMapping("/{noCif}")
    public Nasabah listNasabah(@PathVariable int noCif){
        return this.nasabahDao.findById(noCif);
    }
    
    @PostMapping("/simpan")
    public Nasabah save(@RequestBody Nasabah nasabah){
        return this.nasabahDao.save(nasabah);
    }
    
    @PostMapping("/ubah")
    public Nasabah edit(@RequestBody Nasabah nasabah){
        return this.nasabahDao.update(nasabah);
    }
    
    @PostMapping("{noCif}/dihapus")
    public String remove(@PathVariable int noCif){
        this.nasabahDao.delete(noCif);
        return "{ \"message\" : \"Data berhasil dihapus, Gan!\"}";
    }
}
