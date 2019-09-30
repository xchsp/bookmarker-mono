package com.spring2go.bookmarker.controller;

import com.spring2go.bookmarker.model.Tag;
import com.spring2go.bookmarker.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/tags")
    public List<Tag> tags() {
        return tagRepository.fingAll();
    }
}