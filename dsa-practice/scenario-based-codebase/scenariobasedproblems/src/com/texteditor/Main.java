package com.texteditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        System.out.println(editor.getContent()); // Hello World

        editor.delete(6);
        System.out.println(editor.getContent()); // Hello

        editor.undo();
        System.out.println(editor.getContent()); // Hello World

        editor.undo();
        System.out.println(editor.getContent()); // Hello

        editor.redo();
        System.out.println(editor.getContent()); // Hello World
    }
}