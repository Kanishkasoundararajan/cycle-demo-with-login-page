package com.cycle.demo.Repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cycle.demo.model.CycleDemo;

@Repository

public interface CycleDemoRepsitory extends JpaRepository<CycleDemo,Integer> {

}
