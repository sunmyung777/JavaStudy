package org.dimigo.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasicException {
    public static void main(String[] args) {
        uncheckedException(null);
        checkedException();
        String id=null;
        validate(id);
    }

    private static void validate(String id) {
        if (id==null || "".equals(id)){
            Exception e=new Exception("ID를 입력하세요");
            try {
                throw e;
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    private static void checkedException() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
        }catch (FileNotFoundException fne){
            System.out.println("파일이 없습니다.");
        }catch(IOException ioe){
            System.out.println("파일을 읽는 도중 오류가 남");
        }
    }

    private static void uncheckedException(String s) {
        try {
            System.out.println(s.length());
            Integer.parseInt("123a");
        }catch (NullPointerException npe) {
            System.out.println("문자열이 입력되지 않았습니다.");
        }catch (NumberFormatException nfe){
            System.out.println("숫자가 아닙니다.");
            nfe.printStackTrace();
        }catch (Exception e){
            System.out.println("알수 없는 오류입니다.");
        }
    }
}
