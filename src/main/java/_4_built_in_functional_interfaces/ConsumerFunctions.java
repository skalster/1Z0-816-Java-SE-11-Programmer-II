package _4_built_in_functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

/**
 * Typed Accept and AndThen
 */
public class ConsumerFunctions {

    public void useBiConsumer() {
        BiConsumer biConsumer = (o, o2) -> {
            System.out.print(o);
            System.out.println(o2);
        };
        biConsumer.accept("Biconsumer ", "example!");
    }

    public void useConsumer() {
//        Consumer<String> consumer = s -> System.out.println(s);
        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer interface example.");
    }

    public void useIntConsumer() {
        IntConsumer intConsumer = i -> System.out.println("IntConsumer 5");
        IntConsumer intConsumer2 = i -> System.out.println(i);

        intConsumer.accept(5);
        intConsumer.andThen(intConsumer); // Default method;
    }

    public void useLongConsumer() {
        LongConsumer longConsumerPrint = System.out::println;
        LongConsumer longConsumerMulti = l -> l *= 13;
//        LongConsumer longConsumer = l -> System.out.println(l);
        longConsumerPrint.accept(13L);
        System.out.println(longConsumerPrint.andThen(longConsumerMulti));
        ;
    }

    public void useDoubleConsumer() {
        DoubleConsumer consumer = v -> System.out.println("DoubleConsumer: " + v);
//        Consumer<String> consumer = System.out::println;
        consumer.accept(10.141516d);
    }

    public void useObjDoubleConsumer() {
        ObjDoubleConsumer<String> objDoubleConsumer = (s, v) -> System.out.println("ObjDoubleConsumer : s and v" + s + v);
        objDoubleConsumer.accept("Hola double", 21);
    }

    public void useObjIntConsumer() {
        ObjIntConsumer<String> objIntConsumer = (s, v) -> System.out.println("ObjIntConsumer : s and v" + s + v);
        objIntConsumer.accept("Hola Int", 21);
    }

    public void useObjLongConsumer() {
        ObjLongConsumer<String> objLongConsumer = (s, v) -> System.out.println("ObjLongConsumer : s and v" + s + v);
        objLongConsumer.accept("Hola Long", 21);
    }
}
