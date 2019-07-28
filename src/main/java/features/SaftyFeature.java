package features;

public class SaftyFeature implements Feature {

    private String featureInfo;

    public void setFeatureInfo(final String featureInfo) {
        this.featureInfo = featureInfo;
    }

    @Override
    public String showInfos(final String featureInfo) {
        return featureInfo;
    }

    @Override
    public String showInfos() {
        return featureInfo;
    }
}
