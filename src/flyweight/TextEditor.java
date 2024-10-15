package flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<TextCharacter> textCharacters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    // Method to insert a character with its extrinsic state (position)
    public void insertCharacter(char c, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(c, font, size);  // Get shared Character object
        textCharacters.add(new TextCharacter(character, x, y));  // Store character with its position
    }

    // Method to render the entire document
    public void renderText() {
        for (TextCharacter textCharacter : textCharacters) {
            textCharacter.render();  // Render each character with its position
        }
    }
}
