package com.lrm.blog.service;

import com.lrm.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TagService {

    Tag saveType(Tag tag);

    Tag getType(Long id);

    Tag getTypeByName(String name);

    Page<Tag> listType(Pageable pageable);

    Tag updateType(Long id, Tag tag);

    void deleteType(Long id);
}
