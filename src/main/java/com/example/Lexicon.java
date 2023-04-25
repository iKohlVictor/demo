package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class Lexicon {
    
    private String filePath;
    private String fileName;
    private int fileRead;
    BufferedReader bufferedReader;

    public Lexicon(String fileName){
        this.filePath = Paths.get(fileName).toAbsolutePath().toString();
        this.fileName = fileName;

        try {
            this.bufferedReader = new BufferedReader(new FileReader(this.filePath, StandardCharsets.UTF_8));
            this.fileRead = this.bufferedReader.read();
        } catch(IOException error){
            error.printStackTrace();
        }
    }

    public Token getToken(){
        StringBuilder lexeme = new StringBuilder("");
        char character;
        Token token = new Token();

        try {

            while (fileRead != -1) { 
                character = (char) fileRead;
                if (!(fileRead == 13 || fileRead == 10)) {
                    if (character == ' ') {
                        while (character == ' ') {
                            fileRead = this.bufferedReader.read();
                            character = (char) fileRead;
                        }
                    } else if (Character.isLetter(character)) {
                        while (Character.isLetter(character) || Character.isDigit(character)) {
                            lexeme.append(character);
                            fileRead = this.bufferedReader.read();
                            character = (char) fileRead;
                        }
                        Value valor = new Value();
                        token.setTokenEnum(TokenEnum.cId);
                        valor.setValueIdentification(lexeme.toString());
                        token.setValue(valor);
                        return token;
                    } else if (Character.isDigit(character)) {
                        while (Character.isDigit(character) || character=='.') {
                            lexeme.append(character);
                            fileRead = this.bufferedReader.read();
                            character = (char) fileRead;
                        }
                        Value valor = new Value();
                        token.setTokenEnum(TokenEnum.cInt);
                        valor.setValueIdentification(lexeme.toString());
                        token.setValue(valor);
                        return token;
                        
                    } else {
                        if(character==':'){
                            while(character == ':'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cDoisPontos);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='+'){
                            while(character == '+'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cMais);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='-'){
                            while(character == '-'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cMenor);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='/'){
                            while(character == '/'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cDivisao);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='*'){
                            while(character == '*'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cMultiplicacao);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='>'){
                            while(character == '>'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cMaior);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='<'){
                            while(character == '<'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            valor.setValueIdentification(lexeme.toString());
                            token.setTokenEnum(TokenEnum.cMenor);
                            token.setValue(valor);
                            return token;
                        }else if(character=='='){
                            while(character == '='){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cIgual);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character==','){
                            while(character == ','){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cVirgula);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character==';'){
                            while(character == ';'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cPontoVirgula);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='.'){
                            while(character == '.'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cPonto);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character=='('){
                            while(character == '('){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cParEsq);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else if(character==')'){
                            while(character == ')'){
                                lexeme.append(character);
                                fileRead = this.bufferedReader.read();
                                character = (char) fileRead;
                            }
                            Value valor = new Value();
                            token.setTokenEnum(TokenEnum.cParDir);
                            valor.setValueIdentification(lexeme.toString());
                            token.setValue(valor);
                            return token;
                        }else{
                            token.setTokenEnum(TokenEnum.cEOF);
                        }
                        
                        token.setValue(null);
                        fileRead = this.bufferedReader.read();
                        return token;
                    }
                }else{
                    fileRead = this.bufferedReader.read();
                }
            }

            token.setTokenEnum(TokenEnum.cEOF);
            return token;
        } catch (IOException err) {
            err.printStackTrace();
        }
        return null;
    }
}
