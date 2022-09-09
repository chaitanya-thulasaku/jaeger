package com.irecruit.form.controller;

import com.irecruit.form.service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/iRecruit/*")
public class EncryptionController {
    @Autowired
    private EncryptionService encryptionService;

    @GetMapping("encrypt")
    public String encrypt(@RequestParam String encrypt) {
        System.out.println("*********** " + encrypt + " "+encryptionService.encrypt(encrypt));
        String result =encryptionService.encrypt(encrypt);


        String decrypt=encryptionService.decrypt(result);
        System.out.println("******decrypt "+decrypt);
        // done
        return result;
    }

    @GetMapping("decrypt")
    public String decrypt(@RequestParam String decrypt) {

        return encryptionService.decrypt(decrypt);
    }
}
