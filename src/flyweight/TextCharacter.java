package flyweight;

public class TextCharacter {
    private Character character;  // Shared (intrinsic) flyweight object
    private int x, y;  // Extrinsic state (position)

    public TextCharacter(Character character, int x, int y) {
        this.character = character;
        this.x = x;
        this.y = y;
    }

    public void render() {
        character.render(x, y);  // Render with the extrinsic state (position)
    }
}




