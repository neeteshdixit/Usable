package com.codingwithneetesh.Usable.controller;

import com.codingwithneetesh.Usable.entity.UsableEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;
// controller handle my http requests and send back responses to the client using controllers in spring boot.
@RestController
@RequestMapping("/usable") // ye puri class pr mapping apply kr deta hai
public class UsableEntryController {
    private Map<Long,UsableEntry> usableEntries= new HashMap<>();


    @GetMapping("/abc")
    public List<UsableEntry> getall(){ //localhost:8080/usable/abc GET

        return new ArrayList<>(usableEntries.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody UsableEntry myEntry) { //localhost:8080/usable POST
        usableEntries.put(myEntry.getId(), myEntry);
        return true;
    }

    @GetMapping("id/{myId}")
    public UsableEntry getId(@PathVariable Long myId){
        return usableEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public UsableEntry deleteById(@PathVariable Long myId){
        return usableEntries.remove(myId);
    }

    @PutMapping("id/{myId}")
    public UsableEntry updatebyId(@PathVariable Long myId, @RequestBody UsableEntry myEntry){
        return usableEntries.put(myId,myEntry);
    }
}
