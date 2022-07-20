//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package snakeAndLadder.entities;

public class Snake extends BoardEntity {
    public Snake(int start, int end) {
        super(start, end);
    }

    public String getEncounterMessage() {
        return "Ooops!! You encountered a Snake :( ";
    }

    public String getString() {
        return "S(" + this.getEnd() + ")  ";
    }
}
