package com.dhkpo.effectivejava.chapter01.item09.suppress;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLine {

    static String firstLineOfFile(String path) throws IOException {

        // BufferedReader br = new BadBufferedReader(new FileReader(path));
        // try {
        //     br.readLine(); // 여기서 발생하는 예외는 잡히지 않게 된다.
        // } finally {
        //     br.close(); // 여기서 발생하는 예외만 잡히게 된다.
        // }

        // readLine(), close() 에서 예외 발생하는데 모두 잡게 된다.
        try(BufferedReader br = new BadBufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(firstLineOfFile("pom.xml"));
    }
}
