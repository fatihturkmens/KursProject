package com.KursProje.kurs.Service;

import com.KursProje.kurs.EntityModel.Kurs;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

public interface KursService {

    public String save(Kurs kurs);
    public Kurs getbyId(Integer id);
    public List<Kurs> getAll();
    public String deletebyId(Integer id);



}
