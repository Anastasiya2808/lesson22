package decorator;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptedOutputStream extends FilterOutputStream{
    private String key;
    public EncryptedOutputStream(OutputStream out, String key) {
        super(out);
        this.key = key;
    }
    @Override
    public void write(byte[] b) throws IOException {
        // 1. шифрование
        // 2. вызвали метод write родителя, передали зашифрованные данные
    }
}
