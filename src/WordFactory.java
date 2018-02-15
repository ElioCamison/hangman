public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    public Word makeWord() {
        return null;
    }
}


class DictWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        return null;
    }
}