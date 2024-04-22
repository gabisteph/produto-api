package com.soulcode.produtosapi.repositories;

import com.soulcode.produtosapi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
