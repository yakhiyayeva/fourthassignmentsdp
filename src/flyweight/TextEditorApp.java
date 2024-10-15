package flyweight;

// Demonstration: TextEditorApp
public class TextEditorApp {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor editor = new TextEditor(characterFactory);

        // Insert characters with the same intrinsic state (font and size) but different positions
        editor.insertCharacter('H', "Arial", 12, 10, 10);
        editor.insertCharacter('e', "Arial", 12, 20, 10);
        editor.insertCharacter('l', "Arial", 12, 30, 10);
        editor.insertCharacter('l', "Arial", 12, 40, 10);
        editor.insertCharacter('o', "Arial", 12, 50, 10);
        editor.insertCharacter(' ', "Arial", 12, 60, 10);
        editor.insertCharacter('W', "Arial", 12, 70, 10);
        editor.insertCharacter('o', "Arial", 12, 80, 10);
        editor.insertCharacter('r', "Arial", 12, 90, 10);
        editor.insertCharacter('l', "Arial", 12, 100, 10);
        editor.insertCharacter('d', "Arial", 12, 110, 10);

        // Render the text
        editor.renderText();

        // Print pool size to demonstrate memory efficiency
        System.out.println("\nNumber of unique Character objects in pool: " + characterFactory.getPoolSize());
    }
}

