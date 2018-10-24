import java.util.function.Supplier;

class Birdie {
    static void fly(Supplier<Bird> birdSupplier) {
        birdSupplier.get().fly();
    }
}