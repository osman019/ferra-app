package com.ferreapp.application.usecase;

import java.util.List;

import com.ferreapp.domain.entities.Eps;
import com.ferreapp.repository.EpsRepository;

public class EpsUsecase {
    private final EpsRepository repository;

   public EpsUsecase(EpsRepository repository){
    this.repository = repository;
   }

    public void save(int id, String name) {
        Eps eps = new Eps(name);
        repository.save(eps);
    }

    public List<Eps> listAll() {
        return repository.listAll();
    }

    public void update(int id, String name){
        Eps eps = new Eps( name);
        repository.update(eps);
    }

    public void delete(int id){
        repository.delete(id);
    }

}
