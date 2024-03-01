package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\Danil\\IdeaProjects\\CCLab\\src\\main\\resources\\test.txt");
            MyGrammarLexer lexer = new MyGrammarLexer((input));
            MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            SemanticVisitor semanticVisitor = new SemanticVisitor();
            semanticVisitor.visit(tree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
