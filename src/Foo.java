public class Foo<K, V> {
    private K key;
    private V value;

    public Foo(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Foo<T, T> twice (T value) {
        return new Foo<T, T>(value,value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
