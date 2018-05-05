package io.los.gringos.trashporter.api.rest.controller;

import io.los.gringos.trashporter.api.core.service.NodeRelationshipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/node/relationship")
public class NodeRelationshipController {

    private final NodeRelationshipService nodeRelationshipService;

    public NodeRelationshipController(NodeRelationshipService nodeRelationshipService) {
        this.nodeRelationshipService = nodeRelationshipService;
    }

    @RequestMapping(path = "/file", method = RequestMethod.POST)
    public ResponseEntity<Void> upload(@RequestBody MultipartFile multipartFile) {
        nodeRelationshipService.createFromFile(multipartFile);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
