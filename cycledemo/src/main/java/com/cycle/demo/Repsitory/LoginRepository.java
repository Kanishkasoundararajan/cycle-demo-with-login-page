package com.cycle.demo.Repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cycle.demo.model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Integer>{

}