package ca.georgebrown.comp3074.lab32;

public class Item {

    private String largeText;
    private String smallText;
    private int iconId;

    public String getSmallText() {
        return smallText;
    }

    public int getIconId() {
        return iconId;
    }

    public String getLargeText() {
        return largeText;
    }

    public void setLargeText(String largeText) {
        this.largeText = largeText;
    }

    public void setSmallText(String smallText) {
        this.smallText = smallText;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public Item(String largeText, String smallText, int iconId) {
        this.largeText = largeText;
        this.smallText = smallText;
        this.iconId = iconId;
    }
}
