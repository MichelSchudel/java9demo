package nl.craftsmen.java9demo.stackwalker;

import java.util.List;
import java.util.stream.Collectors;

public class StackwalkerDemo {

    public static void main(String[] args) {
        StackWalker.getInstance().forEach(System.out::println);
        execute();
    }

    static void execute() {

        List<StackWalker.StackFrame> collect = StackWalker
                .getInstance()
                .walk(stackFrameStream -> stackFrameStream.skip(0)
                .collect(Collectors.toList()));
        System.out.println(collect);
    }
}
