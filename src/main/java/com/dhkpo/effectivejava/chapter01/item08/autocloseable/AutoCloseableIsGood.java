package com.dhkpo.effectivejava.chapter01.item08.autocloseable;

import java.io.BufferedInputStream;
import java.io.IOException;

// 파일 및 소켓과 같은 IO 관련한 경우, Closeable 을 구현해도 된다. (close() 메서드에서 IOException 를 throw 함)
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
