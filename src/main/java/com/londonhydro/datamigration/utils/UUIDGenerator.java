package com.londonhydro.datamigration.utils;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.UUID;
@Component
public class UUIDGenerator {

    public static UUID generateType3UUID(String namespace){
        return UUID.nameUUIDFromBytes(namespace.getBytes());
    }

    public static UUID generateType3UUID(String namespace, String name) throws UnsupportedEncodingException {
        byte[] nameSpaceBytes = bytesFromUUID(namespace);
        byte[] nameBytes = name.getBytes("UTF-8");
        byte[] result = joinBytes(nameSpaceBytes, nameBytes);
        return  UUID.nameUUIDFromBytes(result);
    }

    private static byte[] bytesFromUUID(String uuidHexString) {
        String normalizedUUIDHexString = uuidHexString.replace("-","");

        assert normalizedUUIDHexString.length() == 32;

        byte[] bytes = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = hexToByte(normalizedUUIDHexString.substring(i*2, i*2+2));
            bytes[i] = b;
        }
        return bytes;
    }

    public static byte hexToByte(String hexString) {
        int firstDigit = Character.digit(hexString.charAt(0),16);
        int secondDigit = Character.digit(hexString.charAt(1),16);
        return (byte) ((firstDigit << 4) + secondDigit);
    }

    public static byte[] joinBytes(byte[] byteArray1, byte[] byteArray2) {
        int finalLength = byteArray1.length + byteArray2.length;
        byte[] result = new byte[finalLength];

        for(int i = 0; i < byteArray1.length; i++) {
            result[i] = byteArray1[i];
        }

        for(int i = 0; i < byteArray2.length; i++) {
            result[byteArray1.length+i] = byteArray2[i];
        }

        return result;
    }

}
