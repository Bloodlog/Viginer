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
	System.out.println("�����������, ��� ��������� ��� ����������:");
	System.out.println("\t�������� ����:\n 1 �������\n 2 English");
	lan=br.readLine();
	if ((lan.equals("1"))==true)	{
		//��� �������� ����� 
		enc.smesh= (int)'�';
		enc.kolvo=32;
		dec.kolvo=32;
		dec.smesh= (int)'�';
	} else {
		//��� ����������� �����
		enc.smesh= (int)'a';
		enc.kolvo=26;
		dec.kolvo=26;
		dec.smesh= (int)'a';
	}
	
	System.out.println("\t�������� �����:\n 1 ����� ����������\n 2 ����� ����������");
	tic=br.readLine();
	if ((tic.equals("1"))==true) {
 		System.out.println("������� ����� ������� ������ �����������:");
		text=br.readLine();
		System.out.println("������� ����:");
		keyWord=br.readLine();
		System.out.println(enc.encrypt(text,keyWord));
	} else {
		System.out.println("������� ����� ������� ������ �����������:");
		shifr=br.readLine();
		System.out.println("������� ����:");
		keyWord=br.readLine();
		System.out.println(dec.decrypt(shifr,keyWord));
	}
 }
}
	  
	
 
	    
