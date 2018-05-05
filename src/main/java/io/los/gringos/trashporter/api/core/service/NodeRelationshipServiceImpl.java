package io.los.gringos.trashporter.api.core.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NodeRelationshipServiceImpl implements NodeRelationshipService {

    @Override
    public void createFromFile(MultipartFile multipartFile) {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(multipartFile.getInputStream()))) {
            // TODO: parse each line in a universal format (e.g. json)
            buffer.lines().forEach(System.out::println);
        } catch (IOException e) {
            // TODO: handle e
        }
    }
}
