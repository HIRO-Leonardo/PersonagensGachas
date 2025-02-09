package com.gachas.Projeto_Gacha_API_Rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import com.gachas.Projeto_Gacha_API_Rest.user.User;

public interface UserRepository extends JpaRepository<User, String> {

   UserDetails findByLogin(String login);

}
