package libgdx.controls.label;

public class MyWrappedLabelConfig {

    private float width;
    private float fontScale;
    private String textStyle;
    private String text;
    private boolean singleLineLabel;

    MyWrappedLabelConfig() {
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getFontScale() {
        return fontScale;
    }

    public void setFontScale(float fontScale) {
        this.fontScale = fontScale;
    }

    public String getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(String textStyle) {
        this.textStyle = textStyle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isSingleLineLabel() {
        return singleLineLabel;
    }

    public void setSingleLineLabel(boolean singleLineLabel) {
        this.singleLineLabel = singleLineLabel;
    }
}
