public class MusicSystem {
    private String name;
    private int lcdScreenSize, noOfSpeakers;
    private String subWoofer;

    public MusicSystem(String name, int lcdScreenSize, int noOfSpeakers, String subWoofer) {
        this.name = name;
        this.lcdScreenSize = lcdScreenSize;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofer = subWoofer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(int lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public String getSubWoofer() {
        return subWoofer;
    }

    public void setSubWoofer(String subWoofer) {
        this.subWoofer = subWoofer;
    }
}
