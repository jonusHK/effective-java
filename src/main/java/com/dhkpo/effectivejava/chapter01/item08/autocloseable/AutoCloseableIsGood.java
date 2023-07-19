package com.dhkpo.effectivejava.chapter01.item08.autocloseable;

import java.io.BufferedInputStream;
import java.io.IOException;

public class AutoCloseableIsGood implements AutoCloseable {

    private BufferedInputStream inputStream;

    // try-with-resource 사용 시, 자동으로 호출됨
    @Override
    public void close() {
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException("failed to close " + inputStream);
        }
    }
}
