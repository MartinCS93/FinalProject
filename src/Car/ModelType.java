package Car;

public enum ModelType {
    TAIGO("Volkswagen TAIGO"),
    T_CROSS("Volkswagen T-CROSS"),
    T_ROC("Volkswagen T-ROC");
    private String modelType;

    ModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelType() {
        return modelType;
    }
}
