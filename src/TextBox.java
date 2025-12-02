public class TextBox extends UiControl {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String clearText() {
        return this.text = "";
    }

    @Override
    public String toString() {
        return this.text;
    }
}
