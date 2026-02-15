package com.codingwithneetesh.Usable.service;

import com.codingwithneetesh.Usable.entity.UsableEntry;
import com.codingwithneetesh.Usable.repository.UsableEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsableEntryService {

    @Autowired
    private UsableEntryRepository usableEntryRepository; // INJECTION


    public void saveEntry(UsableEntry usableEntry){
        usableEntryRepository.save(usableEntry);
    }
}
