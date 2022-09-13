package com.iRecruit.DefaultForm.Controller;

import com.iRecruit.DefaultForm.Service.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

        return encryptionService.decrypt(decrypt);}
}
