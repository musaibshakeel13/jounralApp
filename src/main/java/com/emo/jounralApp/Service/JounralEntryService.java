

package com.emo.jounralApp.Service;

import com.emo.jounralApp.Entity.JounralEntry;
import com.emo.jounralApp.repository.JounralEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class JounralEntryService {
    @Autowired
    private JounralEntryRepository jounralEntryRepository;

    public void saveEntry(JounralEntry jounralEntry){
        jounralEntryRepository.save(jounralEntry);
    }
}








