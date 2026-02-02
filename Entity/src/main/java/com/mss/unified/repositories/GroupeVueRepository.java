package com.mss.unified.repositories;

import com.mss.unified.entities.GroupeVue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupeVueRepository extends JpaRepository<GroupeVue,Integer> {

}
