package com.ferreapp.repository;

import java.util.List;

import com.ferreapp.domain.entities.Eps;

public interface EpsRepository {
void save(Eps eps);
void update(Eps eps);
List<Eps> listAll();
void delete(int id);
}
