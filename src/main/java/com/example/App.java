package com.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String fileName = "input.txt";

        FormatFile formatFile = new FormatFile();

        formatFile.execute(fileName);


        Lexicon lexicon = new Lexicon(fileName);

        Token token = new Token();

        while(token.getTokenEnum() != TokenEnum.cEOF){
            token = lexicon.getToken();
            System.out.println(token);
        }
    }
}
