package com.example.resto.payload;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
public class copy {


	public void copydata(InputStream is, OutputStream os) throws IOException {
	    byte[] buffer = new byte[100000];
	    int bytesRead;
	    while ((bytesRead = is.read(buffer)) != -1) {
	        os.write(buffer, 0, bytesRead);
	    }
	}
}
