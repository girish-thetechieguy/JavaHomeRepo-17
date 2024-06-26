package Java15;

import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;

public class NewFeatures {

    public static void main(String[] args) {
        // ERROR: cannot find
        // JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        // JavaFileObject source = new StringSourceFileObject("Foo", "public class Foo { }");
        // CompilationTask task = compiler.getTask(null, null, null, null, null, Arrays.asList(source));
        // task.call();

    }

}

// 1. Sealed the classes:

sealed class Shape permits Circle, Rectangle, Triangle {
    /* ... */ }

final class Circle extends Shape {
    /* ... */ }

final class Rectangle extends Shape {
    /* ... */ }

non-sealed class Triangle extends Shape {
    /* ... */ }