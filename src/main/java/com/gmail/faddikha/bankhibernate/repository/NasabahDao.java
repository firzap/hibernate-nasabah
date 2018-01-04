package com.gmail.faddikha.bankhibernate.repository;

import com.gmail.faddikha.bankhibernate.entity.Nasabah;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class NasabahDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    public Nasabah save(Nasabah nasabah){
        int id = (int) this.sessionFactory.getCurrentSession().save(nasabah);
        nasabah = findById(id);
        return nasabah;
    }
    
    @Transactional
    public Nasabah update(Nasabah nasabah){
        this.sessionFactory.getCurrentSession().update(nasabah);
        nasabah = findById(nasabah.getNoCif());
        return nasabah;
    }
    
    @Transactional
    public String delete(Nasabah nasabah){
        this.sessionFactory.getCurrentSession().delete(nasabah);
        return "Hapus sukses!";
    }
    
    public Nasabah findById(int id){
        return this.sessionFactory.getCurrentSession().get(Nasabah.class, id);
    }
    
    public List<Nasabah> getList(){
        Criteria query = this.sessionFactory.getCurrentSession().createCriteria(Nasabah.class);
        return query.list();
    }
}
