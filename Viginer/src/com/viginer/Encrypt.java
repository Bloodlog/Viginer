package com.viginer;

public class Encrypt {
	  public int smesh;//Сдвиг от юникода
	  public int kolvo;
	public String encrypt(String text, String keyWord)
    {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < text.length();i++)
        {
            int num = ((text.charAt(i) + keyWord.charAt(i % keyWord.length()) - 2 * smesh) % kolvo);
            //в num лежит номер буквы в алфавите
            char c = (char)(num + smesh);//получаем символ
            ans.append(c);
        }
        return ans.toString();
    }
}
