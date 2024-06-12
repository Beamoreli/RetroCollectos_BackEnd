package com.example.retrocs.repository;


import com.example.retrocs.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioGamesRepository extends JpaRepository<Usuario, Integer> {
}
