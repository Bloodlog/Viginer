package com.viginer;
import java.io.*;

public class Main {
 public static void main(String args[]) throws IOException{

	Encrypt enc=new Encrypt(); Decrypt dec=new Decrypt();
	String text;
	String keyWord;
	String shifr;
	String tic;
	String lan;

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Здраствуйте, это программа для шифрования:");
	System.out.println("\tВыберите язык:\n 1 Русский\n 2 English");
	lan=br.readLine();
	if ((lan.equals("1"))==true)	{
		//Для русского языка 
		enc.smesh= (int)'а';
		enc.kolvo=32;
		dec.kolvo=32;
		dec.smesh= (int)'а';
	} else {
		//Для английского языка
		enc.smesh= (int)'a';
		enc.kolvo=26;
		dec.kolvo=26;
		dec.smesh= (int)'a';
	}
	
	System.out.println("\tВыберите режим:\n 1 Режим шифрования\n 2 Режим дешифровки");
	tic=br.readLine();
	if ((tic.equals("1"))==true) {
 		System.out.println("Введите текст который хотите зашифровать:");
		text=br.readLine();
		System.out.println("Введите ключ:");
		keyWord=br.readLine();
		System.out.println(enc.encrypt(text,keyWord));
	} else {
		System.out.println("Введите текст который хотите дешифровать:");
		shifr=br.readLine();
		System.out.println("Введите ключ:");
		keyWord=br.readLine();
		System.out.println(dec.decrypt(shifr,keyWord));
	}
 }
}
	  
	
 
	    
