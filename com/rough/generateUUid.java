package com.rough;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.UUID;

public class generateUUid {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        List<String> ls = new ArrayList<String>();
        int i=0;
        for(i=0;i<10000000;i++){
            UUID uudi = UUID.randomUUID();
            ls.add(uudi.toString());
        }   
        long stopTime = System.nanoTime();
        System.out.println("Time taken for programe execution "+ (stopTime -  startTime));
        try{
        long length = getBytesFromList(ls);
        long KB = length / 1024;
        long MB = KB / 1024;
        
        System.out.println("Size of the list MB "+MB+" and in KB "+KB);
        }catch(Exception e){
            System.out.println("got exception");
        }
    }

    public static long getBytesFromList(List list) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(baos);
		out.writeObject(list);
		out.close();
		return baos.toByteArray().length;
	}
}
