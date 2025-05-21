package org.githut.kmp.qr;

import com.google.zxing.WriterException;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Example application that creates a QR code PNG using {@link ZxingQrGenerator}.
 */
public class ZxingExample {
    public static void main(String[] args) throws IOException, WriterException {
        if (args.length != 2) {
            System.err.println("Usage: ZxingExample <data> <output file>");
            return;
        }
        String data = args[0];
        String output = args[1];
        try (FileOutputStream fos = new FileOutputStream(output)) {
            ZxingQrGenerator.writeQrToStream(data, 300, fos);
        }
        System.out.println("QR code written to " + output);
    }
}
