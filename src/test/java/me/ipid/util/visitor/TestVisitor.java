package me.ipid.util.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestVisitor {

    @Test
    public void test_Visitor() {
        Base obj = new Derived2();
        assertEquals("Derived2", obj.fuck());

        SubclassVisitor.visit(obj)
                .when(Derived1.class, x -> {
                    fail();
                })
                .when(Derived2.class, x -> x.derived2())
                .other(x -> {
                    fail();
                });

    }

    public static class Base {
        public String fuck() {
            return "Base";
        }
    }

    public static class Derived1 extends Base {
        public String fuck() {
            return "Derived1";
        }

        public void derived1() {
        }
    }

    public static class Derived2 extends Base {
        public String fuck() {
            return "Derived2";
        }

        public void derived2() {
        }
    }

    public static class Derived3 extends Base {
        public String fuck() {
            return "Derived3";
        }

        public void derived3() {
        }
    }
}