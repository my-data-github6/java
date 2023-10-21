package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextFileLine
{

public static void main(String[] args)
{
try(FileReader fr = new FileReader("/home/abhijeet/git_database/javaPractice/day_15/Assignment_13/Question_3/String.txt")){
try(BufferedReader br =new BufferedReader(fr)){
String line;
while ((line=br.readLine())!=null) {

System.out.println(line);

}

}
}catch(Exception e)
{
e.printStackTrace();

}



}

}

