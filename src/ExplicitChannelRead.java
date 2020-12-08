// Use Channel I/O to read a file

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead {
    public static void main(String[] args) {

        int count;
        Path filePath = null;

        // first obtain a path to the file
        try {
            filePath = Path.of("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Invalid path");
            System.exit(-1);
        }

        // next, obtain a channel to that file within try-resource block
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath)) {

            // allocate a buffer
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // Read a buffer
                count = fChan.read(mBuf);

                // stop when end of file is reached
                if (count != -1) {
                    // rewind buffer so that it can be read
                    mBuf.rewind();

                    // read bytes from buffer and show them on screen as chars
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
