public class TextEditorTest {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("메멘토 패턴");
        textEditor.hitSave();
        textEditor.write("메멘토 수정");
        System.out.println(textEditor.print());
        textEditor.hitUndo();
        System.out.println(textEditor.print());
    }
}
