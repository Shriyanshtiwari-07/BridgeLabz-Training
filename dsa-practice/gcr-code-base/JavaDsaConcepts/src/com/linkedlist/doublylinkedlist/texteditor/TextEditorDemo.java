package com.linkedlist.doublylinkedlist.texteditor;

public class TextEditorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TextEditor editor = new TextEditor();

		 editor.addState("Ravi");
		 editor.addState("Ravi kumar");
		 editor.addState("Ravi Kumar is");
		 editor.addState("Ravi kumar is boy");

		 editor.displayCurrentState();

		 editor.undo();
		 editor.displayCurrentState();

		 editor.undo();
		 editor.displayCurrentState();

		 editor.redo();
		 editor.displayCurrentState();

		 editor.addState("Lucky coder");
		 editor.displayCurrentState();

		 editor.redo(); 
	}

}