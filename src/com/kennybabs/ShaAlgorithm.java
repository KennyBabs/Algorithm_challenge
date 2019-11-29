package com.kennybabs;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class ShaAlgorithm {

        public static void main(String[] args) throws NoSuchAlgorithmException {
            // write your code here
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter string input: ");
            ShaAlgorithm solution = new ShaAlgorithm();
            String hashOutput =  solution.getSHA256Hash(scanner.nextLine());
            System.out.println(hashOutput);
        }

        private String getSHA256Hash(String s) throws NoSuchAlgorithmException {
            String result = null;
            try{
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] hash = messageDigest.digest(s.getBytes("UTF-8"));
                return bytesToHex(hash);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return result;
        }

        private static String bytesToHex(byte[] hash) {
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
    }

