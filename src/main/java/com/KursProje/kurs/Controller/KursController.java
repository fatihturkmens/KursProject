package com.KursProje.kurs.Controller;

import com.KursProje.kurs.EntityModel.Kurs;
import com.KursProje.kurs.Service.KursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KursController {
    @Autowired
    private KursService kursService;

    @PostMapping("kursekle")
    public ResponseEntity<String> save (@RequestBody Kurs kurs){
        String saved =kursService.save(kurs);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
}
     @GetMapping("kurs/{id}")
    public ResponseEntity<Kurs> getbyid(@PathVariable int id){
        Kurs kurs1=kursService.getbyId(id);
        return new ResponseEntity<>(kurs1,HttpStatus.OK);

     }
     @GetMapping("tumkurslar")
     public ResponseEntity<List<Kurs>> listallkurs(){
        List<Kurs> kurslar = kursService.getAll();
        return new ResponseEntity<>(kurslar,HttpStatus.OK);
     }

    @PutMapping("kursguncelle")
    public ResponseEntity<String> update (@RequestBody Kurs kurs){
        String saved =kursService.save(kurs);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    @DeleteMapping("kurs/{id}")
    public ResponseEntity<String> deletekurs(@PathVariable int id){
        String kurs1=kursService.deletebyId(id);
        return new ResponseEntity<>(kurs1,HttpStatus.OK);

    }

}
