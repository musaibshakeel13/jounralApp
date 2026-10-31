





package com.emo.jounralApp.Controller;

import com.emo.jounralApp.Entity.JounralEntry;
import com.emo.jounralApp.repository.JounralEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jounral")
public class JounralEntryControllerV2 {

    @Autowired
    private JounralEntryRepository jounralEntryRepository;

    @GetMapping
    public List<JounralEntry> getall() {
    return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JounralEntry myEntry) {
    jounralEntryRepository.save(myEntry);
        return true;
    }

    @GetMapping("id/{myId}")

    public JounralEntry getJounralEntryByid(@PathVariable Long myId) {
    return null;
    }

    @DeleteMapping("id/{myId}")
    public JounralEntry DeleteJounralEntryById(@PathVariable Long myId) {
    return null;
    }

    @PutMapping("id/{id}")
    public JounralEntry UpdateJounralEntryById(@PathVariable Long id
            , @RequestBody JounralEntry myEntry
    ) {
    return null;
    }
}






      




  











