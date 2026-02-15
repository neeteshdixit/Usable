package com.codingwithneetesh.Usable.repository;

import com.codingwithneetesh.Usable.entity.UsableEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsableEntryRepository extends JpaRepository<UsableEntry,String> {
}



//controller ----> service -----> reopository ko call karenge