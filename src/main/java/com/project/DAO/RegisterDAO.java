package com.project.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.VO.RegisterVO;

public interface RegisterDAO extends JpaRepository<RegisterVO, Integer>{

}
