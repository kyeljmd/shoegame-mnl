package com.brightworks.sg.ims.security.service;

import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author kyel
 */
@Service
public class PasswordEncoderImpl implements PasswordEncoder {

    private StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();

    @Override
    public String encode(CharSequence rawPassword) {
        return passwordEncryptor.encryptPassword(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword,String encodedPassword) {
        try{
            return passwordEncryptor.checkPassword(rawPassword.toString(), encodedPassword);
        }catch (EncryptionOperationNotPossibleException encryptionOperationNotPossibleException){
            return  false;
        }
    }
}
