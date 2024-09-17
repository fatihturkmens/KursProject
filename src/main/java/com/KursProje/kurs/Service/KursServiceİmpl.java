package com.KursProje.kurs.Service;

import com.KursProje.kurs.EntityModel.Kurs;
import com.KursProje.kurs.Repository.KursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KursServiceİmpl implements KursService{
    @Autowired
    private KursRepository kursRepository;


    @Override
    public String save(Kurs kurs) {
        kursRepository.save(kurs);
        return "BAŞARILI BİR ŞEKİLDE KAYIT EDİLDİ";
    }

    @Override
    public Kurs getbyId(Integer id) {
        Optional<Kurs> findbyİd =kursRepository.findById(id);
        if (findbyİd.isPresent()){
            return findbyİd.get();
        }

        return null;
    }

    @Override
    public List<Kurs> getAll() {
        return kursRepository.findAll();
    }

    @Override
    public String deletebyId(Integer id) {
        if (kursRepository.existsById(id)){
        kursRepository.deleteById(id);
        return "BAŞARILI BİR ŞEKİLDE SİLİNDİ";
    } else {
            return "Bulunamadı";
        }
    }

}
