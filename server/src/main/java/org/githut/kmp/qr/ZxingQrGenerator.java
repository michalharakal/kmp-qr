package org.githut.kmp.qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Utility class for generating QR codes using ZXing.
 */
public class ZxingQrGenerator {
    /**
     * Writes a QR code PNG representing the provided text to the given output stream.
     *
     * @param text data to encode
     * @param size size of the square QR code image
     * @param output output stream to write the PNG data to
     */
    public static void writeQrToStream(String text, int size, OutputStream output)
            throws WriterException, IOException {
        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix = writer.encode(text, BarcodeFormat.QR_CODE, size, size);
        MatrixToImageWriter.writeToStream(matrix, "PNG", output);
    }
}
