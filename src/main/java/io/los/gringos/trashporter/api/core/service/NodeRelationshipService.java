package io.los.gringos.trashporter.api.core.service;

import org.springframework.web.multipart.MultipartFile;

public interface NodeRelationshipService {

    void createFromFile(MultipartFile multipartFile);
}
