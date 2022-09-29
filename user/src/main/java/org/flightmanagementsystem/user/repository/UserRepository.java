package org.flightmanagementsystem.user.repository;

import java.math.BigInteger;

import org.flightmanagementsystem.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, BigInteger>{

}
