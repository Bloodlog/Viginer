package com.viginer;

public class Encrypt {
	  public int smesh;//����� �� �������
	  public int kolvo;
	public String encrypt(String text, String keyWord)
    {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < text.length();i++)
        {
            int num = ((text.charAt(i) + keyWord.charAt(i % keyWord.length()) - 2 * smesh) % kolvo);
            //� num ����� ����� ����� � ��������
            char c = (char)(num + smesh);//�������� ������
            ans.append(c);
        }
        return ans.toString();
    }
}
