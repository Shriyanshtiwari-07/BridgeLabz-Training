package com.texteditor;

import java.util.Stack;

public class TextEditor {

    private StringBuilder content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditor() {
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String text) {
        content.append(text);
        undoStack.push(new Action(Action.ActionType.INSERT, text));
        redoStack.clear(); // Clear redo stack on new action
    }

    // Delete last n characters
    public void delete(int length) {
        if (length > content.length()) {
            length = content.length();
        }

        String deletedText = content.substring(content.length() - length);
        content.delete(content.length() - length, content.length());
        undoStack.push(new Action(Action.ActionType.DELETE, deletedText));
        redoStack.clear();
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.getType() == Action.ActionType.INSERT) {
            content.delete(content.length() - action.getText().length(), content.length());
        } else if (action.getType() == Action.ActionType.DELETE) {
            content.append(action.getText());
        }

        redoStack.push(action);
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.getType() == Action.ActionType.INSERT) {
            content.append(action.getText());
        } else if (action.getType() == Action.ActionType.DELETE) {
            content.delete(content.length() - action.getText().length(), content.length());
        }

        undoStack.push(action);
    }

    public String getContent() {
        return content.toString();
    }
}