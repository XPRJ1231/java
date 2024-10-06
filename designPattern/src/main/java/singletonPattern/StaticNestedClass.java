package singletonPattern;

public class StaticNestedClass {
    private StaticNestedClass() {
    }

    private static class StaticNestedClassHolder {
        private static final StaticNestedClass INSTANCE = new StaticNestedClass();
    }

    public static StaticNestedClass getInstance() {
        return StaticNestedClassHolder.INSTANCE;
    }
}
