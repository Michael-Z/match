package com.roy.football.match.main;

import java.io.IOException;
import java.io.StringReader;

import org.wltea.analyzer.IKSegmentation;
import org.wltea.analyzer.Lexeme;

public class ChineseAnalyzerMain {
	
	public static void main (String [] args) throws IOException {
		String text="ī�����ǽ�10������8ʤ2ƽ���ֲ��ܣ������22����������2�����ɼ�Ϊ15ʤ5ƽ2����";
	    StringReader sr=new StringReader(text);
	    IKSegmentation ik=new IKSegmentation(sr, true);
	    Lexeme lex=null;
	    while((lex=ik.next())!=null){  
	        System.out.print(lex.getLexemeText()+"|");  
	    } 
	}
	
}
