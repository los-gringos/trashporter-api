package io.los.gringos.trashporter.api.core.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NodeRelationshipServiceImpl implements NodeRelationshipService {

    @Override
    public void createFromFile(MultipartFile multipartFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(multipartFile.getInputStream()))) {
            // TODO: parse each line in a universal format (e.g. json)
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            // TODO: handle e
            e.printStackTrace();
        }
    }
}
