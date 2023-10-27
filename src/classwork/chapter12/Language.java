package classwork.chapter12;

public enum Language {
    Hy("hayeren"), Ru("rus"), Eng("eng");
    private String languageName;

    Language(String languageName) {
        this.languageName = languageName;
    }

    public String getLanguageName() {
        return languageName;
    }
}
