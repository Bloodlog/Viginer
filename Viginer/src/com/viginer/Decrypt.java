package com.viginer;

public class Decrypt {
	  public int smesh;//����� �� �������
	  public int kolvo;
	  public String decrypt(String shifr, String keyWord)
	    {
	        StringBuilder ans = new StringBuilder();
	        for(int i = 0; i < shifr.length();i++)
	        {
	            int num = ((shifr.charAt(i)  - keyWord.charAt(i % keyWord.length()) + kolvo) % kolvo);
	            //����������� �������
	            char c = (char)(num + smesh);
	            ans.append(c);
	        }
	        return ans.toString();
	    }
	  
	  
	  
}
