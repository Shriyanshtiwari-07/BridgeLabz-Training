package com.texteditor;

public class Action {
    public enum ActionType {
        INSERT, DELETE
    }

    private ActionType type;
    private String text;

    public Action(ActionType type, String text) {
        this.type = type;
        this.text = text;
    }

    public ActionType getType() {
        return type;
    }

    public String getText() {
        return text;
    }
}