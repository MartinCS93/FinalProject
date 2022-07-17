package Car;

public enum PaintOptions {
    PURE_WHITE_UNI("Pure White Uni"),
    INDIUM_GRAY_METALLIC("Indium Gray Metallic"),
    DEEP_BLACK_PEARLESCENT("Deep Black Pearlescent"),
    REFLEX_SILVER_METALLIC("Reflex Silver Metallic"),
    REEF_BLUE_METALLIC("Reef Blue Metallic");

    private String paintOptions;

    PaintOptions(String paintOptions) {
        this.paintOptions = paintOptions;
    }

    public String getPaintOptions() {
        return paintOptions;
    }
}
